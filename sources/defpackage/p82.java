package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p82 implements axd {
    public final /* synthetic */ w82 a;

    public p82(w82 w82Var) {
        this.a = w82Var;
    }

    @Override // defpackage.axd
    public final void a() {
        w82 w82Var = this.a;
        bxd bxdVar = w82Var.f;
        r8e r8eVar = w82Var.t;
        mjg mjgVar = w82Var.m;
        tmc me2 = ((x02) mjgVar.getValue()).getParticipants().getMe();
        boolean z = false;
        boolean z2 = ((ac1) w82Var.b).a().a == 2;
        boolean zC = w82Var.e.c();
        boolean z3 = ((dz4) ((x02) mjgVar.getValue()).z().getValue()).i || ((enc) ((x02) mjgVar.getValue()).getParticipants().a().getValue()).h;
        if (((t4f) r8eVar.a.getValue()).a == u4f.a) {
            m4f m4fVar = ((t4f) r8eVar.a.getValue()).b;
            if (cqk.d(m4fVar != null ? m4fVar.c : null, me2.a.getId()) || me2.a.j()) {
                z = true;
            }
        }
        if (z3 || z2 || zC || z) {
            bxdVar.d();
        } else {
            bxdVar.c();
        }
    }

    @Override // defpackage.axd
    public final void b() {
        this.a.f.d();
    }
}
