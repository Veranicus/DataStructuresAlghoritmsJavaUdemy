package com.patrikpolacek.hashTables.example;

public class StoredEmployee {

    public String key;

    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }


    @Override
    public String toString() {
        return "StoredEmployee{" +
                "key='" + key + '\'' +
                ", employee=" + employee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoredEmployee that = (StoredEmployee) o;

        if (!key.equals(that.key)) return false;
        return employee != null ? employee.equals(that.employee) : that.employee == null;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
