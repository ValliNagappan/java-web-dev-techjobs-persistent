package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(String name,Employer anEmployer, List<Skill> someSkills) {
        super();
        this.setName(name);
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
