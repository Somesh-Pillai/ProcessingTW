import processing.core.PApplet;

import java.util.List;
import java.util.ArrayList;

public class FourBallsChallenge extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    private List<Balls> balls;    //List<Object> list = new ArrayList<Object>();

    public FourBallsChallenge() {  //constructor makes a list of Balls
        balls = new ArrayList<Balls>();

        balls.add(new Balls(1, HEIGHT * 1 / 5));
        balls.add(new Balls(2, HEIGHT * 2 / 5));
        balls.add(new Balls(3, HEIGHT * 3 / 5));
        balls.add(new Balls(4, HEIGHT * 4 / 5));
    }

    public static void main(String[] args){
        PApplet.main("FourBallsChallenge", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        newPositions();
        drawBalls();
    }
    void newPositions() {
        for (Balls ball : balls) {  //type Balls of balls list
            int newXPos = ball.getXPos() + ball.getSpeed();
            ball.setXPos(newXPos);
        }
    }
    void drawBalls(){
            for(Balls ball: balls){
                drawCircle(ball.getXPos(), ball.getYPos());
            }
        }

    private void drawCircle(int xPos, int yPos) {
        ellipse(xPos, yPos, DIAMETER, DIAMETER);
    }
}



