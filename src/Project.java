public class Project {

    private Float skill, readability;
    private String projectName;

    public Project(String projectName, Float skill, Float readability) {
        this.projectName = projectName;
        this.skill = skill;
        this.readability = readability;
    }

    public String getProjectName() {
        return projectName;
    }

    public Float getReadability() {
        return readability;
    }

    public Float getSkill() {
        return skill;
    }
}
