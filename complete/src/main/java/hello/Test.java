package hello;

/**
 * Created by Zhangshunyu on 2017/12/16.
 */
public class Test {
  private String name;
  private String id;

  public Test(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
