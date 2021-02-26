import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls_OOPAttempt extends PApplet {

    public static final int SCREENWIDTH = 640;
    public static final int SCREENHEIGHT = 480;
    public static final int TotalBalls = 4;
    static int Speed=0;

    ArrayList<Ball> ballArray = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBalls_OOPAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(SCREENWIDTH, SCREENHEIGHT);
    }

    @Override
    public void setup() {
        for (int BallNumber = 1; BallNumber <= TotalBalls; BallNumber++) {
            Ball b = new Ball();
            b.setBallHeight(SCREENHEIGHT * BallNumber/5);
            b.setBallWidth(BallNumber);
            ballArray.add(b);
        }
    }

    @Override
    public void draw() {
        for (Ball b :ballArray) {
            int ballSpeed = b.getBallWidth() * Speed;
            int ballHeight = b.getBallHeight();
            ellipse(ballSpeed, ballHeight,Ball.diameter,Ball.diameter);
        }
        Speed++;
    }
}
