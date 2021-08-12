package com.example.Employeecrud;

public class Employee {

        private Long id;
        private String name;
        private String mail;
        private int age;
        private Long salary;
        public Employee(Long id, String name, String mail, int age, Long salary) {
            this.id = id;
            this.name = name;
            this.mail = mail;
            this.age = age;
            this.salary = salary;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public Long getSalary() {
            return salary;
        }
        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }


