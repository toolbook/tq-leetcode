package com.tq.code.part2;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    //添加新的结点
    public void add(int newVal){
        ListNode newNode=new ListNode(newVal);
        if(this.next==null){
            this.next=newNode;
        }else{
            this.next.add(newVal);
        }
    }
    //打印链表
    public void print(){
        System.out.print(this.val+"");
        if(this.next!=null){
            System.out.print("->");
            this.next.print();
        }else{
            System.out.println("->null");
        }
    }
}