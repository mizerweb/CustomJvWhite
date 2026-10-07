package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t3g {
    public static final t3g a = new t3g();
    public static ylc b;

    public static void a() {
        g8c g8cVar;
        ylc ylcVar = b;
        if (ylcVar != null && (g8cVar = (g8c) ylcVar.b) != null) {
            g8cVar.b();
        }
        b = null;
    }

    public static void b(xx1 xx1Var, af7 af7Var) {
        ylc ylcVar = b;
        if (ylcVar == null || ((xx1) ylcVar.a).compareTo(xx1Var) <= 0) {
            a();
            g8c g8cVar = (g8c) af7Var.invoke();
            if (g8cVar != null) {
                b = new ylc(xx1Var, g8cVar);
            }
        }
    }
}
