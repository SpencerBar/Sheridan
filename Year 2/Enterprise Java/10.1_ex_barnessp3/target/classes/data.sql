INSERT INTO sec_user (email, encryptedPassword, enabled)

VALUES ('tan.pham@sheridancollege.ca', '$2y$10$NJcv6KfAnt8XxOMOSWdToeZNcvGnjtTZLHH7qXYlLBaV6pxMKiSHW', 1);

INSERT INTO sec_user (email, encryptedPassword, enabled)

VALUES ('carlos.rebelo@sheridancollege.ca', '$2y$10$AaJ3WoqiY9PkNA0GMBpINuiLw.N3avpRs.Ge2ZqyvK4mxp1lFXYUi', 1);

INSERT INTO sec_role (roleName)

VALUES ('ROLE_USER');

INSERT INTO sec_role (roleName)

VALUES ('ROLE_GUEST');

INSERT INTO user_role (userId, roleId)

VALUES (1, 1);

INSERT INTO user_role (userId, roleId)

VALUES (2, 2);