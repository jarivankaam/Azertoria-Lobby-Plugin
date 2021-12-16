package lobbyplugin2.lobbyplugin2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class invisible implements CommandExecutor {

        public boolean isInvisible = false;
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            if (command.getName().equalsIgnoreCase("invisible")) {
                if (!(sender instanceof Player)) {return true;}
                Player p = (Player) sender;

                int argslenght = args.length;
                if (argslenght <= 0){

                    if(!isInvisible){
                        p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 1, true));
                        p.sendMessage(ChatColor.AQUA + "[AN]" + ChatColor.BLUE + "Je bent net onzichtbaar geworden");
                        isInvisible = true;



                    }else {

                        for (PotionEffect effect : p.getActivePotionEffects()) {

                            p.removePotionEffect(effect.getType());}

                        isInvisible = false;
                        p.sendMessage(ChatColor.AQUA + "[AN]" + ChatColor.BLUE + "Je bent niet meer ontzichtbaar");

                    }
                }
                else{
                    switch (args[0].toLowerCase()) {
                        case "true":


                            isInvisible = true;
                            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 1, true));
                            p.sendMessage(ChatColor.AQUA + "[AN]" + ChatColor.BLUE + "Je bent net onzichtbaar geworden");


                            break;

                        case "false":

                            for (PotionEffect effect : p.getActivePotionEffects()) {

                                p.removePotionEffect(effect.getType());

                            }
                            p.sendMessage(ChatColor.AQUA + "[AN]" + ChatColor.BLUE + "Je bent niet meer ontzichtbaar");
                            isInvisible = false;
                            break;




                    }


                }
            }




            return true;
        }
}
