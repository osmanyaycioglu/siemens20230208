package com.siemens.training.restproject;

public class CreatePersonResponse {
    private Integer status;
    private Long personId;
    private Person person;

    public CreatePersonResponse() {
    }

    public CreatePersonResponse(Integer statusParam,
                                Long personIdParam,
                                Person personParam) {
        status = statusParam;
        personId = personIdParam;
        person = personParam;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer statusParam) {
        status = statusParam;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personIdParam) {
        personId = personIdParam;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person personParam) {
        person = personParam;
    }

    @Override
    public String toString() {
        return "CreatePersonResponse{" +
               "status=" + status +
               ", personId=" + personId +
               ", person=" + person +
               '}';
    }
}
