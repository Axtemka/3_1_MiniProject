package Plot;

public class CharacterP {
    int respect;
    int money;
    int career;
    String name;

    public CharacterP(String name) {
        this.respect = 0;
        this.money = 100;
        this.career = 1;
        this.name = name;
    }

    public int getRespect() {
        return respect;
    }

    public void setRespect(int respect) {
        this.respect = respect;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void validateModifiers(int[] mod){
        setRespect(getRespect()+mod[0]);
        setMoney(getMoney()+mod[1]);
        setCareer(getCareer()+mod[2]);

        printModifiers();
    }

    public void printModifiers(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(getName() + " respect: " + getRespect() + " money: " + getMoney() + " career: " + getCareer());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
