public class Main {
    public static void main(String[] args) {
            Weapon bossWeapon = new Weapon(WeaponType.Sword, "Black flame");
            Boss boss = new Boss("Dark Lord", 1200, bossWeapon);
            boss.printInfo();
            System.out.println();


            Weapon skeletonWeapon1 = new Weapon(WeaponType.Bow, "Bone Bow");
            Skeleton skeleton1 = new Skeleton("Skeleton Archer", 700, skeletonWeapon1, 50);

            Weapon skeletonWeapon2 = new Weapon(WeaponType.Gun, "Fire Gun");
            Skeleton skeleton2 = new Skeleton("Firearm Skeleton ", 400, skeletonWeapon2,
                    90);


            skeleton1.printInfo();
            System.out.println();
            skeleton2.printInfo();
        }
    }
