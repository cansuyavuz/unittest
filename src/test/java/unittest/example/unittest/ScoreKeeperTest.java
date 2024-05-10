package unittest.example.unittest;

import org.junit.jupiter.api.BeforeEach;

public class ScoreKeeperTest {
    @SuppressWarnings("unused")
    private ScoreKeeper scoreKeeper;

    @BeforeEach
    public void setUp() {
        scoreKeeper = new ScoreKeeper();
    }
}