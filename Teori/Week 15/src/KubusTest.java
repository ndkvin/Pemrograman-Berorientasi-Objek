import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KubusTest {
  Kubus kubus;
  
  @BeforeEach
  public void setup() {
    kubus =  new Kubus();
  }

  @Test
  public void testHitungVolume() {
    assertEquals(125.0, kubus.hitungVolume(5));
  }
}
