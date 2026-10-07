package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zv7 {
    public final long a;
    public final List b;

    public zv7(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv7)) {
            return false;
        }
        zv7 zv7Var = (zv7) obj;
        return this.a == zv7Var.a && cqk.d(this.b, zv7Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "HighlightTextState(messageLocalId=" + this.a + ", highlights=" + this.b + ")";
    }
}
