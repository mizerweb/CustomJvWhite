package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wj7 implements du5 {
    public final ColorDrawable a;
    public final Resources b;
    public eve c;
    public final ote d;
    public final wj6 e;
    public final t97 f;

    public wj7(xj7 xj7Var) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        qe7.v();
        this.b = xj7Var.a;
        this.c = xj7Var.p;
        t97 t97Var = new t97(colorDrawable);
        this.f = t97Var;
        List list = xj7Var.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (xj7Var.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = a(xj7Var.m, null);
        drawableArr[1] = a(xj7Var.d, xj7Var.e);
        cqk cqkVar = xj7Var.l;
        t97Var.setColorFilter(null);
        drawableArr[2] = s0k.e(t97Var, cqkVar);
        drawableArr[3] = a(xj7Var.j, xj7Var.k);
        drawableArr[4] = a(xj7Var.f, xj7Var.g);
        drawableArr[5] = a(xj7Var.h, xj7Var.i);
        if (i2 > 0) {
            List list2 = xj7Var.n;
            if (list2 != null) {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = a((Drawable) it.next(), null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = xj7Var.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, null);
            }
        }
        wj6 wj6Var = new wj6(drawableArr);
        this.e = wj6Var;
        wj6Var.l = xj7Var.b;
        if (wj6Var.k == 1) {
            wj6Var.k = 0;
        }
        ote oteVar = new ote(s0k.d(wj6Var, this.c));
        oteVar.e = null;
        this.d = oteVar;
        oteVar.mutate();
        g();
        qe7.v();
    }

    public final Drawable a(Drawable drawable, cqk cqkVar) {
        return s0k.e(s0k.c(drawable, this.c, this.b), cqkVar);
    }

    public final void b(int i) {
        if (i >= 0) {
            wj6 wj6Var = this.e;
            wj6Var.k = 0;
            wj6Var.q[i] = true;
            wj6Var.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            wj6 wj6Var = this.e;
            wj6Var.k = 0;
            wj6Var.q[i] = false;
            wj6Var.invalidateSelf();
        }
    }

    public final pt5 e(int i) {
        wj6 wj6Var = this.e;
        pt5[] pt5VarArr = wj6Var.d;
        oc9.i(Boolean.valueOf(i >= 0));
        oc9.i(Boolean.valueOf(i < pt5VarArr.length));
        if (pt5VarArr[i] == null) {
            pt5VarArr[i] = new aw(wj6Var, i);
        }
        pt5 pt5Var = pt5VarArr[i];
        pt5Var.k();
        return pt5Var.k() instanceof h1f ? (h1f) pt5Var.k() : pt5Var;
    }

    public final h1f f(int i) {
        pt5 pt5VarE = e(i);
        if (pt5VarE instanceof h1f) {
            return (h1f) pt5VarE;
        }
        Drawable drawableE = s0k.e(pt5VarE.d(s0k.a), i1f.o);
        pt5VarE.d(drawableE);
        oc9.q(drawableE, "Parent has no child drawable!");
        return (h1f) drawableE;
    }

    public final void g() {
        wj6 wj6Var = this.e;
        if (wj6Var != null) {
            wj6Var.r++;
            wj6Var.k = 0;
            Arrays.fill(wj6Var.q, true);
            wj6Var.invalidateSelf();
            c();
            b(1);
            wj6Var.b();
            wj6Var.a();
        }
    }

    public final void h(cqk cqkVar) {
        cqkVar.getClass();
        f(2).q(cqkVar);
    }

    public final void i(int i, Drawable drawable) {
        if (drawable == null) {
            this.e.e(i, null);
        } else {
            e(i).d(s0k.c(drawable, this.c, this.b));
        }
    }

    public final void j(Drawable drawable, float f, boolean z) {
        Drawable drawableC = s0k.c(drawable, this.c, this.b);
        drawableC.mutate();
        this.f.o(drawableC);
        wj6 wj6Var = this.e;
        wj6Var.r++;
        c();
        b(2);
        l(f);
        if (z) {
            wj6Var.b();
        }
        wj6Var.a();
    }

    public final void k(Drawable drawable) {
        oc9.j("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(6, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(float f) {
        Drawable drawableD = this.e.d(3);
        if (drawableD == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableD instanceof Animatable) {
                ((Animatable) drawableD).stop();
            }
            d(3);
        } else {
            if (drawableD instanceof Animatable) {
                ((Animatable) drawableD).start();
            }
            b(3);
        }
        drawableD.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(eve eveVar) {
        this.c = eveVar;
        ColorDrawable colorDrawable = s0k.a;
        ote oteVar = this.d;
        Drawable drawable = oteVar.a;
        if (eveVar == null || eveVar.a != 1) {
            if (drawable instanceof bve) {
                oteVar.o(((bve) drawable).o(colorDrawable));
                colorDrawable.setCallback(null);
            }
        } else if (drawable instanceof bve) {
            bve bveVar = (bve) drawable;
            s0k.b(bveVar, eveVar);
            bveVar.m = eveVar.d;
            bveVar.invalidateSelf();
        } else {
            oteVar.o(s0k.d(oteVar.o(colorDrawable), eveVar));
        }
        for (int i = 0; i < this.e.c.length; i++) {
            pt5 pt5VarE = e(i);
            eve eveVar2 = this.c;
            while (true) {
                Object objK = pt5VarE.k();
                if (objK == pt5VarE || !(objK instanceof pt5)) {
                    break;
                } else {
                    pt5VarE = (pt5) objK;
                }
            }
            Drawable drawableK = pt5VarE.k();
            if (eveVar2 == null || eveVar2.a != 2) {
                if (drawableK instanceof xue) {
                    xue xueVar = (xue) drawableK;
                    xueVar.b(false);
                    xueVar.g();
                    xueVar.a(0, 0.0f);
                    xueVar.e(0.0f);
                    xueVar.l();
                    xueVar.j();
                    int i2 = yue.C;
                    xueVar.h();
                }
            } else if (drawableK instanceof xue) {
                s0k.b((xue) drawableK, eveVar2);
            } else if (drawableK != 0) {
                pt5VarE.d(s0k.a);
                pt5VarE.d(s0k.a(drawableK, eveVar2, this.b));
            }
        }
    }
}
