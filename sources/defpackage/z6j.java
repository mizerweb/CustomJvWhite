package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class z6j {
    public static ixj a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ixj ixjVarG = ixj.g(rootWindowInsets, null);
        exj exjVar = ixjVarG.a;
        exjVar.q(ixjVarG);
        exjVar.d(view.getRootView());
        return ixjVarG;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
