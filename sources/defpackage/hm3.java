package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hm3 {
    public final boolean a;
    public final List b;

    public hm3(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm3)) {
            return false;
        }
        hm3 hm3Var = (hm3) obj;
        return this.a == hm3Var.a && cqk.d(this.b, hm3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ActionBarState(isVisible=" + this.a + ", actions=" + this.b + ")";
    }

    public /* synthetic */ hm3() {
        this(r66.a, false);
    }
}
