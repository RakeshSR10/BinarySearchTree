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
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(70);
        myBinaryTree.add(60);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(95);

        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
}
