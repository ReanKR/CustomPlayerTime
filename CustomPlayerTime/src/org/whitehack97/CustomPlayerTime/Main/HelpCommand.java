package org.whitehack97.CustomPlayerTime.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand
{
	public static boolean Help(Player player)
	{
			player.sendMessage(CustomPlayerTime.Prefix + "======== CustomPlayerTime ========");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "Made by ReanKR (whitehack97@gmail.com)");
			player.sendMessage(CustomPlayerTime.Prefix + "　");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/cpt");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "CustomPlayerTime 도움말를 봅니다.");
			player.sendMessage(CustomPlayerTime.Prefix + "　");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/시간설정 [변수]");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "개인 시간을 설정할 수 있습니다.");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "Number (숫자), 자정, 정오, 아침, 일출 , 일몰, 저녁, 초기화");
			player.sendMessage(CustomPlayerTime.Prefix + "　");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/날씨설정 [변수]");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "맑음, 폭풍, 초기화");
			player.sendMessage(CustomPlayerTime.Prefix + "======== CustomPlayerTime ========");
			return true;
	}
}