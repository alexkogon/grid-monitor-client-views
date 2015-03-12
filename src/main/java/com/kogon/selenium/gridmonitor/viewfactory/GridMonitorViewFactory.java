package com.kogon.selenium.gridmonitor.viewfactory;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GridMonitorViewFactory {
	private static final Map<Object,GridMonitorViewFactory> theInstanceMap = new HashMap<Object, GridMonitorViewFactory>();
	private JDesktopPane theJDesktopPane;

	public JDesktopPane getParentWindow() {
		if(theJDesktopPane==null) {
			theJDesktopPane = new JDesktopPane();
		}
		return theJDesktopPane;
	}

	public static GridMonitorViewFactory getInstance(Object aGridMonitorClient) {
		final GridMonitorViewFactory myGridMonitorViewFactory = theInstanceMap.get(aGridMonitorClient);
		if(myGridMonitorViewFactory==null) {
			theInstanceMap.put(aGridMonitorClient, new GridMonitorViewFactory());
			return getInstance(aGridMonitorClient);
		}
		return myGridMonitorViewFactory;
	}

	public JInternalFrame createInternalWindow() {
		return new JInternalFrame();
	};
	
}
