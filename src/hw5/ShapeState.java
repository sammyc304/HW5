package hw5;

import java.awt.*;

public class ShapeState {

  private final int tick;
  private final Position p;
  private final Dimension d;
  private final Color c;
  private final ShapeType s;
  private final CPComponent cp;

  public ShapeState() {
    this.tick = 0;
    this.p = new Position();
    this.d = new Dimension();
    this.c = new Color(0, 0, 0);
    this.s = null;
    this.cp = new CPComponent(p, d, c, s);
  }

  public ShapeState(int tick, Position p, Dimension d, Color c, ShapeType s) {
    this.tick = tick;
    this.p = new Position(p);
    this.d = new Dimension(d);
    this.c = new Color(c.getRGB());
    this.s = s;
    this.cp = new CPComponent(p, d, c, s);
  }
}
