---
theme: gaia
paginate: true
class: section
backgroundColor: #fff
backgroundImage: url('https://marp.app/assets/hero-background.jpg')
style: |
  section {
    font-size : 2rem;
  }
marp: true
---

# 주석

## 대 전제

- 코드는 계속 변화하고 진화한다.
  - 주석은 코드를 수정할때 수정해야하는 포인트이지만 놓치기 쉽다.
- 주석은 문제를 해결할 수 없다.
- 주석이 틀릴때 오류를 유발할 수 있다.
- 코드로 의도를 표현하라!
  - 우리는 프로그래머. 코드로 말하는 것이 직관적이고 위험하지 않다

---

# GOOD 주석

## 법적인 주석

[link](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-tests/spring-boot-integration-tests/spring-boot-server-tests/src/test/java/com/autoconfig/ExampleAutoConfiguration.java)

- 최근에는 License file 을 이용해 관리하는편
  - https://docs.github.com/en/free-pro-team@latest/github/building-a-strong-community/adding-a-license-to-a-repository

---

## 정보를 제공하는 주석

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/5cacec1cb73a97362a82c6664b48c114fa5ad3d2/src/main/kotlin/com/kakao/sdat/commons/util/HangulUtil.kt#L6)

---

## 의도를 설명하는 주석

