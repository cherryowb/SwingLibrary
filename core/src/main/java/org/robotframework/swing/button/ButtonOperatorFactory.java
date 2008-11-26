/*
 * Copyright 2008 Nokia Siemens Networks Oyj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.robotframework.swing.button;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.robotframework.swing.chooser.ByNameOrTextComponentChooser;
import org.robotframework.swing.context.Context;
import org.robotframework.swing.factory.DefaultContextVerifyingOperatorFactory;

/**
 * @author Heikki Hulkko
 */
public class ButtonOperatorFactory extends DefaultContextVerifyingOperatorFactory<ButtonOperator> {
    @Override
    public ButtonOperator createOperatorByIndex(int index) {
        return new ButtonOperator((ContainerOperator) Context.getContext(), index);
    }

    @Override
    public ButtonOperator createOperatorByName(String name) {
        return new ButtonOperator((ContainerOperator) Context.getContext(), new ByNameOrTextComponentChooser(name));
    }
}