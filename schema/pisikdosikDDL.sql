DROP TABLE diseases;
DROP TABLE foods;
DROP TABLE disease_foods;

-- 질병 테이블 생성
CREATE TABLE diseases (
    disease_id INT AUTO_INCREMENT PRIMARY KEY,
    disease_name VARCHAR(255) NOT NULL UNIQUE,
    description TEXT
);

-- 음식 테이블 생성
CREATE TABLE foods (
    food_id INT AUTO_INCREMENT PRIMARY KEY,
    food_name VARCHAR(255) NOT NULL UNIQUE
);

-- 질병과 음식 관계 테이블 생성
CREATE TABLE disease_foods (
    id INT AUTO_INCREMENT PRIMARY KEY,
    disease_id INT,
    food_id INT,
    food_type ENUM('Recommended', 'Avoided') NOT NULL,
    reason TEXT,
    FOREIGN KEY (disease_id) REFERENCES diseases(disease_id) ON DELETE CASCADE,
    FOREIGN KEY (food_id) REFERENCES foods(food_id) ON DELETE CASCADE
);

show tables;
