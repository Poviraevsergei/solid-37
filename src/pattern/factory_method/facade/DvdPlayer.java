package pattern.factory_method.facade;

public class DvdPlayer {

    public void putDisc(String movieDisk){
        System.out.println("Disk with " + movieDisk + " movie set to dvd");
    }

    public void play() {
        System.out.println("DvdPlayer play");
    }

    public void on(){
        System.out.println("DvdPlayer on");
    }

    public void off(){
        System.out.println("DvdPlayer off");
    }

    public void stop(){
        System.out.println("DvdPlayer stop");
    }
}
