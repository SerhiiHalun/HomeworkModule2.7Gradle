package org.example.return_objects_SQL_query;

public class ProjectPrices {
    private String projectName;
    private int projectCost;

    public ProjectPrices(String projectName, int projectCost) {
        this.projectName = projectName;
        this.projectCost = projectCost;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(int projectCost) {
        this.projectCost = projectCost;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "projectName='" + projectName + '\'' +
                ", projectCost=" + projectCost +
                '}';
    }
}
