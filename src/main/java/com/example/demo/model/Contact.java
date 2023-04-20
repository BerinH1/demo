package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Contact {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "contact_id")
    private int contactId;

    @NotBlank(message = "Please enter First Name")
    @Size(min = 3, message = "Name must be longer than 3 characters")
    private String firstName;

    @NotBlank(message = "Please enter Last name")
    @Size(min = 3, message = "Last name has to have at least 3 characters")
    private String lastName;

    @NotBlank(message = "Please enter your e-mail")
    @Email(message = "Please provide a valid e-mail Address")
    private String email;

    @NotBlank(message = "Please enter your message")
    @Size(min = 10, message = "Message must be at least 10 characters long")
    private String message;

    private String status;

}
