/*
 * Copyright (c) 2017, Dmitriy Shchekotin
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package ru.silverhammer.swing.control;

import javax.swing.JCheckBox;

import ru.silverhammer.core.control.ICaptionControl;

public class CheckBoxControl extends ValidatableControl<Boolean, JCheckBox> implements ICaptionControl<Boolean> {

	private static final long serialVersionUID = -7619491028898514149L;

	public CheckBoxControl() {
		super(false);
		getComponent().getModel().addItemListener(l -> fireValueChanged()); 
	}

	@Override
	protected JCheckBox createComponent() {
		return new JCheckBox();
	}

	@Override
	public String getCaption() {
		return getComponent().getText();
	}

	@Override
	public void setCaption(String caption) {
		getComponent().setText(caption);
	}

	@Override
	public Boolean getValue() {
		return getComponent().isSelected();
	}

	@Override
	public void setValue(Boolean value) {
		getComponent().setSelected(value != null && value);
	}
}
