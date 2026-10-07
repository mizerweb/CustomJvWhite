package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 {
    public final int a;
    public final boolean b;
    public final CharSequence c;

    public ru2(int i, CharSequence charSequence, boolean z) {
        this.a = i;
        this.b = z;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru2)) {
            return false;
        }
        ru2 ru2Var = (ru2) obj;
        return this.a == ru2Var.a && this.b == ru2Var.b && cqk.d(this.c, ru2Var.c);
    }

    public final int hashCode() {
        int iN = nbh.n(Integer.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return iN + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Payload(notificationsCount=" + this.a + ", hasReplyMentionOrReaction=" + this.b + ", buttonText=" + ((Object) this.c) + ")";
    }
}
