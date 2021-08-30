package com.bridgelabz;

public abstract class MyMapNode<k, v> extends MyMapNode<k, v> implements INode<k> {
    k Key;
    v value;
    MyMapNode<k,v> next;
    private k key;

    public MyMapNode(){
        super();
        this.Key=key;
        this.value=value;
        next=null;
    }

    public MyMapNode(k key, v value) {
    }

    @Override
    public k getKey(){
        return key;
    }

    @Override
    public void setKey(k key){
        this.key = key;
    }

    @Override
    public INode<k> getNext(){
        return next;
    }
    public void setNext(v value){
        this.value=value;
    }

    @Override
    public void setNext(INode<k> next){
        this.next=(MyMapNode<k, v>)next;
    }

    @Override
    public <v> v getvalue() {
        return null;
    }

    @Override
    public String toString(){
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{"+ "k=").append(key).append("v=").append(value).append('}');
        if(next!=null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }

    public void setValue(v value) {
        this.value = value;
    }

    public v getValue() {
        return value;
    }
}

