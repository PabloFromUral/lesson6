import java.util.Random;

public class Animals {//super class
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name; // при создании объекта нужно ввести имя
    }

    public void run(int dist) { // выводит инфо об объекте относительно действия
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so far.");
    }

    public void swim(int dist) {// выводит инфо об объекте относительно действия
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }

    public void jump(double height) {// выводит инфо об объекте относительно действия
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " jump " + height + " m.");
        else System.out.println(this.type + " " + this.name + " can't jump so hi.");
    }

    public void info() { // выводит сведения об объекте в разрезе дейсвтий
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
    }
}

