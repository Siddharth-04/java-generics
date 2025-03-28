package com.bridgelabz.resumescreening.src;

abstract class JobRole<T> {
    private String candidateName;
    private int experienceYears;
    private T skillSet;

    public JobRole(String candidateName, int experienceYears, T skillSet) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
        this.skillSet = skillSet;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public T getSkillSet() {
        return skillSet;
    }

    public abstract void displayRoleDetails();
}

