package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qk1 extends uk1 {
    public final Long b;
    public final String c;
    public final CharSequence d;

    public qk1(CharSequence charSequence, Long l, String str) {
        this.b = l;
        this.c = str;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk1)) {
            return false;
        }
        qk1 qk1Var = (qk1) obj;
        return cqk.d(this.b, qk1Var.b) && this.c.equals(qk1Var.c) && cqk.d(this.d, qk1Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true) * 31;
        Long l = this.b;
        int iD = zo5.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return iD + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "OpenCallDetail(isLinkCall=true, chatServerId=" + this.b + ", link=" + this.c + ", chatName=" + ((Object) this.d) + ")";
    }
}
