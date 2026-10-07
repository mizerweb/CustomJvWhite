package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class icf extends hcf {
    public final List j;

    public icf(l4e l4eVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(l4eVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.hcf
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.hcf
    public final l4e h(zke zkeVar, long j) {
        return (l4e) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.hcf
    public final boolean i() {
        return true;
    }
}
