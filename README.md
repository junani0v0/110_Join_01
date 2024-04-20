### 요구사항
- 프로젝트 환경 설정하기
  - servlet
  - spring
  - mybatis
  - logback
- index.html -> login.jsp 로 변환
- css, js 파일 resources tag 설정
- Servlet 구성 및 접속
  - 회원가입 페이지 : /loginPage.do
  - 회원가입 : /join.do
    - 회원 테이블에 정보 입력하기
- 회원가입 성공/실패에 따른 Alert 노출하기

### 제약조건
- 구현하는 모든 메서드에 주석을 달 것.
```
/**
 * 회원 찾기
 * 
 * @param memberId 회원ID
 * @param email 회원 이메일
 * @return true/false
 */
public boolean findPasswd(String memberId, String email) {
    // codes
}
```

### Docker DB
```
# for Windows
docker run --name mysql-lecture -p 53306:3306 -v c:/dev/docker/mysql:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=admin_123 -d mysql:8.3.0

# for Mac
docker run --name mysql-lecture -p 53306:3306 -v ~/dev/docker/mysql:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=admin_123 -d mysql:8.3.0
```
