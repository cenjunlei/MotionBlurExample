package kr.edcan.motionblurexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.meizu.common.renderer.effect.GLRenderManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GLRenderManager.getInstance();  //GLRenderManager 객체를 초기화 합니다.
    }
    
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        GLRenderManager.getInstance().trimMemory(GLRenderManager.TRIM_MEMORY_COMPLETE); //메모리 정리 옵션
        //GLRenderManager.TRIM_MEMORY_BACKGROUND -> 백그라운드 상태일 때
        //GLRenderManager.TRIM_MEMORY_COMPLETE; -> 작업이 완료됐을 떄
        //GLRenderManager.TRIM_MEMORY_UI_HIDDEN; -> UI가 표시되지 않을 때
    }
}
