package com.hrudaya.hospital.contract.api.v1.registration;



import com.hrudaya.hospital.contract.common.BaseRequest;

public class CreatePatientRequestV1 extends BaseRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;

    public CreatePatientRequestV1() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}