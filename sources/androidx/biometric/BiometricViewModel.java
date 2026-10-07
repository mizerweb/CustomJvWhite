package androidx.biometric;

import android.os.Looper;
import defpackage.b8j;
import defpackage.cx0;
import defpackage.g8b;
import defpackage.hx0;
import defpackage.ih;
import defpackage.lel;
import defpackage.pw0;
import defpackage.r6a;

/* JADX INFO: loaded from: classes2.dex */
public class BiometricViewModel extends b8j {
    public lel b;
    public r6a c;
    public cx0 d;
    public r6a e;
    public ih f;
    public hx0 g;
    public String h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public g8b o;
    public g8b p;
    public g8b q;
    public g8b r;
    public g8b s;
    public g8b u;
    public g8b w;
    public g8b x;
    public int i = 0;
    public boolean t = true;
    public int v = 0;

    public static void h(g8b g8bVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            g8bVar.k(obj);
        } else {
            g8bVar.i(obj);
        }
    }

    public final int c() {
        return this.c != null ? 15 : 0;
    }

    public final void d(pw0 pw0Var) {
        if (this.p == null) {
            this.p = new g8b();
        }
        h(this.p, pw0Var);
    }

    public final void e(CharSequence charSequence) {
        if (this.x == null) {
            this.x = new g8b();
        }
        h(this.x, charSequence);
    }

    public final void f(int i) {
        if (this.w == null) {
            this.w = new g8b();
        }
        h(this.w, Integer.valueOf(i));
    }

    public final void g(boolean z) {
        if (this.s == null) {
            this.s = new g8b();
        }
        h(this.s, Boolean.valueOf(z));
    }
}
