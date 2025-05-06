CREATE TABLE SessionDetails(
sessionNo int NOT NULL AUTO_INCREMENT,
sessionDate varchar(30) NOT NULL,
slotTime varchar(30) NOT NULL,
available boolean NOT NULL,
PRIMARY KEY (sessionNo)
);
CREATE TABLE Registration(
regNo int NOT NULL AUTO_INCREMENT,
regDate varchar(30) NOT NULL,
sessionNo int NOT NULL,
email varchar(30) NOT NULL,
PRIMARY KEY (regNo),
FOREIGN KEY (sessionNo) REFERENCES SessionDetails(sessionNo)
);
CREATE TABLE sec_user (
  userId            BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  email             VARCHAR(75) NOT NULL UNIQUE,
  encryptedPassword VARCHAR(128) NOT NULL,
  enabled           BIT NOT NULL 
);
CREATE TABLE sec_role(
  roleId   BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  roleName VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE user_role
(
  id     BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  userId BIGINT NOT NULL,
  roleId BIGINT NOT NULL
);