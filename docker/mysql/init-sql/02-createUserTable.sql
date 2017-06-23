CREATE TABLE users
(
    username VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(50)
);
CREATE UNIQUE INDEX users_username_uindex ON users (username);