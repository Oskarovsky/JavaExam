package beyond;

public enum DeviceType {

    PC("High") {
    public void printExpectedPlayers() {
        System.out.println("From block");
    }
    }, 
    XBOX("Medium"), 
    PS("High"),
    PEGASUS("Low");

    private final String players;

    private DeviceType(String players) {
        this.players = players;
    }

    public void printExpectedPlayers() {
        System.out.println(players);
    }
}