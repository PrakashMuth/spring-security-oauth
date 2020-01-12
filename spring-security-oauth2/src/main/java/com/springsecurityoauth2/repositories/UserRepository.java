package com.springsecurityoauth2.repositories;

import com.springsecurityoauth2.model.tables.pojos.Permission;
import com.springsecurityoauth2.model.tables.pojos.Role;
import com.springsecurityoauth2.model.tables.pojos.User;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.springsecurityoauth2.model.tables.Permission.PERMISSION;
import static com.springsecurityoauth2.model.tables.Role.ROLE;
import static com.springsecurityoauth2.model.tables.RolePermission.ROLE_PERMISSION;
import static com.springsecurityoauth2.model.tables.User.USER;
import static com.springsecurityoauth2.model.tables.UserRole.USER_ROLE;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final DSLContext db;

    public Optional<User> fetchUsernameOrEmail(String usernameOrEmail) {
        return Optional.of(db.selectFrom(USER).where(USER.USER_NAME.eq(usernameOrEmail.trim().toLowerCase()))
                .or(USER.EMAIL.eq(usernameOrEmail.trim().toLowerCase())).fetchOneInto(User.class));
    }

    private SelectConditionStep<Record1<Integer>> getRoleIdsQueryByUserId(Integer userId) {
        return db.select(USER_ROLE.ROLE_ID).from(USER_ROLE).where(USER_ROLE.USER_ID.eq(userId));
    }

    public List<Role> findRolesByUserId(Integer userId) {
        var roleIds = getRoleIdsQueryByUserId(userId);
        return db.select(ROLE.NAME).from(ROLE).where(ROLE.ID.eq(roleIds)).fetchInto(Role.class);
    }

    public List<Permission> findPrivilegesByUserId(Integer userId) {
        var roleIds = getRoleIdsQueryByUserId(userId);
        return db.selectFrom(PERMISSION).where(PERMISSION.ID.in(
                db.select(ROLE_PERMISSION.PERMISSION_ID).from(ROLE_PERMISSION)
                        .where(ROLE_PERMISSION.ROLE_ID.in(
                                db.select(ROLE.ID).from(ROLE).where(ROLE.ID.in(roleIds))
                        ))
        )).fetchInto(Permission.class);
    }
}
