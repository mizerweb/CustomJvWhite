package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y2i extends u2i {
    public final /* synthetic */ int a;
    public final r2i b;

    public /* synthetic */ y2i(r2i r2iVar, int i) {
        this.a = i;
        this.b = r2iVar;
    }

    @Override // defpackage.u2i, defpackage.q2i
    public void a(r2i r2iVar) {
        switch (this.a) {
            case 1:
                z2i z2iVar = (z2i) this.b;
                if (!z2iVar.G) {
                    z2iVar.M();
                    z2iVar.G = true;
                }
                break;
        }
    }

    @Override // defpackage.u2i, defpackage.q2i
    public void c(r2i r2iVar) {
        int i = this.a;
        r2i r2iVar2 = this.b;
        switch (i) {
            case 1:
                z2i z2iVar = (z2i) r2iVar2;
                int i2 = z2iVar.F - 1;
                z2iVar.F = i2;
                if (i2 == 0) {
                    z2iVar.G = false;
                    z2iVar.n();
                }
                r2iVar.B(this);
                break;
            case 2:
                r2iVar2.E();
                r2iVar.B(this);
                break;
        }
    }

    @Override // defpackage.u2i, defpackage.q2i
    public void e(r2i r2iVar) {
        switch (this.a) {
            case 0:
                z2i z2iVar = (z2i) this.b;
                z2iVar.D.remove(r2iVar);
                if (!z2iVar.u()) {
                    z2iVar.y(z2iVar, dzh.d, false);
                    z2iVar.r = true;
                    z2iVar.y(z2iVar, dzh.c, false);
                }
                break;
        }
    }
}
