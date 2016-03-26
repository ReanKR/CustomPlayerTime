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
      if (args[0].equalsIgnoreCase("맑음"))
      {
        player.setPlayerWeather(WeatherType.CLEAR);
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 날씨가  설정되었습니다. 지금부터 " + player.getName() + "님에게만 날씨가 맑습니다.");
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/날씨설정 초기화" + ChatColor.AQUA + " : 서버 기본 날씨로 돌아갑니다.");
        return true;
      }
      if (args[0].equalsIgnoreCase("폭풍"))
      {
        player.setPlayerWeather(WeatherType.DOWNFALL);
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "개인 날씨가  설정되었습니다. 지금부터 " + player.getName() + "님에게만 날씨가 폭풍입니다.");
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.LIGHT_PURPLE + "/날씨설정 초기화" + ChatColor.AQUA + " : 서버 기본 날씨로 돌아갑니다.");
        return true;
      }
      if (args[0].equalsIgnoreCase("초기화"))
      {
        player.resetPlayerWeather();
        player.sendMessage(CustomPlayerTime.Prefix + ChatColor.GREEN + "서버 기본 날씨로 설정되었습니다.");
        return true;
      }
      player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "날씨를 알 수 없습니다. 사용법 : /날씨설정 [변수]");
      player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "맑음, 폭풍, 초기화");
      return true;
    }
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "개인 날씨를 설정할 수 있는 권한이 없습니다.");
    
    return true;
  }
  
  public static boolean isOK(Player player, String[] args)
  {
    if (args.length > 0.1D) {
      return true;
    }
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용법: " + ChatColor.GREEN + "/날씨설정 [변수]");
    player.sendMessage(CustomPlayerTime.Prefix + ChatColor.RED + "사용 가능한 변수 : " + ChatColor.BLUE + "맑음, 폭풍, 초기화");
    return false;
  }
}
