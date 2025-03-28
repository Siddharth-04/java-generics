package com.bridgelabz.resumescreening.src;

import java.util.List;

class ResumeScreening {
    public static void screenResumes(List<? extends JobRole<?>> resumes) {
        for (JobRole<?> resume : resumes) {
            resume.displayRoleDetails();
        }
    }
}
