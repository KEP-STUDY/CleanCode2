---
theme: gaia
paginate: true
class: section
backgroundColor: #fff
backgroundImage: url('https://marp.app/assets/hero-background.jpg')
style: |
  section {
    font-size : 1.4rem;
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

---

## 의미를 명료하게 밝히는 주석

---

## 결과를 경고하는 주석

---

## TODO 주석

[link](https://github.kakaocorp.com/A-TF/eva-sdat/blob/95bb730064f5927b9913724677451c8d45def3e8/src/main/kotlin/com/kakao/sdat/news/infrastructure/playlist/RubicsCurrentPlayList.kt#L89)

---

## 중요성을 강조하는 주석

---

## 공개 API에서 Javadoc

---

## Non Offical

### Data Class

[Music DA](https://github.kakaocorp.com/search-middle/music-da/blob/dae1fae7e36aeab07b63ffd10d33d6c757b94e40/src/main/java/com/kakaocorp/model/TokenPack.java#L26)

### 외부 API

[News DA](https://github.kakaocorp.com/A-TF/eva-sdat/blob/df127a10f5cf4019d1c310bd23c0322ec6f9f663/src/main/kotlin/com/kakao/sdat/news/infrastructure/news/NewsApiRepository.kt#L13)

### TestCase

- BAD
  - [Music DA](https://github.kakaocorp.com/search-middle/music-da/blob/1d6dc87a312f8e1e64c81448dd35f83c9dc8d114/src/test/java/com/kakaocorp/v3intent/PlayMyPlaylistTest2.java#L85)
- GOOD
  - [link](https://lenditkr.github.io/kotlin/junit/)

---

# BAD 주석

## 주절거리는 주석

---

## 같은 이야기를 반복하는 주석

---

## 오해할 여지가 있는 주석

---

## 의무적으로 다는 주석

---

## 있으나 마나한 주석

---

## 무서운 잡음

---

## 괄호에 다는 주석

---

## 주석 처리한 코드

---

## HTML 주석

---

## 전역정보

---

## 너무 많은 정보

---

## 모호한 관계

---

## 함수 헤더

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
