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

CREATE TABLE issue_labels (
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