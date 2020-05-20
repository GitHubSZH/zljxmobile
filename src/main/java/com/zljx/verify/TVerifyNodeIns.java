package com.zljx.verify;

import java.util.Date;

public class TVerifyNodeIns {
    private Long nodeInsId;

    private Long flowInsId;

    private Long operationId;

    private Byte insFlowOrder;

    private Long nextInsNode;

    private Byte isVerify;

    private Date verifyTime;

    public Long getNodeInsId() {
        return nodeInsId;
    }

    public void setNodeInsId(Long nodeInsId) {
        this.nodeInsId = nodeInsId;
    }

    public Long getFlowInsId() {
        return flowInsId;
    }

    public void setFlowInsId(Long flowInsId) {
        this.flowInsId = flowInsId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Byte getInsFlowOrder() {
        return insFlowOrder;
    }

    public void setInsFlowOrder(Byte insFlowOrder) {
        this.insFlowOrder = insFlowOrder;
    }

    public Long getNextInsNode() {
        return nextInsNode;
    }

    public void setNextInsNode(Long nextInsNode) {
        this.nextInsNode = nextInsNode;
    }

    public Byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Byte isVerify) {
        this.isVerify = isVerify;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    @Override
    public String toString() {
        return "TVerifyNodeIns{" +
                "nodeInsId=" + nodeInsId +
                ", flowInsId=" + flowInsId +
                ", operationId=" + operationId +
                ", insFlowOrder=" + insFlowOrder +
                ", nextInsNode=" + nextInsNode +
                ", isVerify=" + isVerify +
                ", verifyTime=" + verifyTime +
                '}';
    }
}