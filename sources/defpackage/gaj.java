package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class gaj extends r97 {
    public final String b;
    public int c;

    public gaj(nf2 nf2Var) {
        super(nf2Var);
        this.b = "virtual-" + nf2Var.g() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.r97, defpackage.nf2
    public final int D(int i) {
        return y1i.k(super.D(i) - this.c);
    }

    @Override // defpackage.r97, defpackage.nf2
    public final int d() {
        return D(0);
    }

    @Override // defpackage.r97, defpackage.nf2
    public final String g() {
        return this.b;
    }
}
