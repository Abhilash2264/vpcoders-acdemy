package partice;

public class PrimeVideo {
    private String home;
    private String store;
    private String channels;
    private String find;
    private String myStuff;

    public PrimeVideo(String home, String store, String channels, String find) {
        this.home = home;
        this.store = store;
        this.channels = channels;
        this.find = find;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getFind() {
        return find;
    }

    public void setMyStuff(String myStuff) {
        this.myStuff = myStuff;
    }

    public void setFind(String find) {
        this.find = find;
    }
}
