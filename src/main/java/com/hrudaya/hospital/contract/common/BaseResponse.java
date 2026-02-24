package com.hrudaya.hospital.contract.common;



import com.hrudaya.hospital.contract.enums.StatusType;

public abstract class BaseResponse {

    private String requestId;
    private StatusType status;
    private String message;

    public BaseResponse() {}

    public BaseResponse(String requestId, StatusType status, String message) {
        this.requestId = requestId;
        this.status = status;
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}