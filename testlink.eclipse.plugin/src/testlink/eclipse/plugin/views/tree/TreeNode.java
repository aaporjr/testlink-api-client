/*
 * Daniel R Padilla
 *
 * Copyright (c) 2009, Daniel R Padilla
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package testlink.eclipse.plugin.views.tree;


import org.eclipse.core.runtime.IAdaptable;

import testlink.eclipse.plugin.preferences.TestLinkPreferences;


public class TreeNode implements IAdaptable
{
	/**
	 * Preferences inherited from parent node. Do not
	 * initialize to a default. Leave it null until
	 * explicitly assigned.
	 */
	private TestLinkPreferences preferences;
	private String name;
	private TreeParentNode parent;
	
	public TreeNode(
		String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	public void setPreferences(TestLinkPreferences pref) {
		preferences = pref;
	}

	public void setParent(
		TreeParentNode parent)
	{
		this.parent = parent;
	}

	public TreeParentNode getParent()
	{
		return parent;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return getName();
	}

	public Object getAdapter(
		Class key)
	{
		return null;
	}
	
	public TestLinkPreferences getPreferences() {
		return preferences;
	}
	
	/**
	 * Place holder for extending classes.
	 * 
	 * @return
	 */
	public String displayHtml() {
		return "<html><body><p>" + getName() + "</p></body></html>";
	}
}
