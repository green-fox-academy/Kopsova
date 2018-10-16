public class AirCraft {

    int baseDamage;
    int maxAmmo;
    int ammos ;
    int allDamage;

    public AirCraft(int allDamage) {
        this.ammos = 0;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.allDamage = allDamage;
    }

    public int fight () {

        int damage;
        damage= ammos * baseDamage;
        this.ammos = 0;
        allDamage += damage;
        return damage;
    }
 public int refill (int refilled){

        if (refilled< maxAmmo){
            ammos = refilled;
            return 0;
        } else {
            return refilled - maxAmmo;

        }
 }

 public String getTypeMy (){
        return getClass().getSimpleName();

 }

 public String getStatus () {

        return ("Type" + getTypeMy()+" , Ammo: "+ ammos + " , Base Damage: " + baseDamage + " , All Damage: " + allDamage);



 }
 public boolean isPriority () {

        if (AirCraft.this instanceof F35) {
            return true;
        } else {
    return false;
     }
 }



}
