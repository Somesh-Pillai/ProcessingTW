public class Balls {
    private final int speed;   //encapsulation
    private int xPos;
    private final int yPos;

    public Balls(int speed, int yPos, PApplet pApplet) {
        this.speed = speed;
        this.xPos = 0;
        this.yPos = yPos;
        this.pApplet = pApplet;
    }

    public int getSpeed() {  //getters and setters
        return speed;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

}

