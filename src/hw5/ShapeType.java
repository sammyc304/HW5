package hw5;

public enum ShapeType {

  TRIANGLE("triangle"), RECTANGLE("rectangle"), OVAL("oval");

  private final String name;

  ShapeType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
