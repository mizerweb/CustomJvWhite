package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hqa implements iqa {
    public final long a;
    public final List b;

    public hqa(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqa)) {
            return false;
        }
        hqa hqaVar = (hqa) obj;
        return this.a == hqaVar.a && this.b.equals(hqaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShowReactions(messageId=" + this.a + ", reactions=" + this.b + ")";
    }
}
