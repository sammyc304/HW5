package hw5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.awt.*;

public class BasicAMITest {
  private Position position1 = new Position();
  private Dimension dimension1 = new Dimension();
  private Shape testShapeCircle = new Shape("testShape1Circle", 1,
          position1, dimension1, Color.GREEN, ShapeType.OVAL);
  private BasicAMI ami1 = new BasicAMI();


  @Test
  public void testAddShape() {
    ami1.addShape(testShapeCircle);
    assertEquals(testShapeCircle, ami1.getShape("testShape1Circle"));
  }

  @Test
  public void testGetShape() {
    ami1.addShape(testShapeCircle);
    assertEquals(testShapeCircle, ami1.getShape("testShape1Circle"));

    Shape testShapeCircle2 = new Shape("testShape1Circle", 1,
            position1, dimension1, Color.GREEN, ShapeType.OVAL);
  }

  @Test
  public void testModifyShape() {
    ami1.modifyShape("testShape1Circle", 1, position1, dimension1, Color.BLACK);
  }

  @Test
  public void testRemoveShape() {

  }

  @Test
  public void testRemoveAll() {

  }
  @Test
  public void testTextOutput() {

  }
}
