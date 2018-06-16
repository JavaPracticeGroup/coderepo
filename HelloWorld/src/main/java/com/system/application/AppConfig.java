package com.system.application;

import org.json.JSONObject;

public final class AppConfig {
	private final static String user;
	public final static boolean isDetailPrintLnEnabled;
	public final static boolean isExperimentEnabled;

	static {
		String appConfigStr = null;
		try {
			appConfigStr = AppUtil.getFileContent("AppConfig.json", true);
		} catch (Exception e) {
			appConfigStr = AppUtil.getFileContent("AppConfigCopy.json", true);
		}

		String tUser = null;
		boolean tIsDetailPrintLnEnabled = false, tIsExperimentEnabled = false;
		try {
			JSONObject appConf = new JSONObject(appConfigStr);
			tUser = appConf.getString("USER_NAME");
			tIsDetailPrintLnEnabled = appConf.optBoolean("IS_DETAIL_PRINTLN_ENABLED");
			tIsExperimentEnabled = appConf.optBoolean("IS_EXPERIMENT_ENABLED");
		} catch (Exception e) {
			System.out.println("Error in AppConfig");
			System.exit(0);
		} finally {
			user = tUser;
			isDetailPrintLnEnabled = tIsDetailPrintLnEnabled;
			isExperimentEnabled = tIsExperimentEnabled;
		}
	}

	public static String getUser() {
		return user;
	}
}
