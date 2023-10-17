INSERT INTO users (name, email) VALUES
                                    ('John Smith', 'john.smith@example.com'),
                                    ('Emma Johnson', 'emma.johnson@example.com'),
                                    ('Michael Davis', 'michael.davis@example.com'),
                                    ('Emily Wilson', 'emily.wilson@example.com'),
                                    ('Daniel Thompson', 'daniel.thompson@example.com');

INSERT INTO issues (visible_id, title, description, status, priority, assignee_id) VALUES
                                                                                       ('ISS-001', 'Bug in login page', 'There is a bug in the login page where users cannot enter their credentials.', 'OPEN', 'HIGH', 1),
                                                                                       ('ISS-002', 'Design issue in homepage', 'The homepage design does not match the client requirements.', 'IN_PROGRESS', 'MEDIUM', 2),
                                                                                       ('ISS-003', 'Database connection error', 'There is an error connecting to the database which is affecting the application.', 'OPEN', 'HIGH', 3),
                                                                                       ('ISS-004', 'Performance optimization needed', 'The application is running slow and needs performance optimization.', 'OPEN', 'LOW', 4),
                                                                                       ('ISS-005', 'Feature request: Advanced search', 'A user has requested an advanced search feature to be added to the application.', 'OPEN', 'MEDIUM', 5);

INSERT INTO labels (name) VALUES
                              ('Bug'),
                              ('Design'),
                              ('Database'),
                              ('Performance'),
                              ('Feature');

INSERT INTO issue_labels (issue_id, label_id) VALUES
                                                  (1, 1),
                                                  (2, 2),
                                                  (3, 3),
                                                  (4, 4),
                                                  (5, 5);