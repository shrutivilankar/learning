
package com.shruti.learning;

public class BrowserHistoryLinkedList{

    Node firstNode = new Node();
    class Node{
        Node next;
        String link;
        Node previous;
    }

    public void add(String link){

        if(firstNode.link == null) {
           firstNode.link = link;
        }
        if(firstNode.link != null) {
            Node newNode = new Node();
            newNode.link = link;
            if(firstNode.next != null) //no new element in chain
                firstNode.previous = newNode;
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void remove(String link){
        Node node = this.firstNode;
        while(node.next != null){
            if(node.link.equals(link))
            {
                Node previousNode = node.previous;
                Node nextNode = node.next;
                previousNode.next = nextNode;
                nextNode.previous = previousNode;
                break;
            }
            node = node.next;
        }
    }

    public static void main(String[] args){
        BrowserHistoryLinkedList ll = new BrowserHistoryLinkedList();
        ll.add("google.com");
        ll.add("linkedin.com");
        ll.add("stackoverflow.com");
        ll.add("yahoo.com");
        ll.add("microsoft.com");
        ll.add("ikea.com");

        ll.remove("stackoverflow.com");
        ll.remove("linkedin.com");

    }


}