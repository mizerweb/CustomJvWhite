package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zj {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ifh e;
    public static final ff f;
    public static final ff g;

    static {
        ifh ifhVar = new ifh(new va(4));
        e = ifhVar;
        ff ffVar = new ff(1);
        f = ffVar;
        ff ffVar2 = new ff(2);
        g = ffVar2;
        ((Handler) ifhVar.getValue()).post(ffVar);
        ((Handler) ifhVar.getValue()).post(ffVar2);
    }

    public static void a(rc7 rc7Var, int i) {
        int i2 = rc7Var.a;
        sc7 sc7Var = rc7Var.b;
        float f2 = i2 * 0.5f;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        int iV = oc9.v(sc7Var.j + i, (int) f2, i2);
        int i3 = sc7Var.j;
        if (iV == i3 || iV == i3) {
            return;
        }
        sc7Var.j = oc9.v(iV, 1, sc7Var.i);
        s31 s31VarF = sc7Var.f();
        if (s31VarF != null) {
            s31VarF.a(sc7Var.j);
        }
    }
}
