public class Guest {

    private String name;
    private char currency;
    private int wallet;
    private int sobriety;
    private boolean isBanned;


    public Guest(String name,int wallet,int sobriety,boolean isBanned, char currency){
        this.name = name;
        this.currency = currency;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.isBanned = isBanned;
    }

    // GETTERS & SETTERS


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public boolean getIsBanned(){
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
