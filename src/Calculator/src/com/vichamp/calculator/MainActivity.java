package com.vichamp.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText editTextNumber1;
	private EditText editTextNumber2;
	private Button buttonAdd;
	private Button buttonMinus;
	private Button buttonMultiple;
	private Button buttonDevide;
	private TextView textViewResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.findViews();
		this.bindEvents();
	}

	private void bindEvents() {
		this.buttonAdd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String result = add(editTextNumber1.getText().toString(), editTextNumber2.getText().toString());
				textViewResult.setText("Result: " + result);
			}
		});
		
		this.buttonMinus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String result = minus(editTextNumber1.getText().toString(), editTextNumber2.getText().toString());
				textViewResult.setText("Result: " + result);
			}
		});
		
		this.buttonMultiple.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String result = multiple(editTextNumber1.getText().toString(), editTextNumber2.getText().toString());
				textViewResult.setText("Result: " + result);
			}
		});
		
		this.buttonDevide.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String result = devide(editTextNumber1.getText().toString(), editTextNumber2.getText().toString());
				textViewResult.setText("Result: " + result);
			}
		});
	}

	private void findViews() {
		this.editTextNumber1 = (EditText)findViewById(R.id.editTextNumber1);
		this.buttonAdd = (Button)findViewById(R.id.buttonAdd);
		this.buttonMinus = (Button)findViewById(R.id.buttonMinus);
		this.buttonMultiple = (Button)findViewById(R.id.buttonMultiple);
		this.buttonDevide = (Button)findViewById(R.id.buttonDevide);
		this.editTextNumber2 = (EditText)findViewById(R.id.editTextNumber2);
		this.textViewResult = (TextView)findViewById(R.id.textViewResult);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private String add(String number1, String number2) {
		Integer result = (Integer.parseInt(number1) + Integer.parseInt(number2));
		return result.toString();
	}
	
	private String minus(String number1, String number2) {
		Integer result = (Integer.parseInt(number1) - Integer.parseInt(number2));
		return result.toString();
	}
	
	private String multiple(String number1, String number2) {
		Integer result = (Integer.parseInt(number1) * Integer.parseInt(number2));
		return result.toString();
	}
	
	private String devide(String number1, String number2) {
		Integer result = (Integer.parseInt(number1) / Integer.parseInt(number2));
		return result.toString();
	}
}
