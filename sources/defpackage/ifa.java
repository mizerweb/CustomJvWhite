package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ifa implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ifa(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                jfa jfaVar = (jfa) this.c;
                long j = this.b;
                String str = (String) this.d;
                vo8 vo8Var = (vo8) obj2;
                if (vo8Var == null || !vo8Var.isActive()) {
                    sgg sggVarI0 = yab.i0(jfaVar.a, null, 0, new me1(jfaVar, j, str, (lq4) null), 3);
                    sggVarI0.Y(new t14(jfaVar, j, sggVarI0, 1));
                    return sggVarI0;
                }
                String str2 = jfaVar.e;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return vo8Var;
                }
                je9 je9Var = je9.d;
                if (!a4cVar.b(je9Var)) {
                    return vo8Var;
                }
                a4cVar.c(je9Var, str2, ewi.d(j, "updateViewport: reuse job for chat#", ", owner=", str), null);
                return vo8Var;
            default:
                w50 w50Var = (w50) this.c;
                long j2 = this.b;
                n9i n9iVar = (n9i) obj2;
                return (n9iVar == null || w50Var != n9iVar.b || Math.abs(j2 - n9iVar.a) >= ew5.h(((hjc) this.d).c)) ? new n9i(j2, w50Var) : n9iVar;
        }
    }
}
