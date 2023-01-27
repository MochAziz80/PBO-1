import java.util.Random;
import java.util.Scanner;

public class Player {

    String nama;
    int speed;
    int hp;

    void run(){
        System.out.println(nama+" is running...");
        System.out.println("speed = "+speed);
    }

    boolean isdead(){
        if(hp<=0) return true;
        return false;

    }
}



