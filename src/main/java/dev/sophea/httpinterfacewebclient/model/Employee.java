package dev.sophea.httpinterfacewebclient.model;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String id;

    private String uuid;

    private String fullName;


    private String firstName;

    private String lastName;

    private String password;

    private String gender;

    private String email;

    private String phoneNumber;
}
