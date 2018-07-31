package owner_property;


import org.aeonbits.owner.Config;

public interface BrowserSettings extends Config {

    String name ();
    String version();
    String platform();
    boolean isRemote();
    boolean javascriptEnabled();
    boolean acceptSslCeres();
}
