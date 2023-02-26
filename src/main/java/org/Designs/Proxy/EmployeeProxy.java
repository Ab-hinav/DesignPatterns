package org.Designs.Proxy;

public class EmployeeProxy implements EmployeeDao {

    private EmployeeDao employeeDao;

    public EmployeeProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void addEmployee(String client, Employee employee) {
        if (client.equals("admin")) {
            employeeDao.addEmployee(employee);
        } else {
            System.out.println("You are not authorized to add employee");
        }
    }

    public void deleteEmployee(String client, Employee employee) {
        if (client.equals("admin")) {
            employeeDao.deleteEmployee(employee);
        } else {
            System.out.println("You are not authorized to delete employee");
        }
    }

    public void updateEmployee(String client, Employee employee) {
        if (client.equals("admin")) {
            employeeDao.updateEmployee(employee);
        } else {
            System.out.println("You are not authorized to update employee");
        }
    }

    public Employee getEmployee(String client, int id) {
        if (client.equals("admin") || client.equals("manager")) {
            return employeeDao.getEmployee(id);
        } else {
            System.out.println("You are not authorized to get employee");
            return null;
        }
    }


    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }
}
