package com.sample.employees.security;

import com.sample.employees.entity.Department;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import javax.annotation.Nonnull;

@Nonnull
@ResourceRole(name = "Access to departments", code = "access-to-departments", description = "Даёт доступ к чтению и просмотру отделов (Department) в интерфейсе приложения. Также дает доступ к редактированию заметок по отделу - т.е. ровно одного атрибута Department#notes")
public interface AccessToDepartmentsRole {
    @MenuPolicy(menuIds = "Department.browse")
    @ScreenPolicy(screenIds = {"Department.browse", "Department.edit"})
    void screens();

    @EntityAttributePolicy(entityClass = Department.class, attributes = "notes", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Department.class, attributes = {"id", "name", "internalPhoneNumber"}, action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Department.class, actions = {EntityPolicyAction.UPDATE, EntityPolicyAction.READ})
    void department();
}