package com.bridgelabz.resumescreening.src;

class DataScientist<T> extends JobRole<T> {
    public DataScientist(String candidateName, int experienceYears, T skillSet) {
        super(candidateName, experienceYears, skillSet);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Data Scientist Resume: " + getCandidateName() +
                ", Experience: " + getExperienceYears() + " years, Skills: " + getSkillSet());
    }
}
