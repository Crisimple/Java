package com.secoder.secoder_spring_boot_starter_autoconfigure;

/**
 * @Author crisimple
 * @File HelloPropertie
 * @Time 2021-04-24 21:16
 * @Description
 */
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
