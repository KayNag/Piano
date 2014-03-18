/***
 * Excerpted from "Hello, Android!",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband for more book information.
***/

package Kay.Piano.Sample;



import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class Audio extends Activity implements OnClickListener {
   
   private MediaPlayer a, b,c,d,e,f,g;

   
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      
      Button A = (Button)findViewById(R.id.a);
      A.setOnClickListener(Audio.this);
      Button B = (Button)findViewById(R.id.b);
      B.setOnClickListener(Audio.this);
      Button C = (Button)findViewById(R.id.b);
      C.setOnClickListener(Audio.this);
      Button D = (Button)findViewById(R.id.d);
      D.setOnClickListener(Audio.this);
      Button E = (Button)findViewById(R.id.e);
      E.setOnClickListener(Audio.this);
      Button F = (Button)findViewById(R.id.f);
      F.setOnClickListener(Audio.this);
      Button G = (Button)findViewById(R.id.g);
      G.setOnClickListener(Audio.this);
        }
   
   
   public void onClick(View v) {
	   MediaPlayer mp = new MediaPlayer();

	   switch (v.getId()) {
	   case  R.id.a: {
		   a = MediaPlayer.create(this, R.raw.a);
		   	   
		   a.start();
	   break;
	   }

	   case R.id.b: {
		   b = MediaPlayer.create(this, R.raw.b);
		   b.start();
	   break;
	   }

	   case R.id.c: {
		   c = MediaPlayer.create(this, R.raw.c);
		   c.start();
	   break;
	   }
	   case R.id.d: {
		   d = MediaPlayer.create(this, R.raw.d);
		   d.start();
	   break;
	   }
	   case R.id.e: {
		   e = MediaPlayer.create(this, R.raw.e);
		   e.start();
	   break;
	   }
	   case R.id.f: {
		   f = MediaPlayer.create(this, R.raw.f);
		   f.start();
	   break;
	   }
	   case R.id.g: {
		   g = MediaPlayer.create(this, R.raw.g);
		   g.start();
	   break;
	   }

	   }
	   }
   
  /* @Override
   public boolean onKeyDown(int keyCode, KeyEvent event) {
      MediaPlayer mp;
      switch (keyCode) {
      case KeyEvent.KEYCODE_DPAD_UP:
         mp = up;
         break;
      case KeyEvent.KEYCODE_DPAD_DOWN:
         mp = down;
         break;
      case KeyEvent.KEYCODE_DPAD_LEFT:
         mp = left;
         break;
      case KeyEvent.KEYCODE_DPAD_RIGHT:
         mp = right;
         break;
      case KeyEvent.KEYCODE_DPAD_CENTER:
      case KeyEvent.KEYCODE_ENTER:
         mp = enter;
         break;
      case KeyEvent.KEYCODE_A:
         mp = a;
         break;
      case KeyEvent.KEYCODE_S:
         mp = s;
         break;
      case KeyEvent.KEYCODE_D:
         mp = d;
         break;
      case KeyEvent.KEYCODE_F:
         mp = f;
         break;
      default:
         return super.onKeyDown(keyCode, event);
      }
      mp.seekTo(0); 
      mp.start();
      return true;
   }
   
*/   
}
