public class Main {
    
    /*public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }*/

    /*public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        System.out.println(teenyBit);
    }*/

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

    public static void main(String[] args) {

    }
}
