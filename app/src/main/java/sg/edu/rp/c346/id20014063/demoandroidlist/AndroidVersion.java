package sg.edu.rp.c346.id20014063.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    //Without toString, it will give parent ID of the object as output
    //Use toString for a format output
    @Override
    public String toString() {
        return name + " " + version;
    }
}
