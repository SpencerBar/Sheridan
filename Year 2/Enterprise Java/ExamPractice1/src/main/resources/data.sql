insert into sessiondetails (sessionDate,slotTime,available) values ('26 Dec 2021','9 am to11
am',true),('26 Dec 2021','1 pm to 3 pm',true),('27 Dec 2021','9 am to 11 am',true),
('27 Dec 2021','1 pm to 3 pm',true),('28 Dec 2021','9 am to 11 am',true),('28 Dec 2021','1
pm to 3 pm',true);

INSERT INTO sec_role (roleName)

VALUES ('ROLE_ADMIN');
INSERT INTO sec_user (email, encryptedPassword, enabled)

VALUES ('admin@email.ca', '$2y$10$NJcv6KfAnt8XxOMOSWdToeZNcvGnjtTZLHH7qXYlLBaV6pxMKiSHW', 1);
INSERT INTO user_role (userId, roleId)

VALUES (1, 1);