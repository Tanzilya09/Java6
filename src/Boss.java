public class Boss extends GameEntity{
 Weapon orushie;


    public Weapon getOrushie() {
        return orushie;
    }

    public void setOrushie(Weapon orushie) {
        this.orushie = orushie;
    }
    public String print(){
        return getLife() + " " + getDamage() + " " +
                getOrushie().getType() + " " + getOrushie().getClass();
    }

    public String printInfo(){
        return getLife() + " " + getDamage() + " " + getOrushie().getType() + " " + getOrushie().getName();
    }
}
