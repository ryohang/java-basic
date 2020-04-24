package io.ascending.training.mutation;

import java.util.ArrayList;
import java.util.List;

public class MutableLocation {
    private int x;
    private int y;
    public MutableLocation(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return "mutable location @(x:"+x+","+"y:"+y+")";
    }

    public static void main(String[] args){
//        String zhang3=new String("hello ");
//        String zhang3=new String("hello ");
//        zhang3=new String(zhang3+" ryo");
//        System.out.println(zhang3);
        List<MutableLocation> arrs = new ArrayList();
        MutableLocation m1 = new MutableLocation(1,1);
        arrs.add(m1);
        System.out.println(arrs);
        m1.setX(2);
        System.out.println(arrs);

        List<ImmutableLocation> imArrs = new ArrayList();
        ImmutableLocation im1 = new ImmutableLocation(1,1);
        imArrs.add(im1);
        System.out.println(imArrs);

    }
}
