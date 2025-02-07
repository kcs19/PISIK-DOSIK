# PISIK-DOSIK
## 목차


<hr>

## 🤝 팀원
|<img src="https://avatars.githubusercontent.com/u/98368034?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/49242646?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/103468518?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/103871252?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|
|장수현<br/>[@Aunsxm](https://github.com/Aunsxm)|최윤정<br/>[@letmeloveyou82](https://github.com/letmeloveyou82)|김창성<br/>[@kcs19](https://github.com/kcs19)|김우현<br/>[@woody6624](https://github.com/woody6624)|

<hr>


## 📒 프로젝트 개요

####  개발 목적

50~60대 사용자가 자주 걸리는 질병을 대상으로 피해야 할 음식, 도움이 되는 음식 정보를 제공하여 건강관리에 도움을 주고자 함.


####  주요 기능

- 질병별 피해야 할 음식 목록 제공
- 질병별 섭취하면 좋은 음식 목록 제공
- 간단한 UI/UX로 사용자 친화적 인터페이스 제공


<br>

---
<br>

## 🔧 기술 스택

| **역할**            | **종류**                                                                                                              |
|----------------------|-----------------------------------------------------------------------------------------------------------------------|
| 🤝 협업 도구         | ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) <br> ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) |
| 💬 커뮤니케이션 도구 | ![Notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white)<br> ![Discord](https://img.shields.io/badge/Discord-%235865F2.svg?style=for-the-badge&logo=discord&logoColor=white)|
| 🛠️ 개발 및 관리 도구 | ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)<br><img src ="https://img.shields.io/badge/dbeaver-372923.svg?style=for-the-badge&logo=dbeaver&logoColor=white"><br>![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white)<br>![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)|
| :eyes: 사용 언어 | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>![Markdown](https://img.shields.io/badge/markdown-%23000000.svg?style=for-the-badge&logo=markdown&logoColor=white)|

<br>

---

<br>

## 🖥️시스템 구성


### 1. 데이터베이스 설계

#### 1. `diseases` 테이블

- **목적**: 각 질병에 대한 기본 정보를 저장합니다.
- **주요 컬럼**:
    - `disease_id`: 질병의 고유 식별자 (PRIMARY KEY, AUTO_INCREMENT)
    - `disease_name`: 질병의 이름 (NOT NULL)
    - `description`: 질병에 대한 상세 설명

#### 2. `foods` 테이블

- **목적**: 다양한 음식 정보를 저장합니다.
- **주요 컬럼**:
    - `food_id`: 음식의 고유 식별자 (PRIMARY KEY, AUTO_INCREMENT)
    - `food_name`: 음식의 이름 (NOT NULL)

#### 3. `disease_foods` 테이블

- **목적**: 특정 질병과 음식 간의 관계를 정의하여, 각 질병에 대해 어떤 음식이 권장(Recommended)되거나 피해야(Avoided) 하는지를 관리합니다.
- **주요 컬럼**:
    - `id`: 관계 레코드의 고유 식별자 (PRIMARY KEY, AUTO_INCREMENT)
    - `disease_id`: 관련 질병의 식별자 (FOREIGN KEY, `diseases.disease_id` 참조, ON DELETE CASCADE)
    - `food_id`: 관련 음식의 식별자 (FOREIGN KEY, `foods.food_id` 참조, ON DELETE CASCADE)
    - `food_type`: 해당 음식의 분류를 나타내는 ENUM 필드 (`Recommended` 또는 `Avoided`, NOT NULL)
    - `reason`: 선택한 음식 분류에 대한 이유 설명
### 2. 주요 기능 및 화면 구성


<br>

---

<br>

## 🌠트러블슈팅




<hr>

## 📝회고
