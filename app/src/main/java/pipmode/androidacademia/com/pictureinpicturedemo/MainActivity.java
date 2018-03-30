package pipmode.androidacademia.com.pictureinpicturedemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            enterPictureInPictureMode();
        }
        return false;
    }


}
