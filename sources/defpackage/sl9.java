package defpackage;

import android.os.Build;
import android.view.View;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class sl9 {
    public int a;
    public int b;
    public int c;
    public final Serializable d;

    public sl9(ul9 ul9Var) {
        this.d = ul9Var;
        this.b = -1;
        this.c = ul9Var.h;
        d();
    }

    public void a() {
        if (((ul9) this.d).h == this.c) {
            return;
        }
        c.c();
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d() {
        while (true) {
            int i = this.a;
            ul9 ul9Var = (ul9) this.d;
            if (i >= ul9Var.f || ul9Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void e(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        l4 l4Var = null;
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (f(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = i7j.c(view);
            if (accessibilityDelegateC != null) {
                l4Var = accessibilityDelegateC instanceof k4 ? ((k4) accessibilityDelegateC).a : new l4(accessibilityDelegateC);
            }
            if (l4Var == null) {
                l4Var = new l4();
            }
            i7j.l(view, l4Var);
            view.setTag(this.a, obj);
            i7j.g(view, this.c);
        }
    }

    public abstract boolean f(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((ul9) this.d).f;
    }

    public void remove() {
        ul9 ul9Var = (ul9) this.d;
        a();
        if (this.b == -1) {
            ore.k("Call next() before removing element from the iterator.");
            return;
        }
        ul9Var.c();
        ul9Var.i(this.b);
        this.b = -1;
        this.c = ul9Var.h;
    }

    public sl9(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }
}
