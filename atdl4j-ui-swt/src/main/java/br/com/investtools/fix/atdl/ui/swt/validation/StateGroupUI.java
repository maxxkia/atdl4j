package br.com.investtools.fix.atdl.ui.swt.validation;

import java.util.Map;

import org.apache.xmlbeans.XmlException;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import br.com.investtools.fix.atdl.flow.xmlbeans.BehaviorT;
import br.com.investtools.fix.atdl.flow.xmlbeans.StateGroupDocument.StateGroup.EnumItem;
import br.com.investtools.fix.atdl.flow.xmlbeans.StateGroupDocument.StateGroup.Field;
import br.com.investtools.fix.atdl.ui.swt.ParameterWidget;
import br.com.investtools.fix.atdl.ui.swt.RuleFactory;
import br.com.investtools.fix.atdl.ui.swt.ValidationException;

public class StateGroupUI {

	public class FieldUI implements Listener {

		private ParameterWidget<?> affectedWidget;
		private Field field;
		private Map<String, ParameterWidget<?>> widgets;
		private Map<String, EditUI> rules;
		private EditUI rule;

		public FieldUI(ParameterWidget<?> affectedWidget, Field field,
				Map<String, ParameterWidget<?>> parameters,
				Map<String, EditUI> rules) throws XmlException {
			this.affectedWidget = affectedWidget;
			this.field = field;
			this.widgets = parameters;
			this.rules = rules;
			this.rule = RuleFactory.createRule(field.getEdit(), rules);
		}

		@Override
		public void handleEvent(Event event) {

			try {
				rule.validate(rules, widgets);
			} catch (ValidationException e) {
				setBehaviorAsStateRule(true);
				return;
			} catch (XmlException e) {
				throw new RuntimeException(e);
			}

			setBehaviorAsStateRule(false);

		}

		private void setBehaviorAsStateRule(Boolean state) {

			Boolean enabled;
			Boolean visible;

			if (field.isSetEnabled()) {
				enabled = field.getEnabled();
				for (Control control : affectedWidget.getControls()) {
					control.setEnabled(!(enabled ^ state));
				}
			}

			if (field.isSetVisible()) {
				visible = field.getVisible();
				for (Control control : affectedWidget.getControls()) {
					control.setVisible(!(visible ^ state));
				}
			}

			if (field.isSetBehavior()) {
				for (Control control : affectedWidget.getControls()) {
					BehaviorT.Enum behaviorT = field.getBehavior();

					if (behaviorT.equals(BehaviorT.DISABLE)) {
						control.setEnabled(!(false ^ state));
					} else if (behaviorT.equals(BehaviorT.ENABLE)) {
						control.setEnabled(!(true ^ state));
					} else if (behaviorT.equals(BehaviorT.HIDE)) {
						control.setVisible(!(false ^ state));
					} else if (behaviorT.equals(BehaviorT.UNHIDE)) {
						control.setVisible(!(true ^ state));
					}
				}

			}
		}

	}

	public class EnumItemUI implements Listener {

		private ParameterWidget<?> affectedWidget;
		private EnumItem enumItem;
		private Map<String, ParameterWidget<?>> widgets;
		private Map<String, EditUI> rules;
		private EditUI rule;

		public EnumItemUI(ParameterWidget<?> affectedWidget, EnumItem enumItem,
				Map<String, ParameterWidget<?>> parameters,
				Map<String, EditUI> rules) throws XmlException {
			this.affectedWidget = affectedWidget;
			this.enumItem = enumItem;
			this.widgets = parameters;
			this.rules = rules;
			this.rule = RuleFactory.createRule(enumItem.getEdit(), rules);
		}

		@Override
		public void handleEvent(Event event) {

			try {
				rule.validate(rules, widgets);
			} catch (ValidationException e) {
				setBehaviorAsStateRule(true);
				return;
			} catch (XmlException e) {
				throw new RuntimeException(e);
			}

			setBehaviorAsStateRule(false);

		}

		private void setBehaviorAsStateRule(Boolean state) {

			// TODO resolve the parameter widget index and change its state
			// accordingly

			/*
			 * Boolean enabled; Boolean visible;
			 * 
			 * if (enumItem.isSetEnabled()) { enabled = enumItem.getEnabled();
			 * for (Control control : affectedWidget.getControls()) {
			 * control.setEnabled(!(enabled ^ state)); } }
			 * 
			 * if (enumItem.isSetVisible()) { visible = enumItem.getVisible();
			 * for (Control control : affectedWidget.getControls()) {
			 * control.setVisible(!(visible ^ state)); } }
			 * 
			 * if (enumItem.isSetBehavior()) { for (Control control :
			 * affectedWidget.getControls()) { BehaviorT.Enum behaviorT =
			 * enumItem.getBehavior();
			 * 
			 * if (behaviorT.equals(BehaviorT.DISABLE)) {
			 * control.setEnabled(!(false ^ state)); } else if
			 * (behaviorT.equals(BehaviorT.ENABLE)) { control.setEnabled(!(true
			 * ^ state)); } else if (behaviorT.equals(BehaviorT.HIDE)) {
			 * control.setVisible(!(false ^ state)); } else if
			 * (behaviorT.equals(BehaviorT.UNHIDE)) { control.setVisible(!(true
			 * ^ state)); } }
			 * 
			 * }
			 */
		}

	}

}