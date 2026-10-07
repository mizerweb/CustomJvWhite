package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class an1 extends mk0 {
    public final be1 b;
    public final boolean c;
    public final String d;

    public an1(be1 be1Var, boolean z, String str) {
        super(1);
        this.b = be1Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return cqk.d(this.b, an1Var.b) && this.c == an1Var.c && cqk.d(this.d, an1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nbh.n(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenIncomingCall(chatInfo=");
        sb.append(this.b);
        sb.append(", isVideo=");
        sb.append(this.c);
        sb.append(", sessionId=");
        return zo5.w(sb, this.d, ")");
    }
}
