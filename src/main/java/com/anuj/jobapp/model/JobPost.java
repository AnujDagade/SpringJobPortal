package com.anuj.jobapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String jobTitle;
    private String Description;
    private String location;
    private String companyName;
    private List<String> techStack;


}
