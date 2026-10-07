package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rj1 extends kih {
    public final List c;
    public final long d;
    public final boolean e;

    public rj1(List list, long j, boolean z) {
        this.c = list;
        this.d = j;
        this.e = z;
    }

    public final List h() {
        return this.c;
    }

    public final long i() {
        return this.d;
    }

    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.z(zo5.x(this.c.size(), this.d, "Response(callHistoryItemsSize=", ",callHistorySync="), ",reset=", this.e, ")");
    }
}
