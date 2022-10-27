package PLayers;

public abstract class Hero implements HavingSuperAbility {

    private String heroName;
    private int heroDamage;

    public Hero(String heroName, int heroDamage) {
        this.heroName = heroName;
        this.heroDamage = heroDamage;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }
}