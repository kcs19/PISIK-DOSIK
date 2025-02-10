# 🥗PISIK-DOSIK
## 목차
[📒프로젝트 개요](#-프로젝트-개요)<br>
[🖥️시스템 구성](#️시스템-구성)<br>
[🌠트러블슈팅](#트러블슈팅)<br>
[📝회고](#회고)


<hr>

## 🤝 팀원
|<img src="https://avatars.githubusercontent.com/u/98368034?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/49242646?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/103468518?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/103871252?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|
|장수현<br/>[@Aunsxm](https://github.com/Aunsxm)|최윤정<br/>[@letmeloveyou82](https://github.com/letmeloveyou82)|김창성<br/>[@kcs19](https://github.com/kcs19)|김우현<br/>[@woody6624](https://github.com/woody6624)|

<hr>


## 📒 프로젝트 개요

###  개발 목적
50~60대 사용자가 자주 걸리는 질병을 대상으로 피해야 할 음식, 도움이 되는 음식 정보를 제공하고, 관련 음식 조리법을 쉽게 찾아볼 수 있도록 지원하는 웹페이지를 개발한다.

**1인당 주요 질병 수**
![Image](https://github.com/user-attachments/assets/2d428d03-2c71-405b-8ee3-44ca1ec56c5b)

- **50대 이상 환자, 1인당 6.68개 질병 보유**
    - 건강보험심사평가원은 2018년 한 해 50대 이상 환자들은 1인당 6.68개의 주요 질병으로 병원을 방문했다는 결과를 발표했다.
    - 또한 의료기관·약국을 방문한 환자 수는 50대가 857만 7599명으로 가장 많았다.
        
        http://www.cdpnews.co.kr/renewal/cdpnews_read.asp?menuID=3&idx=36908
        
- **식습관의 중요성 - 우리나라 만성질환 원인 1위‘올바르지 못한 식습관**
    - 세계 보건기구(WHO)에서는 우리나라의 비만, 당뇨, 심혈관질환, 암 등의 **만성질환의 가장 큰 요인으로 올바르지 못한 식습관을 지목**한 바 있다.
    - 대한당뇨병학회: 건강한 식습관이 혈당 조절과 합병증 예방에 도움.
    - 대한고혈압학회: 식이섬유 증가, 나트륨 감소가 혈압 관리에 긍정적 영향.

        https://www.khepi.or.kr/board/view?pageNum=18&rowCnt=10&menuId=MENU00907&maxIndex=99999999999999&minIndex=99999999999999&schType=0&schText=&categoryId=&continent=&country=&upDown=0&boardStyle=&no1=235&linkId=501654

- **문제점 - 식습관 정보를 쉽게 얻기 어려움**.
    - 많은 사람들이 질병에 따라 **어떤 음식이 건강에 좋은지, 어떤 음식은 피해야 하는지 한눈에 보기 어려움**.
- **해결책 - 질병과 관련된 음식 정보를 한눈에 볼 수 있는 웹사이트 구축**
    - 사용자가 쉽게 접근할 수 있도록 **건강한 음식, 피해야 할 음식, 맞춤형 식단 추천 기능**을 제공.


###  주요 기능

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
| 🛠️ 개발 및 관리 도구 | ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)<br><img src ="https://img.shields.io/badge/dbeaver-372923.svg?style=for-the-badge&logo=dbeaver&logoColor=white"><br>![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)|
| :eyes: 사용 언어 | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>![Markdown](https://img.shields.io/badge/markdown-%23000000.svg?style=for-the-badge&logo=markdown&logoColor=white)<br>![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)|

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

## 🛜GCP를 통한 서버 배포

### Google Cloud에서 VM 인스턴스 생성하기

https://cloud.google.com/?hl=ko

![Image](https://github.com/user-attachments/assets/fbec8459-4752-4938-a471-8ab93660d435)

### 부팅 디스크

- 이미지 : Ubuntu 선택(default : debian)
- 크기(GB) : 프로그램에 맞게 유동적으로 조절

### 방화벽 설정하기

![Image](https://github.com/user-attachments/assets/5b00956b-5928-4bce-a13e-cffe2aa6e8e2)

### VPC 네트워크 세부정보

VPC네트워크 → VPC networks → Network: default
![Image](https://github.com/user-attachments/assets/b3b6bdd3-3e09-4ecd-b16e-5ecac0cbcb9f)

방화벽 규칙 추가

트래픽 방향 : 인그레이스

- **Ingress :** 애플리케이션 레벨에서 외부 요청을 내부 서비스로 라우팅하는 역할

대상 : 네트워크의 모든 인스턴스

소스 IPv4 범위 : 0.0.0.0/0

![Image](https://github.com/user-attachments/assets/a452622e-2637-47b6-9898-e2db57c3ce10)

DBeaver를 통해 Ubuntu에 설치되어있는 MySQL을 이용한 협업과 어플리케이션에서 DB와의 통신을 하기 위하여 3306포트를 추가

### 우분투 서버 구성

서버 연결 : 브라우저에서 SSH를 통해서 연결

1. JDK-17 설치
    
    ```bash
    sudo apt update
    sudo apt install openjdk-17-jdk
    # 설치 확인
    java -version
    openjdk version "17.0.14" 2025-01-21
    OpenJDK Runtime Environment (build 17.0.14+7-Ubuntu-120.04)
    OpenJDK 64-Bit Server VM (build 17.0.14+7-Ubuntu-120.04, mixed mode, sharing)
    ```
    
2. MySQL 설치 및 설정
    
    ```bash
    sudo apt update
    sudo apt install mysql-server -y
    # MySQL 상태 체크
    sudo systemctl status mysql
    ```
    
    bind-address 변경
    
    ```bash
    sudo vi /etc/mysql/mysql.conf.d/mysqld.cnf # sudo nano도 가능합니다.
    
    # bind-address = 127.0.0.1 -> bind-address = 0.0.0.0
    # cat을 통해 출력하여 확인
    sudo cat /etc/mysql/mysql.conf.d/mysqld.cnf 
    # 방화벽 설정
    sudo ufw allow 3306/tcp
    sudo ufw reload
    
    # 이후 mysql 재시작
    sudo systemctl restart mysql
    
    ```
    
   ![Image](https://github.com/user-attachments/assets/d4a02ef7-99cb-4fb6-b544-eae95c6f3dbc)
    

### Tomcat 10.1.34 설치

⚠️주의! Tomcat 10.1.34 은 자바 11 이상을 요구합니다.

https://downloads-he-fi-1.apache.org/tomcat/tomcat-10/v10.1.34/

`Tomcat 10.1 requires Java 11 or later. Read the RELEASE-NOTES and the RUNNING.txt file in the distribution for more details.`

Tomcat 10.1.34 다운로드

```bash
sudo wget https://downloads.apache.org/tomcat/tomcat-10/v10.1.34/bin/apache-tomcat-10.1.34.tar.gz
```

다운로드 완료 후 압축 해제

```bash
sudo tar -xvzf /opt/apache-tomcat-10.1.34.tar.gz -C /opt
```

실행 권한 설정 및 Tomcat 실행

```bash
# 디렉토리 이름 변경 tomcat10
sudo mv /opt/apache-tomcat-10.1.34 /opt/tomcat10

# 실행 권한 부여
sudo chmod +x /opt/tomcat10/bin/*.sh

# Tomcat 실행
sudo /opt/tomcat10/bin/startup.sh

```

톰캣의 기본 포트는 8080이므로 포트 변경을 원한다면 파일을 변경해야 합니다.

```bash
sudo vi /opt/tomcat10/conf/server.xml 

<Connector port="원하는 포트번호로 수정" protocol="HTTP/1.1"
           connectionTimeout="20000"
           redirectPort="8443" />
           
# 이후 재시작
sudo /opt/tomcat10/bin/shutdown.sh
sudo /opt/tomcat10/bin/startup.sh
```

STS로부터 export한 war 파일을 정상적으로 우분투 서버에 옮겨오고 난 뒤 진행

추출한 war파일을 `/opt/tomcat10/webapps/` 에 위치시킵니다.

### ⚠️주의

현재 우분투 서버의 JDK 버전은 17입니다.

만약 Eclipse STS를 이용하여 추출한 WAR파일이 JDK-17이 아닌 버전의 JDK로 컴파일이 되었다면 충돌이 일어나므로 JDK 버전을 맞추는 것을 추천합니다.

### 에러 발생 예시

```bash
java.lang.UnsupportedClassVersionError: 특정파일 혹은 디렉토리/특정파일 혹은 디렉토리 
has been compiled by a more recent version of the Java Runtime 
(class file version 65.0), this version of the Java Runtime only recognizes 
class file versions up to 61.0 (unable to load class [특정파일 혹은 디렉토리
/특정파일 혹은 디렉토리 ])
```

### pom.xml 체크

 WAR파일 추출 전에 <source> 태그와 <target> 태그 체크

```bash
<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
            <source>17</source> 
            <target>17</target> # 해당 태그 내부가 21일 경우 우분투에도 21로 설치해야함
        </configuration>
    </plugin>
</plugins>

```

### Tomcat 재시작

```bash
# Tomcat 종료
sudo /opt/tomcat10/bin/shutdown.sh
# Tomcat 시작
sudo /opt/tomcat10/bin/startup.sh
```

`ls -al /opt/tomcat10/webapps/` 명령어를 통해서 정상 배포를 확인해야 합니다.

```bash
# war파일명에 맞추어 디렉토리가 생성되어야합니다.
drwxr-x---  4 root root     4096 Feb  7 09:33 pisikdosik # 생성 완료!
-rw-r--r--  1 root root 13561942 Feb  7 09:33 pisikdosik.war
```

정상적으로 배포가 완료되었다면 `http://<서버_IP>/[war파일명 위 예시에서는 pisikdosik]` 를 통하여 접속을 할 수 있습니다.

### CloudFlare를 통한 도메인과 Https 설정

1. 가비아에서 원하는 도메인 구매
    
    https://www.gabia.com/?utm_source=google-gdn&utm_medium=performanceMax&utm_campaign=%EA%B0%80%EB%B9%84%EC%95%84&utm_term=%EA%B0%80%EB%B9%84%EC%95%84&gad_source=1&gclid=Cj0KCQiA-5a9BhCBARIsACwMkJ4GUUAUIfQ6XQU33OPcl3KqzrsIIbEBHRxV99thNBTWgAxKa-W-sXoaAt3UEALw_wcB
    
2. 도메인 등록 및 DNS 설정 
    
    ![Image](https://github.com/user-attachments/assets/676c23e4-cb49-4229-bba5-818e1e47f0ba)
    
    구매한 도메인과 우분투 서버의 IPv4주소를 입력
    
    - Type : A
    - Name : 구매한 도메인(. 뒤에까지)
    - IPv4 address : 우분투 서버의 IPv4 주소
    - Proxy status : proxied로 설정
        - https://developers.cloudflare.com/dns/manage-dns-records/reference/proxied-dns-records/
    
    ![Image](https://github.com/user-attachments/assets/ec3ff537-c6a4-4491-85b6-96d59dfffc79)
    
3. **SSL/TLS encryption 설정**
    
    Flexible로 설정 
    
    Flexible : 브라우저 ↔ Cloudflare 간은 HTTPS, Cloudflare ↔ 서버 간은 HTTP
    
   ![Image](https://github.com/user-attachments/assets/bfa6e99c-db44-4f49-81e0-f68af77b2557)
    
    다만 보안을 생각한다면 `Full` 혹은 `Full (Strict)` 를 사용하는 것이 좋습니다. 
    
    단, Cloudflare의 SSL 모드가 `Flexible`이 아닌 경우(`Full` 또는 `Full (Strict)` 모드)에는 **서버에도 SSL 인증서**를 설치해야 합니다.
    
    - SSL 인증서 발급 기관 예시 : https://letsencrypt.org/
4. 80포트가 아닌 8080 포트를 사용하고 싶을 시
    
    https://developers.cloudflare.com/cloudflare-one/connections/connect-networks/
    

위 과정을 통해 기존 `http://<서버_IP>/[war파일명 위 예시에서는 pisikdosik]` 가 아닌 `https://<서버_IP>/[war파일명 위 예시에서는 pisikdosik]` 로 연결이 가능합니다.

<hr>

## 🌠트러블슈팅
### 1. JSTL 태그 사용으로 코드 간결화

- 기존에는 JSP tag를 사용하여 Java코드를 이용해 select의 옵션을 반복적으로 생성했습니다.
    
```jsx
    <%@ page import="java.util.List" %>
    <%@ page import="model.domain.Disease" %>
```
    

```html
<div class="disease-list" id="disease-list">
			    <div class="select-container">
			        <span class="select-text">질병 선택🔎</span>
			        <select id="disease-select" onchange="loadFoodInfo(this.value)" class="select">
			            <option value="">질병 선택</option>
			            <% 
			                if (request.getAttribute("diseases") != null) {
			                    List<Disease> diseases = (List<Disease>) request.getAttribute("diseases");
			                    for (Disease disease : diseases) { 
			            %>
			                        <option value="<%= disease.getDiseaseId() %>"><%= disease.getDiseaseName() %></option>
			            <% 
			                    } 
			                } 
			            %>
			        </select>
			    </div>
			</div>
```

- JSTL를 사용하여 코드 간결화하였습니다.
    - EL(Expression Language) `${diseases}` 와 `<c:forEach>` 태그를 더 가독성을 높이고 코드를 단축할 수 있었습니다.

```html
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```

```html
<div class="disease-list" id="disease-list">
	        	<div class="select-container">
        			<span class="select-text">질병 선택🔎</span>
				    <select id="disease-select" onchange="loadFoodInfo(this.value)" class="select">
				    	<option value="">질병 선택</option>
				        <c:forEach items="${diseases}" var="disease">
				            <option value="${disease.diseaseId}">${disease.diseaseName}</option>
				        </c:forEach>
				    </select>
		    	</div>
			</div>
```

하지만 JSTL 라이브러리 추가가 필요했음

1. **jstl  라이브러리 추가**
    
    ![Image](https://github.com/user-attachments/assets/fdd6e969-6bb5-404e-b848-6a42cdccf42b)
    
    1. Apache에서 제공하는 jar 파일을 직접 다운받아 WEB-INF/lib폴더에 적용하는 방법 사용
        
        → 여러 개발자가 협업할 때 동일한 라이브러리를 수동으로 추가해야 하는 번거러움이 있었음
        
    2. Maven을 이용하여 의존성을 추가하여 해결
        
        → `pom.xml`에 JSTL 라이브러리 의존성을 추가하여 공유함으로써 협업할 때 일관된 환경을 유지할 수 있었음
        
    

1. 질병 정보 페이지 이동이 아닌 비동기로 정보 추가
    - 사용자가 질병을 선택했을 때 필요한 데이터만 받아와 기존 페이지는 유지되며 선택한 질병 아래에 추천 시단만 업데이트 되게 함
    
    ```jsx
    <script>
    		function loadFoodInfo(diseaseId) {
    			const xhttp = new XMLHttpRequest();
    			xhttp.onreadystatechange = function() {
    				if (this.readyState == 4 && this.status == 200) {
    					let data = this.responseText; //서버 응답
    			      	//console.log(data,typeof(data));
    			    	document.getElementById("food-info").innerHTML = data;
    			    	document.getElementById("food-info").style.display = "block";
    			    	}
    				};
    			xhttp.open("GET", "good-bad-info?diseaseId="+diseaseId);
    			xhttp.send();
    		}
    	</script>
    ```
    
    1. URL get요청의 파라미터를 통해 `diseaseId`를 파라미터로 포함하여 **서버에서 해당 질병의 추천 식단 정보를 가져옴**
        - 예를 들어, 사용자가 "고혈압"을 선택하고 `diseaseId=1` 이라면,
        
        서버에는 "good-bad-info?diseaseId=1"로 요청이 전송됨
        
    2. `xhttp.send();`
        - 위에서 설정한 GET 요청을 **서버로 전송하고** 요청을 받아 해당 `diseaseId`에 맞는 추천 식단 정보를 응답으로 반환
    
    ⇒ 추천 식단이 사용자에게 페이지를 새로 고침하지 않고 서버에서 데이터를 가져와 동적으로 반영할 수 있어 사용자는 더 빠르게 정보를 확인할 수 있고, 직관이다.



<hr>

## 📝회고

