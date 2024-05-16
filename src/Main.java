public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(10000);
        boss.setDamage(666);
        boss.setDefenseType("Absolute");


        System.out.println("Boss JeepersCreepers:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());


        Hero[] heroesArray = createHeroes();
        System.out.println("\nHeroes Information:");
        for (Hero hero : heroesArray) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage()
                    + ", Superpower: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {

        Hero firstHero = new Hero(1050, 99, "power");
        Hero secondHero = new Hero(800, 150);
        Hero thirdHero = new Hero(3000, 300, "intelect");

        Hero[] heroes = {firstHero, secondHero, thirdHero};

        return heroes;
    }
}
