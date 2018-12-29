package com.cly.eee.activity;

import android.app.ActivityManager;
import android.content.Context;

public class BaseActivity {



/**   完全退出app的方法：
  *   有些时候我们可能想杀死整个App，连后台任务都杀死
  *    杀得一干二净的话，可以使用搭配着下述代码使用：
 */
    public void AppExit(Context context) {
        try {
            ActivityCollector.finishAll();
            ActivityManager activityMgr = (ActivityManager) context
                    .getSystemService(Context.ACTIVITY_SERVICE);
            activityMgr.killBackgroundProcesses(context.getPackageName());
            System.exit(0);
        } catch (Exception ignored) {}
    }


///**双击退出程序的两种方法：
//    1）定义一个变量，来标识是否退出
// */
//    private static boolean isExit = false;
//    Handler mHandler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            isExit = false;
//        }
//    };
//
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            if (!isExit) {
//                isExit = true;
//                Toast.makeText(getApplicationContext(), "再按一次退出程序",
//                        Toast.LENGTH_SHORT).show();
//                // 利用handler延迟发送更改状态信息
//                mHandler.sendEmptyMessageDelayed(0, 2000);
//            } else {
//                exit(this);
//            }
//            return false;
//        }
//        return super.onKeyDown(keyCode, event);}
//
//
//
//    /**双击退出程序的两种方法：
//     2）保存点击的时间
//     */
//    private long exitTime = 0;
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            if ((System.currentTimeMillis() - exitTime) > 2000) {
//                Toast.makeText(getApplicationContext(), "再按一次退出程序",
//                        Toast.LENGTH_SHORT).show();
//                exitTime = System.currentTimeMillis();
//            } else {
//                exit();
//            }
//            return false;
//        }
//        return super.onKeyDown(keyCode, event);
//    }





}
