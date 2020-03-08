package hw5;

import java.awt.*;
import java.util.Map;

import hw5.shapes.Oval;
import hw5.shapes.Rectangle;
import hw5.shapes.Triangle;

public class CPComponent extends Component {

  private final Position p;
  private final Dimension d;
  private final Color c;
  private final ShapeType s;
  private static final Map<ShapeType, Function<Position, Dimension,
      ShapeCommand>> knownCommands = Map.of(ShapeType.OVAL, Oval::new,
      ShapeType.RECTANGLE, Rectangle::new, ShapeType.TRIANGLE, Triangle::new);

  public CPComponent(Position p, Dimension d, Color c, ShapeType s) {
    this.p = new Position(p);
    this.d = new Dimension(d);
    this.c = new Color(c.getRGB());
    this.s = s;
  }

  @FunctionalInterface
  interface Function<One, Two, Three> {
    Three apply(One one, Two two);
  }

  @Override
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(c);
    ShapeCommand c;
    Function<Position, Dimension, ShapeCommand> cmd =
        knownCommands.getOrDefault(s, null);
    if (cmd == null) {
      throw new IllegalArgumentException("No command exists");
    } else {
      c = cmd.apply(p, d);
      c.goCommand(g2d);
    }
  }
}
