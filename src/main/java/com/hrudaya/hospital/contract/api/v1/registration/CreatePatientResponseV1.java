package com.hrudaya.hospital.contract.api.v1.registration;



import com.hrudaya.hospital.contract.common.BaseResponse;
import com.hrudaya.hospital.contract.enums.StatusType;

public class CreatePatientResponseV1 extends BaseResponse {

    private String patientId;

    public CreatePatientResponseV1() {}

    public CreatePatientResponseV1(String requestId,
                                   StatusType status,
                                   String message,
                                   String patientId) {
        super(requestId, status, message);
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}