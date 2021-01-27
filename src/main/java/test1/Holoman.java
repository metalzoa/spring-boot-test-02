package test1;
// 패키지 명을 test1 으로 반드시 맞춰야 한다
// 안그러면 spring-boot-test-01 Application 실행시 오류 발생
public class Holoman {
    String name;
    int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    @Override
    public String toString() {
        return "Holoman{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }
}
