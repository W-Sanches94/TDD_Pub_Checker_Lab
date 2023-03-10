public class Guest {

    private String name;

    private int age;
    private char currency;
    private int wallet;
    private int sobriety;
    private boolean isNotBanned;


    public Guest(String name, int age, int wallet, int sobriety,boolean isNotBanned, char currency){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.currency = '£';
        this.sobriety = sobriety;
        this.isNotBanned = isNotBanned;
    }

    // GETTERS & SETTERS


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency){
        this.currency = currency;
    }

    public int getWallet (){
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getSobriety(){
        return sobriety;
    }

    public void setSobriety(int sobriety){
        this.sobriety = sobriety;
    }

    public boolean getIsNotBanned(){
        return isNotBanned;
    }

    public void setIsNotBanned(boolean isNotBanned) {
        this.isNotBanned = isNotBanned;
    }
}
