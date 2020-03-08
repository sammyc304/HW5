package hw5;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BasicAMI implements AnimationModelInterface {

  private final Map<String, Shape> elements;

  public BasicAMI() {
    this.elements = new HashMap<>();
  }

  @Override
  public void addShape(Shape s) {
    elements.put(s.getName(), s);
  }

  @Override
  public void addMotion(String name, int tick, Position p, Dimension d, Color c) {
    elements.get(name).setNewState(tick, p, d, c);
  }

  @Override
  public String textOutput() {
    StringBuilder ret_val = new StringBuilder();
    for (Map.Entry<String, Shape> entry : elements.entrySet()) {
      ret_val.append("\n").append("shape ").append(entry.getKey()).append(" ")
          .append(entry.getValue().getShapeType().toString()).append("\n\n");
      int size = entry.getValue().getLog().size();
      for (int i = 0; i < size; ++i) {
        ret_val.append("motion ").append(entry.getKey()).append(" ").
            append(entry.getValue().getLog().get(i).toString());
        if (i < size - 1) {
          ret_val.append("   ").append("motion ").append(entry.getKey()).append(" ").
              append(entry.getValue().getLog().get(i + 1).toString());
        }
        ret_val.append("\n");
      }
    }
    return ret_val.toString();
  }
}
