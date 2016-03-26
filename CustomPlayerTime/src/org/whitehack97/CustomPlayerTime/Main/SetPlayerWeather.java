package org.whitehack97.CustomPlayerTime.Main;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.entity.Player;

public class SetPlayerWeather
{
  public static boolean SetWeather(Player player, String[] args)
  {
    Player p = player;
    if (!isOK(p, args)) {
      return true;
    }
    if (p.hasPermission("customplayertime.setweather"))
    {
      if (args[0].equalsIgnoreCase("����"))
      {
        player.setPlayerWeather(WeatherType.CLEAR);
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� ������  �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� ������ �����ϴ�.");
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�������� �ʱ�ȭ" + ChatColor.AQUA + " : ���� �⺻ ������ ���ư��ϴ�.");
        return true;
      }
      if (args[0].equalsIgnoreCase("��ǳ"))
      {
        player.setPlayerWeather(WeatherType.DOWNFALL);
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� ������  �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� ������ ��ǳ�Դϴ�.");
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�������� �ʱ�ȭ" + ChatColor.AQUA + " : ���� �⺻ ������ ���ư��ϴ�.");
        return true;
      }
      if (args[0].equalsIgnoreCase("�ʱ�ȭ"))
      {
        player.resetPlayerWeather();
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �⺻ ������ �����Ǿ����ϴ�.");
        return true;
      }
      player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "������ �� �� �����ϴ�. ���� : /�������� [����]");
      player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "����, ��ǳ, �ʱ�ȭ");
      return true;
    }
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "���� ������ ������ �� �ִ� ������ �����ϴ�.");
    
    return true;
  }
  
  public static boolean isOK(Player player, String[] args)
  {
    if (args.length > 0.1D) {
      return true;
    }
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "����: " + ChatColor.GREEN + "/�������� [����]");
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "����, ��ǳ, �ʱ�ȭ");
    return false;
  }
}
