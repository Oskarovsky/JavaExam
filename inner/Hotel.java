package inner;


public class Hotel {

    private String name;

    public Hotel(String name) {
        this.name=name;
    }

    protected class Room {
        public int repeat = 3;

        public void enter() {
            for (int i=0; i<repeat; i++) printName(name);
        }

        private static void printName(String message) {
            System.out.println(message);
        }
    }

    class Garage {
        int height = 20;

        class Place {
            int number;

            public Place(int number) {
                this.number = number;
            }
        }
    }

    static class Salon {
        int number = 22;
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }


    public static void main(String args[]) {
        Motel motel = new Motel();
        var kitchen = new Motel().new Kitchen() {
            void serveFood() {
                System.out.println("test!");
            }
        }; 
        kitchen.serveFood();

        var kitchenInt = new Motel.KitchenInt() {
            @Override
            public void notServe() {
                System.out.println("from anonymius class!");
            }
        };
        kitchenInt.notServe();
    }
}