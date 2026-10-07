package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class ay5 extends zx5 {
    @Override // defpackage.yx5
    public void b(mfh mfhVar, mfh mfhVar2, Window window, View view, boolean z, boolean z2) {
        ch3 kxjVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            iq4.g(window);
        } else if (i >= 30) {
            t4.b(window);
        } else {
            zl2.b(window);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        v56 v56Var = new v56(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            kxjVar = new lxj(window, v56Var);
        } else {
            kxjVar = i2 >= 30 ? new kxj(window, v56Var) : new jxj(window, v56Var);
        }
        kxjVar.a0(!z);
        kxjVar.Z(!z2);
    }
}
