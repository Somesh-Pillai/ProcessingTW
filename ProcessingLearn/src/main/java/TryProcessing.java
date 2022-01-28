import processing.core.PApplet;

public class TryProcessing extends PApplet {


    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    int s1, s2, s3, s4 = 0 ;
    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() { //called once
//        ellipse(WIDTH/2, HEIGHT/2, 100,100 );           //(x, y, height width)

    }

    @Override
    public void draw() {   // infinite call
//        printWhite();
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(s1, HEIGHT/5, DIAMETER,DIAMETER);
        s1++;
    }
    private void drawCircle2() {
        ellipse(s2, 2 * HEIGHT/5, DIAMETER,DIAMETER);
        s2 += 2;
    }
    private void drawCircle3() {
        ellipse(s3, 3 * HEIGHT/5, DIAMETER,DIAMETER);
        s3 += 3;
    }
    private void drawCircle4() {
        ellipse(s4, 4 * HEIGHT/5, DIAMETER,DIAMETER);
        s4 += 4;
    }

   // private void printWhite() {
   //     background(255);                             //erasing every time we draw by white
   // }
}
