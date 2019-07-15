package com.spring.odi.framework.queue.queue;

public interface BaseQueue<E> {

    /**
     * 功能描述: <br>
     * 获取队列数据
     * @param
     * @return:E
     **/
    E take() throws InterruptedException;

    /**
     * 功能描述: <br>
     * 添加队列数据
     * @param
     * @return:E
     **/
    boolean add(E object);

    /**
     * 功能描述: <br>
     * 移除队列数据
     * @param
     * @return:E
     **/
    boolean remove(E object);


    /**
     * 功能描述: <br>
     * 判断队列数据存在
     * @param
     * @return:E
     **/
    boolean contains(E object);

    /**
     * 功能描述: <br>
     * 获取数量
     * @param
     * @return:int
     * @Date: 2019/7/14 14:24
     **/
    int size();
}
