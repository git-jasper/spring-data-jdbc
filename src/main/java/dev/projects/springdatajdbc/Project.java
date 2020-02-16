package dev.projects.springdatajdbc;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("projects")
public class Project {

    @Id
    private Long id;
    private String title;
    private String description;
    private String icon;
    private State state;

    public Project(Long id, String title, String description, String icon, State state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.state = state;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Project of(String title, String description, State state) {
        return new Project(null, title, description, null, state);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", state=" + state +
                '}';
    }
}
