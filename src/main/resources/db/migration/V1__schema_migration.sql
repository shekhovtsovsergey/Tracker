CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255),
                       email VARCHAR(255),
                       domain VARCHAR(255)
);


CREATE TABLE issues (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        visible_id VARCHAR(255),
                        title VARCHAR(255),
                        description VARCHAR(255),
                        status VARCHAR(20),
                        priority VARCHAR(20),
                        assignee_id INT,
                        FOREIGN KEY (assignee_id) REFERENCES users(id)
);

CREATE TABLE labels (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        value VARCHAR(255),
                        domain VARCHAR(255)
);

CREATE TABLE issues_labels (
                              issue_id INT,
                              label_id INT,
                              FOREIGN KEY (issue_id) REFERENCES issues(id),
                              FOREIGN KEY (label_id) REFERENCES labels(id),
                              PRIMARY KEY (issue_id, label_id)
);

CREATE TABLE comments (
                          id INT,
                          text VARCHAR(255),
                          date DATE,
                          user_id INT,
                          issue_id INT,
                          FOREIGN KEY (user_id) REFERENCES users(id),
                          FOREIGN KEY (issue_id) REFERENCES issues(id)
);
CREATE TABLE tickets (
                         id INT PRIMARY KEY,
                         name VARCHAR(255),
                         description TEXT,
                         analytics VARCHAR(255),
                         development VARCHAR(255),
                         testing VARCHAR(255)
);

-- CREATE TABLE tasks (
--                        id INT,
--                        name VARCHAR(255),
--                        DAY1 VARCHAR(255),
--                        DAY2 VARCHAR(255),
--                        DAY3 VARCHAR(255),
--                        DAY4 VARCHAR(255),
--                        DAY5 VARCHAR(255),
--                        DAY6 VARCHAR(255),
--                        DAY7 VARCHAR(255),
--                        DAY8 VARCHAR(255),
--                        DAY9 VARCHAR(255),
--                        DAY10 VARCHAR(255),
--                        DAY11 VARCHAR(255),
--                        DAY12 VARCHAR(255),
--                        DAY13 VARCHAR(255),
--                        DAY14 VARCHAR(255),
--                        DAY15 VARCHAR(255),
--                        DAY16 VARCHAR(255),
--                        DAY17 VARCHAR(255),
--                        DAY18 VARCHAR(255),
--                        DAY19 VARCHAR(255),
--                        DAY20 VARCHAR(255),
--                        DAY21 VARCHAR(255),
--                        DAY22 VARCHAR(255),
--                        DAY23 VARCHAR(255),
--                        DAY24 VARCHAR(255),
--                        DAY25 VARCHAR(255),
--                        DAY26 VARCHAR(255),
--                        DAY27 VARCHAR(255),
--                        DAY28 VARCHAR(255),
--                        DAY29 VARCHAR(255),
--                        DAY30 VARCHAR(255)
-- );


CREATE TABLE tasks (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255),
                       days_map JSON
);