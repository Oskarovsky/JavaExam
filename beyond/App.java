package beyond;

import java.util.*;

public class App {

    public static void main(String[] args) {

        var pcType = DeviceType.PC;

        pcType.printExpectedPlayers();

        // switch (pcType) {
        //     case PC: 
        //         System.out.println("KOMPUTER!");
        //         break;
        //     case XBOX: 
        //         System.out.println("X!");
        //         break;
        //     case PS: 
        //         System.out.println("PLAYSTATION!");
        //         break;
        //     default:
        //         throw new IllegalArgumentException("!!!");
        // }

    } 

}