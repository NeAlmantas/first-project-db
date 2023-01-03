package com.example.firstprojectdb.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "a_dummy_data")
public class DefaultObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;

    @Column (name = "TITLE")
    private String title;

    @Column (name = "RANDOM_TEXT")
    private String randomText;

    @Column (name = "CREATE_DATE")
    private LocalDateTime createDate = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRandomText() {
        return randomText;
    }

    public void setRandomText(String randomText) {
        this.randomText = randomText;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
