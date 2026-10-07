package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a81 {
    public final long a;
    public final ArrayList b;

    public a81(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a81)) {
            return false;
        }
        a81 a81Var = (a81) obj;
        return this.a == a81Var.a && this.b.equals(a81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CacheState(totalSizeBytes=" + this.a + ", items=" + this.b + ")";
    }
}
