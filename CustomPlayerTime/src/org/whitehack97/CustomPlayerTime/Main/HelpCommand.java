package org.whitehack97.CustomPlayerTime.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand
{
	public static boolean Help(Player player)
	{
			player.sendMessage(CustomPlayerTime.Prefix + "======== CustomPlayerTime ========");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "Made by ReanKR (whitehack97@gmail.com)");
			player.sendMessage(CustomPlayerTime.Prefix + "��");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/cpt");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "CustomPlayerTime ���򸻸� ���ϴ�.");
			player.sendMessage(CustomPlayerTime.Prefix + "��");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�ð����� [����]");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.AQUA + "���� �ð��� ������ �� �ֽ��ϴ�.");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "Number (����), ����, ����, ��ħ, ���� , �ϸ�, ����, �ʱ�ȭ");
			player.sendMessage(CustomPlayerTime.Prefix + "��");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/�������� [����]");
			player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "��� ������ ���� : " + ChatColor.BLUE + "����, ��ǳ, �ʱ�ȭ");
			player.sendMessage(CustomPlayerTime.Prefix + "======== CustomPlayerTime ========");
			return true;
	}
}