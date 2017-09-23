package com.kirby.runanjing.untils;


import android.content.*;
import com.kirby.runanjing.*;

public class Theme
{
	private static SharedPreferences.Editor edit;
	private static String FILE_NAME="theme";
	public static void setClassTheme(Context context)
	{
		SharedPreferences theme = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
		int themeId=theme.getInt("themeId", 0);
		Theme(context, themeId);
	}
	public static void setTheme(Context context, int i)
	{
		SharedPreferences theme = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
		edit=theme.edit();
		edit.putInt("themeId", i);
		edit.apply();
	}
	private static void Theme(Context context, int themeId)
	{
		switch(themeId){
			case 0:
				context.setTheme(R.style.BuleTheme);
				break;
			case 1:
				context.setTheme(R.style.RedTheme);
				break;
		}
	}
}