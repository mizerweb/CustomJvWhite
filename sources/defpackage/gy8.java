package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.LongSupplier;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class gy8 {
    public final float[] A;
    public final float[] B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final ny8 G;
    public final ny8 H;
    public int I;
    public final zk2 a;
    public final LongSupplier b;
    public Long c;
    public Long d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public long m;
    public Long n;
    public long o;
    public Long p;
    public a2i q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public float y;
    public float z;

    public gy8(zk2 zk2Var) {
        lu1 lu1Var = new lu1(2);
        this.a = zk2Var;
        this.b = lu1Var;
        this.I = 1;
        this.e = -1;
        this.f = -1;
        this.i = 1.0f;
        this.v = new float[2];
        this.w = new float[2];
        this.x = new float[2];
        this.A = new float[2];
        this.B = new float[2];
        this.G = rx8.P(3, new q38(22));
        this.H = rx8.P(3, new q38(23));
    }

    public final void a(a2i a2iVar, float f, float f2) {
        long asLong = this.b.getAsLong();
        Long l = this.n;
        boolean z = false;
        boolean z2 = l != null && l.longValue() == a2iVar.a() && asLong - this.m < 300;
        this.m = asLong;
        this.n = Long.valueOf(a2iVar.a());
        Long l2 = this.c;
        boolean z3 = l2 != null && l2.longValue() == a2iVar.a();
        long jA = a2iVar.a();
        zk2 zk2Var = this.a;
        i8b i8bVar = zk2Var.l;
        if (i8bVar == null) {
            i8bVar = new i8b(zk2Var.k.size());
            Iterator it = zk2Var.k.iterator();
            while (it.hasNext()) {
                i8bVar.a(((vk2) it.next()).getId());
            }
        }
        long[] jArr = i8bVar.a;
        int i = i8bVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (jA == jArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0 && i2 != i8bVar.b - 1) {
            i8bVar.c(i2);
            i8bVar.a(jA);
            zk2Var.l = i8bVar;
        }
        this.c = Long.valueOf(a2iVar.a());
        this.p = Long.valueOf(a2iVar.a());
        if (z2 || z3) {
            a2i a2iVar2 = (a2i) zk2Var.j.f(a2iVar.a());
            if (a2iVar2 != null && a2iVar2.k()) {
                z = true;
            }
        }
        this.r = z;
        this.g = f;
        this.h = f2;
        Long lValueOf = Long.valueOf(a2iVar.a());
        cf7 cf7Var = zk2Var.C;
        if (cf7Var != null) {
            cf7Var.invoke(lValueOf);
        }
        zk2Var.invalidate();
    }

    public final void b(MotionEvent motionEvent) {
        if (this.I != 4) {
            return;
        }
        boolean zF = f();
        zk2 zk2Var = this.a;
        if (zF) {
            af7 af7Var = zk2Var.J;
            if (af7Var != null) {
                af7Var.invoke();
            }
        } else {
            Long l = this.c;
            if (l != null) {
                long jLongValue = l.longValue();
                if (g(l) != null) {
                    zk2Var.f(jLongValue);
                }
            }
        }
        h(1);
        int iFindPointerIndex = motionEvent.findPointerIndex(this.e);
        if (iFindPointerIndex >= 0) {
            this.g = motionEvent.getX(iFindPointerIndex);
            this.h = motionEvent.getY(iFindPointerIndex);
        }
    }

    public final a2i c(float f, float f2) {
        List<a2i> gestureLayers = this.a.getGestureLayers();
        for (int iO0 = xw3.O0(gestureLayers); -1 < iO0; iO0--) {
            a2i a2iVar = gestureLayers.get(iO0);
            long jA = a2iVar.a();
            Long l = this.d;
            if ((l == null || jA != l.longValue()) && a2iVar.i(f, f2)) {
                return a2iVar;
            }
        }
        return null;
    }

    public final void d(boolean z) {
        Long l;
        Object next;
        cf7 cf7Var;
        af7 af7Var;
        boolean zF = f();
        zk2 zk2Var = this.a;
        if (zF) {
            if (z) {
                this.o = 0L;
            }
            if (this.I != 1 && (af7Var = zk2Var.J) != null) {
                af7Var.invoke();
            }
            h(1);
            this.q = null;
            this.e = -1;
            this.f = -1;
            return;
        }
        Long l2 = this.p;
        this.p = null;
        boolean z2 = !z && this.r && this.I == 1;
        this.r = false;
        if (z2 && l2 != null && (cf7Var = zk2Var.E) != null) {
            cf7Var.invoke(l2);
        }
        if (z) {
            this.o = 0L;
        }
        int i = this.I;
        if (i == 2 && this.u) {
            Long l3 = this.c;
            if (l3 != null) {
                long jLongValue = l3.longValue();
                if (zk2Var.j.f(jLongValue) instanceof z1i) {
                    zk2Var.b(Long.valueOf(jLongValue));
                } else {
                    yk2 yk2Var = zk2Var.m;
                    if (yk2Var != null) {
                        EditStoryScreen editStoryScreen = (EditStoryScreen) ((uvc) yk2Var).b;
                        zv8[] zv8VarArr = EditStoryScreen.A1;
                        oyg oygVar = editStoryScreen.C1().s;
                        xk2 xk2Var = oygVar.a;
                        Iterator it = xk2Var.b.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((vk2) next).getId() != jLongValue);
                        if (!(((vk2) next) instanceof sk2)) {
                            List list = xk2Var.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (((vk2) obj).getId() != jLongValue) {
                                    arrayList.add(obj);
                                }
                            }
                            if (arrayList.size() != xk2Var.b.size()) {
                                xk2Var.b = arrayList;
                                xk2Var.a();
                                mjg mjgVar = xk2Var.d;
                                List list2 = xk2Var.b;
                                mjgVar.getClass();
                                mjgVar.j(null, list2);
                            }
                        }
                        mjg mjgVar2 = oygVar.i;
                        mjgVar2.getClass();
                        mjgVar2.j(null, lyg.a);
                    }
                }
            }
        } else if (i != 1 && (l = this.c) != null && g(l) != null) {
            zk2Var.f(l.longValue());
        }
        this.s = false;
        this.t = false;
        zk2Var.e(false, false);
        if (this.u) {
            zk2Var.d(false);
        }
        this.u = false;
        h(1);
        this.e = -1;
        this.f = -1;
        zk2Var.invalidate();
    }

    public final int e(a2i a2iVar, float f, float f2) {
        Matrix matrixF = a2iVar.f();
        RectF rectF = a2iVar.c;
        float f3 = rectF.left;
        float[] fArr = this.v;
        fArr[0] = f3;
        fArr[1] = rectF.top;
        matrixF.mapPoints(fArr);
        float f4 = rectF.right;
        float[] fArr2 = this.w;
        fArr2[0] = f4;
        fArr2[1] = rectF.bottom;
        matrixF.mapPoints(fArr2);
        float handleTouchTargetPx = this.a.getHandleTouchTargetPx() / 2.0f;
        float f5 = fArr[0];
        if (f >= f5 - handleTouchTargetPx && f <= f5 + handleTouchTargetPx) {
            float f6 = fArr[1];
            if (f2 >= f6 - handleTouchTargetPx && f2 <= f6 + handleTouchTargetPx) {
                return 2;
            }
        }
        float f7 = fArr2[0];
        if (f >= f7 - handleTouchTargetPx && f <= f7 + handleTouchTargetPx) {
            float f8 = fArr2[1];
            if (f2 >= f8 - handleTouchTargetPx && f2 <= f8 + handleTouchTargetPx) {
                return 3;
            }
        }
        return 1;
    }

    public final boolean f() {
        return this.q != null;
    }

    public final a2i g(Long l) {
        if (l == null) {
            return null;
        }
        return (a2i) this.a.j.f(l.longValue());
    }

    public final void h(int i) {
        yk2 yk2Var;
        if (this.I != i) {
            this.I = i;
            if (f() || (yk2Var = this.a.m) == null) {
                return;
            }
            EditStoryScreen editStoryScreen = (EditStoryScreen) ((uvc) yk2Var).b;
            zv8[] zv8VarArr = EditStoryScreen.A1;
            editStoryScreen.C1().s.c(i);
        }
    }

    public final void i(a2i a2iVar) {
        Matrix matrixF = a2iVar.f();
        float fB = a2iVar.b();
        float[] fArr = this.x;
        fArr[0] = fB;
        fArr[1] = a2iVar.c();
        matrixF.mapPoints(fArr);
        this.y = fArr[0];
        this.z = fArr[1];
    }
}
