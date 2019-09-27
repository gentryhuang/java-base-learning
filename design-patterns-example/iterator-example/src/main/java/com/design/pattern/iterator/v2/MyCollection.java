package com.design.pattern.iterator.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * MyCollection
 *
 * @author shunhua
 * @date 2019-09-27
 */
public class MyCollection<T> {
    /**
     * 元素集合
     */
   private final List<T> list = new ArrayList<>();

    /**
     * 增加元素
     * @param item
     */
    public void add(T item){
        list.add(item);
    }

    /**
     * 移出元素
     */
    public void remove(T item){
        this.list.remove(item);
    }

    /**
     * 删除所有元素
     */
    public void removeAll(){
        this.list.removeAll(list);
    }

    /**
     * 获取迭代器，注意需要把实体对象列表传给迭代器
     * @return
     */
    public MyIterator iterator(){
       return new MyIterator(list);
    }


}