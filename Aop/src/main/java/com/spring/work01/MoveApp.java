package com.spring.work01;

public class MoveApp {
    public static void main( String[] args ) {
        Move t1=new Tank();
        Move moveproxy1=new TankProxy(t1);
        moveproxy1.move();
    }
}
