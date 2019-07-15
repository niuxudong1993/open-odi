package com.spring.odi.framework.oauth.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@SuppressWarnings("unused")
public class ODILoginAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    private Logger logger= LoggerFactory.getLogger(ODILoginAuthenticationFailureHandler.class);
    private String defaultFailureUrl;
    private boolean forwardToDestination = false;
    private boolean allowSessionCreation = true;
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    public ODILoginAuthenticationFailureHandler() {
        super();
    }

    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        logger.info("登录用户服务失败");
        if (defaultFailureUrl == null) {
            logger.debug("No failure URL set, sending 401 Unauthorized error");

            response.sendError(HttpStatus.UNAUTHORIZED.value(),
                    HttpStatus.UNAUTHORIZED.getReasonPhrase());
        }
        else {
            saveException(request, exception);

            if (forwardToDestination) {
                logger.debug("Forwarding to " + defaultFailureUrl);

                request.getRequestDispatcher(defaultFailureUrl)
                        .forward(request, response);
            }
            else {
                logger.debug("Redirecting to " + defaultFailureUrl);
                redirectStrategy.sendRedirect(request, response, defaultFailureUrl);
            }
        }

    }
}