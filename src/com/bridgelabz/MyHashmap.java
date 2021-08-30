package com.bridgelabz;

public class MyHashmap<k,v> {
    MyLinkedList<k> myLinkedList;
    private k key;

    public MyHashmap(){
        this.myLinkedList=new MyLinkedList<>();
    }

    public v get(k key) {
        MyMapNode<k,v> myMapNode=(MyMapNode<k,v>)this.myLinkedList.search(key);
        return(myMapNode == null) ? null:myMapNode.getvalue();
    }

    public void add(k word, v value) {
        MyMapNode<k,v> myMapNode=(MyMapNode<k, v>) this.myLinkedList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<k, v>(key, value) {
                @Override
                public <v> v getvalue() {
                    return null;
                }
            };
            this.myLinkedList.append(myMapNode);
        }else{
            myMapNode.setValue(value);
        }

    }
}
