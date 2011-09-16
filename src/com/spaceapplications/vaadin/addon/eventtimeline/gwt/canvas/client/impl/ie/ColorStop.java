/*
 * Copyright 2008-2009 Oliver Zoran
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spaceapplications.vaadin.addon.eventtimeline.gwt.canvas.client.impl.ie;

/**
 * Internet Explorer specific storage object for an offset and color
 * combination corresponding to a color stop for color gradients.
 */
public class ColorStop {

	public double offset;

	public String color;

	public ColorStop(double offset, String color) {
		this.offset = offset;
		this.color = color;
	}
}
