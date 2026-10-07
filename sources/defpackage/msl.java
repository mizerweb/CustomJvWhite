package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class msl {
    public static final String a = "msl";

    public static List a(byte[] bArr) {
        try {
            dxg dxgVar = new dxg();
            sia.mergeFrom(dxgVar, bArr);
            cxg[] cxgVarArr = dxgVar.a;
            ArrayList arrayList = new ArrayList();
            for (cxg cxgVar : cxgVarArr) {
                ou5 ou5VarF = f(cxgVar);
                if (ou5VarF != null) {
                    arrayList.add(ou5VarF);
                }
            }
            return arrayList;
        } catch (Exception e) {
            String str = a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Failed to deserialize DrawingPrimitives", e);
                }
            }
            return r66.a;
        }
    }

    public static a36 b(byte[] bArr) {
        try {
            exg exgVar = new exg();
            if (gxg.f == null) {
                synchronized (ck8.b) {
                    try {
                        if (gxg.f == null) {
                            gxg.f = new gxg[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            exgVar.a = gxg.f;
            exgVar.b = null;
            exgVar.cachedSize = -1;
            sia.mergeFrom(exgVar, bArr);
            return g(exgVar);
        } catch (Exception e) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "msl", "Failed to deserialize EditorState", e);
                }
            }
            return null;
        }
    }

    public static byte[] c(List list) {
        dxg dxgVar = new dxg();
        List<ou5> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (ou5 ou5Var : list2) {
            cxg cxgVar = new cxg();
            cxgVar.a = ou5Var.a.ordinal();
            cxgVar.b = ou5Var.b;
            arrayList.add(cxgVar);
        }
        dxgVar.a = (cxg[]) arrayList.toArray(new cxg[0]);
        return sia.toByteArray(dxgVar);
    }

    public static long d(double d) {
        lvb.O("not a normal value", e(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean e(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static ou5 f(cxg cxgVar) {
        nu5 nu5Var = (nu5) ww3.u1(cxgVar.a, nu5.b);
        if (nu5Var != null) {
            return new ou5(nu5Var, cxgVar.b);
        }
        String str = a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(cxgVar.a, "Skip primitive with unknown type="), null);
            }
        }
        return null;
    }

    public static a36 g(exg exgVar) {
        gxg[] gxgVarArr = exgVar.a;
        ArrayList arrayList = new ArrayList();
        int length = gxgVarArr.length;
        int i = 0;
        while (true) {
            iy8Var = null;
            iy8Var = null;
            iy8 iy8Var = null;
            if (i >= length) {
                break;
            }
            gxg gxgVar = gxgVarArr[i];
            hy8 hy8Var = (hy8) ww3.u1(gxgVar.b, hy8.b);
            if (hy8Var == null) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "msl", zo5.h(gxgVar.b, "Skip layer with unknown type="), null);
                    }
                }
            } else {
                int i2 = gxgVar.a;
                int i3 = gxgVar.c;
                float f = gxgVar.d;
                cxg[] cxgVarArr = gxgVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (cxg cxgVar : cxgVarArr) {
                    ou5 ou5VarF = f(cxgVar);
                    if (ou5VarF != null) {
                        arrayList2.add(ou5VarF);
                    }
                }
                iy8Var = new iy8(i2, hy8Var, i3, f, arrayList2);
            }
            if (iy8Var != null) {
                arrayList.add(iy8Var);
            }
            i++;
        }
        fxg fxgVar = exgVar.b;
        return new a36(arrayList, fxgVar != null ? new RectF(fxgVar.a, fxgVar.b, fxgVar.c, fxgVar.d) : null);
    }
}
