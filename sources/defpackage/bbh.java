package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bbh {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bbh(Context context, Looper looper, qt3 qt3Var) {
        this.c = new fbc(context.getApplicationContext(), 25);
        nfh nfhVar = (nfh) qt3Var;
        this.d = nfhVar.a(looper, null);
        this.e = nfhVar.a(Looper.getMainLooper(), null);
    }

    public void a(final boolean z, final boolean z2) {
        sfh sfhVar = (sfh) this.d;
        if (z && z2) {
            sfhVar.f(new Runnable() { // from class: wbj
                @Override // java.lang.Runnable
                public final void run() {
                    fbc.a((fbc) this.a.c, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        sfh sfhVar2 = (sfh) this.e;
        sfhVar2.a.postDelayed(new o90(this, 26, atomicBoolean), 1000L);
        sfhVar.f(new Runnable() { // from class: xbj
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                fbc.a((fbc) this.a.c, z, z2);
            }
        });
    }

    public void b(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.a) {
            a(true, z);
        }
    }

    public bbh(Context context, String str, n31 n31Var, boolean z, boolean z2) {
        this.c = context;
        this.d = str;
        this.e = n31Var;
        this.a = z;
        this.b = z2;
    }
}
