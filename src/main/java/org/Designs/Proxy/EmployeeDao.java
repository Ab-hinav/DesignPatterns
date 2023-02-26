package org.Designs.Proxy;

public interface EmployeeDao {

    public void addEmployee(Employee employee);

    public void deleteEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public Employee getEmployee(int id);




}
