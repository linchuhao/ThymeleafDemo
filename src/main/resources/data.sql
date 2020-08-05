DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS company;
CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(10) DEFAULT NULL
);
INSERT INTO employee (name, age, gender) VALUES
 ('User1','54','male'),
 ('User2','82','female'),
 ('User3','69','female'),
 ('User4','41','male'),
  ('User5','54','male'),
 ('User6','82','female'),
 ('User7','69','female'),
 ('User8','41','male'),
  ('User9','54','male');