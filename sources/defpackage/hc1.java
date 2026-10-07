package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hc1 {
    public final /* synthetic */ j12 a;

    public hc1(j12 j12Var) {
        this.a = j12Var;
    }

    public final x02 a(b95 b95Var, String str, r3f r3fVar) {
        gdi gdiVar = new gdi("call-session-".concat(str));
        gdiVar.c.add(r3fVar);
        gdiVar.d(740, new gc1(0, b95Var));
        gdiVar.d(742, new v02(0));
        gdiVar.d(60, new v02(1));
        gdiVar.d(743, new v02(2));
        gdiVar.d(744, new gc1(1, str));
        gdiVar.d(745, new v02(3));
        gdiVar.d(746, new v02(4));
        r3f r3fVarA = gdiVar.a();
        this.a.a.put(new z02(str), r3fVarA);
        return (x02) new w02(r3fVarA).getAccessor().c(744);
    }
}
