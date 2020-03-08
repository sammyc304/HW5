package hw5;

import java.awt.*;
import java.util.ArrayList;

public class Shape {

  ArrayList<ShapeState> log;
  String name;
  ShapeType s;

  public Shape() {
    this.log = new ArrayList<>();
    this.name = "";
    this.s = null;
  }

  public Shape(String name, int tick, Position p, Dimension d, Color c, ShapeType s) {
    this.log = new ArrayList<>();
    this.name = name;
    this.s = s;
    log.add(new ShapeState(tick, p, d, c, s));
  }

  public void setNewState(int tick, Position p, Dimension d, Color c) {
    log.add(new ShapeState(tick, p, d, c, s));
  }
}
