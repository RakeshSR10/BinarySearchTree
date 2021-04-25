package com.bridgeLabz;

public class MyBinaryTree<K extends Comparable<K>>{
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    public void search(K key){
        this.root = this.searchRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        if(current == null)
            return new MyBinaryNode<>(key);
        int comapareResult = key.compareTo(current.key);

        if(comapareResult == 0)
            return current;

        if(comapareResult < 0){
            current.left = addRecursively(current.left, key);
        }else{
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    //UC3 search particular number
    private MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key){
        if(current == null)
            return null;
        int searchResult = key.compareTo(current.key);

        if(searchResult == 0)
            return current;

        if(searchResult < 0){
            current.left = searchRecursively(current.left, key);
        }else{
            current.right = searchRecursively(current.right, key);
        }
        return current;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current){
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }
}