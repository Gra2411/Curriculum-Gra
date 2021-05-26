package com.cvgras.cvgras.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Document(collection = "usersCV")
@Data
public class UserModel {
    @Id
    private String id;

    private String name;

    private String firstName;

    private String lastName;

    private String job;

    private String city;

    private String country;

    private String email;

    private String phoneNumber;

    private List<Skills> skills;

    private List<Languages> languages;

    private List<WorkExperience> workExperience;

    private List<Education> education;

    private SocialMedia socialMedia;

    private List<Challenges> challenges;

    private Config config;
}
