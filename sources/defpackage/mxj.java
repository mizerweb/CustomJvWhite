package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class mxj {
    public final ch3 a;

    public mxj(Window window, View view) {
        v56 v56Var = new v56(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new lxj(window, v56Var);
        } else if (i >= 30) {
            this.a = new kxj(window, v56Var);
        } else {
            this.a = new jxj(window, v56Var);
        }
    }

    public final void a(int i) {
        this.a.c0(i);
    }
}
