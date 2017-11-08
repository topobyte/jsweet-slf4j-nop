// Copyright 2017 Sebastian Kuerten
//
// This file is part of jsweet-slf4j-nop.
//
// jsweet-slf4j-nop is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsweet-slf4j-nop is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsweet-slf4j-nop. If not, see <http://www.gnu.org/licenses/>.

package org.slf4j;

public class NopLoggerImpl implements Logger
{

	private String name;

	public NopLoggerImpl(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public boolean isTraceEnabled()
	{
		return false;
	}

	@Override
	public boolean isTraceEnabled(Marker marker)
	{
		return false;
	}

	@Override
	public boolean isDebugEnabled()
	{
		return false;
	}

	@Override
	public boolean isDebugEnabled(Marker marker)
	{
		return false;
	}

	@Override
	public boolean isInfoEnabled()
	{
		return false;
	}

	@Override
	public boolean isInfoEnabled(Marker marker)
	{
		return false;
	}

	@Override
	public boolean isWarnEnabled()
	{
		return false;
	}

	@Override
	public boolean isWarnEnabled(Marker marker)
	{
		return false;
	}

	@Override
	public boolean isErrorEnabled()
	{
		return false;
	}

	@Override
	public boolean isErrorEnabled(Marker marker)
	{
		return false;
	}

	@Override
	public void trace(String msg)
	{
		// NOP
	}

	@Override
	public void trace(String format, Object arg)
	{
		// NOP
	}

	@Override
	public void trace(String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void trace(String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void trace(String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void trace(Marker marker, String msg)
	{
		// NOP
	}

	@Override
	public void trace(Marker marker, String format, Object arg)
	{
		// NOP
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void trace(Marker marker, String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void debug(String msg)
	{
		// NOP
	}

	@Override
	public void debug(String format, Object arg)
	{
		// NOP
	}

	@Override
	public void debug(String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void debug(String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void debug(String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void debug(Marker marker, String msg)
	{
		// NOP
	}

	@Override
	public void debug(Marker marker, String format, Object arg)
	{
		// NOP
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void debug(Marker marker, String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void info(String msg)
	{
		// NOP
	}

	@Override
	public void info(String format, Object arg)
	{
		// NOP
	}

	@Override
	public void info(String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void info(String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void info(String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void info(Marker marker, String msg)
	{
		// NOP
	}

	@Override
	public void info(Marker marker, String format, Object arg)
	{
		// NOP
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void info(Marker marker, String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void info(Marker marker, String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void warn(String msg)
	{
		// NOP
	}

	@Override
	public void warn(String format, Object arg)
	{
		// NOP
	}

	@Override
	public void warn(String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void warn(String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void warn(String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void warn(Marker marker, String msg)
	{
		// NOP
	}

	@Override
	public void warn(Marker marker, String format, Object arg)
	{
		// NOP
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void warn(Marker marker, String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void error(String msg)
	{
		// NOP
	}

	@Override
	public void error(String format, Object arg)
	{
		// NOP
	}

	@Override
	public void error(String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void error(String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void error(String msg, Throwable t)
	{
		// NOP
	}

	@Override
	public void error(Marker marker, String msg)
	{
		// NOP
	}

	@Override
	public void error(Marker marker, String format, Object arg)
	{
		// NOP
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2)
	{
		// NOP
	}

	@Override
	public void error(Marker marker, String format, Object[] argArray)
	{
		// NOP
	}

	@Override
	public void error(Marker marker, String msg, Throwable t)
	{
		// NOP
	}

}
