package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class dy5 {
    public final long a;
    public final long b;
    public final Uri c;

    public dy5(long j, long j2, Uri uri) {
        this.a = j;
        this.b = j2;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy5)) {
            return false;
        }
        dy5 dy5Var = (dy5) obj;
        return this.a == dy5Var.a && this.b == dy5Var.b && cqk.d(this.c, dy5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "EditAndReplyArgs(replyChatId=", ", replyMessageLocalId=");
        sbS.append(this.b);
        sbS.append(", sourceUri=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
