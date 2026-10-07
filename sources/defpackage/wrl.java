package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import java.util.UUID;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wrl {
    public static final hyg a(swg swgVar, zyg zygVar) {
        String str = swgVar.c;
        if (str == null) {
            str = swgVar.b;
        }
        k40 k40Var = new k40();
        k40Var.a = w50.PHOTO;
        k40Var.f = Integer.valueOf(swgVar.g);
        k40Var.g = Integer.valueOf(swgVar.h);
        k40Var.c = str;
        int i = swgVar.f;
        long j = swgVar.i;
        long j2 = swgVar.e;
        l40 l40VarA = k40Var.a();
        Long lValueOf = Long.valueOf(swgVar.a);
        long leastSignificantBits = BuildConfig.MAX_TIME_TO_UPLOAD & UUID.randomUUID().getLeastSignificantBits();
        return new hyg(leastSignificantBits, zygVar, i, j, (int) j2, l40VarA, leastSignificantBits, null, null, lValueOf, 3, 0, 2304);
    }

    public static final ku5 b(rwg rwgVar) {
        return new ku5(rwgVar.b, rwgVar.d, rwgVar.e, rwgVar.f, new Rect(rwgVar.g, rwgVar.h, rwgVar.i, rwgVar.j));
    }

    public static final i6a c(xwg xwgVar) {
        return new i6a(xwgVar.b, xwgVar.c, xwgVar.d, xwgVar.e, xwgVar.f, xwgVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public static final tmh d(jxg jxgVar) {
        RectF rectF;
        long j = jxgVar.a;
        int iV = v0h.v(jxgVar.d);
        int i = jxgVar.e;
        int i2 = jxgVar.f;
        String str = jxgVar.g;
        int iW = v0h.w(jxgVar.h);
        int i3 = jxgVar.i;
        float f = jxgVar.j;
        float f2 = jxgVar.k;
        float f3 = jxgVar.l;
        float f4 = jxgVar.m;
        Float f5 = jxgVar.n;
        if (f5 != null) {
            float fFloatValue = f5.floatValue();
            Float f6 = jxgVar.o;
            if (f6 != null) {
                float fFloatValue2 = f6.floatValue();
                Float f7 = jxgVar.p;
                if (f7 != null) {
                    float fFloatValue3 = f7.floatValue();
                    Float f8 = jxgVar.q;
                    if (f8 != null) {
                        rectF = new RectF(fFloatValue, fFloatValue2, fFloatValue3, f8.floatValue());
                    } else {
                        rectF = null;
                    }
                } else {
                    rectF = null;
                }
            } else {
                rectF = null;
            }
        } else {
            rectF = null;
        }
        return new tmh(j, iV, i, i2, str, iW, i3, f, f2, f3, f4, rectF);
    }

    public static boolean e(nb nbVar) {
        if (Looper.myLooper() == null) {
            ifh ifhVar = ii5.c;
            if (((ThreadLocal) ifhVar.getValue()) != null) {
                ThreadLocal threadLocal = (ThreadLocal) ifhVar.getValue();
                ii5 ii5Var = new ii5(threadLocal);
                Looper looper = ii5Var.b;
                try {
                    nbVar.invoke(ii5Var);
                    if (cqk.d(looper.getThread(), Thread.currentThread())) {
                        threadLocal.remove();
                        return true;
                    }
                    ore.k("Illegal thread");
                    return false;
                } catch (Throwable th) {
                    if (cqk.d(looper.getThread(), Thread.currentThread())) {
                        ii5Var.a.remove();
                        throw th;
                    }
                    ore.k("Illegal thread");
                    return false;
                }
            }
        }
        return false;
    }
}
