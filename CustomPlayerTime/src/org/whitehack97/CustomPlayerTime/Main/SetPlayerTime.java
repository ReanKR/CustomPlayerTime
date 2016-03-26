package org.whitehack97.CustomPlayerTime.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SetPlayerTime
{
	public static boolean SetTime(Player player, String[] args)
	{
	    if (!isOK(player, args))
	    {
	      return true;
	    }
	    /*if (player.hasPermission("customplayertime.settime"))
	    {*/
	    if (CheckNumber(args[0]))
	    {
	        int time = Integer.parseInt(args[0]);
	        player.setPlayerTime(time, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� �ð��� " + ChatColor.AQUA + time + ChatColor.GREEN + "tick(s)�Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("����"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Midnight, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� �ð���  ���� (12:00 AM) �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("��ħ"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Morning, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� �ð���  ��ħ (9:00 AM) �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("����"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Noon, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� �ð���  ���� (12:00 PM) �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("����"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Evening, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը� �ð���  ���� (4:00 PM) �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("�ϸ�"))
	    {
	        player.setPlayerTime(CustomPlayerTime.sunset, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը�  �ϸ� (7:00 PM) �ð��� �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("����"))
	    {
	        player.setPlayerTime(CustomPlayerTime.sunrise, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը�  ���� (5:30 PM) �ð��� �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("����"))
	    {
	        player.setPlayerTime(CustomPlayerTime.night, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �ð��� �����Ǿ����ϴ�. ���ݺ��� " + player.getName() + "�Կ��Ը�  ���� (9:00 PM) �ð��� �Դϴ�.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� �ʱ�ȭ " + ChatColor.AQUA + " : ���� �⺻ �ð����� �ǵ��ư��ϴ�.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("�ʱ�ȭ"))
	    {
	        player.resetPlayerTime();
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "���� �⺻ �ð����� �����Ǿ����ϴ�.");
	        return true;
	    }
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "�ð��� �� �� �����ϴ�. ���� : /�ð����� [����]");
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "Number (����), ����, ����, ��ħ, ���� , �ϸ�, ����, �ʱ�ȭ");
	    return true;
	    /*}*/
	   /* player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "���� �ð��� ������ �� �ִ� ������ �����ϴ�.");
	    return true; */
	}

	public static boolean isOK(Player player, String[] args)
    {
		if (args.length > 0.1D)
		{
			return true;
		}
		
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "����: " + ChatColor.GREEN + "/�ð����� [����]");
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "Number (����), ����, ����, ��ħ, ���� , �ϸ�, ����, �ʱ�ȭ");
	    return false;
    }

	public static boolean CheckNumber(String string)
	{
	    try
	    {
	      Double.parseDouble(string);
	    }
	    catch (NumberFormatException nfe)
	    {
	      return false;
	    }
	    return true;
	}
}
