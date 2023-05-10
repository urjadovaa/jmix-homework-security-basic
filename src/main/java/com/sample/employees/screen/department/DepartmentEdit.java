package com.sample.employees.screen.department;

import io.jmix.ui.screen.*;
import com.sample.employees.entity.Department;

@UiController("Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentEdit extends StandardEditor<Department> {
}