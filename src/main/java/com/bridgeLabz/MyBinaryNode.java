package com.bridgeLabz;

public class MyBinaryNode<K extends Comparable<K>>{
    K key;//root
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key){
        this.key = key;
        this.left = null;
        this.right =null;
    }
}
