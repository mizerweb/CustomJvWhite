package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class fja implements Serializable {
    public final long a;
    public final dja b;

    public fja(long j, dja djaVar) {
        this.a = j;
        this.b = djaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fja)) {
            return false;
        }
        fja fjaVar = (fja) obj;
        return this.a == fjaVar.a && this.b.equals(fjaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntry(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
