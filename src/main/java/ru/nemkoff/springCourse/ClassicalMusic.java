package ru.nemkoff.springCourse;

public class ClassicalMusic implements Music {
  @Override
  public String getSong() {
    return "Rhapsody Levitan";
  }
  public void doMyInit() {
    System.out.println("Doing my initialization");
  }

  public void doMyDestroy() {
    System.out.println("Doing my destroy");
  }
}
