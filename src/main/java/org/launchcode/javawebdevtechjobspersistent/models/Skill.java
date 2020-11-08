package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();

//    @Size(min = 3, max = 100, message = "Location must be between 3 and 100 characters.")
    @Column(name = "skill_description")
    private String skillDescription;

    public Skill(String skillDescription) { this.skillDescription = skillDescription; }

    public Skill() {}

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}