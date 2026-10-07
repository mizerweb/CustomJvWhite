package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bfa implements Serializable {
    public final long a;
    public final afa b;

    public bfa(long j, afa afaVar) {
        this.a = j;
        this.b = afaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfa)) {
            return false;
        }
        bfa bfaVar = (bfa) obj;
        return this.a == bfaVar.a && this.b.equals(bfaVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageCommentsInfoUpdate(postId=" + this.a + ", commentsInfo=" + this.b + ")";
    }
}
