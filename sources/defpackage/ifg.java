package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ifg {
    public static final vw5 p = new vw5(2);
    public static final vw5 q = new vw5(3);
    public static final vw5 r = new vw5(4);
    public static final vw5 s = new vw5(5);
    public static final vw5 t = new vw5(6);
    public static final vw5 u = new vw5(7);
    public static final vw5 v = new vw5(8);
    public static final vw5 w = new vw5(0);
    public static final vw5 x = new vw5(1);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final lvb e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public jfg m;
    public float n;
    public boolean o;

    public ifg(Object obj, lvb lvbVar, int i) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = lvbVar;
        if (lvbVar == t || lvbVar == u || lvbVar == v) {
            this.j = 0.1f;
            return;
        }
        if (lvbVar == x) {
            this.j = 0.00390625f;
        } else if (lvbVar == r || lvbVar == s) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }

    public static hk d() {
        ThreadLocal threadLocal = hk.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new hk(new v2a(6)));
        }
        return (hk) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new jfg(f);
        }
        this.m.i = f;
        g();
    }

    public final void b() {
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            c(true);
        }
        float f = this.n;
        if (f != Float.MAX_VALUE) {
            jfg jfgVar = this.m;
            if (jfgVar == null) {
                this.m = new jfg(f);
            } else {
                jfgVar.i = f;
            }
            this.n = Float.MAX_VALUE;
        }
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        hk hkVarD = d();
        hkVarD.a.remove(this);
        ArrayList arrayList2 = hkVarD.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            hkVarD.f = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((yw5) arrayList.get(i)).a(this.b, z);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f) {
        ArrayList arrayList;
        this.e.C0(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((zw5) arrayList.get(i)).g(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            c.i("Spring animations can only come to an end when there is damping");
        } else {
            if (!d().a()) {
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            if (this.f) {
                this.o = true;
            }
        }
    }

    public final void g() {
        jfg jfgVar = this.m;
        if (jfgVar == null) {
            c.i("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) jfgVar.i;
        float f = this.g;
        if (d > f) {
            c.i("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.h;
        if (d < f2) {
            c.i("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        jfgVar.d = dAbs;
        jfgVar.e = dAbs * 62.5d;
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.q0(this.d);
        }
        float f3 = this.b;
        if (f3 > f || f3 < f2) {
            ore.p("Starting value need to be in between min value and max value");
            return;
        }
        hk hkVarD = d();
        ArrayList arrayList = hkVarD.b;
        if (arrayList.size() == 0) {
            ((Choreographer) hkVarD.e.b).postFrameCallback(new gk(0, hkVarD.d));
            if (Build.VERSION.SDK_INT >= 33) {
                hkVarD.g = ValueAnimator.getDurationScale();
                if (hkVarD.h == null) {
                    hkVarD.h = new uvc(hkVarD);
                }
                hkVarD.h.p();
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public ifg(Object obj, lvb lvbVar, float f) {
        this(obj, lvbVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new jfg(f);
    }

    public ifg(ux6 ux6Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new ww5(0, ux6Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public ifg(Object obj, lvb lvbVar) {
        this(obj, lvbVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
