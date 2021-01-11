# 창발성

## 창발성이란 무엇인가?

- [위키](https://ko.wikipedia.org/wiki/%EC%B0%BD%EB%B0%9C)
- 하위 계층에는 없는 특성 상위 계층에서 발생하는 현상
    - Bool 연산, 뉴런, 레 ...
![전가산기](https://t1.daumcdn.net/cfile/tistory/235B935056E830D938)
![뉴런](http://study.zumst.com/upload/00-D22-91-12-05/1_2_a_%EB%89%B4%EB%9F%B0%EC%9D%98%20%EA%B5%AC%EC%A1%B0.jpg)
    

## 좋은 코드란 무엇인가?

- 켄트 백 say "단순한 코드가 좋은 코드다"
- 단순한 코드란 무엇인가? (위에서 부터 중요한 순)
    - 모든 테스트를 실행한다.
    - 중복을 없애라.
    - 프로그래머 의도를 표현한다.
    - 클래스와 매서드 수를 최소로 줄인다.

## 모든 테스트를 실행하라

- 모든 시스템의 제일 중요한 점은 의도한 대로 돌아가는 것
    - 문제는 어떻게 증명할 것인가
    - 테스트가 없으면 검증이 불가능하다
- 테스트를 하기 위해서는 품질이 높은 시스템을 만들어야 한다
    - 크기가 작고 하나의 목적을 수행하는 클래스가 생성됨
    - SRP (단일 책임 원칙) 를 준수하는 클래스는 테스트 하기 쉬움
    - 기존 테스트가 많으면 새로운 테스트를 만들기 쉬워짐
- 결합도가 높으면 테스트 케이스를 만들기 어려워짐
    - DI, Interface, 추상화 등을 사용해서 결합도를 낮추게됨
- 리팩토링
    - 테스트 케이스가 잘되어 있으면 리팩토링 하기 편함 

## 중복을 없애라

- 불필요한 중복은 복잡도 + 버그의 근원
- 중복의 종류
    - 똑같은 코드
- template method pattern

```kotlin
fun main(){
    val coffeeRecipe = CoffeeRecipe()
    val redTeeRecipe = RedTeeRecipe()
    
    coffeeRecipe.make(listOf("설탕", "크림"))
    redTeeRecipe.make(listOf("레몬"))
    
    coffeeRecipe.make(listOf("레몬"))
    
}

abstract class DrinkRecipeTemplate{
    fun make(additionalItems:List<String>){
        this.boilWater()
       	this.brew()
        this.pourIntoCup()
        this.addAsYouLike(additionalItems)
        println("완료되었습니다. \n")
    }
    
    abstract fun boilWater()
    abstract fun brew()
    abstract fun pourIntoCup()
    abstract fun addAsYouLike(additionalItems:List<String>)
    
}

class CoffeeRecipe:DrinkRecipeTemplate(){
	override fun boilWater(){
        println("물을 끓입니다")
    }
    override fun brew(){
        println("커피를 우립니다")
    }
    override fun pourIntoCup(){
        println("컵에 붓습니다.")
    }
    override fun addAsYouLike(additionalItems:List<String>){
        if(additionalItems.contains("레몬")){
            throw Exception("커피에는 레몬이 들어가지 않습니다")
        }
        println(additionalItems.joinToString(", ") + "을 추가합니다.")
    }
}

class RedTeeRecipe:DrinkRecipeTemplate(){
    override fun boilWater(){
        println("물을 끓입니다")
    }
    override fun brew(){
        println("홍차를 우립니다")
    }
    override fun pourIntoCup(){
        println("컵에 붓습니다.")
    }
    override fun addAsYouLike(additionalItems:List<String>){
        println(additionalItems.joinToString(", ") + "을 추가합니다.")
    }
}

```
[Kotlin PlayGround](https://pl.kotl.in/GhXSJic7_)

## 프로그래머의 의도를 표현해라

- 의도를 표현하는 방법
    - 좋은 이름을 선택한다
    - 함수와 클래스 크기를 가능한 줄인다
    - 표준 명칭을 사용한다
    - 단위 테스트 케이스를 꼼꼼히 작성한다.
- 표현력을 높이는 가장 중요한 방법은 노력
    - 코드가 작동한다고 완성된건 아니다
    - 미래에 이 코드를 읽을 사람을 생각하라

## 클래스와 매서드 수를 최소로 줄인다

- 극도로 클래스와 매서드의 크기를 줄이면 득보다 실이 많아진다
    - 그래서 함수와 클래스의 수를 줄이라고 제안한다
- 극도로 철저한 규칙은 오히려 독이 될 수도 있다.
    - 모든 클래스는 인터페이스를 가진다.
    - 자료 클래스와 동작 클래스는 분리한다.
- 목적과 수단을 헷갈리지 말아라
    - 클래스를 나누고 패턴을 만드는 이유는 가독성을 높이고 오류를 피하기 위함
    - 클래스를 나누기 위해 가독성을 포기하는 것은 잘못된 일