package com.sample.employees.screen.employee;

import io.jmix.ui.screen.*;
import com.sample.employees.entity.Employee;

@UiController("Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
public class EmployeeEdit extends StandardEditor<Employee> {
}