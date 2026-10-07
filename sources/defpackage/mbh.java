package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mbh {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public mbh(List list, List list2, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbh)) {
            return false;
        }
        mbh mbhVar = (mbh) obj;
        return this.a.equals(mbhVar.a) && cqk.d(this.b, mbhVar.b) && this.c == mbhVar.c && this.d == mbhVar.d && this.e == mbhVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Integer.hashCode(this.e) + zo5.c(this.d, zo5.c(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb.append(this.a);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.b);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.c);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.d);
        sb.append(", maxFpsForAllSizes=");
        return qt4.p(sb, this.e, ')');
    }
}
