package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ixj {
    public static final ixj b;
    public final exj a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = dxj.s;
        } else if (i >= 30) {
            b = cxj.r;
        } else {
            b = exj.b;
        }
    }

    public ixj(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new dxj(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new cxj(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new bxj(this, windowInsets);
        } else if (i >= 28) {
            this.a = new axj(this, windowInsets);
        } else {
            this.a = new zwj(this, windowInsets);
        }
    }

    public static mi8 e(mi8 mi8Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, mi8Var.a - i);
        int iMax2 = Math.max(0, mi8Var.b - i2);
        int iMax3 = Math.max(0, mi8Var.c - i3);
        int iMax4 = Math.max(0, mi8Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? mi8Var : mi8.b(iMax, iMax2, iMax3, iMax4);
    }

    public static ixj g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        ixj ixjVar = new ixj(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i7j.a;
            ixj ixjVarA = z6j.a(view);
            exj exjVar = ixjVar.a;
            exjVar.q(ixjVarA);
            exjVar.d(view.getRootView());
            exjVar.s(view.getWindowSystemUiVisibility());
        }
        return ixjVar;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ixj) {
            return Objects.equals(this.a, ((ixj) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        exj exjVar = this.a;
        if (exjVar instanceof ywj) {
            return ((ywj) exjVar).c;
        }
        return null;
    }

    public final int hashCode() {
        exj exjVar = this.a;
        if (exjVar == null) {
            return 0;
        }
        return exjVar.hashCode();
    }

    public ixj() {
        this.a = new exj(this);
    }
}
