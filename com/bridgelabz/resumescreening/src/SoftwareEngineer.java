package com.bridgelabz.resumescreening.src;

class SoftwareEngineer<T> extends JobRole<T> {
    public SoftwareEngineer(String candidateName, int experienceYears, T skillSet) {
        super(candidateName, experienceYears, skillSet);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer Resume: " + getCandidateName() +
                ", Experience: " + getExperienceYears() + " years, Skills: " + getSkillSet());
    }
}
