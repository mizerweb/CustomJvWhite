package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class akf extends mjf {
    public final long b;
    public final long c;
    public final boolean d;
    public final String e = akf.class.getName();

    public akf(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.mjf
    public final void B() {
        je9 je9Var = je9.c;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, ewi.d(this.b, "process: ", ", ", vd7.K(Long.valueOf(this.c))), null);
        }
        rt2 rt2Var = (rt2) k().k(this.b).a.getValue();
        if (rt2Var == null) {
            return;
        }
        if (rt2Var.b.a != 0 || c().V(rt2Var)) {
            boolean z = this.d && rt2Var.e0() && rt2Var.b.d == rt2Var.f;
            if ((rt2Var.h0() || rt2Var.b.c != kx2.c) && !rt2Var.q0()) {
                String str2 = this.e;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "process: updateMessagesStatusesLessEqThan", null);
                }
                r().r(this.b, this.c, wja.DELETED);
            } else {
                String str3 = this.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, "process: chat.isLeaving || chat.isLeft", null);
                }
            }
            pvb pvbVarB = b();
            long j = rt2Var.a;
            long j2 = rt2Var.b.a;
            long j3 = this.c;
            if (pvbVarB.j(j)) {
                pvb.t(pvbVarB, new ux2(pvbVarB.u().a.g(), j, j2, j3, z));
            }
        } else {
            gm0.U(this.e, "delete local chat with serverId = 0");
            njf njfVar = this.a;
            ((js3) (njfVar != null ? njfVar : null).B.getValue()).a(this.b, this.c, false);
        }
        id9 id9VarQ = q();
        r().e(this.b);
        id9VarQ.getClass();
    }
}
