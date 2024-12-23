package com.anuj.jobapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    private String jobTitle;
    private String description;
    private String location;
    private String companyName;

    //TODO: Learn about @ElementCollection
    @ElementCollection
    @CollectionTable(name = "tech_stack")
    private List<String> techStack;


}
