package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class s31 {
    public final k2d a;
    public final ri b;
    public final ww6 c;
    public final due d;
    public final int e;
    public final ConcurrentHashMap f;
    public volatile int g;
    public volatile boolean h;
    public final ww6 i;
    public int j;
    public Map k;
    public Set l;

    public s31(k2d k2dVar, ri riVar, ww6 ww6Var, due dueVar, int i) {
        this.a = k2dVar;
        this.b = riVar;
        this.c = ww6Var;
        this.d = dueVar;
        int iD = (d(dueVar) * i) / 1000;
        iD = iD < 1 ? 1 : iD;
        this.e = iD;
        this.f = new ConcurrentHashMap();
        this.i = new ww6(dueVar.v(), 8, (byte) 0);
        this.j = -1;
        this.k = s66.a;
        this.l = c76.a;
        a(d(dueVar));
        this.g = (int) (iD * 0.5f);
    }

    public static int d(due dueVar) {
        long jV = 1000 / ((long) (((si) dueVar.a).f / dueVar.v()));
        if (jV < 1) {
            jV = 1;
        }
        return (int) jV;
    }

    public final void a(int i) {
        due dueVar = this.d;
        int i2 = ((si) dueVar.a).f;
        int iY = dueVar.y();
        if (iY < 1) {
            iY = 1;
        }
        int i3 = i2 * iY;
        int iV = dueVar.v();
        int iD = d(dueVar);
        if (i > iD) {
            i = iD;
        }
        int i4 = i >= 1 ? i : 1;
        int i5 = this.c.b;
        if (i4 > i5) {
            i4 = i5;
        }
        float f = (i3 / 1000.0f) * i4;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = iV;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i6 = 0;
        hj8 hj8VarF0 = oc9.f0(0, iV);
        int iP0 = wm9.P0(yw3.W0(hj8VarF0, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        Iterator it = hj8VarF0.iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                this.k = linkedHashMap;
                this.l = ww3.X1(linkedHashMap.values());
                return;
            } else {
                Object next = gj8Var.next();
                int iIntValue = ((Number) next).intValue();
                if (((int) (iIntValue % f3)) == 0) {
                    i6 = iIntValue;
                }
                linkedHashMap.put(next, Integer.valueOf(i6));
            }
        }
    }

    public final yj b(int i) {
        yj yjVar;
        ww6 ww6Var = this.i;
        Iterator it = new hj8(0, ww6Var.b, 1).iterator();
        do {
            gj8 gj8Var = (gj8) it;
            yjVar = null;
            if (!gj8Var.c) {
                break;
            }
            int iK = ww6Var.k(i - gj8Var.nextInt());
            r31 r31Var = (r31) this.f.get(Integer.valueOf(iK));
            if (r31Var != null) {
                if (r31Var.b || !r31Var.a.P()) {
                    r31Var = null;
                }
                if (r31Var != null) {
                    yjVar = new yj(iK, r31Var.a);
                }
            }
        } while (yjVar == null);
        return yjVar;
    }

    public final vc7 c(int i) {
        yj yjVarB = b(i);
        if (yjVarB == null) {
            return new vc7(3, null);
        }
        au3 au3VarL = yjVarB.b.l();
        this.j = yjVarB.a;
        return new vc7(2, au3VarL);
    }

    public final void e(int i, int i2) {
        if (this.h) {
            return;
        }
        this.h = true;
        kk.a.execute(new q31(this, i, i2, 0));
    }

    public final void f(int i, au3 au3Var) throws IOException {
        au3 au3VarY;
        yj yjVarB = b(i);
        ri riVar = this.b;
        if (yjVarB != null && (au3VarY = yjVarB.b.y()) != null) {
            try {
                int i2 = yjVarB.a;
                if (i2 < i) {
                    Bitmap bitmap = (Bitmap) au3VarY.K();
                    if (au3Var.P() && !au3Var.K().equals(bitmap)) {
                        Canvas canvas = new Canvas((Bitmap) au3Var.K());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    Iterator it = new hj8(i2 + 1, i, 1).iterator();
                    while (((gj8) it).c) {
                        riVar.a((Bitmap) au3Var.K(), ((gj8) it).nextInt());
                    }
                    au3VarY.close();
                    return;
                }
                au3VarY.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(au3VarY, th);
                    throw th2;
                }
            }
        }
        if (au3Var.P()) {
            new Canvas((Bitmap) au3Var.K()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Iterator it2 = new hj8(0, i, 1).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it2;
            if (!gj8Var.c) {
                return;
            } else {
                riVar.a((Bitmap) au3Var.K(), gj8Var.nextInt());
            }
        }
    }
}
