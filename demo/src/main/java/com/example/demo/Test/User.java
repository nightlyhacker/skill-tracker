package com.example.demo.Test;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min=5,max=30)
    private String name;

    @NotNull
    @Size(min=5,max=30)
    @Pattern(regexp = "^CTS.*$", message = "ID must start with CTS", flags =Pattern.Flag.CASE_INSENSITIVE)
    private String associateId;

    @NotNull
    @Size(min=10,max=10)
    private String mobNum;

    @NotNull
    //@Pattern(regexp = "^CTS.*$", message = "ID must start with CTS", flags =Pattern.Flag.CASE_INSENSITIVE)
    private String email;

    @Min(0)
    @Max(20)
    private Integer html;
    @Min(0)
    @Max(20)
    private Integer angular;
    @Min(0)
    @Max(20)
    private Integer react;
    @Min(0)
    @Max(20)
    private Integer spring;
    @Min(0)
    @Max(20)
    private Integer restful;
    @Min(0)
    @Max(20)
    private Integer hibernate;
    @Min(0)
    @Max(20)
    private Integer git;
    @Min(0)
    @Max(20)
    private Integer docker;
    @Min(0)
    @Max(20)
    private Integer jenkins;
    @Min(0)
    @Max(20)
    private Integer aws;

    @Min(0)
    @Max(20)
    private Integer spoken;
    @Min(0)
    @Max(20)
    private Integer communication;
    @Min(0)
    @Max(20)
    private Integer aptitude;

    public User() {
    }

    public User(Integer id, String name, String associateId, String mobNum, String email, Integer html, Integer angular, Integer react, Integer spring, Integer restful, Integer hibernate, Integer git, Integer docker, Integer jenkins, Integer aws, Integer spoken, Integer communication, Integer aptitude) {
        this.id = id;
        this.name = name;
        this.associateId = associateId;
        this.mobNum = mobNum;
        this.email = email;
        this.html = html;
        this.angular = angular;
        this.react = react;
        this.spring = spring;
        this.restful = restful;
        this.hibernate = hibernate;
        this.git = git;
        this.docker = docker;
        this.jenkins = jenkins;
        this.aws = aws;
        this.spoken = spoken;
        this.communication = communication;
        this.aptitude = aptitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHtml() {
        return html;
    }

    public void setHtml(Integer html) {
        this.html = html;
    }

    public Integer getAngular() {
        return angular;
    }

    public void setAngular(Integer angular) {
        this.angular = angular;
    }

    public Integer getReact() {
        return react;
    }

    public void setReact(Integer react) {
        this.react = react;
    }

    public Integer getSpring() {
        return spring;
    }

    public void setSpring(Integer spring) {
        this.spring = spring;
    }

    public Integer getRestful() {
        return restful;
    }

    public void setRestful(Integer restful) {
        this.restful = restful;
    }

    public Integer getHibernate() {
        return hibernate;
    }

    public void setHibernate(Integer hibernate) {
        this.hibernate = hibernate;
    }

    public Integer getGit() {
        return git;
    }

    public void setGit(Integer git) {
        this.git = git;
    }

    public Integer getDocker() {
        return docker;
    }

    public void setDocker(Integer docker) {
        this.docker = docker;
    }

    public Integer getJenkins() {
        return jenkins;
    }

    public void setJenkins(Integer jenkins) {
        this.jenkins = jenkins;
    }

    public Integer getAws() {
        return aws;
    }

    public void setAws(Integer aws) {
        this.aws = aws;
    }

    public Integer getSpoken() {
        return spoken;
    }

    public void setSpoken(Integer spoken) {
        this.spoken = spoken;
    }

    public Integer getCommunication() {
        return communication;
    }

    public void setCommunication(Integer communication) {
        this.communication = communication;
    }

    public Integer getAptitude() {
        return aptitude;
    }

    public void setAptitude(Integer aptitude) {
        this.aptitude = aptitude;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", associateId='" + associateId + '\'' +
                ", mobNum='" + mobNum + '\'' +
                ", email='" + email + '\'' +
                ", html=" + html +
                ", angular=" + angular +
                ", react=" + react +
                ", spring=" + spring +
                ", restful=" + restful +
                ", hibernate=" + hibernate +
                ", git=" + git +
                ", docker=" + docker +
                ", jenkins=" + jenkins +
                ", aws=" + aws +
                ", spoken=" + spoken +
                ", communication=" + communication +
                ", aptitude=" + aptitude +
                '}';
    }
}
