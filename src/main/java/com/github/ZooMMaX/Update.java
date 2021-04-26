package com.github.ZooMMaX;

public class Update {
    String json;

    public Update(String json){
        this.json=json;

    }

    public GetMessage getMessage() {
        return new GetMessage(json);
    }
}
