package com.example.umcstudy.basic;

public class BasicClass {
    public static void main(String[] args) {
        Student student = new Student("신우경", 201912004, "컴퓨터공학과");
        System.out.println(student.name);
        System.out.println(student.studentId);
        System.out.println(student.major);
        student.setName("홍길동");
        System.out.println("이름 변경 : " + student.name);
    }
}

class Student {
    static String name;
    static int studentId;
    static String major;

    Student(String name, int studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setStudentId(int studentId) {
        Student.studentId = studentId;
    }

    public static void setMajor(String major) {
        Student.major = major;
    }

    public static String getMajor() {
        return major;
    }

    public static int getStudentId() {
        return studentId;
    }

    public static String getName() {
        return name;
    }
}