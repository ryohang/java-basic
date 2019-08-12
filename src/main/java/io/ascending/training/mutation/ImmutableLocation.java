package io.ascending.training.mutation;

public class ImmutableLocation {
    private final int x;
    private final int y;
    public ImmutableLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public String toString(){
        return "immutable location @(x:"+x+","+"y:"+y+")";
    }
}
