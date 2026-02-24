package com.hrudaya.hospital.contract.event.v1.registration;

import com.hrudaya.hospital.contract.common.BaseEvent;
import com.hrudaya.hospital.contract.enums.ModuleType;

public class PatientCreatedEventV1 extends BaseEvent {

    private final String patientId;
    private final String firstName;
    private final String lastName;
    private final String email;

    public PatientCreatedEventV1(String patientId,
                                 String firstName,
                                 String lastName,
                                 String email) {
        super(ModuleType.REGISTRATION, "v1");
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
