package org.example.proxy;

public class ProxyConnection implements Connection {
    private RealConnection connection;
    public ProxyConnection() {
        connection = new RealConnection();
    }
    private static final String[] blockedSites = {"facebook.com","instagram.com","twitter.com"};
    @Override
    public void connect(String host) {
        if(isSiteBlocked(host)) {
            System.out.println("Site blocked!");
        }
        else {
            connection.connect(host);
        }
    }
    private boolean isSiteBlocked(String site) {
        for (String blockedSite : blockedSites) {
            if (site.equals(blockedSite)) {
                return true;
            }
        }
        return false;
    }
}
