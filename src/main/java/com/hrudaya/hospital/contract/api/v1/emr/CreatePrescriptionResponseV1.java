package com.hrudaya.hospital.contract.api.v1.emr;



import com.hrudaya.hospital.contract.common.BaseResponse;
import com.hrudaya.hospital.contract.enums.StatusType;

public class CreatePrescriptionResponseV1 extends BaseResponse {

    private String prescriptionId;

    public CreatePrescriptionResponseV1() {}

    public CreatePrescriptionResponseV1(String requestId,
                                        StatusType status,
                                        String message,
                                        String prescriptionId) {
        super(requestId, status, message);
        this.prescriptionId = prescriptionId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
}