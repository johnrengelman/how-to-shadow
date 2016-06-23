package shadow;

import shadow.client.Version;

public class AdapterVersion {

  public static String getVersion() {
    return "Adapter: " + Version.getVersion();
  }
}
