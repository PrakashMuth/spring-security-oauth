/**
oauth details
 */
INSERT INTO public.oauth_client_details (client_id, resource_ids, client_secret, scope, authorized_grant_types,
                                         web_server_redirect_uri, authorities, access_token_validity,
                                         refresh_token_validity, additional_information, autoapprove)
VALUES ('OauthApp', '', '$2a$11$7WYpPH3Xo7H3KoailgWpcuuS0gAyH8xk9VKEsgRgOXk43wNiA9vFu', 'webclient,mobileclient',
        'authorization_code',
        'http://localhost:8080/login,http://localhost:3000/login,https://getpostman.com/oauth2/callback', '', NULL,
        NULL, '{}', 'true');
/**
USER DETAILS SEAD
 */
INSERT INTO public.user (first_name, last_name, user_name, email, password, created_at)
values ('Bruce', 'Wayne', 'bruce_wayne', 'bruce_wayne@gmail.com',
        '$2a$10$z.Gzyrrh9PzcNe8eC6cL8eqR7dsV34KS97AAoMr9vxJgNKqOxYyES', 'now()'),
       ('steve', 'smith', 'steve_smith', 'steve_smith@gmail.com',
        '$2a$10$z.Gzyrrh9PzcNe8eC6cL8eqR7dsV34KS97AAoMr9vxJgNKqOxYyES', 'now()');

/**
Role And Permission
 */

INSERT INTO public.role (name)
values ('OWNER'),
       ('ADMIN'),
       ('MAINTAINER');

INSERT INTO public.permission(name)
values ('READ_PERMISSION'),
       ('WRITE_PERMISSION'),
       ('DELETE_PERMISSION');

INSERT INTO public.role_permission(role_id, permission_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 1),
       (2, 2),
       (3, 1);

INSERT INTO public.user_role(user_id, role_id)
VALUES (1, 1),
       (2, 2)