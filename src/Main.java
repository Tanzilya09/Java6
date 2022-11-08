public class Main {
    public static void main(String[] args) {
        GameEntity gameEntity = new GameEntity();
        Boss boss=new Boss();
        Weapon orushie=new Weapon();
        orushie.setName("Aka48");
        orushie.setType("cold");
        boss.setOrushie(orushie);
        boss.setDamage(50);
        boss.setLife(200);
        System.out.println(boss.getDamage());
        System.out.println(boss.getLife());
        System.out.println(boss.getOrushie().getName());
        System.out.println(boss.getOrushie().getType());


    }
}