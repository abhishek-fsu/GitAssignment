package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        armor=(int)(0.80*armor);
		int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}