package PLayers;

public class Warrior extends Hero{

    public Warrior(int health, int damage,  String heroName) {
        super(health, damage,SuperAbility.CRITICAL_DAMAGE, heroName);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }
}
