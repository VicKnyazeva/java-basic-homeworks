package ru.knyazeva.java.basic.homeworks.homework11;

import java.util.ArrayList;
import java.util.List;

public class Node implements SearchTree {
    private int value;
    private Node left;
    private Node right;

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        var s = " < " + value + " > ";
        if (left != null) {
            s = left.value + s;
        }
        if (right != null) {
            s = s + right.value;
        }
        return "(" + s + ")";
    }

    public static Node sortedListToBST(List<Integer> arrList) {
        if (arrList == null || arrList.isEmpty())
            return null;

        return build(arrList, 0, arrList.size() - 1);
    }

    private static Node build(List<Integer> arrList, int leftIndex, int rightIndex) {
        int middle = (leftIndex + rightIndex + 1) / 2;
        Node node = new Node(arrList.get(middle));

        if (leftIndex <= middle - 1)
            node.left = build(arrList, leftIndex, middle - 1);

        if (middle + 1 <= rightIndex)
            node.right = build(arrList, middle + 1, rightIndex);

        return node;
    }

    @Override
    public boolean find(int value) {
        if (this.value > value) {
            return this.left != null && this.left.find(value);
        }
        if (this.value < value) {
            return this.right != null && this.right.find(value);
        }
        return true;
    }

    @Override
    public List getSortedList() {
        List<Integer> list = new ArrayList<>();
        collect(list, this);
        return list;
    }

    private static void collect(List<Integer> list, Node node) {
        if (node.left != null)
            collect(list, node.left);

        list.add(node.value);

        if (node.right != null)
            collect(list, node.right);
    }
}
