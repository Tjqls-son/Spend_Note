# 💰Spend_Note

Kotlin 기반 지출기록 앱입니다.  
기록하고 분석하며, 당신만의 스마트한 소비 습관을 설계하세요! 



## ✨ 주요 기능

- 🔐 구글, 네이버, 카카오톡 로그인
- 🧾 지출 내역 작성
- 📅 날짜별 소비 기록 조회
- 🎯 예산 설정 및 구독 관리
- 📊 소비 분석 리포트 (카테고리별, 기간별)
- 🤝 친구와의 동기부여 챌린지



## 🗂 프로젝트 구조

```bash
app/
├── java/com/example/spendnote/
│   ├── data/                     # 데이터 관련 코드 관리
│   │   ├── model/                 # 데이터 모델 클래스
│   │   ├── repository/            # 데이터 처리 및 저장소 역할
│   │   └── local/                 # 로컬 DB 및 DAO 정의 (Room)
│   ├── ui/                       # UI 관련 코드 (화면별 분리)
│   │   ├── auth/                  # 로그인 및 회원가입 화면
│   │   ├── home/                  # 홈 화면
│   │   ├── calendar/              # 달력 화면
│   │   ├── expenses/              # 소비 기록 화면
│   │   ├── budget/                # 예산 및 구독 관리 화면
│   │   ├── analysis/              # 소비 분석 화면
│   │   └── motivation/            # 동기부여 화면
│   └── MainActivity.kt            # 앱 진입점 액티비티
├── res/
│   ├── layout/                    # XML 레이아웃 파일
│   ├── drawable/                  # 이미지, 아이콘 등 리소스
│   └── values/                    # 색상, 문자열, 스타일 정의
└── AndroidManifest.xml            # 앱 설정 및 컴포넌트 등록
...
```

----------------------------------------------------------------- 이 아래로는 수정 필요

## 🧭 라우트 구조

| 경로         | 화면           |
|-------------|----------------|
| `/`         | SplashScreen   |
| `/login`    | LoginScreen    |
| `/home`     | HomeScreen     |
| `/calender` | CalenderScreen |



## 🧩 향후 확장 예정 구조

```
features/
├── todo/                    # 할 일 CRUD + 날짜 분류
├── pet/                     # 캐릭터 성장 및 상태 관리
├── inventory/               # 아이템 소유, 착용 상태
...
```



## 🛠 사용 기술 스택

- Kotlin
- Firebase Authentication (구글 로그인)
- Firebase Firestore (데이터 저장 예정)
- Provider or Riverpod (상태 관리 예정)
- Figma (UI 설계 도구)
- Hive (상태 저장)





본 문서는 계속 업데이트될 예정입니다.
구조 변경이나 기능 추가 시 함께 수정해 주세요.
