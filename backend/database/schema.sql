BEGIN TRANSACTION;

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


CREATE TABLE cohort (
cohort_id SERIAL,
programming_language VARCHAR(255),
PRIMARY KEY (cohort_id)
);
--Creates cohort table

CREATE TABLE profile (
profile_id SERIAL,
user_id INT,
portfolio_id SERIAL,
cohort_id INT,
first_name VARCHAR(255),
last_name VARCHAR(255),
summary VARCHAR(255),
soft_skills VARCHAR(255),
contact_preferences VARCHAR(255),
tech_interests VARCHAR(255),
is_published BOOLEAN,
PRIMARY KEY (profile_id),
FOREIGN KEY (user_id) REFERENCES users(user_id)
);
--Creates profile table

CREATE TABLE cohort_student (
cohort_id INT,
profile_id INT,
PRIMARY KEY (profile_id),
FOREIGN KEY (profile_id) REFERENCES profile(profile_id),
FOREIGN KEY (cohort_id) REFERENCES cohort(cohort_id)
);
--Creates cohort to student table

CREATE TABLE portfolio_links(
portfolio_link_id SERIAL,
description VARCHAR(255),
file_name VARCHAR(255),
source_code VARCHAR(255),
PRIMARY KEY (portfolio_link_id)
);
--Creates table of all portfolio links.

CREATE TABLE portfolio_portfolio_links(
portfolio_id INT,
portfolio_link_id INT,
FOREIGN KEY (portfolio_id) REFERENCES profile(profile_id),
FOREIGN KEY (portfolio_link_id) REFERENCES portfolio_links(portfolio_link_id)
);
--Creates table joining portfolios to their respective portfolio links

CREATE TABLE degree(
degree_id SERIAL,
institution_name VARCHAR(255),
level VARCHAR(255),
degree_type VARCHAR(255),
subject_area VARCHAR(255),
PRIMARY KEY (degree_id)
);
--Creates table of degrees students have earned

CREATE TABLE profile_degree(
profile_id INT,
degree_id INT,
PRIMARY KEY (degree_id),
FOREIGN KEY (profile_id) REFERENCES profile(profile_id),
FOREIGN KEY (degree_id) REFERENCES degree(degree_id)
);
--Creates table joining degrees to their respective profiles

CREATE TABLE career_experience(
entry_id SERIAL,
experience_title VARCHAR(255),
organization_name VARCHAR(255),
date_started DATE,
date_ended DATE,
description VARCHAR(255),
PRIMARY KEY (entry_id)
);
--Creates table of all career experiences entered

CREATE TABLE profile_career_experience(
profile_id INT,
career_experience_id INT,
PRIMARY KEY (career_experience_id),
FOREIGN KEY (career_experience_id) REFERENCES career_experience(entry_id),
FOREIGN KEY (profile_id) REFERENCES profile(profile_id)
);
--Creates table joining career experiences to their respective tables





COMMIT TRANSACTION;
