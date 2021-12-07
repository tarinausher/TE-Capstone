SELECT * FROM users;

INSERT INTO profile (user_id, first_name, last_name, summary, is_published, cohort_id)
VALUES (4, 'Tarina', 'Usher', 'Hi, plz hire me, I will do a good job.', true, 10),
(6, 'Billy', 'Tables', 'Look out for those darn sql injections, kiddos.', false, 10),
(7, 'Rene', 'Descartes', 'I think, therefore I am.', false, 8);

SELECT * FROM profile;

ALTER TABLE profile ADD cohort_id INT;
ALTER TABLE profile ADD soft_skills varchar(255);
ALTER TABLE profile ADD contact_preferences varchar(255);
ALTER TABLE profile ADD tech_interests varchar(255);
--Adds email column to the users table

DELETE from profile WHERE first_name = 'Tarina';

INSERT INTO profile (user_id, first_name, last_name, summary, is_published, cohort_id);
 
UPDATE profile SET soft_skills = 'problem solving, empathy', contact_preferences = 'email', tech_interests = 'Java, SQL, backend development' WHERE first_name = 'Tarina';
UPDATE profile SET soft_skills = 'networking, focus', contact_preferences = 'phone', tech_interests = 'Hacking, data security, SQL' WHERE first_name = 'Billy';
UPDATE profile SET soft_skills = 'situational awareness, perspective', contact_preferences = 'smoke signals', tech_interests = 'HTML, CSS, JavaScript, Vue.js' WHERE first_name = 'Rene';