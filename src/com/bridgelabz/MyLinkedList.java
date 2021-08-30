package com.bridgelabz;

public class MyLinkedList<k> {
    public k search(k key) {
        return null;
    }

    public void append() {
        append();
    }

    public void append(MyMapNode myMapNode) {
    }

    private static class MyLinkedlist {
        private INode tail;
        private INode head;

        public MyLinkedlist() {
            this.head = null;
            this.tail = null;
        }

    public void append(INode myMapNode) {
        INode newNode = null;
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }

   

        public void add(INode newNode) {
            if (this.tail == null) {
                this.tail = newNode;
            }
            if (this.head == null) {
                this.head = newNode;
            } else {
                INode tempnode = this.head;
                this.head = newNode;
                this.head.setNext(tempnode);
            }
        }
            

        }



        public void insert(INode mynode , INode newnode) {
            INode tempnode=mynode.getNext();
            mynode.setNext(newnode);
            newnode.setNext(tempnode);
        }
    }

