package shadow;

import shadow.client.Version;

public class App {

  // tag::main[]
  public static void main(String[] args) {
    System.out.println(AdapterVersion.getVersion());
    System.out.println(Version.getVersion());
  }
  // end::main[]
}
