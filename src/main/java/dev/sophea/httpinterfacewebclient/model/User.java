package dev.sophea.httpinterfacewebclient.model;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String uuid;

    private String name;

    private String gender;

    private String numberPhone;

    private String email;

}
