package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p54 extends kih {
    public final long c;
    public final List d;

    public p54(long j, List list) {
        this.c = j;
        this.d = list;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbQ = c0a.q(this.d.size(), this.c, "Response(complainSync=", ",complainsSize:");
        sbQ.append(")");
        return sbQ.toString();
    }
}
