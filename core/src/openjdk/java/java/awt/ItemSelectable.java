/*
 * Copyright 1996-2000 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package java.awt;

import java.awt.event.*;

/**
 * The interface for objects which contain a set of items for
 * which zero or more can be selected.
 *
 * @version 1.23 05/05/07
 * @author Amy Fowler
 */

public interface ItemSelectable {

    /**
     * Returns the selected items or <code>null</code> if no
     * items are selected.
     */
    public Object[] getSelectedObjects();

    /**
     * Adds a listener to receive item events when the state of an item is
     * changed by the user. Item events are not sent when an item's
     * state is set programmatically.  If <code>l</code> is
     * <code>null</code>, no exception is thrown and no action is performed.
     *
     * @param    l the listener to receive events
     * @see ItemEvent
     */    
    public void addItemListener(ItemListener l);

    /**
     * Removes an item listener.
     * If <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     *
     * @param 	l the listener being removed
     * @see ItemEvent
     */ 
    public void removeItemListener(ItemListener l);
}