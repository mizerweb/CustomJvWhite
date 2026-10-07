package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bp0 implements k79 {
    public final long a;
    public final List b;

    public bp0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp0)) {
            return false;
        }
        bp0 bp0Var = (bp0) obj;
        return this.a == bp0Var.a && cqk.d(this.b, bp0Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    public final String toString() {
        return "BannerViewPagerListItem(itemId=" + this.a + ", items=" + this.b + ")";
    }
}
