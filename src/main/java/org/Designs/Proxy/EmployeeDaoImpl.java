package org.Designs.Proxy;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Employee added");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        System.out.println("Employee deleted");
    }

    @Override
    public void updateEmployee(Employee employee) {
        System.out.println("Employee updated");
    }

    @Override
    public Employee getEmployee(int id) {
        System.out.println("Employee retrieved");
        return null;
    }

}
