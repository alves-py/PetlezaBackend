CREATE DATABASE petleza;

CREATE TABLE forms (
    id Int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    image VARCHAR(255),
    age INT,
    species VARCHAR(255),
    race VARCHAR(255),
    gender VARCHAR(255),
    cadastred VARCHAR(255),
    weight FLOAT,
    personality VARCHAR(255),
    habits_food VARCHAR(255),
    habits_hygiene VARCHAR(255),
    special_needs VARCHAR(255),
    pet_activities VARCHAR(255),
    specific_behavior VARCHAR(255),
    social_interactions VARCHAR(255),
    current_medications VARCHAR(255),
    allergy VARCHAR(255),
    illnesses VARCHAR(255),
    surgeries VARCHAR(255),
    tutor_name VARCHAR(255),
    tutor_phone VARCHAR(255),
    last_consultation VARCHAR(255)
);

