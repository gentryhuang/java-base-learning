package com.design.pattern.iterator.v2;

import java.util.List;

/**
 * MyIterator
 *
 * @author shunhua
 * @date 2019-09-27
 */
public class MyIterator<T> {

    /**
     * 集合
     */
    private List<T> list ;
    /**
     * 游标
     */
    private int position;

    /**
     * 集合中的元素
     */
    private T item;

    public MyIterator(List<T> list){
        this.list = list;
    }

    /**
     * 是否有下一个元素
     * @return
     */
    public boolean hasNext(){
        if( this.position < list.size()){
            return true;
        }
        return false;
    }

    public T next(){
        T item = list.get(position);
        position ++;
        return item;
    }

}