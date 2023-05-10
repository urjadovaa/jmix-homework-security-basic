package com.sample.employees.screen.employee;

import io.jmix.ui.screen.*;
import com.sample.employees.entity.Employee;

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
public class EmployeeBrowse extends StandardLookup<Employee> {
}