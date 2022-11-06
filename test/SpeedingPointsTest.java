import org.junit.jupiter.api.BeforeEach;

class SpeedingPointsTest {
    SpeedingPoints speedingPoints;

    @BeforeEach
    void setUp() {
        speedingPoints = new SpeedingPoints();
    }

    @org.junit.jupiter.api.Test
    void testAll() {
        for (int limit = 20; limit < 80; limit+= 10) {
            int points = 0;
            for (int i = 20; i < 102; i++) {
                speedingPoints.checkPoints(i, limit);
                int newPoints = speedingPoints.getPoints();
                if (newPoints > points) {
                    System.out.println(speedingPoints.getOutcomeStr(i, limit));
                    points = newPoints;
                }
            }
        }
    }
}