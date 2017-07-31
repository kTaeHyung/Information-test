## README.md

*[//]CMD를 이용해서 로컬저장소, 원경저장소에 올리기*

---
1. CMD 창에서 자바프로젝트를 만든 곳으로 경로 지정을 해놓는다.
    - ex) C:\JAVA_MAVEN\GitTestProject
2. git init
    - 이 명령어는 프로젝트 디렉토리에 git 저장소가 새로 만들어지고 프로젝트를 버전 관리 할 수 있다.
    - .git 이라는 하위 디렉토리를 만든다.
    - .git 디렉토리에는 저장소에 필요한 뼈대 파일(Skeleton)이 들어 있다. 이 명령만으로는 아직 프로젝트의 어떤 파일로 관리하지 않는다.
3. git add *
    - git add <파일이름>
    - git이 파일을 관리하게 하려면 저장소에 파일을 추가하고 커밋해야한다.
    - 변경된 파일은 이 명령어로 (인덱스)에 추가할 수 있다.
4. git commit -m '이번 확정본에 대한 설명'
    - git의 기본 config 를 설정하지 않은경우  
        - git config --global user.email "you@example.com" 
        - git config --global user.name "Your Name"
        설정해줘야 한다.
    - git의 기본 config 를 설정한 경우 
        - 저장소에 스냅샷을 저장한다.
        - 실제로 변경 내용을 확정하려면 아래 명령을 내려야 한다.
5. git remote add origin <원격 서버 주소>
    - ex) git remote add origin <https://github.com/kTaehyung/HelloWorld.git>
    - 기존에 있던 원격 저장소를 복제한 것이 아니라면, 원격 서버의 주소를 git에게 알려줘야 한다.
    - git 원격 저장소 변경 (git remote set-url origin <원격 서버 주소>)
6. git push -u origin master
    - 이코드를 작성하기 전에 현재의 변경 내용은 아직 로컬 저장소의 HEAD 안에 머물고 있다. 이 변경 내용을 원격 서버로 올리기 위해서는 이 코드를 작성한다.
   
- git clone <원격 서버 주소> 
    - ㄱ        

---