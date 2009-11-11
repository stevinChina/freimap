/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package freimapgsoc;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.HashMap;

/**
 *
 * @author stefanopilla
 */
public class MapNode implements Comparable, Serializable {

    public MapNode() {
    }

    public MapNode(String ip) {
        this(ip, "noname"); //use "noname" as a name
    }

    public MapNode(String ip, String name) {
        this.name = name;
        this.ip = ip;
    }

    public MapNode(String id, double lat, double lon) {
        this.lat=lat;
        this.lon=lon;
    }

    public MapNode(String ip, String name, double lat, double lon) {
        this.name = name;
        this.lat=lat;
        this.lon=lon;
    }

    public MapNode(String ip, String name, double uptime) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
    }

    public MapNode(String ip, String name, double uptime, Connections conn) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
        this.conn = conn;
    }

    public MapNode(String ip, String name, double uptime, Connections conn, Interfaces ifaces) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
        this.conn = conn;
        this.inter = ifaces;
    }

    public MapNode(String ip, String name, double uptime, Connections conn, Interfaces ifaces, double lat, double lon) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
        this.conn = conn;
        this.inter = ifaces;
        this.lat = lat;
        this.lon = lon;

    }

    public MapNode(String ip, String name, double uptime, Connections conn, Interfaces ifaces, double lon) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
        this.conn = conn;
        this.inter = ifaces;
        this.lat = DEFAULT_LAT;
        this.lon = DEFAULT_LON;

    }

    public MapNode(String ip, String name, double uptime, Connections conn, Interfaces ifaces, double lat, double lon, HashMap<String, Object> attributes) {
        this.name = name;
        this.ip = ip;
        this.uptime = uptime;
        this.conn = conn;
        this.inter = ifaces;
        this.lat = lat;
        this.lon = lon;
        this.attributes = attributes;
    }
    MapNode eqo;



    public boolean equals(Object o) {
        if (!(o instanceof MapNode)) {
            return false;
        }
        eqo = (MapNode) o;
        if (this.name.equals(eqo.name)) {
            return true;
        }
        /*if (this.fqid != null) {
        if (this.fqid.equals(eqo.id)) return true;
        if (eqo.fqid != null) {
        if (this.fqid.equals(eqo.fqid)) return true;
        if (eqo.fqid.equals(this.id)) return true;
        }
        }*/
        return false;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public String name;
    public String ip;
    public double uptime;
    public Connections conn;
    public Interfaces inter;
    public Services services;
    public InetAddress addr;
    public double DEFAULT_LAT = Double.NaN;
    public double DEFAULT_LON = Double.NaN;
    public double lat;
    public double lon;
    public HashMap<String, Object> attributes = new HashMap<String, Object>();


}