package com.zljx.verify;

import java.util.Date;

public class TVerifyFlowIns {
    private Long flowInsId;

    private Long taskId;

    private Byte verifyType;

    private Long nextId;

    private Long lastVerifyId;

    private Byte verifyStatus;

    private Date lastVerifyTime;

    private String refuseReason;

    public Long getFlowInsId() {
        return flowInsId;
    }

    public void setFlowInsId(Long flowInsId) {
        this.flowInsId = flowInsId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Byte getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Byte verifyType) {
        this.verifyType = verifyType;
    }

    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }

    public Long getLastVerifyId() {
        return lastVerifyId;
    }

    public void setLastVerifyId(Long lastVerifyId) {
        this.lastVerifyId = lastVerifyId;
    }

    public Byte getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Byte verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Date getLastVerifyTime() {
        return lastVerifyTime;
    }

    public void setLastVerifyTime(Date lastVerifyTime) {
        this.lastVerifyTime = lastVerifyTime;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }
}