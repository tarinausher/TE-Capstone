package com.techelevator.model;

public class Portfolio {
    private int portfolioId;
    private String projectTitle;
    private String projectDescription;
    private String technologiesUsed;

    /*Portfolio links to different projects student has worked on?
    * TODO need to clarify how portfolio is going to actually work, is this specific object referencing each project??*/

    public Portfolio() {
    }

    public Portfolio(int portfolioId, String projectTitle, String projectDescription, String technologiesUsed) {
        this.portfolioId = portfolioId;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.technologiesUsed = technologiesUsed;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(String technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    @Override
    public String toString() {
        return "PortfolioProject{" +
                "portfolioId=" + portfolioId +
                ", projectTitle='" + projectTitle + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", technologiesUsed=" + technologiesUsed + '\'' +
                '}';
    }

}
