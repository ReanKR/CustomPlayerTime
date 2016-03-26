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
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만 시간이 " + ChatColor.AQUA + time + ChatColor.GREEN + "tick(s)입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("자정"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Midnight, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만 시간이  자정 (12:00 AM) 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("아침"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Morning, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만 시간이  아침 (9:00 AM) 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("정오"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Noon, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만 시간이  정오 (12:00 PM) 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("오후"))
	    {
	        player.setPlayerTime(CustomPlayerTime.Evening, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만 시간이  오후 (4:00 PM) 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("일몰"))
	    {
	        player.setPlayerTime(CustomPlayerTime.sunset, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만  일몰 (7:00 PM) 시간대 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("일출"))
	    {
	        player.setPlayerTime(CustomPlayerTime.sunrise, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만  일출 (5:30 PM) 시간대 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("저녁"))
	    {
	        player.setPlayerTime(CustomPlayerTime.night, false);
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 시간이 설정되었습니다. 지금부터 " + player.getName() + "님에게만  저녁 (9:00 PM) 시간대 입니다.");
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 초기화 " + ChatColor.AQUA + " : 서버 기본 시간으로 되돌아갑니다.");
	        return true;
	    }
	    else if(args[0].equalsIgnoreCase("초기화"))
	    {
	        player.resetPlayerTime();
	        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "서버 기본 시간으로 설정되었습니다.");
	        return true;
	    }
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "시간를 알 수 없습니다. 사용법 : /시간설정 [변수]");
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "Number (숫자), 자정, 정오, 아침, 일출 , 일몰, 저녁, 초기화");
	    return true;
	    /*}*/
	   /* player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "개인 시간을 설정할 수 있는 권한이 없습니다.");
	    return true; */
	}

	public static boolean isOK(Player player, String[] args)
    {
		if (args.length > 0.1D)
		{
			return true;
		}
		
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용법: " + ChatColor.GREEN + "/시간설정 [변수]");
	    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "Number (숫자), 자정, 정오, 아침, 일출 , 일몰, 저녁, 초기화");
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
