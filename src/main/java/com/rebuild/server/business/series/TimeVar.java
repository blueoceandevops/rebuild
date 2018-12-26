/*
rebuild - Building your system freely.
Copyright (C) 2018 devezhao <zhaofang123@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package com.rebuild.server.business.series;

import cn.devezhao.commons.CalendarUtils;

/**
 * YYYY-MM-DD HH-II-SS
 * yyyy-MM-dd HH-mm:ss
 * 
 * @author devezhao
 * @since 12/24/2018
 */
public class TimeVar extends SeriesVar {

	/**
	 * @param symbols
	 */
	protected TimeVar(String symbols) {
		super(symbols);
	}

	@Override
	public String generate() {
		String s = getSymbols().replace("Y", "y");
		s = s.replace("D", "d");
		s = s.replace("I", "m");
		s = s.replace("S", "s");
		return CalendarUtils.format(s, CalendarUtils.now());
	}
}