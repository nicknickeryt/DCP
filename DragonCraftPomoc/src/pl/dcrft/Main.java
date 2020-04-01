package pl.dcrft;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class Main extends JavaPlugin {

	public void CheckConfig() {
		 
        if(getConfig().get("pomoc") == null){ //if the setting has been deleted it will be null
            getConfig().set("pomoc", "brak"); //reset the setting
            saveConfig();
            reloadConfig();
 
        }
 
    }
	
    public void onEnable() {
    	 File file = new File(getDataFolder() + File.separator + "config.yml"); //This will get the config file
    	 
    	 
         if (!file.exists()){ //This will check if the file exist
         //Situation A, File doesn't exist

         getConfig().addDefault("pomoc", "test"); //adding default settings

         //Save the default settings
         getConfig().options().copyDefaults(true);
         saveConfig();
         } else {
         //situation B, Config does exist
         CheckConfig(); //function to check the important settings
         saveConfig(); //saves the config
         reloadConfig();    //reloads the config

     }   
    	
        System.out.println("Uruchomiono plugin!\nAutorem pluginu jest Nick Nicker.\nPlugin zosta\u0142 stworzony dla serwera DragonCraft [DCRFT.PL]");
    }

    public void onDisable() {
    	////get String
    	//String string = getConfig().getString("Name");
    	 
    	////get Integer
    	//int integer = getConfig().getInt("Name");
    	 
    	////get Boolean
    	//Boolean boolean = getConfig().getBoolean("Name");
        System.out.println("");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("pomoc")) {
            sender.sendMessage(getConfig().getString("pomoc"));
        }
        else if (command.getName().equalsIgnoreCase("rlpomoc")) {
        	sender.sendMessage("§e§lDragon§6§lCraft §e» §cPrzeładowywanie pliku konfiguracyjnego pomocy.");
        	reloadConfig();
        	sender.sendMessage("§e§lDragon§6§lCraft §e» §aPrzeładowano plik konfiguracyjny pomocy.");
        }
        return true;
    }
}

