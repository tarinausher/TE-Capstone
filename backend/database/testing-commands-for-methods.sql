SELECT * FROM users;
SELECT * FROM profile;

--Query corresponding to updateIsPublished
UPDATE profile SET is_published = false WHERE user_id = 6;

--Query corresponding to getStudentsByCohortId
SELECT * FROM profile WHERE cohort_id = 10; 

--Query corresponding to viewAllStudents
SELECT * FROM profile WHERE is_published = true;

--Query corresponding to viewStudentsByProfileId
SELECT * FROM profile WHERE profile_id = 3;

--Query corresponding to viewStudentByUserId
SELECT * FROM profile WHERE user_id = 4;

--Query corresponding to viewUnpublishedProfiles
SELECT * FROM profile WHERE is_published = false;