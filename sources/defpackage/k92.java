package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k92 {
    public final List a;
    public final boolean b;

    public k92(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k92)) {
            return false;
        }
        k92 k92Var = (k92) obj;
        return cqk.d(this.a, k92Var.a) && this.b == k92Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallsHistoryState(tabs=" + this.a + ", isBannerVisible=" + this.b + ")";
    }
}
