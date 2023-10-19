INSERT INTO users (name, email, domain) VALUES
                                    ('John Smith', 'john.smith@example.com','programming'),
                                    ('Emma Johnson', 'emma.johnson@example.com','programming'),
                                    ('Michael Davis', 'michael.davis@example.com','programming'),
                                    ('Emily Wilson', 'emily.wilson@example.com','programming'),
                                    ('Daniel Thompson', 'daniel.thompson@example.com','programming');

INSERT INTO issues (visible_id, title, description, status, priority, assignee_id) VALUES
                                                                                       ('ISS-001', 'Bug in login page', 'There is a bug in the login page where users cannot enter their credentials.','OPEN', 'HIGH', 1),
                                                                                       ('ISS-002', 'Design issue in homepage', 'The homepage design does not match the client requirements.', 'OPEN', 'MEDIUM', 2),
                                                                                       ('ISS-003', 'Database connection error', 'There is an error connecting to the database which is affecting the application.', 'OPEN', 'HIGH', 3),
                                                                                       ('ISS-004', 'Performance optimization needed', 'The application is running slow and needs performance optimization.', 'OPEN', 'LOW', 4),
                                                                                       ('ISS-005', 'Feature request: Advanced search', 'A user has requested an advanced search feature to be added to the application.', 'OPEN', 'MEDIUM', 5);

INSERT INTO labels (value, domain) VALUES
                              ('Bug','programming'),
                              ('Design','programming'),
                              ('Database','programming'),
                              ('Performance','programming'),
                              ('Feature','programming');

INSERT INTO issue_labels (issue_id, label_id) VALUES
                                                  (1, 1),
                                                  (2, 2),
                                                  (3, 3),
                                                  (4, 4),
                                                  (5, 5);

INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (1, 'First comment', '2021-01-01', 1, 1);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (2, 'Second comment', '2021-02-02', 2, 1);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (3, 'Third comment', '2021-03-03', 1, 2);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (4, 'Fourth comment', '2021-04-04', 3, 2);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (5, 'Fifth comment', '2021-05-05', 2, 3);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (6, 'Sixth comment', '2021-06-06', 3, 3);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (7, 'Seventh comment', '2021-07-07', 1, 4);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (8, 'Eighth comment', '2021-08-08', 2, 4);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (9, 'Ninth comment', '2021-09-09', 3, 5);
INSERT INTO comments (id, text, date, user_id, issue_id) VALUES (10, 'Tenth comment', '2021-10-10', 1, 5);