package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(MAX_RANDOM_NUMBER));
        ball.setColor(colorSupplier.getRandomColor());

        return ball;
    }
}
