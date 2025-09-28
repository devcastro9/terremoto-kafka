package com.wintux.terremotokafka.model;

import java.util.Map;

public class Product {
    private String id;
    private String type;
    private String code;
    private String source;
    private Long updateTime;
    private String status;
    private Map<String, String> properties;
    private Integer preferredWeight;
    private Map<String, ProductContent> contents;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public Integer getPreferredWeight() {
        return preferredWeight;
    }

    public void setPreferredWeight(Integer preferredWeight) {
        this.preferredWeight = preferredWeight;
    }

    public Map<String, ProductContent> getContents() {
        return contents;
    }

    public void setContents(Map<String, ProductContent> contents) {
        this.contents = contents;
    }
}
