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
package ilarkesto.mda.legacy.model;

import java.util.ArrayList;
import java.util.List;

public class ReferenceListPropertyModel extends ReferenceSetPropertyModel {

	private boolean duplicatesAllowed = true;

	public ReferenceListPropertyModel(BeanModel entityModel, String name, EntityModel referencedEntity) {
		super(entityModel, name, referencedEntity);
	}

	@Override
	public String getCollectionImpl() {
		return ArrayList.class.getName();
	}

	@Override
	public String getCollectionType() {
		return List.class.getName();
	}

	public boolean isDuplicatesAllowed() {
		return duplicatesAllowed;
	}

	public ReferenceListPropertyModel setDuplicatesAllowed(boolean duplicatesAllowed) {
		this.duplicatesAllowed = duplicatesAllowed;
		return this;
	}

}
