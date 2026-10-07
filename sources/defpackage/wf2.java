package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class wf2 implements g19 {
    public final i19 a;
    public final Handler b;

    public wf2() {
        i19 i19Var = new i19(this);
        this.a = i19Var;
        this.b = new Handler(Looper.getMainLooper());
        i19Var.d(m09.ON_CREATE);
    }

    public final void a() {
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.d(m09.ON_DESTROY);
        } else {
            this.b.post(new vf2(this, 0));
        }
    }

    public final void b() {
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.d(m09.ON_PAUSE);
        } else {
            this.b.post(new vf2(this, 1));
        }
    }

    public final void e() {
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.d(m09.ON_RESUME);
        } else {
            this.b.post(new vf2(this, 2));
        }
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.a;
    }
}
