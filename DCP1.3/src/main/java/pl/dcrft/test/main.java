/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandSender
 *  org.bukkit.plugin.java.JavaPlugin
 */
package pl.dcrft.test;

import java.io.PrintStream;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main
extends JavaPlugin {
    public void onEnable() {
        System.out.println("Uruchomiono plugin!\nAutorem pluginu jest Nick Nicker.\nPlugin zosta\u0142 stworzony dla serwera DragonCraft [DCRFT.PL]");
    }

    public void onDisable() {
        System.out.println("Wy\u0142\u0105czono plugin.");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("pomoc")) {
            sender.sendMessage("\u00a76--==[\u00a79\u00a7lInformacje o serwerze\u00a76]==--\n\u00a76-==[\u00a79\u00a7lOg\u00f3lne\u00a76]==-\n\u00a7eSerwer jest serwerem typu \u00a79\u00a7lsurvival\u00a7e z mo\u017cliwo\u015bci\u0105 stworzenia \u00a79\u00a7ldzia\u0142ki\u00a7e za pomoc\u0105 \u00a79\u00a7lnoteblocka\u00a7e.\n\u00a76-==[\u00a7b\u00a7lDzia\u0142ki\u00a76]==-\n\u00a79\u00a7lDzia\u0142k\u0119\u00a7e stworzysz za pomoc\u0105 \u00a79\u00a7lnoteblocka\u00a7e. Ma ona wymiary \u00a79\u00a7l51x501x51\u00a7e.\n\u00a7eSzczeg\u00f3\u0142owe informacje dotycz\u0105ce \u00a79\u00a7lkuboid\u00a7e znajdziesz na /info.\n\u00a76-==[\u00a7e\u00a7lRangi\u00a76]==-\n\u00a7eDost\u0119pne rangi to \u00a79\u00a7lVIP\u00a7e,\u00a75\u00a7l SVIP\u00a7e, \u00a79\u00a7lMVIP\u00a7e oraz rangi z \u00a7e'+'\n\u00a7eMo\u017cna je zakupi\u0107 na stronie serwera \u00a79\u00a7lDCRFT.PL\u00a7e.\n\u00a76-==[\u00a76\u00a7lSmocze jaja\u00a76]==-\n\u00a76\u00a7lSmocze jaja\u00a7e s\u0105 walut\u0105 premium serwera. Mo\u017cna je zakupi\u0107 na stronie, na /sklep b\u0105d\u017c wydropi\u0107 z niekt\u00f3rych mob\u00f3w.\n\u00a7eSzczeg\u00f3\u0142owe informacje dotycz\u0105ce \u00a76\u00a7lSmoczych jaj \u00a7eznajdziesz na /info.\n\u00a76-==[\u00a72\u00a7lPomocnicy \u00a79\u00a7li \u00a72\u00a7lmoderatorzy\u00a76]==-\n\u00a7eRekrutacja na \u00a7a\u00a7lpomocnika \u00a7ejest zapowiadana na czacie. Rang\u0119 \u00a7a\u00a7lpomocnik \u00a7emo\u017cna jednak zdoby\u0107 post\u0119puj\u0105c zgodnie z krokami na /info, tak samo jak rang\u0119 \u00a72\u00a7lmoderator\u00a7e.\n\u00a7eSzczeg\u00f3\u0142owe informacje dotycz\u0105ce pomocnik\u00f3w i moderator\u00f3w znajdziesz na /info.\n\u00a76-==[\u00a74\u00a7lYou\u00a7f\u00a7lTuberzy\u00a76]==-\n\u00a7eRang\u0119 \u00a74\u00a7lYou\u00a7f\u00a7lTuber\u00a7e mo\u017cna otrzyma\u0107 wrzucaj\u0105c na sw\u00f3j kana\u0142 reklam\u0119 naszego serwera. Kana\u0142 ten musi mie\u0107 co najmniej \u00a79\u00a7l500 subskrypcji\u00a7e.\n\u00a76-==[\u00a79\u00a7lInformacje o graczu\u00a76]==-\n\u00a7eInformacje o graczu wy\u015bwietlisz poprzez wpisanie komendy \u00a79\u00a7l/gracz [nick]\u00a7e.\n\u00a76-==[\u00a74\u00a7lRegulamin\u00a76]==-\n\u00a79\u00a7lRegulamin serwera \u00a7eznajduje si\u0119 na /info\u00a7e, na /spawn\u00a7e oraz na stronie.\n\u00a76-==[\u00a7f\u00a7lSk\u00f3rki\u00a76]==-\n\u00a79\u00a7lSk\u00f3rk\u0119\u00a7e ustawisz za pomoc\u0105 \u00a79\u00a7l/skin [nick]\u00a7e.\n\u00a76-==[\u00a79\u00a7lDiscord\u00a76]==-\n\u00a7eNasz serwer \u00a79\u00a7lDiscord\u00a7e to: \u00a79\u00a7ldiscord.gg/7pPNbUU\u00a7e.\n\u00a76-==[\u00a77\u00a7lQuesty\u00a76]==-\n\u00a77\u00a7lQuesty \u00a7es\u0105 dodatkiem do serwera. Aby wykona\u0107 quest, nale\u017cy klikn\u0105\u0107 prawym przyciskiem mysz na NPC. Je\u015bli quest nie wymaga przedmiot\u00f3w, nale\u017cy klikn\u0105\u0107 drugi raz na NPC, je\u015bli jednak wymaga on dostarczenia przedmiot u, nale\u017cy klikn\u0105\u0107 na NPC trzymaj\u0105c przedmiot w r\u0119ce.\n\u00a76-==[\u00a7a\u00a7lWi\u0119cej informacji znajduje si\u0119 na /info\u00a76]==-\n");
        }
        return true;
    }
}

