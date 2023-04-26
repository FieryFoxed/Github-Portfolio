import javax.swing.*;

public class PokemonSelection {
    public static Pokemon createPokemon() {
        String name = JOptionPane.showInputDialog("Enter name: ");
        int hitPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter HP: "));
        String move = JOptionPane.showInputDialog("Enter move: ");
        int movePower = Integer.parseInt(JOptionPane.showInputDialog("Enter move's power: "));
        int attackSpeed= Integer.parseInt(JOptionPane.showInputDialog("Enter attack speed: "));
        Pokemon player = new Pokemon(name, hitPoints, move, movePower, attackSpeed);
        return player;
    }


    ///Responsible for starting createPokemon() and collecting its information
    ///Sends collected information to Pokemon class to createPokemon
    public void assignPokemon(){
        System.out.printf("%nPayer 1: Select a Pokemon and enter its stats");
        var pokemon1 = createPokemon();

        System.out.printf("%nPayer 2: Select a Pokemon and enter its stats");
        var pokemon2 = createPokemon();

        System.out.printf("%nPlayer 1 Pokemon%n----------------%n");
        System.out.printf(pokemon1.displayPokemonStats());
        System.out.printf("%nPlayer 2 Pokemon%n----------------%n");
        System.out.printf(pokemon2.displayPokemonStats());
    }
}





