package com.myzigen.core.internal;

import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.myzigen.core.GravityEnum;

public class ThemeSingleton {

	private static ThemeSingleton singleton;

	public static ThemeSingleton get(boolean createIfNull) {
		if (singleton == null && createIfNull)
			singleton = new ThemeSingleton();
		return singleton;
	}

	public static ThemeSingleton get() {
		return get(true);
	}

	public boolean darkTheme = false;
	@ColorInt
	public int titleColor = 0;
	@ColorInt
	public int contentColor = 0;
	@ColorInt
	public ColorStateList positiveColor = null;
	@ColorInt
	public ColorStateList neutralColor = null;
	@ColorInt
	public ColorStateList negativeColor = null;
	@ColorInt
	public int widgetColor = 0;
	@ColorInt
	public int itemColor = 0;
	public Drawable icon = null;
	@ColorInt
	public int backgroundColor = 0;
	@ColorInt
	public int dividerColor = 0;
	@ColorInt
	public ColorStateList linkColor = null;

	@DrawableRes
	public int listSelector = 0;
	@DrawableRes
	public int btnSelectorStacked = 0;
	@DrawableRes
	public int btnSelectorPositive = 0;
	@DrawableRes
	public int btnSelectorNeutral = 0;
	@DrawableRes
	public int btnSelectorNegative = 0;

	public GravityEnum titleGravity = GravityEnum.START;
	public GravityEnum contentGravity = GravityEnum.START;
	public GravityEnum btnStackedGravity = GravityEnum.END;
	public GravityEnum itemsGravity = GravityEnum.START;
	public GravityEnum buttonsGravity = GravityEnum.START;
}