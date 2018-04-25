import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMockForTestsTest {

  @Test
  public void getSimleTextTest() {

    SimpleMockForTests mockForTests = new SimpleMockForTests();

    assertThat(mockForTests.getSimleText(),is("Simle text here"));
  }
}