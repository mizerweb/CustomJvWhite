package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class pic {
    public int a;
    public final Object b;
    public final Object c;

    public pic(vee veeVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = veeVar;
    }

    public static pic b(vee veeVar, int i) {
        if (i == 0) {
            return new oic(veeVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new oic(veeVar, i2);
        }
        ore.p("invalid orientation");
        return null;
    }

    public abstract void a(qxe qxeVar);

    public abstract void c(qxe qxeVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r();

    public abstract void s(qxe qxeVar);

    public abstract void t();

    public abstract void u(qxe qxeVar);

    public abstract pse v(qxe qxeVar);

    public pic(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
