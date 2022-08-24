-- seed the database with 2 users
INSERT INTO users (username, password, enabled) VALUES ('user', 'password', true);
INSERT INTO users (username, password, enabled) VALUES ('admin', 'password', true);

-- create the authorities
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
