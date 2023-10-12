CREATE TABLE BOOKS
(
    ID             BIGSERIAL        PRIMARY KEY,
    NAME           VARCHAR(255)     NOT NULL,
    AUTHOR_ID      BIGINT           NOT NULL,
    GENRE_ID       BIGINT           NOT NULL
);