/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>
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
package ilarkesto.media.metadata;

import ilarkesto.media.AMetadata;

public class SongMetadata extends AMetadata {

	public String getArtist() {
		return get("artist");
	}

	public String getTitle() {
		return get("title");
	}

	public void setTitle(String title) {
		set("title", title);
	}

	public String getAlbum() {
		return get("album");
	}

	@Override
	public String getFullTitle() {
		return getArtist() + " - " + getTitle();
	}

}
