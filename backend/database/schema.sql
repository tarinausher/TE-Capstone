BEGIN TRANSACTION;

DROP TABLE IF EXISTS tech;

DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	email varchar(254) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

INSERT INTO users (username,password_hash, email, role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user@user.com', 'ROLE_USER');
INSERT INTO users (username,password_hash, email, role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'admin@admin.com', 'ROLE_ADMIN');


DROP TABLE IF EXISTS experiences;
DROP TABLE IF EXISTS degrees;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS cohorts;

--THE COMMANDS BELOW ARE THE ONES ADDED FOLLOWING THE BASE CODE WE RECEIVED
--You can highlight all and run them all, or run then one by one
--Creates cohort table
CREATE TABLE cohorts (
cohort_id SERIAL PRIMARY KEY,
description VARCHAR(255),
end_date DATE
);

--Creates student profiles table:
CREATE TABLE students (
user_id INT PRIMARY KEY,
cohort_id INT,
first_name VARCHAR(255),
last_name VARCHAR(255),
summary VARCHAR(255),
technologies VARCHAR(255),
soft_skills VARCHAR(255),
contact_preferences VARCHAR(255),
is_published BOOLEAN,
last_updated DATE,

UNIQUE(user_id),
FOREIGN KEY (user_id) REFERENCES users(user_id),

CONSTRAINT fk_cohort_id FOREIGN KEY (cohort_id) REFERENCES cohorts(cohort_id)
);

--Creates table with the collection of degrees 
CREATE TABLE degrees (
degree_id SERIAL PRIMARY KEY,
level VARCHAR(255),
institution VARCHAR(255),
subject_area VARCHAR(255),
user_id INT,
date_completed DATE,

FOREIGN KEY (user_id) REFERENCES students(user_id)
);

--Creates table for various job experiences
CREATE TABLE experiences (
experience_id SERIAL PRIMARY KEY,
industry VARCHAR(255),
title VARCHAR(255),
organization VARCHAR(255),
date_started DATE,
date_ended DATE,
description VARCHAR(255),
user_id INT,

FOREIGN KEY (user_id) REFERENCES students(user_id)
);

--Creates table for student projects 
CREATE TABLE projects (
project_id SERIAL PRIMARY KEY,
user_id INT,
title VARCHAR(255),
description VARCHAR(255),
is_solo BOOLEAN,
technologies VARCHAR(255),
link VARCHAR(255), 

FOREIGN KEY (user_id) REFERENCES students(user_id)
);

select * from users;

ALTER TABLE users ADD COLUMN is_validated BOOLEAN;
UPDATE users SET is_validated = true WHERE user_id = 1;
UPDATE users SET is_validated = true WHERE user_id = 2;
UPDATE users SET is_validated = true WHERE user_id = 4;
UPDATE users SET is_validated = true WHERE user_id = 5;
UPDATE users SET is_validated = true WHERE user_id = 6;
UPDATE users SET is_validated = true WHERE user_id = 7;
UPDATE users SET is_validated = true WHERE user_id = 8;
UPDATE users SET is_validated = true WHERE user_id = 9;
UPDATE users SET is_validated = true WHERE user_id = 10;

UPDATE users SET is_validated = false WHERE user_id = 11;
UPDATE users SET is_validated = false WHERE user_id = 12;
UPDATE users SET is_validated = false WHERE user_id = 3;

COMMIT TRANSACTION;

