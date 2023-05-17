package thymeleaf.Workshop.model;

import jakarta.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty(message = "Person name is required")
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
