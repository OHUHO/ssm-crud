package com.jingchao.pojo;

public class Emp {
    private Integer id;

    private String workId;
    private String name;

    private String gender;

    private  String email;

    private String phone;

    private Integer deptId;

    private String deptName;

    public Emp() {
    }

    public Emp(Integer id, String workId, String name, String gender, String email, String phone, Integer deptId, String deptName) {
        this.id = id;
        this.workId = workId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", workId='" + workId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
