package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.fel;
import defpackage.oc9;
import defpackage.pgg;
import defpackage.sv;
import defpackage.uc2;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            oc9.j0(context, new sv(1), new pgg(this), true);
            return;
        }
        int i = 10;
        Object obj = null;
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        pgg pggVar = new pgg(this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new uc2(pggVar, 11, obj, i).run();
                        return;
                    }
                    return;
                }
                pgg pggVar2 = new pgg(this);
                try {
                    oc9.W(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new uc2(pggVar2, i, obj, i).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new uc2(pggVar2, 7, e, i).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            pgg pggVar3 = new pgg(this);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                fel.e(context, pggVar3);
            } else if (!"SAVE_PROFILE".equals(string2)) {
                pggVar3.d(16, null);
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                pggVar3.d(12, null);
            }
        }
    }
}
