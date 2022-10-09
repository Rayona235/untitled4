package PLayers;

public class Bersek extends Hero{

    public Bersek(int health, int damage, String heroName) {
        super(health, damage, SuperAbility.SAVE_AND_REVERT_DAMAGE, heroName);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }
}
