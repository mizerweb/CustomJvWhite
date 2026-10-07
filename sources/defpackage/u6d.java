package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u6d extends kjl {
    public final int a;
    public final List b;

    public u6d(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6d)) {
            return false;
        }
        u6d u6dVar = (u6d) obj;
        return this.a == u6dVar.a && this.b.equals(u6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WinnerStack(count=" + this.a + ", avatarInfo=" + this.b + ")";
    }
}
