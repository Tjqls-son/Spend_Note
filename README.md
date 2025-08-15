# 💰오늘의 소비

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
├── manifests/
│   └── AndroidManifest.xml           # 앱의 기본 설정 및 컴포넌트(Activity, Service 등) 등록
├── kotlin+java/
│   └── com.example.spend_note/
│       ├── MainActivity.kt           # 앱의 메인 진입점 액티비티
│       └── (필요 시) 기타 화면/유틸 클래스 # 다른 화면을 담당하는 액티비티나 헬퍼 클래스 등
├── res/
│   ├── drawable/                     # 이미지, 아이콘, 배경 등 시각적 리소스
│   ├── layout/                       # UI 화면 레이아웃 XML 파일
│   ├── mipmap/                       # 앱 아이콘 리소스
│   └── values/                       # 색상, 문자열, 스타일 등 앱 디자인 정의
└── Gradle Scripts/                   # 빌드 설정 파일
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
