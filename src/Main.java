public class Main {
    public static void main(String[] args) {
        GameEntity gameEntity = new GameEntity();
        Boss boss=new Boss();
        Weapon orushie=new Weapon("cold","AK47");
        boss.setOrushie(orushie);
        boss.setDamage(50);
        boss.setLife(200);
        System.out.println(boss.getDamage());
        System.out.println(boss.getLife());
        System.out.println(boss.getOrushie().getName());
        System.out.println(boss.getOrushie().getType());
        Skeleton skeleton = new Skeleton();
        skeleton.setLife(400);
        skeleton.setDamage(100);
        skeleton.setNumberOfArrows(15);
        skeleton.setOrushie(new Weapon("bow","zero"));
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setLife(1000);
        skeleton1.setDamage(10000);
        skeleton1.setNumberOfArrows(150);
        skeleton1.setOrushie(new Weapon("bow", "zero"));
        System.out.println(skeleton1.printInfo());

    }
}