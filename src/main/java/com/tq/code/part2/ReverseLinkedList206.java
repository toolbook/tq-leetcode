package com.tq.code.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 206.反转链表
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author tq
 * @Date 2020/11/14 21:40
 * @Version 1.0
 */
public class ReverseLinkedList206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static void main(String[] args) {
        /**
         * 输入: 1->2->3->4->5->NULL
         * 输出: 5->4->3->2->1->NULL
         */
        ListNode node=new ListNode(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.print();//1->2->3->4->5->null

        reverseList2(node).print();

    }
    public static ListNode reverseList(ListNode head) {
        //TODO
        Stack<ListNode> stack=new Stack<>();
        //把链表节点全都摘掉放到栈中
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        if(stack.isEmpty()){
            return null;
        }
        ListNode node=stack.pop();
        ListNode dummy=node;
        //栈中的节点全部出栈，然后重新连成一个新的链表
        while (!stack.isEmpty()){
            ListNode tempNode=stack.pop();
            node.next=tempNode;
            node=node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next等于空，否则会成环
        node.next=null;
        return dummy;
    }

    /*
    方法2:迭代

    注意：∅:表示空集合,即集合中不包含任何元素
     */
    public static ListNode reverseList2(ListNode head) {
        ListNode prev=null;
        ListNode curr =  head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}



