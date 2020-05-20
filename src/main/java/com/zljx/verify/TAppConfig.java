package com.zljx.verify;

import java.util.Date;

public class TAppConfig {
    private Long appId;

    private String appName;

    private String description;

    private Date createTime;

    private Long createOperation;

    private Date lastCreateTime;

    private Long lastUpdateOperation;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateOperation() {
        return createOperation;
    }

    public void setCreateOperation(Long createOperation) {
        this.createOperation = createOperation;
    }

    public Date getLastCreateTime() {
        return lastCreateTime;
    }

    public void setLastCreateTime(Date lastCreateTime) {
        this.lastCreateTime = lastCreateTime;
    }

    public Long getLastUpdateOperation() {
        return lastUpdateOperation;
    }

    public void setLastUpdateOperation(Long lastUpdateOperation) {
        this.lastUpdateOperation = lastUpdateOperation;
    }
}