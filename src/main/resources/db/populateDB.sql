DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

-- password
INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password');
-- admin
INSERT INTO users (name, email, password)
VALUES ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES ('ROLE_USER', 100000);
INSERT INTO user_roles (role, user_id) VALUES ('ROLE_ADMIN', 100001);

--meal
INSERT INTO meals (datetime, description, calories, user_id) VALUES ('2015-01-06 09:00', 'омар', 1000, 100000);
INSERT INTO meals (datetime, description, calories, user_id) VALUES ('2015-01-06 09:00', 'анчоус', 500, 100001);
