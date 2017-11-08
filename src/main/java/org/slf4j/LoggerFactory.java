// Copyright 2017 Sebastian Kuerten
//
// This file is part of jsweet-slfj4-nop.
//
// jsweet-slfj4-nop is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsweet-slfj4-nop is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsweet-slfj4-nop. If not, see <http://www.gnu.org/licenses/>.

package org.slf4j;

public class LoggerFactory
{

	public static Logger getLogger(String name)
	{
		return new NopLoggerImpl(name);
	}

	public static Logger getLogger(Class<?> clazz)
	{
		return getLogger(clazz.getName());
	}

}
