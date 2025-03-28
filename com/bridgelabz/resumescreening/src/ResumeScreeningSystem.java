package com.bridgelabz.resumescreening.src;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer<String> seResume = new SoftwareEngineer<>("Sidddharth", 5, "Java, Spring Boot");
        DataScientist<List<String>> dsResume = new DataScientist<>("Ishaan", 3, Arrays.asList("Python", "TensorFlow", "SQL"));
        ProductManager<String> pmResume = new ProductManager<>("Dhruv", 7, "Agile, Roadmap Planning");

        Resume<SoftwareEngineer<String>> seProcess = new Resume<>(seResume);
        Resume<DataScientist<List<String>>> dsProcess = new Resume<>(dsResume);
        Resume<ProductManager<String>> pmProcess = new Resume<>(pmResume);

        seProcess.processResume();
        dsProcess.processResume();
        pmProcess.processResume();

        System.out.println("\n--- Screening Multiple Resumes ---");
        List<JobRole<?>> resumes = Arrays.asList(seResume, dsResume, pmResume);
        ResumeScreening.screenResumes(resumes);
    }
}

//Processing Resume:
//Software Engineer Resume: Sidddharth, Experience: 5 years, Skills: Java, Spring Boot
//Processing Resume:
//Data Scientist Resume: Ishaan, Experience: 3 years, Skills: [Python, TensorFlow, SQL]
//Processing Resume:
//Product Manager Resume: Dhruv, Experience: 7 years, Skills: Agile, Roadmap Planning
//
//--- Screening Multiple Resumes ---
//Software Engineer Resume: Sidddharth, Experience: 5 years, Skills: Java, Spring Boot
//Data Scientist Resume: Ishaan, Experience: 3 years, Skills: [Python, TensorFlow, SQL]
//Product Manager Resume: Dhruv, Experience: 7 years, Skills: Agile, Roadmap Planning
