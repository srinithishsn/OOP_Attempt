import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class FourBalls_OOPAttempt extends PApplet {

    public static final int SCREENWIDTH = 640;
    public static final int SCREENHEIGHT = 480;
    public static final int TotalBalls = 5;
    public static final int BALL4_POSITION = SCREENHEIGHT * 4 / TotalBalls;
    public static final int BALL3_POSITION = SCREENHEIGHT * 3 / TotalBalls;
    public static final int BALL2_HEIGHT = SCREENHEIGHT * 2 / TotalBalls;
    public static final int BALL1_HEIGHT = SCREENHEIGHT * 1 / TotalBalls;
    public static final int InitialPosition = 0;

    private int Speed1=1;
    private int Speed2=2;
    private int Speed3=3;
    private int Speed4=4;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("FourBalls_OOPAttempt",args);
    }

    @Override
    public void settings() {
        size(SCREENWIDTH, SCREENHEIGHT);
    }


    @Override
    public void setup() {
        ball1 = new Ball(InitialPosition, BALL1_HEIGHT, Speed1);
        ball2 = new Ball(InitialPosition, BALL2_HEIGHT, Speed2);
        ball3 = new Ball(InitialPosition, BALL3_POSITION, Speed3);
        ball4 = new Ball(InitialPosition, BALL4_POSITION, Speed4);
        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    };

    @Override
    public void draw() {
        balls.forEach(Ball::move);
        balls.forEach(ball -> ball.draw(this));
    }
}
