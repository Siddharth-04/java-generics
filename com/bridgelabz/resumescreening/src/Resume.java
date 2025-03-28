package com.bridgelabz.resumescreening.src;

class Resume<T extends JobRole<?>> {
    private T candidateResume;

    public Resume(T candidateResume) {
        this.candidateResume = candidateResume;
    }

    public void processResume() {
        System.out.println("Processing Resume:");
        candidateResume.displayRoleDetails();
    }
}

