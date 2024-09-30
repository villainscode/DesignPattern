/**
 * @Author : CodeVillains
 * @Description : 인스턴스를 계속만들어 내는 것이 아닌, 동일 인스턴스를 사용하게 해야할 경우 사용된다.
 * 공용으로 사용하는 클래스(환경 설정 클래스나 커넥션 풀 등)와 같이 프로그램의 종료 시점까지 단 하나의 인스턴스만을 생성하고 재 사용한다거나 관리할 때 유용하다.
 */
package harunote.pattern.singleton;