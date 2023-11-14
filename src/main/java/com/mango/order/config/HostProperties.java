package com.mango.order.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("host")
public class HostProperties {

    private String email;
    private List<Cluster> cList = new ArrayList<>();

    public static class Cluster {
        private String ip;
        private String path;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public String toString() {
            return "clusters{" +
                    "ip='" + ip + '\'' +
                    ", path='" + path + '\'' +
                    '}';
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cluster> getCList() {
        return cList;
    }

    public void setCList(List<Cluster> cList) {
        this.cList = cList;
    }

    @Override
    public String toString() {
        return "ServerProperties{" +
                "email='" + email + '\'' +
                ", cList=" + cList +
                '}';
    }
}
