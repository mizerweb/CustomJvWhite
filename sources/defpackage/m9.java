package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m9 {
    public long a;
    public boolean b;
    public Object c;
    public Serializable d;
    public Object e;

    public jx2 a() {
        return new jx2(this);
    }

    public void b() {
        if (this.b) {
            this.b = false;
            g9 g9Var = (g9) this.e;
            if (g9Var == null) {
                return;
            }
            long j = this.a;
            ((gsh) ((esh) this.c)).getClass();
            ((rea) this.d).invoke(g9Var, Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(long j) {
        this.a = j;
    }

    public void f(ArrayList arrayList) {
        this.e = arrayList;
    }

    public void g(String str) {
        this.d = str;
    }
}
