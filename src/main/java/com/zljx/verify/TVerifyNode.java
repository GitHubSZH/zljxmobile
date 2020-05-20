package com.zljx.verify;

public class TVerifyNode {
    private Long nodeId;

    private Long operationId;

    private Long flowId;

    private Byte flowOrder;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Byte getFlowOrder() {
        return flowOrder;
    }

    public void setFlowOrder(Byte flowOrder) {
        this.flowOrder = flowOrder;
    }
}