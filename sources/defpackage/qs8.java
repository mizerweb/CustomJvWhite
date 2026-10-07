package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qs8 {
    public static final ps8 d = new ps8(new at8(false, false, false, true, "    ", false, "type", true, 3), n1g.f);
    public final at8 a;
    public final khb b;
    public final ue4 c = new ue4(1);

    public qs8(at8 at8Var, khb khbVar) {
        this.a = at8Var;
        this.b = khbVar;
    }

    public final Object a(aw8 aw8Var, String str) {
        vyh vyhVar = new vyh(str);
        Object objD = new x4h(this, w0k.OBJ, vyhVar, aw8Var.d()).d(aw8Var);
        if (vyhVar.h() == 10) {
            return objD;
        }
        vyh.q(vyhVar, "Expected EOF after parsing, but had " + str.charAt(vyhVar.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(aw8 aw8Var, Object obj) {
        char[] cArr;
        qf4 qf4Var = new qf4(2);
        ws2 ws2Var = ws2.c;
        synchronized (ws2Var) {
            zv zvVar = ws2Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (zvVar.isEmpty() ? null : zvVar.removeLast());
            if (cArr2 != null) {
                ws2Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[np0.m];
        }
        qf4Var.c = cArr;
        try {
            new y4h(new s74(qf4Var), this, w0k.OBJ, new ot8[w0k.h.getSize()]).t(aw8Var, obj);
            return qf4Var.toString();
        } finally {
            qf4Var.m();
        }
    }

    public final jt8 c(String str) {
        return (jt8) a(mt8.a, str);
    }
}
