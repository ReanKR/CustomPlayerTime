package org.whitehack97.CustomPlayerTime.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomPlayerTime extends JavaPlugin implements Listener
{
	public static String Version;
	public static String Prefix = ChatColor.translateAlternateColorCodes('&',"��b[&eC&fustom&aP&flayer&1T&fime&b]&f ");
	public static int sunrise = 23500;
	public static int Noon = 6000;
	public static int Midnight = 18000;
	public static int Morning = 3000;
	public static int sunset = 13000;
 	public static int Evening = 10000;
 	public static int night = 15000;
	public SetPlayerTime SPT = new SetPlayerTime();
	public SetPlayerWeather SPW = new SetPlayerWeather();
	@Override
	public void onEnable()
	{
		Version = this.getDescription().getVersion();
		Bukkit.getPluginManager().registerEvents(this, this);
	    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "CustomPlayerTime v" + Version + " Ȱ��ȭ��.");
	    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "Made by ReanKR (whitehack97@gmail.com)");
	}
	
	@Override
	public void onDisable()
	{
	    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "CustomPlayerTime v" + Version + " ��Ȱ��ȭ��.");
	    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "Made by ReanKR (whitehack97@gmail.com)");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String String, String[] args)
	{
	  if((sender instanceof Player))
	  {
		  Player p = (Player)sender;
	      if (String.equalsIgnoreCase("cpt"))
	      {
	    	  HelpCommand.Help(p);
	    	  return true;
	      }
	      if(args.length > 0)
	      {
	    	  if (String.equalsIgnoreCase("�ð�����"))
	    	  {
	    		  SetPlayerTime.SetTime(p, args);
	    		  return true;
	    	  }
	    	  if (String.equalsIgnoreCase("��������"))
	    	  {
	    		  SetPlayerWeather.SetWeather(p, args);
	    		  return true;
	    	  }
	      }
	  }
	  else
	  {
	      Bukkit.getConsoleSender().sendMessage(Prefix + ChatColor.DARK_RED + "�ֿܼ��� ����Ͻ� �� �����ϴ�.");
	      return true;
	  }
	  return true;
	}
}
