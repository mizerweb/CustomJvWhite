package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gr8 implements jr8 {
    public final List a;
    public final boolean b;

    public gr8(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr8)) {
            return false;
        }
        gr8 gr8Var = (gr8) obj;
        return cqk.d(this.a, gr8Var.a) && this.b == gr8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(items=" + this.a + ", canLoadMore=" + this.b + ")";
    }
}
