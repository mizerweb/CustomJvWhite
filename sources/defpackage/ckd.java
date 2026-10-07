package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ckd {
    public final long a;
    public final List b;

    public ckd(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        return ((long) ((this.b.hashCode() * 31) + Long.hashCode(j))) | Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckd)) {
            return false;
        }
        ckd ckdVar = (ckd) obj;
        return this.a == ckdVar.a && cqk.d(this.b, ckdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProfileAvatarModel(id=" + this.a + ", urls=" + this.b + ")";
    }
}
