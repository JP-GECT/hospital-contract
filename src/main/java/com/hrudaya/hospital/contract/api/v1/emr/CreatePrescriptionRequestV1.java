package com.hrudaya.hospital.contract.api.v1.emr;



import com.hrudaya.hospital.contract.common.BaseRequest;

public class CreatePrescriptionRequestV1 extends BaseRequest {

    private String patientId;
    private String medicationName;
    private String dosage;
    private String instructions;

    public CreatePrescriptionRequestV1() {}

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}