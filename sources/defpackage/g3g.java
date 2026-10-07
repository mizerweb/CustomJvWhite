package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g3g implements vpa {
    public final long a;
    public final List b;

    public g3g(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3g)) {
            return false;
        }
        g3g g3gVar = (g3g) obj;
        return this.a == g3gVar.a && cqk.d(this.b, g3gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShowReactions(messageId=" + this.a + ", reactions=" + this.b + ")";
    }
}
