/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Audi extends Car implements Vehicle{

    public Audi(String type) {
        super(type);
    }

    @Override
    public void move(int time) {
        super.pos = super.distance(5, time);
    }    
    
    public void run(){
        super.run();
        int time = 1;
        while(time++ < 10) this.move(time);
    }

    @Override
    protected void showInfo() {
        System.out.println(super.type+" is at position: "+super.pos);
    }
}
