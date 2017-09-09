package zooanimals;

public abstract class Animal {

  protected String name;
  protected String gender;
  protected int age;
  protected int weightInKgs;

  public abstract void greet();

  public abstract String wantChild();

  public abstract void move();

  public abstract void eat();

  public abstract void rest();

  public String getName() {
    return name;
  }
}
