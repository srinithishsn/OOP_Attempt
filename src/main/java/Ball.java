import processing.core.PApplet;

public class Ball {
    public static final int diameter = 15;
    private int ballHeight;
        private int ballPosition;
        private int speed;

    public Ball(int ballHeight, int ballPosition, int speed) {
        this.ballHeight = ballHeight;
        this.ballPosition = ballPosition;
        this.speed = speed;
    }
    public void move(){
        ballHeight+=speed;
    }
    public void draw(PApplet pApplet) {
        pApplet.ellipse(ballHeight,ballPosition, diameter, diameter);
    }
}
