package com.zljx.verify;

import java.util.Date;

public class TVerifyFlow {
    private Long verifyFlowId;

    private Long appId;

    private Byte verifyType;

    private Date createTime;

    private Long createOperation;

    private Date lastUpdateTime;

    private Long lastUpdateOperation;

    public Long getVerifyFlowId() {
        return verifyFlowId;
    }

    public void setVerifyFlowId(Long verifyFlowId) {
        this.verifyFlowId = verifyFlowId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Byte getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Byte verifyType) {
        this.verifyType = verifyType;
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

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getLastUpdateOperation() {
        return lastUpdateOperation;
    }

    public void setLastUpdateOperation(Long lastUpdateOperation) {
        this.lastUpdateOperation = lastUpdateOperation;
    }
}