INSERT INTO users (username, email, password_hash, role)
VALUES ('testuser', 'test@testemail.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('billytables', 'billy@tables.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('renedecartes', 'decartes@email.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('anthonyhughes', 'anthony@te.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STAFF'),
('pncbank', 'pnc@bank.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_EMPLOYER'),
('teststudent1', 'student1@email.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('teststudent2', 'student2@email.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('teststudent3', 'student3@email.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT'),
('teststudent4', 'student4@email.com', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'ROLE_STUDENT');

SELECT * FROM users;

INSERT INTO cohorts (description, end_date)
VALUES ('Java', '12/15/2015'),
('Java', '12/15/2016'),
('Java', '06/15/2017'),
('Java', '12/15/2017'),
('Java', '06/15/2018'),
('Java', '12/15/2018'),
('Java', '06/15/2019'),
('Java', '12/15/2019'),
('Java', '12/15/2020'),
('Java', '12/15/2021');

DELETE FROM degrees;
DELETE from experiences;
DELETE from projects;
DELETE from students;

INSERT INTO students (user_id, cohort_id, first_name, last_name, summary, technologies, soft_skills, contact_preferences, is_published, last_updated, picture)
VALUES (4, 7, 'Test', 'User', 'I am a test user, here is my data.', 'Java, SQL, SpringBoot', 'teamwork, leadership', 'email', true, '06/15/2019', 'https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png'),
(5, 8, 'Bobby', 'Tables', 'Look out for SQL injections, kiddos.', 'SQL, Java, Python', 'conflict resolution, communication', 'email', true, '12/15/2019', 'https://www.explainxkcd.com/wiki/images/8/8c/Adult_Bobby_Tables.PNG'),
(6, 8, 'Rene', 'Descartes', 'I think, therefore I am', 'Java, HTML, CSS, JavaScript', 'perspective, communication', 'email', false, '12/15/2019', 'https://i2.wp.com/www.military-history.org/wp-content/uploads/2014/03/Descartes.jpg'),
(9, 10, 'Spongebob', 'Squarepants', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'Java, SprintBoot, JUnit, SQL', 'problem solving, smiling', 'email', true, '12/8/2021', 'https://cdn.newsday.com/polopoly_fs/1.50200555.1617225167!/httpImage/image.jpg_gen/derivatives/landscape_1280/image.jpg'),
(10, 8, 'Tom', 'Nook', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'Java, SprintBoot, JUnit, SQL', 'marketing, sales', 'email', true, '12/16/2019', 'https://static3.srcdn.com/wordpress/wp-content/uploads/2021/07/Great-Animal-Crossing-Ideas-For-Undermining-Tom-Nook.jpg'),
(11, 10, 'Stephen', 'Universe', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'Java, SprintBoot, JUnit, SQL', 'decisiveness, negotiation', 'linkedin', true, '12/7/2021', 'https://assets.teenvogue.com/photos/5da4a5ffa554aa00097346a6/master/pass/Ent_Steven-Universe_PROMO.jpg'),
(12, 10, 'Lisa', 'Simpson', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'Java, SprintBoot, JUnit, SQL', 'flexibility, problem solving', 'email', true, '12/6/2021', 'https://media.entertainmentearth.com/assets/images/6d18e00403d94e6fab70ad36f9422214xl.jpg');
UPDATE students SET first_name = 'Steven' where last_name = 'Universe';


SELECT * FROM students;

INSERT INTO degrees (user_id, level, institution, subject_area, date_completed)
VALUES (5, 'Bachelors', 'University of Mysteries', 'Statistics', '04/30/2014'),
(5, 'Associates', 'University of Mysteries', 'Biology', '04/30/2010'),
(4, 'High School', 'Taylor Allderdice High School', 'High School Diploma', '04/30/2018'),
(6, 'Bachelors', 'University of Poitiers', 'Philosophy, Math', '04/30/2010'),
(9, 'Bachelors', 'University of Pittsburgh', 'Sociology', '04/30/2012'),
(9, 'Masters', 'University of Pittsburgh', 'Social Work', '04/30/2014'),
(10, 'Bachelors', 'University of Toledo', 'Chemistry', '04/30/2018'),
(11, 'Bachelors', 'University of Toronto', 'History', '04/30/2008'),
(11, 'Masters', 'University of Pittsburgh', 'History', '04/30/2012'),
(12, 'Associates', 'Community College of Allegheny County', 'Criminology', '04/30/2000'),
(12, 'Bachelors', 'University of Pittsburgh', 'Administration of Justice', '04/30/2002'),
(12, 'Masters', 'University of Pittsburgh', 'Social Psychology', '04/30/2006'),
(12, 'Doctorate', 'University of Pittsburgh', 'Forensic Psychology', '04/30/2010');

SELECT * FROM degrees;

DELETE FROM degrees where degree_id > 94;

SELECT * FROM degrees WHERE user_id = 12;


INSERT INTO experiences (user_id, industry, title, organization, date_started, date_ended, description)
VALUES (4, 'Government', 'Statistician', 'Bureau of Labor Statistics', '06/06/2014', '03/03/2019', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'),
(5, 'Education', 'Philosopher', 'Bureau of Labor Statistics', '06/06/2014', '03/03/2019', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.');

SELECT * FROM users
WHERE role = 'ROLE_STUDENT';

INSERT INTO projects (user_id, title, description, is_solo, technologies, link)
VALUES (4, 'Dropping the SQL', 'Developed a backend program that audits a SQL Database to determine which tables are no longer needed', true, 'Java, SQL', 'https://github.com/'),
(6, 'If I think, therefore I am', 'Created a program to determine what thinking means', true, 'Javascript, Java, Restful APIs, SQL', 'https://github.com/'),
(4, 'JUnit Extraordinaire', 'Developed a library of JUnit tests that can be easily readjusted to suit the users needs', false, 'Java, JUnit', 'https://github.com/'),
(4, 'Digital Craftsmen', 'Used Object-Oriented Programming to construct blueprints for various types of tables', true, 'Java', 'https://github.com/'),
(5, 'Dropping the SQL', 'Developed a backend program that audits a SQL Database to determine which tables are no longer needed', true, 'Java, SQL', 'https://github.com/');


SELECT * FROM projects;

INSERT INTO experiences (industry, title, organization, date_started, date_ended, description, user_id)
VALUES ('Service', 'Bartender', 'Condado', '02-01-2020', '12-01-2020', 'Managed the bar area customer orders, enforced mask policies', 4),
('Retail', 'Overnight Fulfillment Director', 'Target', '04-01-2020', '08-01-2020', 'Gathered items for customer orders and packed them', 11),
('Service', 'Barista', 'Starbucks', '01-01-2021', '12-01-2021', 'Crafted coffee beverages for customers', 4);

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


UPDATE students SET is_published = true WHERE last_name = 'Descartes';



