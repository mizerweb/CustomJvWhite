package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lv9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv9 b;

    public /* synthetic */ lv9(pv9 pv9Var, js8 js8Var) {
        this.a = 2;
        this.b = pv9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        pv9 pv9Var = this.b;
        switch (i) {
            case 0:
                if (!pv9Var.k && ((mu9) pv9Var.i.b).e.a() == null) {
                    pv9Var.e0();
                    break;
                }
                break;
            case 1:
                Context context = pv9Var.a;
                ComponentName componentNameC = pv9Var.c.a.c();
                kr6 kr6Var = new kr6();
                kr6Var.c = pv9Var;
                kr6Var.a = new hs9(kr6Var);
                ks9 ks9Var = new ks9(context, componentNameC, kr6Var, pv9Var.b.d.T());
                pv9Var.j = ks9Var;
                lvb.g0("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                ((is9) ks9Var.b).b.connect();
                break;
            default:
                iu9 iu9Var = pv9Var.b;
                iu9Var.getClass();
                lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                gu9 gu9Var = iu9Var.e;
                gu9Var.getClass();
                gu9.p();
                gu9Var.o();
                break;
        }
    }

    public /* synthetic */ lv9(pv9 pv9Var, int i) {
        this.a = i;
        this.b = pv9Var;
    }
}
