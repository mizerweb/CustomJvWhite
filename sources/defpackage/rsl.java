package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rsl {
    public static RectF a(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return new RectF();
        }
        float f = i3;
        float f2 = i;
        float f3 = i4;
        float f4 = i2;
        float fMin = Math.min(f / f2, f3 / f4);
        float f5 = f2 * fMin;
        float f6 = f4 * fMin;
        float f7 = (f - f5) / 2.0f;
        float f8 = (f3 - f6) / 2.0f;
        return new RectF(f7, f8, f5 + f7, f6 + f8);
    }

    public static ns5 b(int i) {
        Object next;
        y1 y1Var = new y1(0, ns5.k);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((ns5) next).a != i);
        ns5 ns5Var = (ns5) next;
        return ns5Var == null ? ns5.UNKNOWN : ns5Var;
    }
}
