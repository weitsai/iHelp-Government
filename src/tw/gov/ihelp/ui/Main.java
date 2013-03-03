package tw.gov.ihelp.ui;

import tw.gov.ihelp.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findViews();
		correctionViewSize();

	}

	// UI
	View setting;
	TextView appName;

	private void findViews() {
		setting = findViewById(R.id.setting_img);
		appName = (TextView) findViewById(R.id.app_name);
	}

	/*
	 * 校正圖像大小
	 */
	private void correctionViewSize() {
		appName.measure(0, 0);
		setting.getLayoutParams().width = (int) (appName.getMeasuredHeight() / 1.2);
		setting.getLayoutParams().height = (int) (appName.getMeasuredHeight() / 1.2);
	}

}