[link](https://github.kakaocorp.com/search-middle/music-da/blob/27bd0477da65beba5c199d46dc14a09b2c90a289/src/main/java/com/kakaocorp/model/Token.java#L38)

---

## 의미를 명료하게 밝히는 주석

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/7de4294462dc2c001567be8955df64b3948c2992/src/main/kotlin/com/kakao/sdat/sports/application/SportsPlayerResultAggregator.kt#L36)

---

## 결과를 경고하는 주석

[link](https://github.kakaocorp.com/search-middle/music-da/blob/aa80e8daa3161efb3299ed4f3ccdafe26b3d36b8/clients/src/main/java/com/kakaocorp/search/musicda/clients/melon/dto/io/DeliveryStreamingPathReq.java#L83)

---

## TODO 주석

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/95bb730064f5927b9913724677451c8d45def3e8/src/main/kotlin/com/kakao/sdat/news/infrastructure/playlist/RubicsCurrentPlayList.kt#L89)

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/5167bbff982f238d228b31d9d1be9f7a18524532/src/main/kotlin/com/kakao/sdat/news/domain/intent/NewsScenarioGuesser.kt#L21)

---

## 중요성을 강조하는 주석

[link](https://github.kakaocorp.com/search-middle/music-da/blob/1624105c2e746bd10cec79eea4607dcf35afa677/commons/src/main/java/com/kakaocorp/search/da/musicda/support/model/DeviceInfo.java#L99)

---

## 공개 API에서 Javadoc

[link](https://github.com/ReactiveX/RxJava/blob/0f21ba82666e65a54e980638cfb8a0ffe3dfe506/src/main/java/io/reactivex/rxjava3/core/Single.java#L235)

---

## Non Offical

### Data Class

[Bad](https://github.kakaocorp.com/search-middle/music-da/blob/dae1fae7e36aeab07b63ffd10d33d6c757b94e40/src/main/java/com/kakaocorp/model/TokenPack.java#L26)

[Good](https://github.kakaocorp.com/search-middle/music-da/blob/8b7fae8c2a6bd372a2f685e4997b92368b034f3e/clients/src/main/java/com/kakaocorp/search/musicda/clients/capri/dao/UserMeReq.java#L36)

### 외부 API

[News DA](https://github.kakaocorp.com/A-TF/eva-sdat/blob/df127a10f5cf4019d1c310bd23c0322ec6f9f663/src/main/kotlin/com/kakao/sdat/news/infrastructure/news/NewsApiRepository.kt#L13)

### TestCase

- [BAD](https://github.kakaocorp.com/search-middle/music-da/blob/1d6dc87a312f8e1e64c81448dd35f83c9dc8d114/src/test/java/com/kakaocorp/v3intent/PlayMyPlaylistTest2.java#L85)
- [GOOD](https://lenditkr.github.io/kotlin/junit/)

---

# BAD 주석

## 주절거리는 주석

```java
public void loadProperties()
{
  try
  {
    String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
    FileInputStream propertiesStream = new FileInputStream(propertiesPath);
    loadedProperties.load(propertiesStream);
  }
  catch(IOException e)
  {
    // 속성 파일이 없다면 기본값을 모두 메모리로 읽어 들였다는 의미이다.
  }
}

```

---

## 같은 이야기를 반복하는 주석

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/7de4294462dc2c001567be8955df64b3948c2992/src/main/kotlin/com/kakao/sdat/sports/application/SportsPlayerResultAggregator.kt#L41)

---

## 오해할 여지가 있는 주석

```java
// this.closed가 true일 때 반환되는 유틸리티 메서드이다.
// 타임아웃에 도달하면 예외를 던진다.
public synchronized void waitForClose(final long timeoutMillis)
throws Exception
{
  if(!closed)
  {
    wait(timeoutMillis);
    if(!closed)
     throw new Exception("MockResponseSender could not be closed");
  }
}

```

---

## 의무적으로 다는 주석

```java
 /**
 *
 * @param title The title of the CD
 * @param author The author of the CD
 * @param tracks The number of tracks on the CD
 * @param durationInMinutes The duration of the CD in minutes
 */
 public void addCD(String title, String author,
                   int tracks, int durationInMinutes) {
  CD cd = new CD();
  cd.title = title;
  cd.author = author;
  cd.tracks = tracks;
  cd.duration = duration;
  cdList.add(cd)
 }

```

---

## 있으나 마나한 주석

```java
/**
 * 기본 생성자
 */
protected AnnualDateRule() {
}

/** 월 중 일자 */
 private int dayOfMonth;

/**
 * 월 중 일자를 반환한다.
 *
 * @return 월 중 일자
 */
public int getDayOfMonth() {
 return dayOfMonth;
}

```

---

## 괄호에 다는 주석

```java
public class wc {
 public static void main(String[] args) {
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 String line;
 int lineCount = 0;
 int charCount = 0;
 int wordCount = 0;
 try {
    while ((line = in.readLine()) != null) {
      lineCount++;
      charCount += line.length();
      String words[] = line.split("\\W");
      wordCount += words.length;
    } //while
    System.out.println("wordCount = " + wordCount);
    System.out.println("lineCount = " + lineCount);
    System.out.println("charCount = " + charCount);
  } // try
  catch (IOException e) {
    System.err.println("Error:" + e.getMessage());
  } //catch
 }

```

---

## 주석 처리한 코드

우리에겐 Git 이 있다.

---

## HTML 주석

[link](https://github.com/ReactiveX/RxJava/blob/0f21ba82666e65a54e980638cfb8a0ffe3dfe506/src/main/java/io/reactivex/rxjava3/core/Maybe.java#L198)

---

## 전역정보

```
/**
 * 적합성 테스트가 동작하는 포트: 기본값은 <b>8082</b>.
 *
 * @param fitnessePort
 */
public void setFitnessePort(int fitnessePort)
{
  this.fitnessePort = fitnessePort;
}

```

흠... 난 좋은데..

---

## 비공개 코드에서 Javadocs

[link](https://github.kakaocorp.com/search-middle/kakaotv-da2/blob/9b8201f7edc66f9b8213db6b8329ee626d10a62e/src/main/java/com/kakao/search/da/kakaotv/clients/commons/ClientBaseUrlRegistry.java#L39)

---

# 결론

## Schema as Code

[발표 자료](https://docs.google.com/presentation/d/1XQWrYrz8wr8DzXV4e8Ffhhb9pjrAu8BXq2xrNdE1pW4/edit?usp=sharing)

## Infra as Code

[Terraform](https://www.terraform.io/)
[Blog](https://woowabros.github.io/tools/2019/09/20/terraform.html)

---

![](../image/hqdefault.jpg)

---
