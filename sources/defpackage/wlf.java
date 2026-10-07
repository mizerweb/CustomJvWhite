package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wlf extends mjf {
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public wlf(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    @Override // defpackage.mjf
    public final void B() {
        qfa qfaVarR = r();
        qfaVarR.getClass();
        long j = this.d;
        Long lValueOf = Long.valueOf(j);
        boolean z = this.e;
        gm0.m("qfa", "updateDelayedAttrs %d, %b", lValueOf, Boolean.valueOf(z));
        uoa uoaVarC = qfaVarR.b.c();
        Long lValueOf2 = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z);
        rre rreVar = ((toa) ((ose) uoaVarC).h()).a;
        long j2 = this.c;
        ch3.G(rreVar, false, true, new t14(lValueOf2, boolValueOf, j2, 4));
        qfaVarR.f.g.remove(Long.valueOf(j2));
        r().p(r().l(j2), xfa.SENDING);
        dfi dfiVar = new dfi(((s7f) m()).g(), this.b, this.c, this.d, this.e);
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        ((sih) njfVar.j.getValue()).c(dfiVar, (12 & 2) != 0 ? false : true, 0L, (12 & 8) == 0 ? 1 : 0);
        njf njfVar2 = this.a;
        ((t51) (njfVar2 != null ? njfVar2 : null).d.getValue()).c(new kfi(this.b, this.c, false));
    }
}
