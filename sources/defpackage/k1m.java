package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1m {
    public static int a(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    public static int b(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        ore.p(c0a.k(i, "Not a hex char '", "'"));
        return 0;
    }

    public static jji c(Integer num) {
        if (num != null) {
            for (jji jjiVar : jji.e) {
                if (jjiVar.a == num.intValue()) {
                    return jjiVar;
                }
            }
        }
        return jji.UNKNOWN;
    }

    public static oji d(Integer num) {
        if (num != null) {
            y1 y1Var = new y1(0, oji.m);
            while (y1Var.hasNext()) {
                oji ojiVar = (oji) y1Var.next();
                if (ojiVar.a == num.intValue()) {
                    return ojiVar;
                }
            }
        }
        return oji.UNKNOWN;
    }

    public static y0e e(Integer num) {
        if (num != null) {
            return (y0e) y0e.l.get(num.intValue());
        }
        ore.n("qualityValueFromInt fail!");
        return null;
    }

    public static Integer f(y0e y0eVar) {
        return Integer.valueOf(y0eVar.b);
    }

    public static Integer g(jji jjiVar) {
        return Integer.valueOf(jjiVar.a);
    }

    public static Integer h(oji ojiVar) {
        return Integer.valueOf(ojiVar.a);
    }
}
