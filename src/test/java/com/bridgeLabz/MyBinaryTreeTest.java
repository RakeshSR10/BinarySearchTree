package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    //UC1 Ability to create BST by adding 56, 30 and 70
    @Test
    public void given3NumbersWhenAddedToBSTShouldReturnSize3(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
}
