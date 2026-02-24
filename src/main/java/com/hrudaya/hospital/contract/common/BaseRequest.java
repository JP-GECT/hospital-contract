package com.hrudaya.hospital.contract.common;

public abstract class BaseRequest {

    private String requestId;

    public BaseRequest() {}

    public BaseRequest(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}