package com.example.battle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class RenkActivity extends ActionBarActivity  {



	Handler updateConversationHandler;
	
	Socket socket2 = null;
	Thread serverThread = null;
	int sayac=0;
    int kazanma=0;
    final Context context=this;
    String message = "";
	ServerSocket serverSocket;
	Socket socket = null;
	public static final int SERVERPORT = 8080;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_renk);
		kayitGor();
		for(int i=0;i<6;i++){
			int deger2=Integer.parseInt(Dizi[i]);
			veritabnýndanngelen(deger2);

		}
		//Thread socketServerThread = new Thread(new SocketServerThread());
		//socketServerThread.start();
		updateConversationHandler = new Handler();
	this.serverThread = new Thread(new ServerThread());
		this.serverThread.start();
		ImageView ýmg1 = (ImageView) findViewById(R.id.row1col1);
		ImageView ýmg2 = (ImageView) findViewById(R.id.row1col2);
		ImageView ýmg3 = (ImageView) findViewById(R.id.row1col3);
		ImageView ýmg4 = (ImageView) findViewById(R.id.row1col4);
		ImageView ýmg5 = (ImageView) findViewById(R.id.row1col5);
		ImageView ýmg6 = (ImageView) findViewById(R.id.row1col6);
		ImageView ýmg7 = (ImageView) findViewById(R.id.row1col7);
		ImageView ýmg8 = (ImageView) findViewById(R.id.row1col8);
		ImageView ýmg9 = (ImageView) findViewById(R.id.row1col9);
		ImageView ýmg10 = (ImageView) findViewById(R.id.row1col10);
		ImageView ýmg11 = (ImageView) findViewById(R.id.row2col1);
		ImageView ýmg12 = (ImageView) findViewById(R.id.row2col2);
		ImageView ýmg13 = (ImageView) findViewById(R.id.row2col3);
		ImageView ýmg14 = (ImageView) findViewById(R.id.row2col4);
		ImageView ýmg15 = (ImageView) findViewById(R.id.row2col5);
		ImageView ýmg16 = (ImageView) findViewById(R.id.row2col6);
		ImageView ýmg17 = (ImageView) findViewById(R.id.row2col7);
		ImageView ýmg18 = (ImageView) findViewById(R.id.row2col8);
		ImageView ýmg19 = (ImageView) findViewById(R.id.row2col9);
		ImageView ýmg20 = (ImageView) findViewById(R.id.row2col10);
		ImageView ýmg21 = (ImageView) findViewById(R.id.row3col1);
		ImageView ýmg22 = (ImageView) findViewById(R.id.row3col2);
		ImageView ýmg23 = (ImageView) findViewById(R.id.row3col3);
		ImageView ýmg24 = (ImageView) findViewById(R.id.row3col4);
		ImageView ýmg25 = (ImageView) findViewById(R.id.row3col5);
		ImageView ýmg26 = (ImageView) findViewById(R.id.row3col6);
		ImageView ýmg27 = (ImageView) findViewById(R.id.row3col7);
		ImageView ýmg28 = (ImageView) findViewById(R.id.row3col8);
		ImageView ýmg29 = (ImageView) findViewById(R.id.row3col9);
		ImageView ýmg30 = (ImageView) findViewById(R.id.row3col10);
		ImageView ýmg31 = (ImageView) findViewById(R.id.row4col1);
		ImageView ýmg32 = (ImageView) findViewById(R.id.row4col2);
		ImageView ýmg33 = (ImageView) findViewById(R.id.row4col3);
		ImageView ýmg34 = (ImageView) findViewById(R.id.row4col4);
		ImageView ýmg35 = (ImageView) findViewById(R.id.row4col5);
		ImageView ýmg36 = (ImageView) findViewById(R.id.row4col6);
		ImageView ýmg37 = (ImageView) findViewById(R.id.row4col7);
		ImageView ýmg38 = (ImageView) findViewById(R.id.row4col8);
		ImageView ýmg39 = (ImageView) findViewById(R.id.row4col9);
		ImageView ýmg40 = (ImageView) findViewById(R.id.row4col10);
		ImageView ýmg41 = (ImageView) findViewById(R.id.row5col1);
		ImageView ýmg42 = (ImageView) findViewById(R.id.row5col2);
		ImageView ýmg43 = (ImageView) findViewById(R.id.row5col3);
		ImageView ýmg44 = (ImageView) findViewById(R.id.row5col4);
		ImageView ýmg45 = (ImageView) findViewById(R.id.row5col5);
		ImageView ýmg46 = (ImageView) findViewById(R.id.row5col6);
		ImageView ýmg47 = (ImageView) findViewById(R.id.row5col7);
		ImageView ýmg48 = (ImageView) findViewById(R.id.row5col8);
		ImageView ýmg49 = (ImageView) findViewById(R.id.row5col9);
		ImageView ýmg50 = (ImageView) findViewById(R.id.row5col10);
		ImageView ýmg51 = (ImageView) findViewById(R.id.row6col1);
		ImageView ýmg52 = (ImageView) findViewById(R.id.row6col2);
		ImageView ýmg53 = (ImageView) findViewById(R.id.row6col3);
		ImageView ýmg54 = (ImageView) findViewById(R.id.row6col4);
		ImageView ýmg55 = (ImageView) findViewById(R.id.row6col5);
		ImageView ýmg56 = (ImageView) findViewById(R.id.row6col6);
		ImageView ýmg57 = (ImageView) findViewById(R.id.row6col7);
		ImageView ýmg58 = (ImageView) findViewById(R.id.row6col8);
		ImageView ýmg59 = (ImageView) findViewById(R.id.row6col9);
		ImageView ýmg60 = (ImageView) findViewById(R.id.row6col10);
		ImageView ýmg61 = (ImageView) findViewById(R.id.row7col1);
		ImageView ýmg62 = (ImageView) findViewById(R.id.row7col2);
		ImageView ýmg63 = (ImageView) findViewById(R.id.row7col3);
		ImageView ýmg64 = (ImageView) findViewById(R.id.row7col4);
		ImageView ýmg65 = (ImageView) findViewById(R.id.row7col5);
		ImageView ýmg66 = (ImageView) findViewById(R.id.row7col6);
		ImageView ýmg67 = (ImageView) findViewById(R.id.row7col7);
		ImageView ýmg68 = (ImageView) findViewById(R.id.row7col8);
		ImageView ýmg69 = (ImageView) findViewById(R.id.row7col9);
		ImageView ýmg70 = (ImageView) findViewById(R.id.row7col10);
		ImageView ýmg71 = (ImageView) findViewById(R.id.row8col1);
		ImageView ýmg72 = (ImageView) findViewById(R.id.row8col2);
		ImageView ýmg73 = (ImageView) findViewById(R.id.row8col3);
		ImageView ýmg74 = (ImageView) findViewById(R.id.row8col4);
		ImageView ýmg75 = (ImageView) findViewById(R.id.row8col5);
		ImageView ýmg76 = (ImageView) findViewById(R.id.row8col6);
		ImageView ýmg77 = (ImageView) findViewById(R.id.row8col7);
		ImageView ýmg78 = (ImageView) findViewById(R.id.row8col8);
		ImageView ýmg79 = (ImageView) findViewById(R.id.row8col9);
		ImageView ýmg80 = (ImageView) findViewById(R.id.row8col10);
		ImageView ýmg81 = (ImageView) findViewById(R.id.row9col1);
		ImageView ýmg82 = (ImageView) findViewById(R.id.row9col2);
		ImageView ýmg83 = (ImageView) findViewById(R.id.row9col3);
		ImageView ýmg84 = (ImageView) findViewById(R.id.row9col4);
		ImageView ýmg85 = (ImageView) findViewById(R.id.row9col5);
		ImageView ýmg86 = (ImageView) findViewById(R.id.row9col6);
		ImageView ýmg87 = (ImageView) findViewById(R.id.row9col7);
		ImageView ýmg88 = (ImageView) findViewById(R.id.row9col8);
		ImageView ýmg89 = (ImageView) findViewById(R.id.row9col9);
		ImageView ýmg90 = (ImageView) findViewById(R.id.row9col10);
		ImageView ýmg91 = (ImageView) findViewById(R.id.row10col1);
		ImageView ýmg92 = (ImageView) findViewById(R.id.row10col2);
		ImageView ýmg93 = (ImageView) findViewById(R.id.row10col3);
		ImageView ýmg94 = (ImageView) findViewById(R.id.row10col4);
		ImageView ýmg95 = (ImageView) findViewById(R.id.row10col5);
		ImageView ýmg96 = (ImageView) findViewById(R.id.row10col6);
		ImageView ýmg97 = (ImageView) findViewById(R.id.row10col7);
		ImageView ýmg98 = (ImageView) findViewById(R.id.row10col8);
		ImageView ýmg99 = (ImageView) findViewById(R.id.row10col9);
		ImageView ýmg100 = (ImageView) findViewById(R.id.row10col10);
        ýmg1.setOnClickListener(onClickListener);
        ýmg2.setOnClickListener(onClickListener);
        ýmg3.setOnClickListener(onClickListener);
        ýmg4.setOnClickListener(onClickListener);
        ýmg5.setOnClickListener(onClickListener);
        ýmg6.setOnClickListener(onClickListener);
        ýmg7.setOnClickListener(onClickListener);
        ýmg8.setOnClickListener(onClickListener);
        ýmg9.setOnClickListener(onClickListener);
        ýmg10.setOnClickListener(onClickListener);
        ýmg11.setOnClickListener(onClickListener);
        ýmg12.setOnClickListener(onClickListener);
        ýmg13.setOnClickListener(onClickListener);
        ýmg14.setOnClickListener(onClickListener);
        ýmg15.setOnClickListener(onClickListener);
        ýmg16.setOnClickListener(onClickListener);
        ýmg17.setOnClickListener(onClickListener);
        ýmg18.setOnClickListener(onClickListener);
        ýmg19.setOnClickListener(onClickListener);
        ýmg20.setOnClickListener(onClickListener);
        ýmg21.setOnClickListener(onClickListener);
        ýmg22.setOnClickListener(onClickListener);
        ýmg23.setOnClickListener(onClickListener);
        ýmg24.setOnClickListener(onClickListener);
        ýmg25.setOnClickListener(onClickListener);
        ýmg26.setOnClickListener(onClickListener);
        ýmg27.setOnClickListener(onClickListener);
        ýmg28.setOnClickListener(onClickListener);
        ýmg29.setOnClickListener(onClickListener);
        ýmg30.setOnClickListener(onClickListener);
        ýmg31.setOnClickListener(onClickListener);
        ýmg32.setOnClickListener(onClickListener);
        ýmg33.setOnClickListener(onClickListener);
        ýmg34.setOnClickListener(onClickListener);
        ýmg35.setOnClickListener(onClickListener);
        ýmg36.setOnClickListener(onClickListener);
        ýmg37.setOnClickListener(onClickListener);
        ýmg38.setOnClickListener(onClickListener);
        ýmg39.setOnClickListener(onClickListener);
        ýmg40.setOnClickListener(onClickListener);
        ýmg41.setOnClickListener(onClickListener);
        ýmg42.setOnClickListener(onClickListener);
        ýmg43.setOnClickListener(onClickListener);
        ýmg44.setOnClickListener(onClickListener);
        ýmg45.setOnClickListener(onClickListener);
        ýmg46.setOnClickListener(onClickListener);
        ýmg47.setOnClickListener(onClickListener);
        ýmg48.setOnClickListener(onClickListener);
        ýmg49.setOnClickListener(onClickListener);
        ýmg50.setOnClickListener(onClickListener);
        ýmg51.setOnClickListener(onClickListener);
        ýmg52.setOnClickListener(onClickListener);
        ýmg53.setOnClickListener(onClickListener);
        ýmg54.setOnClickListener(onClickListener);
        ýmg55.setOnClickListener(onClickListener);
        ýmg56.setOnClickListener(onClickListener);
        ýmg57.setOnClickListener(onClickListener);
        ýmg58.setOnClickListener(onClickListener);
        ýmg59.setOnClickListener(onClickListener);
        ýmg60.setOnClickListener(onClickListener);
        ýmg61.setOnClickListener(onClickListener);
        ýmg62.setOnClickListener(onClickListener);
        ýmg63.setOnClickListener(onClickListener);
        ýmg64.setOnClickListener(onClickListener);
        ýmg65.setOnClickListener(onClickListener);
        ýmg66.setOnClickListener(onClickListener);
        ýmg67.setOnClickListener(onClickListener);
        ýmg68.setOnClickListener(onClickListener);
        ýmg69.setOnClickListener(onClickListener);
        ýmg70.setOnClickListener(onClickListener);
        ýmg71.setOnClickListener(onClickListener);
        ýmg72.setOnClickListener(onClickListener);
        ýmg73.setOnClickListener(onClickListener);
        ýmg74.setOnClickListener(onClickListener);
        ýmg75.setOnClickListener(onClickListener);
        ýmg76.setOnClickListener(onClickListener);
        ýmg77.setOnClickListener(onClickListener);
        ýmg78.setOnClickListener(onClickListener);
        ýmg79.setOnClickListener(onClickListener);
        ýmg80.setOnClickListener(onClickListener);
        ýmg81.setOnClickListener(onClickListener);
        ýmg82.setOnClickListener(onClickListener);
        ýmg83.setOnClickListener(onClickListener);
        ýmg84.setOnClickListener(onClickListener);
        ýmg85.setOnClickListener(onClickListener);
        ýmg86.setOnClickListener(onClickListener);
        ýmg87.setOnClickListener(onClickListener);
        ýmg88.setOnClickListener(onClickListener);
        ýmg89.setOnClickListener(onClickListener);
        ýmg90.setOnClickListener(onClickListener);
        ýmg91.setOnClickListener(onClickListener);
        ýmg92.setOnClickListener(onClickListener);
        ýmg93.setOnClickListener(onClickListener);
        ýmg94.setOnClickListener(onClickListener);
        ýmg95.setOnClickListener(onClickListener);
        ýmg96.setOnClickListener(onClickListener);
        ýmg97.setOnClickListener(onClickListener);
        ýmg98.setOnClickListener(onClickListener);
        ýmg99.setOnClickListener(onClickListener);
        ýmg100.setOnClickListener(onClickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.renk, menu);
		return true;
	}
	SocketServerReplyThread socketServerReplyThread;
	private OnClickListener onClickListener = new OnClickListener() {
        @SuppressLint("NewApi")
		@Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.row1col1:
                
                	ImageView btn1 = (ImageView) findViewById(R.id.row1col1);
                	btn1.setImageResource(R.drawable.green_square);
			 socketServerReplyThread = new SocketServerReplyThread(
						socket, "0,0");
				socketServerReplyThread.run();
    				
                	break;
                case R.id.row1col2:
                	ImageView btn2 = (ImageView) findViewById(R.id.row1col2);
                	btn2.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,1");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col3:
                	ImageView btn3 = (ImageView) findViewById(R.id.row1col3);
                	btn3.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,2");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col4:
                	ImageView btn4 = (ImageView) findViewById(R.id.row1col4);
                	btn4.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,3");
    				socketServerReplyThread.run();
                	break;
                case R.id.row1col5:
                	ImageView btn5 = (ImageView) findViewById(R.id.row1col5);
                	btn5.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,4");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col6:
                	ImageView btn6 = (ImageView) findViewById(R.id.row1col6);
                	btn6.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,5");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col7:
                	ImageView btn7 = (ImageView) findViewById(R.id.row1col7);
                	btn7.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,6");
    				socketServerReplyThread.run();
                	break;
                case R.id.row1col8:
                	ImageView btn8 = (ImageView) findViewById(R.id.row1col8);
                	btn8.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,7");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col9:
                	ImageView btn9 = (ImageView) findViewById(R.id.row1col9);
                	btn9.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,8");
    				socketServerReplyThread.run();
                    break;
                case R.id.row1col10:
                	ImageView btn10 = (ImageView) findViewById(R.id.row1col10);
                	btn10.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "0,9");
    				socketServerReplyThread.run();
                	break;
                case R.id.row2col1:
                	ImageView btn11 = (ImageView) findViewById(R.id.row2col1);
                	btn11.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,0");
    				socketServerReplyThread.run();
                	break;
                case R.id.row2col2:
                	ImageView btn12 = (ImageView) findViewById(R.id.row2col2);
                	btn12.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,1");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col3:
                	ImageView btn13 = (ImageView) findViewById(R.id.row2col3);
                	btn13.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,2");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col4:
                	ImageView btn14 = (ImageView) findViewById(R.id.row2col4);
                	btn14.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,3");
    				socketServerReplyThread.run();
                	break;
                case R.id.row2col5:
                	ImageView btn15 = (ImageView) findViewById(R.id.row2col5);
                	btn15.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,4");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col6:
                	ImageView btn16 = (ImageView) findViewById(R.id.row2col6);
                	btn16.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,5");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col7:
                	ImageView btn17 = (ImageView) findViewById(R.id.row2col7);
                	btn17.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,6");
    				socketServerReplyThread.run();
                	break;
                case R.id.row2col8:
                	ImageView btn18 = (ImageView) findViewById(R.id.row2col8);
                	btn18.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,7");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col9:
                	ImageView btn19 = (ImageView) findViewById(R.id.row2col9);
                	btn19.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,8");
    				socketServerReplyThread.run();
                    break;
                case R.id.row2col10:
                	ImageView btn20 = (ImageView) findViewById(R.id.row2col10);
                	btn20.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "1,9");
    				socketServerReplyThread.run();
                	break;
                case R.id.row3col1:
                	ImageView btn21 = (ImageView) findViewById(R.id.row3col1);
                	btn21.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,0");
    				socketServerReplyThread.run();
                	break;
                case R.id.row3col2:
                	ImageView btn22 = (ImageView) findViewById(R.id.row3col2);
                	btn22.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,1");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col3:
                	ImageView btn23 = (ImageView) findViewById(R.id.row3col3);
                	btn23.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,2");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col4:
                	ImageView btn24 = (ImageView) findViewById(R.id.row3col4);
                	btn24.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,3");
    				socketServerReplyThread.run();
                	break;
                case R.id.row3col5:
                	ImageView btn25 = (ImageView) findViewById(R.id.row3col5);
                	btn25.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,4");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col6:
                	ImageView btn26 = (ImageView) findViewById(R.id.row3col6);
                	btn26.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,5");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col7:
                	ImageView btn27 = (ImageView) findViewById(R.id.row3col7);
                	btn27.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,6");
    				socketServerReplyThread.run();
                	break;
                case R.id.row3col8:
                	ImageView btn28 = (ImageView) findViewById(R.id.row3col8);
                	btn28.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,7");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col9:
                	ImageView btn29 = (ImageView) findViewById(R.id.row3col9);
                	btn29.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,8");
    				socketServerReplyThread.run();
                    break;
                case R.id.row3col10:
                	ImageView btn30 = (ImageView) findViewById(R.id.row3col10);
                	btn30.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "2,9");
    				socketServerReplyThread.run();
                	break;
                case R.id.row4col1:
                	ImageView btn31 = (ImageView) findViewById(R.id.row4col1);
                	btn31.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,0");
    				socketServerReplyThread.run();
                	break;
                case R.id.row4col2:
                	ImageView btn32 = (ImageView) findViewById(R.id.row4col2);
                	btn32.setImageResource(R.drawable.green_square);
                 	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,1");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col3:
                	ImageView btn33 = (ImageView) findViewById(R.id.row4col3);
                	btn33.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,2");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col4:
                	ImageView btn34 = (ImageView) findViewById(R.id.row4col4);
                	btn34.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,3");
    				socketServerReplyThread.run();
                	break;
                case R.id.row4col5:
                	ImageView btn35 = (ImageView) findViewById(R.id.row4col5);
                	btn35.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,4");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col6:
                	ImageView btn36 = (ImageView) findViewById(R.id.row4col6);
                	btn36.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,5");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col7:
                	ImageView btn37 = (ImageView) findViewById(R.id.row4col7);
                	btn37.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,6");
    				socketServerReplyThread.run();
                	break;
                case R.id.row4col8:
                	ImageView btn38 = (ImageView) findViewById(R.id.row4col8);
                	btn38.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,7");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col9:
                	ImageView btn39 = (ImageView) findViewById(R.id.row4col9);
                	btn39.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,8");
    				socketServerReplyThread.run();
                    break;
                case R.id.row4col10:
                	ImageView btn40 = (ImageView) findViewById(R.id.row4col10);
                	btn40.setImageResource(R.drawable.green_square);
                	socketServerReplyThread = new SocketServerReplyThread(
    						socket, "3,9");
    				socketServerReplyThread.run();
                	break;
               case R.id.row5col1:
              	ImageView btn41 = (ImageView) findViewById(R.id.row5col1);
              	btn41.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row5col2:
              	ImageView btn42 = (ImageView) findViewById(R.id.row5col2);
              	btn42.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col3:
              	ImageView btn43 = (ImageView) findViewById(R.id.row5col3);
              	btn43.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col4:
              	ImageView btn44 = (ImageView) findViewById(R.id.row5col4);
              	btn44.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row5col5:
              	ImageView btn45 = (ImageView) findViewById(R.id.row5col5);
              	btn45.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col6:
              	ImageView btn46 = (ImageView) findViewById(R.id.row5col6);
              	btn46.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col7:
              	ImageView btn47 = (ImageView) findViewById(R.id.row5col7);
              	btn47.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row5col8:
              	ImageView btn48 = (ImageView) findViewById(R.id.row5col8);
              	btn48.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col9:
              	ImageView btn49 = (ImageView) findViewById(R.id.row5col9);
              	btn49.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row5col10:
              	ImageView btn50 = (ImageView) findViewById(R.id.row5col10);
              	btn50.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "4,9");
				socketServerReplyThread.run();
              	break;
              case R.id.row6col1:
              	ImageView btn51 = (ImageView) findViewById(R.id.row6col1);
              	btn51.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row6col2:
              	ImageView btn52 = (ImageView) findViewById(R.id.row6col2);
              	btn52.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col3:
              	ImageView btn53 = (ImageView) findViewById(R.id.row6col3);
              	btn53.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col4:
              	ImageView btn54 = (ImageView) findViewById(R.id.row6col4);
              	btn54.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row6col5:
              	ImageView btn55 = (ImageView) findViewById(R.id.row6col5);
              	btn55.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col6:
              	ImageView btn56 = (ImageView) findViewById(R.id.row6col6);
              	btn56.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col7:
              	ImageView btn57 = (ImageView) findViewById(R.id.row6col7);
              	btn57.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row6col8:
              	ImageView btn58 = (ImageView) findViewById(R.id.row6col8);
              	btn58.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col9:
              	ImageView btn59 = (ImageView) findViewById(R.id.row6col9);
              	btn59.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row6col10:
              	ImageView btn60 = (ImageView) findViewById(R.id.row6col10);
              	btn60.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "5,9");
				socketServerReplyThread.run();
              	break;
              case R.id.row7col1:
              	ImageView btn61 = (ImageView) findViewById(R.id.row7col1);
              	btn61.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row7col2:
              	ImageView btn62 = (ImageView) findViewById(R.id.row7col2);
              	btn62.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col3:
              	ImageView btn63 = (ImageView) findViewById(R.id.row7col3);
              	btn63.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col4:
              	ImageView btn64 = (ImageView) findViewById(R.id.row7col4);
              	btn64.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row7col5:
              	ImageView btn65 = (ImageView) findViewById(R.id.row7col5);
              	btn65.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col6:
              	ImageView btn66 = (ImageView) findViewById(R.id.row7col6);
              	btn66.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col7:
              	ImageView btn67 = (ImageView) findViewById(R.id.row7col7);
              	btn67.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row7col8:
              	ImageView btn68 = (ImageView) findViewById(R.id.row7col8);
              	btn68.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col9:
              	ImageView btn69 = (ImageView) findViewById(R.id.row7col9);
              	btn69.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row7col10:
              	ImageView btn70 = (ImageView) findViewById(R.id.row7col10);
              	btn70.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "6,9");
				socketServerReplyThread.run();
              	break;
              case R.id.row8col1:
              	ImageView btn71 = (ImageView) findViewById(R.id.row8col1);
              	btn71.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row8col2:
              	ImageView btn72 = (ImageView) findViewById(R.id.row8col2);
              	btn72.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col3:
              	ImageView btn73 = (ImageView) findViewById(R.id.row8col3);
              	btn73.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col4:
              	ImageView btn74 = (ImageView) findViewById(R.id.row8col4);
              	btn74.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row8col5:
              	ImageView btn75 = (ImageView) findViewById(R.id.row8col5);
              	btn75.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col6:
              	ImageView btn76 = (ImageView) findViewById(R.id.row8col6);
              	btn76.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col7:
              	ImageView btn77 = (ImageView) findViewById(R.id.row8col7);
              	btn77.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row8col8:
              	ImageView btn78 = (ImageView) findViewById(R.id.row8col8);
              	btn78.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col9:
              	ImageView btn79 = (ImageView) findViewById(R.id.row8col9);
              	btn79.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row8col10:
              	ImageView btn80 = (ImageView) findViewById(R.id.row8col10);
              	btn80.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "7,9");
				socketServerReplyThread.run();
              	break;
              case R.id.row9col1:
              	ImageView btn81 = (ImageView) findViewById(R.id.row9col1);
              	btn81.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row9col2:
              	ImageView btn82 = (ImageView) findViewById(R.id.row9col2);
              	btn82.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col3:
              	ImageView btn83 = (ImageView) findViewById(R.id.row9col3);
              	btn83.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col4:
              	ImageView btn84 = (ImageView) findViewById(R.id.row9col4);
              	btn84.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row9col5:
              	ImageView btn85 = (ImageView) findViewById(R.id.row9col5);
              	btn85.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col6:
              	ImageView btn86 = (ImageView) findViewById(R.id.row9col6);
              	btn86.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col7:
              	ImageView btn87 = (ImageView) findViewById(R.id.row9col7);
              	btn87.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row9col8:
              	ImageView btn88 = (ImageView) findViewById(R.id.row9col8);
              	btn88.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col9:
              	ImageView btn89 = (ImageView) findViewById(R.id.row9col9);
              	btn89.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row9col10:
              	ImageView btn90 = (ImageView) findViewById(R.id.row9col10);
              	btn90.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "8,9");
				socketServerReplyThread.run();
              	break;
              case R.id.row10col1:
              	ImageView btn91 = (ImageView) findViewById(R.id.row10col1);
              	btn91.setImageResource(R.drawable.green_square);
              	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,0");
				socketServerReplyThread.run();
              	break;
              case R.id.row10col2:
              	ImageView btn92 = (ImageView) findViewById(R.id.row10col2);
              	btn92.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,1");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col3:
              	ImageView btn93 = (ImageView) findViewById(R.id.row10col3);
              	btn93.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,2");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col4:
              	ImageView btn94 = (ImageView) findViewById(R.id.row10col4);
              	btn94.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,3");
				socketServerReplyThread.run();
              	break;
              case R.id.row10col5:
              	ImageView btn95 = (ImageView) findViewById(R.id.row10col5);
              	btn95.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,4");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col6:
              	ImageView btn96 = (ImageView) findViewById(R.id.row10col6);
              	btn96.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,5");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col7:
              	ImageView btn97 = (ImageView) findViewById(R.id.row10col7);
              	btn97.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,6");
				socketServerReplyThread.run();
              	break;
              case R.id.row10col8:
              	ImageView btn98 = (ImageView) findViewById(R.id.row10col8);
              	btn98.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,7");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col9:
              	ImageView btn99 = (ImageView) findViewById(R.id.row10col9);
              	btn99.setImageResource(R.drawable.green_square);
            	socketServerReplyThread = new SocketServerReplyThread(
						socket, "9,8");
				socketServerReplyThread.run();
                  break;
              case R.id.row10col10:
              	ImageView btn100 = (ImageView) findViewById(R.id.row10col10);
            		btn100.setImageResource(R.drawable.green_square);
            		socketServerReplyThread = new SocketServerReplyThread(
    						socket, "9,9");
    				socketServerReplyThread.run();
              	break;
            }
            }
    };
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
/*	protected void onStop() {
		super.onStop();
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	class ServerThread implements Runnable {

		public void run() {
			
			try {
				serverSocket = new ServerSocket(SERVERPORT);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			while (!Thread.currentThread().isInterrupted()) {

				try {
					socket = serverSocket.accept();
					CommunicationThread commThread = new CommunicationThread(socket);
					new Thread(commThread).start();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	class CommunicationThread implements Runnable {

		private Socket clientSocket;

		private BufferedReader input;

		public CommunicationThread(Socket clientSocket) {

			this.clientSocket = clientSocket;

			try {

				this.input = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			

			while (!Thread.currentThread().isInterrupted()) {

				try {

					String read = input.readLine();

					updateConversationHandler.post(new updateUIThread(read));
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	public String satýr;
	public String sutun;
	class updateUIThread implements Runnable {
		private String msg;

		public updateUIThread(String str) {
			this.msg = str;
		}

		@Override
		public void run() {
		String renk;
			String[] splt= msg.split(",");
			satýr=splt[0];
			sutun=splt[1];
			sayac++;
			if(splt.length==3){
			    renk=splt[2];
			    String deger=""+satýr+""+sutun;
					int deger2=Integer.parseInt(deger);
					bul3(deger2);
				}
			
			if(satýr.equals("Kazandýn")){
				AlertDialog alertMessage = new AlertDialog.Builder(RenkActivity.this).create();
				alertMessage.setTitle("Oyun Bitti");
				alertMessage.setMessage("Oyunu Sen  "+sutun+" puanýný alarak oyunu Kazandýn");
				alertMessage.setButton(RESULT_OK, "Evet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(context, MainActivity.class);
			            startActivity(intent);
						
					}
				}
				);
				
				alertMessage.show();
			}
			else if(splt.length==2)
		    veriTabani();
		
		}
}
	@Override
protected void onDestroy() {
	super.onDestroy();

	if (serverSocket != null) {
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


private class SocketServerReplyThread extends Thread {

	private Socket hostThreadSocket;
String cnt;

	SocketServerReplyThread(Socket socket, String c) {
		hostThreadSocket = socket;
		cnt = c;
	}

	@Override
	public void run() {
		OutputStream outputStream;
		String msgReply = cnt;

		try {
			outputStream = hostThreadSocket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.print(msgReply);
            printStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message += "Something wrong! " + e.toString() + "\n";
		}

	}

}
	public static String[] Dizi=new String[6];
	public void veriTabani(){
	kayitGor();
	String deger=""+satýr+""+sutun;
	
	if(Dizi[0].equals(deger)){
		int deger2=Integer.parseInt(deger);
		bul(deger2);
		kazanma++;
      	
	}
	else if(Dizi[1].equals(deger)){
		int deger2=Integer.parseInt(deger);
		bul(deger2);
		kazanma++;
		
	}
     else if(Dizi[2].equals(deger)){
    	 int deger2=Integer.parseInt(deger);
 		bul(deger2);
 		kazanma++;
    
	}
     else if(Dizi[3].equals(deger)){
		int deger2=Integer.parseInt(deger);
		bul(deger2);
		kazanma++;
      	
	}
	else if(Dizi[4].equals(deger)){
		int deger2=Integer.parseInt(deger);
		bul(deger2);
		kazanma++;
		
	}
	else if(Dizi[5].equals(deger)){
		int deger2=Integer.parseInt(deger);
		bul(deger2);
		kazanma++;
		
	}
   	else{
		int deger2=Integer.parseInt(deger);
		bul2(deger2);
	
	}
	if(kazanma>5){
		AlertDialog alertMessage = new AlertDialog.Builder(this).create();
		alertMessage.setTitle("Oyun Bitti");
		int c=sayac*100;
		
		socketServerReplyThread = new SocketServerReplyThread(
				socket, "Kazandýn,"+""+c);
		socketServerReplyThread.run();
		
		alertMessage.setMessage("192.168.56.102 isimli Kiþi "+c+" puanýný alarak oyunu Kazandý");
		alertMessage.setButton(RESULT_OK, "Evet", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent = new Intent(context, MainActivity.class);
	            startActivity(intent);
				
			}
		}
		);
		
		alertMessage.show();
		
	}
	}


	public void bul(int gelen){
		
		switch(gelen){
        case 0:
        	ImageView btn1 = (ImageView) findViewById(R.id.row1col1);
        	btn1.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,0,red");
			socketServerReplyThread.run();
        	break;
        case 1:
        	ImageView btn2 = (ImageView) findViewById(R.id.row1col2);
        	btn2.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,1,red");
			socketServerReplyThread.run();
            break;
        case 2:
        	ImageView btn3 = (ImageView) findViewById(R.id.row1col3);
        	btn3.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,2,red");
			socketServerReplyThread.run();
            break;
        case 3:
        	ImageView btn4 = (ImageView) findViewById(R.id.row1col4);
        	btn4.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,3,red");
			socketServerReplyThread.run();
        	break;
        case 4:
        	ImageView btn5 = (ImageView) findViewById(R.id.row1col5);
        	btn5.setImageResource(R.drawable.green_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,4,red");
			socketServerReplyThread.run();
            break;
        case 5:
        	ImageView btn6 = (ImageView) findViewById(R.id.row1col6);
        	btn6.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,5,red");
			socketServerReplyThread.run();
            break;
        case 6:
        	ImageView btn7 = (ImageView) findViewById(R.id.row1col7);
        	btn7.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,6,red");
			socketServerReplyThread.run();
        	break;
        case 7:
        	ImageView btn8 = (ImageView) findViewById(R.id.row1col8);
        	btn8.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,7,red");
			socketServerReplyThread.run();
            break;
        case 8:
        	ImageView btn9 = (ImageView) findViewById(R.id.row1col9);
        	btn9.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,8,red");
			socketServerReplyThread.run();
            break;
        case 9:
        	ImageView btn10 = (ImageView) findViewById(R.id.row1col10);
        	btn10.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "0,9,red");
			socketServerReplyThread.run();
        	break;
        case 10:
        	ImageView btn11 = (ImageView) findViewById(R.id.row2col1);
        	btn11.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,0,red");
			socketServerReplyThread.run();
        	break;
        case 11:
        	ImageView btn12 = (ImageView) findViewById(R.id.row2col2);
        	btn12.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,1,red");
			socketServerReplyThread.run();
            break;
        case 12:
        	ImageView btn13 = (ImageView) findViewById(R.id.row2col3);
        	btn13.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,2,red");
			socketServerReplyThread.run();
            break;
        case 13:
        	ImageView btn14 = (ImageView) findViewById(R.id.row2col4);
        	btn14.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,3,red");
			socketServerReplyThread.run();
        	break;
        case 14:
        	ImageView btn15 = (ImageView) findViewById(R.id.row2col5);
        	btn15.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,4,red");
			socketServerReplyThread.run();
            break;
        case 15:
        	ImageView btn16 = (ImageView) findViewById(R.id.row2col6);
        	btn16.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,5,red");
			socketServerReplyThread.run();
            break;
        case 16:
        	ImageView btn17 = (ImageView) findViewById(R.id.row2col7);
        	btn17.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,6,red");
			socketServerReplyThread.run();
        	break;
        case 17:
        	ImageView btn18 = (ImageView) findViewById(R.id.row2col8);
        	btn18.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,7,red");
			socketServerReplyThread.run();
            break;
        case 18:
        	ImageView btn19 = (ImageView) findViewById(R.id.row2col9);
        	btn19.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,8,red");
			socketServerReplyThread.run();
            break;
        case 19:
        	ImageView btn20 = (ImageView) findViewById(R.id.row2col10);
        	btn20.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "1,9,red");
			socketServerReplyThread.run();
        	break;
        case 20:
        	ImageView btn21 = (ImageView) findViewById(R.id.row3col1);
        	btn21.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,0,red");
			socketServerReplyThread.run();
        	break;
        case 21:
        	ImageView btn22 = (ImageView) findViewById(R.id.row3col2);
        	btn22.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,1,red");
			socketServerReplyThread.run();
            break;
        case 22:
        	ImageView btn23 = (ImageView) findViewById(R.id.row3col3);
        	btn23.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,2,red");
			socketServerReplyThread.run();
            break;
        case 23:
        	ImageView btn24 = (ImageView) findViewById(R.id.row3col4);
        	btn24.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,3,red");
			socketServerReplyThread.run();
        	break;
        case 24:
        	ImageView btn25 = (ImageView) findViewById(R.id.row3col5);
        	btn25.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,4,red");
			socketServerReplyThread.run();
            break;
        case 25:
        	ImageView btn26 = (ImageView) findViewById(R.id.row3col6);
        	btn26.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,5,red");
			socketServerReplyThread.run();
            break;
        case 26:
        	ImageView btn27 = (ImageView) findViewById(R.id.row3col7);
        	btn27.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,6,red");
			socketServerReplyThread.run();
        	break;
        case 27:
        	ImageView btn28 = (ImageView) findViewById(R.id.row3col8);
        	btn28.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,7,red");
			socketServerReplyThread.run();
            break;
        case 28:
        	ImageView btn29 = (ImageView) findViewById(R.id.row3col9);
        	btn29.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,8,red");
			socketServerReplyThread.run();
            break;
        case 29:
        	ImageView btn30 = (ImageView) findViewById(R.id.row3col10);
        	btn30.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "2,9,red");
			socketServerReplyThread.run();
        	break;
        case 30:
        	ImageView btn31 = (ImageView) findViewById(R.id.row4col1);
        	btn31.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,0,red");
			socketServerReplyThread.run();
        	break;
        case 31:
        	ImageView btn32 = (ImageView) findViewById(R.id.row4col2);
        	btn32.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,1,red");
			socketServerReplyThread.run();
            break;
        case 32:
        	ImageView btn33 = (ImageView) findViewById(R.id.row4col3);
        	btn33.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,0,red");
			socketServerReplyThread.run();
            break;
        case 33:
        	ImageView btn34 = (ImageView) findViewById(R.id.row4col4);
        	btn34.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,3,red");
			socketServerReplyThread.run();
        	break;
        case 34:
        	ImageView btn35 = (ImageView) findViewById(R.id.row4col5);
        	btn35.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,4,red");
			socketServerReplyThread.run();
            break;
        case 35:
        	ImageView btn36 = (ImageView) findViewById(R.id.row4col6);
        	btn36.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,5,red");
			socketServerReplyThread.run();
            break;
        case 36:
        	ImageView btn37 = (ImageView) findViewById(R.id.row4col7);
        	btn37.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,6,red");
			socketServerReplyThread.run();
        	break;
        case 37:
        	ImageView btn38 = (ImageView) findViewById(R.id.row4col8);
        	btn38.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,7,red");
			socketServerReplyThread.run();
            break;
        case 38:
        	ImageView btn39 = (ImageView) findViewById(R.id.row4col9);
        	btn39.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,8,red");
			socketServerReplyThread.run();
            break;
        case 39:
        	ImageView btn40 = (ImageView) findViewById(R.id.row4col10);
        	btn40.setImageResource(R.drawable.red_square);
        	socketServerReplyThread = new SocketServerReplyThread(
					socket, "3,9,red");
			socketServerReplyThread.run();
        	break;
       case 40:
      	ImageView btn41 = (ImageView) findViewById(R.id.row5col1);
      	btn41.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,0,red");
		socketServerReplyThread.run();
      	break;
      case 41:
      	ImageView btn42 = (ImageView) findViewById(R.id.row5col2);
      	btn42.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,1,red");
		socketServerReplyThread.run();
          break;
      case 42:
      	ImageView btn43 = (ImageView) findViewById(R.id.row5col3);
      	btn43.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,2,red");
		socketServerReplyThread.run();
          break;
      case 43:
      	ImageView btn44 = (ImageView) findViewById(R.id.row5col4);
      	btn44.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,3,red");
		socketServerReplyThread.run();
      	break;
      case 44:
      	ImageView btn45 = (ImageView) findViewById(R.id.row5col5);
      	btn45.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,4,red");
		socketServerReplyThread.run();
          break;
      case 45:
      	ImageView btn46 = (ImageView) findViewById(R.id.row5col6);
      	btn46.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,5,red");
		socketServerReplyThread.run();
          break;
      case 46:
      	ImageView btn47 = (ImageView) findViewById(R.id.row5col7);
      	btn47.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,6,red");
		socketServerReplyThread.run();
      	break;
      case 47:
      	ImageView btn48 = (ImageView) findViewById(R.id.row5col8);
      	btn48.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,7,red");
		socketServerReplyThread.run();
          break;
      case 48:
      	ImageView btn49 = (ImageView) findViewById(R.id.row5col9);
      	btn49.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,8,red");
		socketServerReplyThread.run();
          break;
      case 49:
      	ImageView btn50 = (ImageView) findViewById(R.id.row5col10);
      	btn50.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "4,9,red");
		socketServerReplyThread.run();
      	break;
      case 50:
      	ImageView btn51 = (ImageView) findViewById(R.id.row6col1);
      	btn51.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,0,red");
		socketServerReplyThread.run();
      	break;
      case 51:
      	ImageView btn52 = (ImageView) findViewById(R.id.row6col2);
      	btn52.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,1,red");
		socketServerReplyThread.run();
          break;
      case 52:
      	ImageView btn53 = (ImageView) findViewById(R.id.row6col3);
      	btn53.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,2,red");
		socketServerReplyThread.run();
          break;
      case 53:
      	ImageView btn54 = (ImageView) findViewById(R.id.row6col4);
      	btn54.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,3,red");
		socketServerReplyThread.run();
      	break;
      case 54:
      	ImageView btn55 = (ImageView) findViewById(R.id.row6col5);
      	btn55.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,4,red");
		socketServerReplyThread.run();
          break;
      case 55:
      	ImageView btn56 = (ImageView) findViewById(R.id.row6col6);
      	btn56.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,5,red");
		socketServerReplyThread.run();
          break;
      case 56:
      	ImageView btn57 = (ImageView) findViewById(R.id.row6col7);
      	btn57.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,6,red");
		socketServerReplyThread.run();
      	break;
      case 57:
      	ImageView btn58 = (ImageView) findViewById(R.id.row6col8);
      	btn58.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,7,red");
		socketServerReplyThread.run();
          break;
      case 58:
      	ImageView btn59 = (ImageView) findViewById(R.id.row6col9);
      	btn59.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "5,8,red");
		socketServerReplyThread.run();
          break;
      case 59:
      	ImageView btn60 = (ImageView) findViewById(R.id.row6col10);
      	btn60.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,0,red");
		socketServerReplyThread.run();
      	break;
      case 60:
      	ImageView btn61 = (ImageView) findViewById(R.id.row7col1);
      	btn61.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,1,red");
		socketServerReplyThread.run();
      	break;
      case 61:
      	ImageView btn62 = (ImageView) findViewById(R.id.row7col2);
      	btn62.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,1,red");
		socketServerReplyThread.run();
          break;
      case 62:
      	ImageView btn63 = (ImageView) findViewById(R.id.row7col3);
      	btn63.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,2,red");
		socketServerReplyThread.run();
          break;
      case 63:
      	ImageView btn64 = (ImageView) findViewById(R.id.row7col4);
      	btn64.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,3,red");
		socketServerReplyThread.run();
      	break;
      case 64:
      	ImageView btn65 = (ImageView) findViewById(R.id.row7col5);
      	btn65.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,4,red");
		socketServerReplyThread.run();
          break;
      case 65:
      	ImageView btn66 = (ImageView) findViewById(R.id.row7col6);
      	btn66.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,5,red");
		socketServerReplyThread.run();
          break;
      case 66:
      	ImageView btn67 = (ImageView) findViewById(R.id.row7col7);
      	btn67.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,6,red");
		socketServerReplyThread.run();
      	break;
      case 67:
      	ImageView btn68 = (ImageView) findViewById(R.id.row7col8);
      	btn68.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,7,red");
		socketServerReplyThread.run();
          break;
      case 68:
      	ImageView btn69 = (ImageView) findViewById(R.id.row7col9);
      	btn69.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,8,red");
		socketServerReplyThread.run();
          break;
      case 69:
      	ImageView btn70 = (ImageView) findViewById(R.id.row7col10);
      	btn70.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "6,9,red");
		socketServerReplyThread.run();
      	break;
      case 70:
      	ImageView btn71 = (ImageView) findViewById(R.id.row8col1);
      	btn71.setImageResource(R.drawable.red_square);
     	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,0,red");
		socketServerReplyThread.run();
      	break;
      case 71:
      	ImageView btn72 = (ImageView) findViewById(R.id.row8col2);
      	btn72.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,1,red");
		socketServerReplyThread.run();
          break;
      case 72:
      	ImageView btn73 = (ImageView) findViewById(R.id.row8col3);
      	btn73.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,2,red");
		socketServerReplyThread.run();
          break;
      case 73:
      	ImageView btn74 = (ImageView) findViewById(R.id.row8col4);
      	btn74.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,3,red");
		socketServerReplyThread.run();
      	break;
      case 74:
      	ImageView btn75 = (ImageView) findViewById(R.id.row8col5);
      	btn75.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,4,red");
		socketServerReplyThread.run();
          break;
      case 75:
      	ImageView btn76 = (ImageView) findViewById(R.id.row8col6);
      	btn76.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,5,red");
		socketServerReplyThread.run();
          break;
      case 76:
      	ImageView btn77 = (ImageView) findViewById(R.id.row8col7);
      	btn77.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,6,red");
		socketServerReplyThread.run();
      	break;
      case 77:
      	ImageView btn78 = (ImageView) findViewById(R.id.row8col8);
      	btn78.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,7,red");
		socketServerReplyThread.run();
          break;
      case 78:
      	ImageView btn79 = (ImageView) findViewById(R.id.row8col9);
      	btn79.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,8,red");
		socketServerReplyThread.run();
          break;
      case 79:
      	ImageView btn80 = (ImageView) findViewById(R.id.row8col10);
      	btn80.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "7,9,red");
		socketServerReplyThread.run();
      	break;
      case 80:
      	ImageView btn81 = (ImageView) findViewById(R.id.row9col1);
      	btn81.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,0,red");
		socketServerReplyThread.run();
      	break;
      case 81:
      	ImageView btn82 = (ImageView) findViewById(R.id.row9col2);
      	btn82.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,1,red");
		socketServerReplyThread.run();
          break;
      case 82:
      	ImageView btn83 = (ImageView) findViewById(R.id.row9col3);
      	btn83.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,2,red");
		socketServerReplyThread.run();
          break;
      case 83:
      	ImageView btn84 = (ImageView) findViewById(R.id.row9col4);
      	btn84.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,3,red");
		socketServerReplyThread.run();
      	break;
      case 84:
      	ImageView btn85 = (ImageView) findViewById(R.id.row9col5);
      	btn85.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,4,red");
		socketServerReplyThread.run();
          break;
      case 85:
      	ImageView btn86 = (ImageView) findViewById(R.id.row9col6);
      	btn86.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,5,red");
		socketServerReplyThread.run();
          break;
      case 86:
      	ImageView btn87 = (ImageView) findViewById(R.id.row9col7);
      	btn87.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,6,red");
		socketServerReplyThread.run();
      	break;
      case 87:
      	ImageView btn88 = (ImageView) findViewById(R.id.row9col8);
      	btn88.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,7,red");
		socketServerReplyThread.run();
          break;
      case 88:
      	ImageView btn89 = (ImageView) findViewById(R.id.row9col9);
      	btn89.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,8,red");
		socketServerReplyThread.run();
          break;
      case 89:
      	ImageView btn90 = (ImageView) findViewById(R.id.row9col10);
      	btn90.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "8,9,red");
		socketServerReplyThread.run();
      	break;
      case 90:
      	ImageView btn91 = (ImageView) findViewById(R.id.row10col1);
      	btn91.setImageResource(R.drawable.red_square);
      	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,0,red");
		socketServerReplyThread.run();
      	break;
      case 91:
      	ImageView btn92 = (ImageView) findViewById(R.id.row10col2);
      	btn92.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,1,red");
		socketServerReplyThread.run();
          break;
      case 92:
      	ImageView btn93 = (ImageView) findViewById(R.id.row10col3);
      	btn93.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,2,red");
		socketServerReplyThread.run();
          break;
      case 93:
      	ImageView btn94 = (ImageView) findViewById(R.id.row10col4);
      	btn94.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,3,red");
		socketServerReplyThread.run();
      	break;
      case 94:
      	ImageView btn95 = (ImageView) findViewById(R.id.row10col5);
      	btn95.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,4,red");
		socketServerReplyThread.run();
          break;
      case 95:
      	ImageView btn96 = (ImageView) findViewById(R.id.row10col6);
      	btn96.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,5,red");
		socketServerReplyThread.run();
          break;
      case 96:
      	ImageView btn97 = (ImageView) findViewById(R.id.row10col7);
      	btn97.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,6,red");
		socketServerReplyThread.run();
      	break;
      case 97:
      	ImageView btn98 = (ImageView) findViewById(R.id.row10col8);
      	btn98.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,7,red");
		socketServerReplyThread.run();
          break;
      case 98:
      	ImageView btn99 = (ImageView) findViewById(R.id.row10col9);
      	btn99.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,8,red");
		socketServerReplyThread.run();
          break;
      case 99:
      	ImageView btn100 = (ImageView) findViewById(R.id.row10col10);
      	btn100.setImageResource(R.drawable.red_square);
    	socketServerReplyThread = new SocketServerReplyThread(
				socket, "9,9,red");
		socketServerReplyThread.run();
      	break;
    }
	}
			
public void bul2(int gelen){
		
		switch(gelen){
        case 00:
        	ImageView btn1 = (ImageView) findViewById(R.id.row1col1);
        	btn1.setImageResource(R.drawable.yellow_square);
        	break;
        case 01:
        	ImageView btn2 = (ImageView) findViewById(R.id.row1col2);
        	btn2.setImageResource(R.drawable.yellow_square);
            break;
        case 02:
        	ImageView btn3 = (ImageView) findViewById(R.id.row1col3);
        	btn3.setImageResource(R.drawable.yellow_square);
            break;
        case 03:
        	ImageView btn4 = (ImageView) findViewById(R.id.row1col4);
        	btn4.setImageResource(R.drawable.yellow_square);
        	break;
        case 04:
        	ImageView btn5 = (ImageView) findViewById(R.id.row1col5);
        	btn5.setImageResource(R.drawable.yellow_square);
            break;
        case 05:
        	ImageView btn6 = (ImageView) findViewById(R.id.row1col6);
        	btn6.setImageResource(R.drawable.yellow_square);
            break;
        case 06:
        	ImageView btn7 = (ImageView) findViewById(R.id.row1col7);
        	btn7.setImageResource(R.drawable.yellow_square);
        	break;
        case 07:
        	ImageView btn8 = (ImageView) findViewById(R.id.row1col8);
        	btn8.setImageResource(R.drawable.yellow_square);
            break;
        case 8:
        	ImageView btn9 = (ImageView) findViewById(R.id.row1col9);
        	btn9.setImageResource(R.drawable.yellow_square);
            break;
        case 9:
        	ImageView btn10 = (ImageView) findViewById(R.id.row1col10);
        	btn10.setImageResource(R.drawable.yellow_square);
        	break;
        case 10:
        	ImageView btn11 = (ImageView) findViewById(R.id.row2col1);
        	btn11.setImageResource(R.drawable.yellow_square);
        	break;
        case 11:
        	ImageView btn12 = (ImageView) findViewById(R.id.row2col2);
        	btn12.setImageResource(R.drawable.yellow_square);
            break;
        case 12:
        	ImageView btn13 = (ImageView) findViewById(R.id.row2col3);
        	btn13.setImageResource(R.drawable.yellow_square);
            break;
        case 13:
        	ImageView btn14 = (ImageView) findViewById(R.id.row2col4);
        	btn14.setImageResource(R.drawable.yellow_square);
        	break;
        case 14:
        	ImageView btn15 = (ImageView) findViewById(R.id.row2col5);
        	btn15.setImageResource(R.drawable.yellow_square);
            break;
        case 15:
        	ImageView btn16 = (ImageView) findViewById(R.id.row2col6);
        	btn16.setImageResource(R.drawable.yellow_square);
            break;
        case 16:
        	ImageView btn17 = (ImageView) findViewById(R.id.row2col7);
        	btn17.setImageResource(R.drawable.yellow_square);
        	break;
        case 17:
        	ImageView btn18 = (ImageView) findViewById(R.id.row2col8);
        	btn18.setImageResource(R.drawable.yellow_square);
            break;
        case 18:
        	ImageView btn19 = (ImageView) findViewById(R.id.row2col9);
        	btn19.setImageResource(R.drawable.yellow_square);
            break;
        case 19:
        	ImageView btn20 = (ImageView) findViewById(R.id.row2col10);
        	btn20.setImageResource(R.drawable.yellow_square);
        	break;
        case 20:
        	ImageView btn21 = (ImageView) findViewById(R.id.row3col1);
        	btn21.setImageResource(R.drawable.yellow_square);
        	break;
        case 21:
        	ImageView btn22 = (ImageView) findViewById(R.id.row3col2);
        	btn22.setImageResource(R.drawable.yellow_square);
            break;
        case 22:
        	ImageView btn23 = (ImageView) findViewById(R.id.row3col3);
        	btn23.setImageResource(R.drawable.yellow_square);
            break;
        case 23:
        	ImageView btn24 = (ImageView) findViewById(R.id.row3col4);
        	btn24.setImageResource(R.drawable.yellow_square);
        	break;
        case 24:
        	ImageView btn25 = (ImageView) findViewById(R.id.row3col5);
        	btn25.setImageResource(R.drawable.yellow_square);
            break;
        case 25:
        	ImageView btn26 = (ImageView) findViewById(R.id.row3col6);
        	btn26.setImageResource(R.drawable.yellow_square);
            break;
        case 26:
        	ImageView btn27 = (ImageView) findViewById(R.id.row3col7);
        	btn27.setImageResource(R.drawable.yellow_square);
        	break;
        case 27:
        	ImageView btn28 = (ImageView) findViewById(R.id.row3col8);
        	btn28.setImageResource(R.drawable.yellow_square);
            break;
        case 28:
        	ImageView btn29 = (ImageView) findViewById(R.id.row3col9);
        	btn29.setImageResource(R.drawable.yellow_square);
            break;
        case 29:
        	ImageView btn30 = (ImageView) findViewById(R.id.row3col10);
        	btn30.setImageResource(R.drawable.yellow_square);
        	break;
        case 30:
        	ImageView btn31 = (ImageView) findViewById(R.id.row4col1);
        	btn31.setImageResource(R.drawable.yellow_square);
        	break;
        case 31:
        	ImageView btn32 = (ImageView) findViewById(R.id.row4col2);
        	btn32.setImageResource(R.drawable.yellow_square);
            break;
        case 32:
        	ImageView btn33 = (ImageView) findViewById(R.id.row4col3);
        	btn33.setImageResource(R.drawable.yellow_square);
            break;
        case 33:
        	ImageView btn34 = (ImageView) findViewById(R.id.row4col4);
        	btn34.setImageResource(R.drawable.yellow_square);
        	break;
        case 34:
        	ImageView btn35 = (ImageView) findViewById(R.id.row4col5);
        	btn35.setImageResource(R.drawable.yellow_square);
            break;
        case 35:
        	ImageView btn36 = (ImageView) findViewById(R.id.row4col6);
        	btn36.setImageResource(R.drawable.yellow_square);
            break;
        case 36:
        	ImageView btn37 = (ImageView) findViewById(R.id.row4col7);
        	btn37.setImageResource(R.drawable.yellow_square);
        	break;
        case 37:
        	ImageView btn38 = (ImageView) findViewById(R.id.row4col8);
        	btn38.setImageResource(R.drawable.yellow_square);
            break;
        case 38:
        	ImageView btn39 = (ImageView) findViewById(R.id.row4col9);
        	btn39.setImageResource(R.drawable.yellow_square);
            break;
        case 39:
        	ImageView btn40 = (ImageView) findViewById(R.id.row4col10);
        	btn40.setImageResource(R.drawable.yellow_square);
        	break;
       case 40:
      	ImageView btn41 = (ImageView) findViewById(R.id.row5col1);
      	btn41.setImageResource(R.drawable.yellow_square);
      	break;
      case 41:
      	ImageView btn42 = (ImageView) findViewById(R.id.row5col2);
      	btn42.setImageResource(R.drawable.yellow_square);
          break;
      case 42:
      	ImageView btn43 = (ImageView) findViewById(R.id.row5col3);
      	btn43.setImageResource(R.drawable.yellow_square);
          break;
      case 43:
      	ImageView btn44 = (ImageView) findViewById(R.id.row5col4);
      	btn44.setImageResource(R.drawable.yellow_square);
      	break;
      case 44:
      	ImageView btn45 = (ImageView) findViewById(R.id.row5col5);
      	btn45.setImageResource(R.drawable.yellow_square);
          break;
      case 45:
      	ImageView btn46 = (ImageView) findViewById(R.id.row5col6);
      	btn46.setImageResource(R.drawable.yellow_square);
          break;
      case 46:
      	ImageView btn47 = (ImageView) findViewById(R.id.row5col7);
      	btn47.setImageResource(R.drawable.yellow_square);
      	break;
      case 47:
      	ImageView btn48 = (ImageView) findViewById(R.id.row5col8);
      	btn48.setImageResource(R.drawable.yellow_square);
          break;
      case 48:
      	ImageView btn49 = (ImageView) findViewById(R.id.row5col9);
      	btn49.setImageResource(R.drawable.yellow_square);
          break;
      case 49:
      	ImageView btn50 = (ImageView) findViewById(R.id.row5col10);
      	btn50.setImageResource(R.drawable.yellow_square);
      	break;
      case 50:
      	ImageView btn51 = (ImageView) findViewById(R.id.row6col1);
      	btn51.setImageResource(R.drawable.yellow_square);
      	break;
      case 51:
      	ImageView btn52 = (ImageView) findViewById(R.id.row6col2);
      	btn52.setImageResource(R.drawable.yellow_square);
          break;
      case 52:
      	ImageView btn53 = (ImageView) findViewById(R.id.row6col3);
      	btn53.setImageResource(R.drawable.yellow_square);
          break;
      case 53:
      	ImageView btn54 = (ImageView) findViewById(R.id.row6col4);
      	btn54.setImageResource(R.drawable.yellow_square);
      	break;
      case 54:
      	ImageView btn55 = (ImageView) findViewById(R.id.row6col5);
      	btn55.setImageResource(R.drawable.yellow_square);
          break;
      case 55:
      	ImageView btn56 = (ImageView) findViewById(R.id.row6col6);
      	btn56.setImageResource(R.drawable.yellow_square);
          break;
      case 56:
      	ImageView btn57 = (ImageView) findViewById(R.id.row6col7);
      	btn57.setImageResource(R.drawable.yellow_square);
      	break;
      case 57:
      	ImageView btn58 = (ImageView) findViewById(R.id.row6col8);
      	btn58.setImageResource(R.drawable.yellow_square);
          break;
      case 58:
      	ImageView btn59 = (ImageView) findViewById(R.id.row6col9);
      	btn59.setImageResource(R.drawable.yellow_square);
          break;
      case 59:
      	ImageView btn60 = (ImageView) findViewById(R.id.row6col10);
      	btn60.setImageResource(R.drawable.yellow_square);
      	break;
      case 60:
      	ImageView btn61 = (ImageView) findViewById(R.id.row7col1);
      	btn61.setImageResource(R.drawable.yellow_square);
      	break;
      case 61:
      	ImageView btn62 = (ImageView) findViewById(R.id.row7col2);
      	btn62.setImageResource(R.drawable.yellow_square);
          break;
      case 62:
      	ImageView btn63 = (ImageView) findViewById(R.id.row7col3);
      	btn63.setImageResource(R.drawable.yellow_square);
          break;
      case 63:
      	ImageView btn64 = (ImageView) findViewById(R.id.row7col4);
      	btn64.setImageResource(R.drawable.yellow_square);
      	break;
      case 64:
      	ImageView btn65 = (ImageView) findViewById(R.id.row7col5);
      	btn65.setImageResource(R.drawable.yellow_square);
          break;
      case 65:
      	ImageView btn66 = (ImageView) findViewById(R.id.row7col6);
      	btn66.setImageResource(R.drawable.yellow_square);
          break;
      case 66:
      	ImageView btn67 = (ImageView) findViewById(R.id.row7col7);
      	btn67.setImageResource(R.drawable.yellow_square);
      	break;
      case 67:
      	ImageView btn68 = (ImageView) findViewById(R.id.row7col8);
      	btn68.setImageResource(R.drawable.yellow_square);
          break;
      case 68:
      	ImageView btn69 = (ImageView) findViewById(R.id.row7col9);
      	btn69.setImageResource(R.drawable.yellow_square);
          break;
      case 69:
      	ImageView btn70 = (ImageView) findViewById(R.id.row7col10);
      	btn70.setImageResource(R.drawable.yellow_square);
      	break;
      case 70:
      	ImageView btn71 = (ImageView) findViewById(R.id.row8col1);
      	btn71.setImageResource(R.drawable.yellow_square);
      	break;
      case 71:
      	ImageView btn72 = (ImageView) findViewById(R.id.row8col2);
      	btn72.setImageResource(R.drawable.yellow_square);
          break;
      case 72:
      	ImageView btn73 = (ImageView) findViewById(R.id.row8col3);
      	btn73.setImageResource(R.drawable.yellow_square);
          break;
      case 73:
      	ImageView btn74 = (ImageView) findViewById(R.id.row8col4);
      	btn74.setImageResource(R.drawable.yellow_square);
      	break;
      case 74:
      	ImageView btn75 = (ImageView) findViewById(R.id.row8col5);
      	btn75.setImageResource(R.drawable.yellow_square);
          break;
      case 75:
      	ImageView btn76 = (ImageView) findViewById(R.id.row8col6);
      	btn76.setImageResource(R.drawable.yellow_square);
          break;
      case 76:
      	ImageView btn77 = (ImageView) findViewById(R.id.row8col7);
      	btn77.setImageResource(R.drawable.yellow_square);
      	break;
      case 77:
      	ImageView btn78 = (ImageView) findViewById(R.id.row8col8);
      	btn78.setImageResource(R.drawable.yellow_square);
          break;
      case 78:
      	ImageView btn79 = (ImageView) findViewById(R.id.row8col9);
      	btn79.setImageResource(R.drawable.yellow_square);
          break;
      case 79:
      	ImageView btn80 = (ImageView) findViewById(R.id.row8col10);
      	btn80.setImageResource(R.drawable.yellow_square);
      	break;
      case 80:
      	ImageView btn81 = (ImageView) findViewById(R.id.row9col1);
      	btn81.setImageResource(R.drawable.yellow_square);
      	break;
      case 81:
      	ImageView btn82 = (ImageView) findViewById(R.id.row9col2);
      	btn82.setImageResource(R.drawable.yellow_square);
          break;
      case 82:
      	ImageView btn83 = (ImageView) findViewById(R.id.row9col3);
      	btn83.setImageResource(R.drawable.yellow_square);
          break;
      case 83:
      	ImageView btn84 = (ImageView) findViewById(R.id.row9col4);
      	btn84.setImageResource(R.drawable.yellow_square);
      	break;
      case 84:
      	ImageView btn85 = (ImageView) findViewById(R.id.row9col5);
      	btn85.setImageResource(R.drawable.yellow_square);
          break;
      case 85:
      	ImageView btn86 = (ImageView) findViewById(R.id.row9col6);
      	btn86.setImageResource(R.drawable.yellow_square);
          break;
      case 86:
      	ImageView btn87 = (ImageView) findViewById(R.id.row9col7);
      	btn87.setImageResource(R.drawable.yellow_square);
      	break;
      case 87:
      	ImageView btn88 = (ImageView) findViewById(R.id.row9col8);
      	btn88.setImageResource(R.drawable.yellow_square);
          break;
      case 88:
      	ImageView btn89 = (ImageView) findViewById(R.id.row9col9);
      	btn89.setImageResource(R.drawable.yellow_square);
          break;
      case 89:
      	ImageView btn90 = (ImageView) findViewById(R.id.row9col10);
      	btn90.setImageResource(R.drawable.yellow_square);
      	break;
      case 90:
      	ImageView btn91 = (ImageView) findViewById(R.id.row10col1);
      	btn91.setImageResource(R.drawable.yellow_square);
      	break;
      case 91:
      	ImageView btn92 = (ImageView) findViewById(R.id.row10col2);
      	btn92.setImageResource(R.drawable.yellow_square);
          break;
      case 92:
      	ImageView btn93 = (ImageView) findViewById(R.id.row10col3);
      	btn93.setImageResource(R.drawable.yellow_square);
          break;
      case 93:
      	ImageView btn94 = (ImageView) findViewById(R.id.row10col4);
      	btn94.setImageResource(R.drawable.yellow_square);
      	break;
      case 94:
      	ImageView btn95 = (ImageView) findViewById(R.id.row10col5);
      	btn95.setImageResource(R.drawable.yellow_square);
          break;
      case 95:
      	ImageView btn96 = (ImageView) findViewById(R.id.row10col6);
      	btn96.setImageResource(R.drawable.yellow_square);
          break;
      case 96:
      	ImageView btn97 = (ImageView) findViewById(R.id.row10col7);
      	btn97.setImageResource(R.drawable.yellow_square);
      	break;
      case 97:
      	ImageView btn98 = (ImageView) findViewById(R.id.row10col8);
      	btn98.setImageResource(R.drawable.yellow_square);
          break;
      case 98:
      	ImageView btn99 = (ImageView) findViewById(R.id.row10col9);
      	btn99.setImageResource(R.drawable.yellow_square);
          break;
      case 99:
      	ImageView btn100 = (ImageView) findViewById(R.id.row10col10);
      	btn100.setImageResource(R.drawable.yellow_square);
      	break;
    }
	}
public void veritabnýndanngelen(int gelen){
	
	switch(gelen){
    case 00:
    	ImageView btn1 = (ImageView) findViewById(R.id.row1col1);
    	btn1.setImageResource(R.drawable.light_blue_square);
    	break;
    case 01:
    	ImageView btn2 = (ImageView) findViewById(R.id.row1col2);
    	btn2.setImageResource(R.drawable.light_blue_square);
        break;
    case 02:
    	ImageView btn3 = (ImageView) findViewById(R.id.row1col3);
    	btn3.setImageResource(R.drawable.light_blue_square);
        break;
    case 03:
    	ImageView btn4 = (ImageView) findViewById(R.id.row1col4);
    	btn4.setImageResource(R.drawable.light_blue_square);
    	break;
    case 04:
    	ImageView btn5 = (ImageView) findViewById(R.id.row1col5);
    	btn5.setImageResource(R.drawable.light_blue_square);
        break;
    case 05:
    	ImageView btn6 = (ImageView) findViewById(R.id.row1col6);
    	btn6.setImageResource(R.drawable.light_blue_square);
        break;
    case 06:
    	ImageView btn7 = (ImageView) findViewById(R.id.row1col7);
    	btn7.setImageResource(R.drawable.light_blue_square);
    	break;
    case 07:
    	ImageView btn8 = (ImageView) findViewById(R.id.row1col8);
    	btn8.setImageResource(R.drawable.light_blue_square);
        break;
    case 8:
    	ImageView btn9 = (ImageView) findViewById(R.id.row1col9);
    	btn9.setImageResource(R.drawable.light_blue_square);
        break;
    case 9:
    	ImageView btn10 = (ImageView) findViewById(R.id.row1col10);
    	btn10.setImageResource(R.drawable.light_blue_square);
    	break;
    case 10:
    	ImageView btn11 = (ImageView) findViewById(R.id.row2col1);
    	btn11.setImageResource(R.drawable.light_blue_square);
    	break;
    case 11:
    	ImageView btn12 = (ImageView) findViewById(R.id.row2col2);
    	btn12.setImageResource(R.drawable.light_blue_square);
        break;
    case 12:
    	ImageView btn13 = (ImageView) findViewById(R.id.row2col3);
    	btn13.setImageResource(R.drawable.light_blue_square);
        break;
    case 13:
    	ImageView btn14 = (ImageView) findViewById(R.id.row2col4);
    	btn14.setImageResource(R.drawable.light_blue_square);
    	break;
    case 14:
    	ImageView btn15 = (ImageView) findViewById(R.id.row2col5);
    	btn15.setImageResource(R.drawable.light_blue_square);
        break;
    case 15:
    	ImageView btn16 = (ImageView) findViewById(R.id.row2col6);
    	btn16.setImageResource(R.drawable.light_blue_square);
        break;
    case 16:
    	ImageView btn17 = (ImageView) findViewById(R.id.row2col7);
    	btn17.setImageResource(R.drawable.light_blue_square);
    	break;
    case 17:
    	ImageView btn18 = (ImageView) findViewById(R.id.row2col8);
    	btn18.setImageResource(R.drawable.light_blue_square);
        break;
    case 18:
    	ImageView btn19 = (ImageView) findViewById(R.id.row2col9);
    	btn19.setImageResource(R.drawable.light_blue_square);
        break;
    case 19:
    	ImageView btn20 = (ImageView) findViewById(R.id.row2col10);
    	btn20.setImageResource(R.drawable.light_blue_square);
    	break;
    case 20:
    	ImageView btn21 = (ImageView) findViewById(R.id.row3col1);
    	btn21.setImageResource(R.drawable.light_blue_square);
    	break;
    case 21:
    	ImageView btn22 = (ImageView) findViewById(R.id.row3col2);
    	btn22.setImageResource(R.drawable.light_blue_square);
        break;
    case 22:
    	ImageView btn23 = (ImageView) findViewById(R.id.row3col3);
    	btn23.setImageResource(R.drawable.light_blue_square);
        break;
    case 23:
    	ImageView btn24 = (ImageView) findViewById(R.id.row3col4);
    	btn24.setImageResource(R.drawable.light_blue_square);
    	break;
    case 24:
    	ImageView btn25 = (ImageView) findViewById(R.id.row3col5);
    	btn25.setImageResource(R.drawable.light_blue_square);
        break;
    case 25:
    	ImageView btn26 = (ImageView) findViewById(R.id.row3col6);
    	btn26.setImageResource(R.drawable.light_blue_square);
        break;
    case 26:
    	ImageView btn27 = (ImageView) findViewById(R.id.row3col7);
    	btn27.setImageResource(R.drawable.light_blue_square);
    	break;
    case 27:
    	ImageView btn28 = (ImageView) findViewById(R.id.row3col8);
    	btn28.setImageResource(R.drawable.light_blue_square);
        break;
    case 28:
    	ImageView btn29 = (ImageView) findViewById(R.id.row3col9);
    	btn29.setImageResource(R.drawable.light_blue_square);
        break;
    case 29:
    	ImageView btn30 = (ImageView) findViewById(R.id.row3col10);
    	btn30.setImageResource(R.drawable.light_blue_square);
    	break;
    case 30:
    	ImageView btn31 = (ImageView) findViewById(R.id.row4col1);
    	btn31.setImageResource(R.drawable.light_blue_square);
    	break;
    case 31:
    	ImageView btn32 = (ImageView) findViewById(R.id.row4col2);
    	btn32.setImageResource(R.drawable.light_blue_square);
        break;
    case 32:
    	ImageView btn33 = (ImageView) findViewById(R.id.row4col3);
    	btn33.setImageResource(R.drawable.light_blue_square);
        break;
    case 33:
    	ImageView btn34 = (ImageView) findViewById(R.id.row4col4);
    	btn34.setImageResource(R.drawable.light_blue_square);
    	break;
    case 34:
    	ImageView btn35 = (ImageView) findViewById(R.id.row4col5);
    	btn35.setImageResource(R.drawable.light_blue_square);
        break;
    case 35:
    	ImageView btn36 = (ImageView) findViewById(R.id.row4col6);
    	btn36.setImageResource(R.drawable.light_blue_square);
        break;
    case 36:
    	ImageView btn37 = (ImageView) findViewById(R.id.row4col7);
    	btn37.setImageResource(R.drawable.light_blue_square);
    	break;
    case 37:
    	ImageView btn38 = (ImageView) findViewById(R.id.row4col8);
    	btn38.setImageResource(R.drawable.light_blue_square);
        break;
    case 38:
    	ImageView btn39 = (ImageView) findViewById(R.id.row4col9);
    	btn39.setImageResource(R.drawable.light_blue_square);
        break;
    case 39:
    	ImageView btn40 = (ImageView) findViewById(R.id.row4col10);
    	btn40.setImageResource(R.drawable.light_blue_square);
    	break;
   case 40:
  	ImageView btn41 = (ImageView) findViewById(R.id.row5col1);
  	btn41.setImageResource(R.drawable.light_blue_square);
  	break;
  case 41:
  	ImageView btn42 = (ImageView) findViewById(R.id.row5col2);
  	btn42.setImageResource(R.drawable.light_blue_square);
      break;
  case 42:
  	ImageView btn43 = (ImageView) findViewById(R.id.row5col3);
  	btn43.setImageResource(R.drawable.light_blue_square);
      break;
  case 43:
  	ImageView btn44 = (ImageView) findViewById(R.id.row5col4);
  	btn44.setImageResource(R.drawable.light_blue_square);
  	break;
  case 44:
  	ImageView btn45 = (ImageView) findViewById(R.id.row5col5);
  	btn45.setImageResource(R.drawable.light_blue_square);
      break;
  case 45:
  	ImageView btn46 = (ImageView) findViewById(R.id.row5col6);
  	btn46.setImageResource(R.drawable.light_blue_square);
      break;
  case 46:
  	ImageView btn47 = (ImageView) findViewById(R.id.row5col7);
  	btn47.setImageResource(R.drawable.light_blue_square);
  	break;
  case 47:
  	ImageView btn48 = (ImageView) findViewById(R.id.row5col8);
  	btn48.setImageResource(R.drawable.light_blue_square);
      break;
  case 48:
  	ImageView btn49 = (ImageView) findViewById(R.id.row5col9);
  	btn49.setImageResource(R.drawable.light_blue_square);
      break;
  case 49:
  	ImageView btn50 = (ImageView) findViewById(R.id.row5col10);
  	btn50.setImageResource(R.drawable.light_blue_square);
  	break;
  case 50:
  	ImageView btn51 = (ImageView) findViewById(R.id.row6col1);
  	btn51.setImageResource(R.drawable.light_blue_square);
  	break;
  case 51:
  	ImageView btn52 = (ImageView) findViewById(R.id.row6col2);
  	btn52.setImageResource(R.drawable.light_blue_square);
      break;
  case 52:
  	ImageView btn53 = (ImageView) findViewById(R.id.row6col3);
  	btn53.setImageResource(R.drawable.light_blue_square);
      break;
  case 53:
  	ImageView btn54 = (ImageView) findViewById(R.id.row6col4);
  	btn54.setImageResource(R.drawable.light_blue_square);
  	break;
  case 54:
  	ImageView btn55 = (ImageView) findViewById(R.id.row6col5);
  	btn55.setImageResource(R.drawable.light_blue_square);
      break;
  case 55:
  	ImageView btn56 = (ImageView) findViewById(R.id.row6col6);
  	btn56.setImageResource(R.drawable.light_blue_square);
      break;
  case 56:
  	ImageView btn57 = (ImageView) findViewById(R.id.row6col7);
  	btn57.setImageResource(R.drawable.light_blue_square);
  	break;
  case 57:
  	ImageView btn58 = (ImageView) findViewById(R.id.row6col8);
  	btn58.setImageResource(R.drawable.light_blue_square);
      break;
  case 58:
  	ImageView btn59 = (ImageView) findViewById(R.id.row6col9);
  	btn59.setImageResource(R.drawable.light_blue_square);
      break;
  case 59:
  	ImageView btn60 = (ImageView) findViewById(R.id.row6col10);
  	btn60.setImageResource(R.drawable.light_blue_square);
  	break;
  case 60:
  	ImageView btn61 = (ImageView) findViewById(R.id.row7col1);
  	btn61.setImageResource(R.drawable.light_blue_square);
  	break;
  case 61:
  	ImageView btn62 = (ImageView) findViewById(R.id.row7col2);
  	btn62.setImageResource(R.drawable.light_blue_square);
      break;
  case 62:
  	ImageView btn63 = (ImageView) findViewById(R.id.row7col3);
  	btn63.setImageResource(R.drawable.light_blue_square);
      break;
  case 63:
  	ImageView btn64 = (ImageView) findViewById(R.id.row7col4);
  	btn64.setImageResource(R.drawable.light_blue_square);
  	break;
  case 64:
  	ImageView btn65 = (ImageView) findViewById(R.id.row7col5);
  	btn65.setImageResource(R.drawable.light_blue_square);
      break;
  case 65:
  	ImageView btn66 = (ImageView) findViewById(R.id.row7col6);
  	btn66.setImageResource(R.drawable.light_blue_square);
      break;
  case 66:
  	ImageView btn67 = (ImageView) findViewById(R.id.row7col7);
  	btn67.setImageResource(R.drawable.light_blue_square);
  	break;
  case 67:
  	ImageView btn68 = (ImageView) findViewById(R.id.row7col8);
  	btn68.setImageResource(R.drawable.light_blue_square);
      break;
  case 68:
  	ImageView btn69 = (ImageView) findViewById(R.id.row7col9);
  	btn69.setImageResource(R.drawable.light_blue_square);
      break;
  case 69:
  	ImageView btn70 = (ImageView) findViewById(R.id.row7col10);
  	btn70.setImageResource(R.drawable.light_blue_square);
  	break;
  case 70:
  	ImageView btn71 = (ImageView) findViewById(R.id.row8col1);
  	btn71.setImageResource(R.drawable.light_blue_square);
  	break;
  case 71:
  	ImageView btn72 = (ImageView) findViewById(R.id.row8col2);
  	btn72.setImageResource(R.drawable.light_blue_square);
      break;
  case 72:
  	ImageView btn73 = (ImageView) findViewById(R.id.row8col3);
  	btn73.setImageResource(R.drawable.light_blue_square);
      break;
  case 73:
  	ImageView btn74 = (ImageView) findViewById(R.id.row8col4);
  	btn74.setImageResource(R.drawable.light_blue_square);
  	break;
  case 74:
  	ImageView btn75 = (ImageView) findViewById(R.id.row8col5);
  	btn75.setImageResource(R.drawable.light_blue_square);
      break;
  case 75:
  	ImageView btn76 = (ImageView) findViewById(R.id.row8col6);
  	btn76.setImageResource(R.drawable.light_blue_square);
      break;
  case 76:
  	ImageView btn77 = (ImageView) findViewById(R.id.row8col7);
  	btn77.setImageResource(R.drawable.light_blue_square);
  	break;
  case 77:
  	ImageView btn78 = (ImageView) findViewById(R.id.row8col8);
  	btn78.setImageResource(R.drawable.light_blue_square);
      break;
  case 78:
  	ImageView btn79 = (ImageView) findViewById(R.id.row8col9);
  	btn79.setImageResource(R.drawable.light_blue_square);
      break;
  case 79:
  	ImageView btn80 = (ImageView) findViewById(R.id.row8col10);
  	btn80.setImageResource(R.drawable.light_blue_square);
  	break;
  case 80:
  	ImageView btn81 = (ImageView) findViewById(R.id.row9col1);
  	btn81.setImageResource(R.drawable.light_blue_square);
  	break;
  case 81:
  	ImageView btn82 = (ImageView) findViewById(R.id.row9col2);
  	btn82.setImageResource(R.drawable.light_blue_square);
      break;
  case 82:
  	ImageView btn83 = (ImageView) findViewById(R.id.row9col3);
  	btn83.setImageResource(R.drawable.light_blue_square);
      break;
  case 83:
  	ImageView btn84 = (ImageView) findViewById(R.id.row9col4);
  	btn84.setImageResource(R.drawable.light_blue_square);
  	break;
  case 84:
  	ImageView btn85 = (ImageView) findViewById(R.id.row9col5);
  	btn85.setImageResource(R.drawable.light_blue_square);
      break;
  case 85:
  	ImageView btn86 = (ImageView) findViewById(R.id.row9col6);
  	btn86.setImageResource(R.drawable.light_blue_square);
      break;
  case 86:
  	ImageView btn87 = (ImageView) findViewById(R.id.row9col7);
  	btn87.setImageResource(R.drawable.light_blue_square);
  	break;
  case 87:
  	ImageView btn88 = (ImageView) findViewById(R.id.row9col8);
  	btn88.setImageResource(R.drawable.light_blue_square);
      break;
  case 88:
  	ImageView btn89 = (ImageView) findViewById(R.id.row9col9);
  	btn89.setImageResource(R.drawable.light_blue_square);
      break;
  case 89:
  	ImageView btn90 = (ImageView) findViewById(R.id.row9col10);
  	btn90.setImageResource(R.drawable.light_blue_square);
  	break;
  case 90:
  	ImageView btn91 = (ImageView) findViewById(R.id.row10col1);
  	btn91.setImageResource(R.drawable.light_blue_square);
  	break;
  case 91:
  	ImageView btn92 = (ImageView) findViewById(R.id.row10col2);
  	btn92.setImageResource(R.drawable.light_blue_square);
      break;
  case 92:
  	ImageView btn93 = (ImageView) findViewById(R.id.row10col3);
  	btn93.setImageResource(R.drawable.light_blue_square);
      break;
  case 93:
  	ImageView btn94 = (ImageView) findViewById(R.id.row10col4);
  	btn94.setImageResource(R.drawable.light_blue_square);
  	break;
  case 94:
  	ImageView btn95 = (ImageView) findViewById(R.id.row10col5);
  	btn95.setImageResource(R.drawable.light_blue_square);
      break;
  case 95:
  	ImageView btn96 = (ImageView) findViewById(R.id.row10col6);
  	btn96.setImageResource(R.drawable.light_blue_square);
      break;
  case 96:
  	ImageView btn97 = (ImageView) findViewById(R.id.row10col7);
  	btn97.setImageResource(R.drawable.light_blue_square);
  	break;
  case 97:
  	ImageView btn98 = (ImageView) findViewById(R.id.row10col8);
  	btn98.setImageResource(R.drawable.light_blue_square);
      break;
  case 98:
  	ImageView btn99 = (ImageView) findViewById(R.id.row10col9);
  	btn99.setImageResource(R.drawable.light_blue_square);
      break;
  case 99:
  	ImageView btn100 = (ImageView) findViewById(R.id.row10col10);
  	btn100.setImageResource(R.drawable.light_blue_square);
  	break;
}
}
public void bul3(int gelen){
	
	switch(gelen){
    case 00:
    	ImageView btn1 = (ImageView) findViewById(R.id.row1col1);
    	btn1.setImageResource(R.drawable.grey_square);
    	break;
    case 01:
    	ImageView btn2 = (ImageView) findViewById(R.id.row1col2);
    	btn2.setImageResource(R.drawable.grey_square);
        break;
    case 02:
    	ImageView btn3 = (ImageView) findViewById(R.id.row1col3);
    	btn3.setImageResource(R.drawable.grey_square);
        break;
    case 03:
    	ImageView btn4 = (ImageView) findViewById(R.id.row1col4);
    	btn4.setImageResource(R.drawable.grey_square);
    	break;
    case 04:
    	ImageView btn5 = (ImageView) findViewById(R.id.row1col5);
    	btn5.setImageResource(R.drawable.grey_square);
        break;
    case 05:
    	ImageView btn6 = (ImageView) findViewById(R.id.row1col6);
    	btn6.setImageResource(R.drawable.grey_square);
        break;
    case 06:
    	ImageView btn7 = (ImageView) findViewById(R.id.row1col7);
    	btn7.setImageResource(R.drawable.grey_square);
    	break;
    case 07:
    	ImageView btn8 = (ImageView) findViewById(R.id.row1col8);
    	btn8.setImageResource(R.drawable.grey_square);
        break;
    case 8:
    	ImageView btn9 = (ImageView) findViewById(R.id.row1col9);
    	btn9.setImageResource(R.drawable.grey_square);
        break;
    case 9:
    	ImageView btn10 = (ImageView) findViewById(R.id.row1col10);
    	btn10.setImageResource(R.drawable.grey_square);
    	break;
    case 10:
    	ImageView btn11 = (ImageView) findViewById(R.id.row2col1);
    	btn11.setImageResource(R.drawable.grey_square);
    	break;
    case 11:
    	ImageView btn12 = (ImageView) findViewById(R.id.row2col2);
    	btn12.setImageResource(R.drawable.grey_square);
        break;
    case 12:
    	ImageView btn13 = (ImageView) findViewById(R.id.row2col3);
    	btn13.setImageResource(R.drawable.grey_square);
        break;
    case 13:
    	ImageView btn14 = (ImageView) findViewById(R.id.row2col4);
    	btn14.setImageResource(R.drawable.grey_square);
    	break;
    case 14:
    	ImageView btn15 = (ImageView) findViewById(R.id.row2col5);
    	btn15.setImageResource(R.drawable.grey_square);
        break;
    case 15:
    	ImageView btn16 = (ImageView) findViewById(R.id.row2col6);
    	btn16.setImageResource(R.drawable.grey_square);
        break;
    case 16:
    	ImageView btn17 = (ImageView) findViewById(R.id.row2col7);
    	btn17.setImageResource(R.drawable.grey_square);
    	break;
    case 17:
    	ImageView btn18 = (ImageView) findViewById(R.id.row2col8);
    	btn18.setImageResource(R.drawable.grey_square);
        break;
    case 18:
    	ImageView btn19 = (ImageView) findViewById(R.id.row2col9);
    	btn19.setImageResource(R.drawable.grey_square);
        break;
    case 19:
    	ImageView btn20 = (ImageView) findViewById(R.id.row2col10);
    	btn20.setImageResource(R.drawable.grey_square);
    	break;
    case 20:
    	ImageView btn21 = (ImageView) findViewById(R.id.row3col1);
    	btn21.setImageResource(R.drawable.grey_square);
    	break;
    case 21:
    	ImageView btn22 = (ImageView) findViewById(R.id.row3col2);
    	btn22.setImageResource(R.drawable.grey_square);
        break;
    case 22:
    	ImageView btn23 = (ImageView) findViewById(R.id.row3col3);
    	btn23.setImageResource(R.drawable.grey_square);
        break;
    case 23:
    	ImageView btn24 = (ImageView) findViewById(R.id.row3col4);
    	btn24.setImageResource(R.drawable.grey_square);
    	break;
    case 24:
    	ImageView btn25 = (ImageView) findViewById(R.id.row3col5);
    	btn25.setImageResource(R.drawable.grey_square);
        break;
    case 25:
    	ImageView btn26 = (ImageView) findViewById(R.id.row3col6);
    	btn26.setImageResource(R.drawable.grey_square);
        break;
    case 26:
    	ImageView btn27 = (ImageView) findViewById(R.id.row3col7);
    	btn27.setImageResource(R.drawable.grey_square);
    	break;
    case 27:
    	ImageView btn28 = (ImageView) findViewById(R.id.row3col8);
    	btn28.setImageResource(R.drawable.grey_square);
        break;
    case 28:
    	ImageView btn29 = (ImageView) findViewById(R.id.row3col9);
    	btn29.setImageResource(R.drawable.grey_square);
        break;
    case 29:
    	ImageView btn30 = (ImageView) findViewById(R.id.row3col10);
    	btn30.setImageResource(R.drawable.grey_square);
    	break;
    case 30:
    	ImageView btn31 = (ImageView) findViewById(R.id.row4col1);
    	btn31.setImageResource(R.drawable.grey_square);
    	break;
    case 31:
    	ImageView btn32 = (ImageView) findViewById(R.id.row4col2);
    	btn32.setImageResource(R.drawable.grey_square);
        break;
    case 32:
    	ImageView btn33 = (ImageView) findViewById(R.id.row4col3);
    	btn33.setImageResource(R.drawable.grey_square);
        break;
    case 33:
    	ImageView btn34 = (ImageView) findViewById(R.id.row4col4);
    	btn34.setImageResource(R.drawable.grey_square);
    	break;
    case 34:
    	ImageView btn35 = (ImageView) findViewById(R.id.row4col5);
    	btn35.setImageResource(R.drawable.grey_square);
        break;
    case 35:
    	ImageView btn36 = (ImageView) findViewById(R.id.row4col6);
    	btn36.setImageResource(R.drawable.grey_square);
        break;
    case 36:
    	ImageView btn37 = (ImageView) findViewById(R.id.row4col7);
    	btn37.setImageResource(R.drawable.grey_square);
    	break;
    case 37:
    	ImageView btn38 = (ImageView) findViewById(R.id.row4col8);
    	btn38.setImageResource(R.drawable.grey_square);
        break;
    case 38:
    	ImageView btn39 = (ImageView) findViewById(R.id.row4col9);
    	btn39.setImageResource(R.drawable.grey_square);
        break;
    case 39:
    	ImageView btn40 = (ImageView) findViewById(R.id.row4col10);
    	btn40.setImageResource(R.drawable.grey_square);
    	break;
   case 40:
  	ImageView btn41 = (ImageView) findViewById(R.id.row5col1);
  	btn41.setImageResource(R.drawable.grey_square);
  	break;
  case 41:
  	ImageView btn42 = (ImageView) findViewById(R.id.row5col2);
  	btn42.setImageResource(R.drawable.grey_square);
      break;
  case 42:
  	ImageView btn43 = (ImageView) findViewById(R.id.row5col3);
  	btn43.setImageResource(R.drawable.grey_square);
      break;
  case 43:
  	ImageView btn44 = (ImageView) findViewById(R.id.row5col4);
  	btn44.setImageResource(R.drawable.grey_square);
  	break;
  case 44:
  	ImageView btn45 = (ImageView) findViewById(R.id.row5col5);
  	btn45.setImageResource(R.drawable.grey_square);
      break;
  case 45:
  	ImageView btn46 = (ImageView) findViewById(R.id.row5col6);
  	btn46.setImageResource(R.drawable.grey_square);
      break;
  case 46:
  	ImageView btn47 = (ImageView) findViewById(R.id.row5col7);
  	btn47.setImageResource(R.drawable.grey_square);
  	break;
  case 47:
  	ImageView btn48 = (ImageView) findViewById(R.id.row5col8);
  	btn48.setImageResource(R.drawable.grey_square);
      break;
  case 48:
  	ImageView btn49 = (ImageView) findViewById(R.id.row5col9);
  	btn49.setImageResource(R.drawable.grey_square);
      break;
  case 49:
  	ImageView btn50 = (ImageView) findViewById(R.id.row5col10);
  	btn50.setImageResource(R.drawable.grey_square);
  	break;
  case 50:
  	ImageView btn51 = (ImageView) findViewById(R.id.row6col1);
  	btn51.setImageResource(R.drawable.grey_square);
  	break;
  case 51:
  	ImageView btn52 = (ImageView) findViewById(R.id.row6col2);
  	btn52.setImageResource(R.drawable.grey_square);
      break;
  case 52:
  	ImageView btn53 = (ImageView) findViewById(R.id.row6col3);
  	btn53.setImageResource(R.drawable.grey_square);
      break;
  case 53:
  	ImageView btn54 = (ImageView) findViewById(R.id.row6col4);
  	btn54.setImageResource(R.drawable.grey_square);
  	break;
  case 54:
  	ImageView btn55 = (ImageView) findViewById(R.id.row6col5);
  	btn55.setImageResource(R.drawable.grey_square);
      break;
  case 55:
  	ImageView btn56 = (ImageView) findViewById(R.id.row6col6);
  	btn56.setImageResource(R.drawable.grey_square);
      break;
  case 56:
  	ImageView btn57 = (ImageView) findViewById(R.id.row6col7);
  	btn57.setImageResource(R.drawable.grey_square);
  	break;
  case 57:
  	ImageView btn58 = (ImageView) findViewById(R.id.row6col8);
  	btn58.setImageResource(R.drawable.grey_square);
      break;
  case 58:
  	ImageView btn59 = (ImageView) findViewById(R.id.row6col9);
  	btn59.setImageResource(R.drawable.grey_square);
      break;
  case 59:
  	ImageView btn60 = (ImageView) findViewById(R.id.row6col10);
  	btn60.setImageResource(R.drawable.grey_square);
  	break;
  case 60:
  	ImageView btn61 = (ImageView) findViewById(R.id.row7col1);
  	btn61.setImageResource(R.drawable.grey_square);
  	break;
  case 61:
  	ImageView btn62 = (ImageView) findViewById(R.id.row7col2);
  	btn62.setImageResource(R.drawable.grey_square);
      break;
  case 62:
  	ImageView btn63 = (ImageView) findViewById(R.id.row7col3);
  	btn63.setImageResource(R.drawable.grey_square);
      break;
  case 63:
  	ImageView btn64 = (ImageView) findViewById(R.id.row7col4);
  	btn64.setImageResource(R.drawable.grey_square);
  	break;
  case 64:
  	ImageView btn65 = (ImageView) findViewById(R.id.row7col5);
  	btn65.setImageResource(R.drawable.grey_square);
      break;
  case 65:
  	ImageView btn66 = (ImageView) findViewById(R.id.row7col6);
  	btn66.setImageResource(R.drawable.grey_square);
      break;
  case 66:
  	ImageView btn67 = (ImageView) findViewById(R.id.row7col7);
  	btn67.setImageResource(R.drawable.grey_square);
  	break;
  case 67:
  	ImageView btn68 = (ImageView) findViewById(R.id.row7col8);
  	btn68.setImageResource(R.drawable.grey_square);
      break;
  case 68:
  	ImageView btn69 = (ImageView) findViewById(R.id.row7col9);
  	btn69.setImageResource(R.drawable.grey_square);
      break;
  case 69:
  	ImageView btn70 = (ImageView) findViewById(R.id.row7col10);
  	btn70.setImageResource(R.drawable.grey_square);
  	break;
  case 70:
  	ImageView btn71 = (ImageView) findViewById(R.id.row8col1);
  	btn71.setImageResource(R.drawable.grey_square);
  	break;
  case 71:
  	ImageView btn72 = (ImageView) findViewById(R.id.row8col2);
  	btn72.setImageResource(R.drawable.grey_square);
      break;
  case 72:
  	ImageView btn73 = (ImageView) findViewById(R.id.row8col3);
  	btn73.setImageResource(R.drawable.grey_square);
      break;
  case 73:
  	ImageView btn74 = (ImageView) findViewById(R.id.row8col4);
  	btn74.setImageResource(R.drawable.grey_square);
  	break;
  case 74:
  	ImageView btn75 = (ImageView) findViewById(R.id.row8col5);
  	btn75.setImageResource(R.drawable.grey_square);
      break;
  case 75:
  	ImageView btn76 = (ImageView) findViewById(R.id.row8col6);
  	btn76.setImageResource(R.drawable.grey_square);
      break;
  case 76:
  	ImageView btn77 = (ImageView) findViewById(R.id.row8col7);
  	btn77.setImageResource(R.drawable.grey_square);
  	break;
  case 77:
  	ImageView btn78 = (ImageView) findViewById(R.id.row8col8);
  	btn78.setImageResource(R.drawable.grey_square);
      break;
  case 78:
  	ImageView btn79 = (ImageView) findViewById(R.id.row8col9);
  	btn79.setImageResource(R.drawable.grey_square);
      break;
  case 79:
  	ImageView btn80 = (ImageView) findViewById(R.id.row8col10);
  	btn80.setImageResource(R.drawable.grey_square);
  	break;
  case 80:
  	ImageView btn81 = (ImageView) findViewById(R.id.row9col1);
  	btn81.setImageResource(R.drawable.grey_square);
  	break;
  case 81:
  	ImageView btn82 = (ImageView) findViewById(R.id.row9col2);
  	btn82.setImageResource(R.drawable.grey_square);
      break;
  case 82:
  	ImageView btn83 = (ImageView) findViewById(R.id.row9col3);
  	btn83.setImageResource(R.drawable.grey_square);
      break;
  case 83:
  	ImageView btn84 = (ImageView) findViewById(R.id.row9col4);
  	btn84.setImageResource(R.drawable.grey_square);
  	break;
  case 84:
  	ImageView btn85 = (ImageView) findViewById(R.id.row9col5);
  	btn85.setImageResource(R.drawable.grey_square);
      break;
  case 85:
  	ImageView btn86 = (ImageView) findViewById(R.id.row9col6);
  	btn86.setImageResource(R.drawable.grey_square);
      break;
  case 86:
  	ImageView btn87 = (ImageView) findViewById(R.id.row9col7);
  	btn87.setImageResource(R.drawable.grey_square);
  	break;
  case 87:
  	ImageView btn88 = (ImageView) findViewById(R.id.row9col8);
  	btn88.setImageResource(R.drawable.grey_square);
      break;
  case 88:
  	ImageView btn89 = (ImageView) findViewById(R.id.row9col9);
  	btn89.setImageResource(R.drawable.grey_square);
      break;
  case 89:
  	ImageView btn90 = (ImageView) findViewById(R.id.row9col10);
  	btn90.setImageResource(R.drawable.grey_square);
  	break;
  case 90:
  	ImageView btn91 = (ImageView) findViewById(R.id.row10col1);
  	btn91.setImageResource(R.drawable.grey_square);
  	break;
  case 91:
  	ImageView btn92 = (ImageView) findViewById(R.id.row10col2);
  	btn92.setImageResource(R.drawable.grey_square);
      break;
  case 92:
  	ImageView btn93 = (ImageView) findViewById(R.id.row10col3);
  	btn93.setImageResource(R.drawable.grey_square);
      break;
  case 93:
  	ImageView btn94 = (ImageView) findViewById(R.id.row10col4);
  	btn94.setImageResource(R.drawable.grey_square);
  	break;
  case 94:
  	ImageView btn95 = (ImageView) findViewById(R.id.row10col5);
  	btn95.setImageResource(R.drawable.grey_square);
      break;
  case 95:
  	ImageView btn96 = (ImageView) findViewById(R.id.row10col6);
  	btn96.setImageResource(R.drawable.grey_square);
      break;
  case 96:
  	ImageView btn97 = (ImageView) findViewById(R.id.row10col7);
  	btn97.setImageResource(R.drawable.grey_square);
  	break;
  case 97:
  	ImageView btn98 = (ImageView) findViewById(R.id.row10col8);
  	btn98.setImageResource(R.drawable.grey_square);
      break;
  case 98:
  	ImageView btn99 = (ImageView) findViewById(R.id.row10col9);
  	btn99.setImageResource(R.drawable.grey_square);
      break;
  case 99:
  	ImageView btn100 = (ImageView) findViewById(R.id.row10col10);
  	btn100.setImageResource(R.drawable.grey_square);
  	break;
}
}
	
	Veritabani V1= new Veritabani(this);
	SQLiteDatabase db;
	private String[] sutunlar = {"_id", "x","y"};
	
	private void kayitGor(){
		SQLiteDatabase db = V1.getReadableDatabase();
		Cursor cursorKayit = db.query("Oyun", sutunlar,
		null, null, null, null, null);
		int i=0;
		while(cursorKayit.moveToNext()){
		int id=cursorKayit.getInt(cursorKayit.getColumnIndex("_id"));
		int x=cursorKayit.getInt(cursorKayit.getColumnIndex("x"));
		int y = cursorKayit.getInt(cursorKayit.getColumnIndex("y"));
		if(i<6){
		Dizi[i]=""+x+""+y;
		i++;
		}
		}
		cursorKayit.close();
		}
	
	
}
