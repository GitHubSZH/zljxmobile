package com.zljx.verify;

import java.util.Date;

public class TTask {
    private Long taskId;

    private Long aapId;

    private String title;

    private String context;

    private Byte verifyType;

    private Byte stauts;

    private Date createTime;

    private Long createOperation;

    private Date lastUpdateTime;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getAapId() {
        return aapId;
    }

    public void setAapId(Long aapId) {
        this.aapId = aapId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Byte getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Byte verifyType) {
        this.verifyType = verifyType;
    }

    public Byte getStauts() {
        return stauts;
    }

    public void setStauts(Byte stauts) {
        this.stauts = stauts;
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
}