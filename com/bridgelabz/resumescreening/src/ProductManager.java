package com.bridgelabz.resumescreening.src;

class ProductManager<T> extends JobRole<T> {
    public ProductManager(String candidateName, int experienceYears, T skillSet) {
        super(candidateName, experienceYears, skillSet);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Product Manager Resume: " + getCandidateName() +
                ", Experience: " + getExperienceYears() + " years, Skills: " + getSkillSet());
    }
}