package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m53 {
    public static final m53 c = new m53(3, 0, null);
    public final List a;
    public final int b;

    public /* synthetic */ m53(int i, int i2, List list) {
        this(-1, (i & 1) != 0 ? r66.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m53)) {
            return false;
        }
        m53 m53Var = (m53) obj;
        return cqk.d(this.a, m53Var.a) && this.b == m53Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaState(items=" + this.a + ", initialPosition=" + this.b + ")";
    }

    public m53(int i, List list) {
        this.a = list;
        this.b = i;
    }
}
