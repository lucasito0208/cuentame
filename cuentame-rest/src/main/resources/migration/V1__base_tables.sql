DROP TABLE IF EXISTS ${sch}.users;

CREATE TABLE ${sch}.users (
  id             BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
  email          VARCHAR(100) NOT NULL,
  password       VARCHAR(100) NOT NULL,
  deleted        BIT          NOT NULL DEFAULT 0,
  create_time    DATETIME     NOT NULL DEFAULT GETDATE(),
  create_user_id BIGINT                DEFAULT NULL,
  update_time    DATETIME     NULL     DEFAULT NULL,
  update_user_id BIGINT       NULL     DEFAULT NULL,
  CONSTRAINT users_unq_01 UNIQUE (email),
  CONSTRAINT users_fk_01 FOREIGN KEY (create_user_id) REFERENCES sonar_dev.users (id),
  CONSTRAINT users_fk_02 FOREIGN KEY (update_user_id) REFERENCES sonar_dev.users (id)
);

INSERT INTO ${sch}.users (email,password,deleted,create_time,create_user_id,update_time,update_user_id)
VALUES ('admin@sdos.es','$2a$06$5jNY3ZlK8Dx4/XcyBnJ1iOIeEPcNy.fTrPIQpGBDUxX0qGvRzgXo6',0,'2021-02-22 00:00:00',1,NULL,1);


