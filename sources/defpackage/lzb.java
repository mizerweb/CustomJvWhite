package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lzb implements hw7 {
    public final long b;
    public final ny8 c;

    public lzb(ny8 ny8Var, long j) {
        this.b = j;
        this.c = ny8Var;
    }

    @Override // defpackage.hw7
    public final long d() {
        return m().b.y;
    }

    @Override // defpackage.hw7
    public final long e() {
        return 0L;
    }

    @Override // defpackage.hw7
    public final String j() {
        fda fdaVar = m().c;
        return "localId:" + (fdaVar != null ? Long.valueOf(fdaVar.a.a) : null) + "|serverId:" + (fdaVar != null ? Long.valueOf(fdaVar.a.b) : null);
    }

    @Override // defpackage.hw7
    public final long k() {
        return m().b.j;
    }

    @Override // defpackage.hw7
    public final List l() {
        return m().b.n.e(mg5.REGULAR);
    }

    public final rt2 m() {
        return (rt2) yab.A0(k66.a, new ur8(this, null, 17));
    }
}
