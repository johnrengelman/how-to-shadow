package shadow;

import shadow.client.Version;
import shadow.runtime.Runtime;

public class App {

  // tag::main[]
  public static void main(String[] args) {
    System.out.println(AdapterVersion.getVersion());
    Runtime.execute();
  }
  // end::main[]
}
