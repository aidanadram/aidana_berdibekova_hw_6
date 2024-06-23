public class Boss extends GameEntity {
        private Weapon weapon;

        public Boss(String name, int health, Weapon weapon) {
            super(name, health);
            this.weapon = weapon;
        }

        public Weapon getWeapon() {
            return weapon;
        }

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public void printInfo() {
            System.out.println("Boss Name: " + getName());
            System.out.println("Health: " + getHealth());
            System.out.println("Weapon Type: " + weapon.getType());
            System.out.println("Weapon Name: " + weapon.getName());
        }
}
