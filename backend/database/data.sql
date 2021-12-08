--Faux data to populate database
INSERT INTO users (username, email, password_hash, role)
VALUES ('tarina', 'tarinausher@gmail.com', '$2a$10$L0fuFfcbbiRZB7ZC4E9HauUbLEu9vvpTxeyVp4PA4Qpd6N8gOBvaO', 'ROLE_USER'),
('billytables', 'billytables@test.com', '$2a$10$eKlm.6fXkUpxlGtbtXhijeBdOzfyC4AetWy/E6jvxYT/ZGdxLzx5m', 'ROLE_USER'),
('Descartes', 'decartes@email.com', '$2a$10$mij0eaPCQNtHw/14/DVYluma/sHp6inbppTDKZKuonHOOPXHV2iUq', 'ROLE_USER');

INSERT INTO profile (user_id, first_name, last_name, summary, is_published, cohort_id, soft_skills, contact_preferences, interests)
VALUES (3, 'Tarina', 'Usher', 'Hi, plz hire me, I will do a good job.', true, 10, 'problem solving, empathy', 'email', 'Java, SQL, backend development'),
(4, 'Billy', 'Tables', 'Look out for those darn sql injections, kiddos.', false, 10, 'networking, focus', 'phone', 'Hacking, data security, SQL'),
(5, 'Rene', 'Descartes', 'I think, therefore I am.', false, 9, 'situational awareness, perspective', 'smoke signals', 'HTML, CSS, JavaScript, Vue.js');

SELECT * FROM users;
SELECT * FROM profile;

INSERT INTO career_experience (experience_title, organization_name, date_started, date_ended, description)
VALUES ('Barista', 'Cafe Carnegie', '6/1/2021', '9/15/2021', 'Served coffee to customers at the museum. Tried not to cry.');