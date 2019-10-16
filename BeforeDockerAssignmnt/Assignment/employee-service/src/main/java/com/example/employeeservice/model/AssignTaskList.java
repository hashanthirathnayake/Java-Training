package com.example.employeeservice.model;

import java.util.List;

public class AssignTaskList {
    private Integer id;

    private Integer eid;

    private Integer pid;

    private List<Integer> tid;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<Integer> getTid() {
        return tid;
    }

    public void setTid(List<Integer> tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "AssignTask{" +
                "id=" + id +
                ", eid=" + eid +
                ", pid=" + pid +
                ", tid='" + tid + '\'' +
                '}';
    }
}


