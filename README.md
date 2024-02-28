OS - MacBook Pro 14 Sonoma 14.3.1
Dev Tool - IntelliJ IDEA
DB - Maria DB
Server - Spring Boot Gradle
Project - Gradle - Kotlin
Language - Java (back), Vue (front)
Framework - Spring Boot (3.2.3)
Project Metadata    
    - Group - thunderbard
    - Artifact - dietitian
    - Name - dietitian-api
    - Description - dietitian
    - Package name - thunderbard.dietitian
    - Packaging - Jar
    - JDK - jbr17 JetBrains Runtime version 17.0.9
    - Java - 17
Dependencies
    - [추천 Dependency](https://velog.io/@luna001631/Springboot-Spring-Initializr을-사용해보자)
        - SpringWeb
        - Lobmok
        - Spring Data JPA
        - MySQL Driver
        - Spring Configuration Processor
        - Spring Boot DevTools
Version Control
    - git & github
        - https://github.com/Bard-K/dietitian-api.git
ERD
    - [ERD Cloud](https://www.erdcloud.com/d/NgHBEf5PqjGmYi7Wa)
화면 프로세스
    - [draw.io](https://app.diagrams.net/#G1jIknWWy3tKSTDa0MfbJxA4CCMmUesQ6w#%7B%22pageId%22%3A%22C5RBs43oDa-KdzZeNtuy%22%7D)
화면 설계서
    - [Figma](https://www.figma.com/file/267ULzLWtJrhqFOl4jXGDI/%ED%99%94%EB%A9%B4%EC%84%A4%EA%B3%84%EC%84%9C?type=design&node-id=0-1&mode=design&t=grH96APqde2QdHiZ-0)

깃 브랜치 전략 : Git-flow
    작업 순서
    1. local/develop checkout → fetch & merge 또는 pull 최신 소스 받기
    2. 피쳐 브랜치 따기
        local/develop > New Branch … → feature/날짜-이름-기능 → Create
    3. 피쳐 브랜치에서 코딩
    4. 피쳐 커밋 → 푸시
    5. local/develop checkout (디벨롭 브랜치로 이동) → fetch & merge 또는 pull 최신 소스 받기
        → 피쳐를 merge → push (디벨롭 브랜치를 푸시)
    -- 개발 할때는 위에까지 진행
    6. local/release checkout (릴리즈 브랜치로 이동) → fetch & merge 또는 pull 최신 소스 받기
        → 디벨롭을 merge → push (릴리즈 브랜치를 푸시)
    -- QA 진행 할 때 여기까지 진행
    7. local/master checkout (마스터 브랜치로 이동) → fetch & merge 또는 pull 최신 소스 받기 
        → 릴리즈를 merge → push (마스터 브랜치를 푸시)
    -- 배포 할 때 여기까지 진행

깃 커밋 컨벤션
    feat: 커밋 메시지 제목
    <type>
    feat : 새로운 기능에 대한 커밋
    fix : build 빌드 관련 파일 수정에 대한 커밋
    build : 빌드 관련 파일 수정에 대한 커밋
    chore : 그 외 자잘한 수정에 대한 커밋(rlxk qusrud)
    ci : CI 관련 설정 수정에 대한 커밋
    docs : 문서 수정에 대한 커밋
    style : 코드 스타일 혹은 포맷 등에 관한 커밋
    refactor : 코드 리팩토링에 대한 커밋
    test : 테스트 코드 수정에 대한 커밋