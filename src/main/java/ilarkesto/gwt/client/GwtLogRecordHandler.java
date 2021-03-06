/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>, Artjom Kochtchi
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package ilarkesto.gwt.client;

import ilarkesto.core.logging.LogRecord;
import ilarkesto.core.logging.LogRecordHandler;

import com.google.gwt.core.client.GWT;

public class GwtLogRecordHandler extends LogRecordHandler {

	@Override
	public void log(LogRecord record) {
		super.log(record);
		if (GWT.isScript()) {
			logToConsole(record.toString());
		} else {
			System.out.println(record.toString());
		}
	}

	private static native void logToConsole(String message)
	/*-{
		if (typeof console === 'undefined') return;
	 	console.log(message);
	}-*/;

	@Override
	public void flush() {}

}
