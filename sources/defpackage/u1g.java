package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u1g implements vpa {
    public final List a;
    public final long b;

    public u1g(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g)) {
            return false;
        }
        u1g u1gVar = (u1g) obj;
        return cqk.d(this.a, u1gVar.a) && this.b == u1gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCommentAdminDeleteConfirmation(messageIds=" + this.a + ", authorUserId=" + this.b + ")";
    }
}
