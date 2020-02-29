package com.shruti.learning;

public class BlogPost{
    public BlogPost(){

    }
    public BlogPost(String text){
        this.text = text;
    }

    String text;   
    public String getText(){
        return this.text;
    } 
    public void setText(String text){
        this.text = text;
    }
}