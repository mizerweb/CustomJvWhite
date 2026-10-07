package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wne {
    public final CharSequence a;
    public final Long b;
    public final Long c;

    public wne(CharSequence charSequence, Long l, Long l2) {
        this.a = charSequence;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wne)) {
            return false;
        }
        wne wneVar = (wne) obj;
        return cqk.d(this.a, wneVar.a) && cqk.d(this.b, wneVar.b) && cqk.d(this.c, wneVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Result(text=" + ((Object) this.a) + ", editMsgId=" + this.b + ", replyMsgId=" + this.c + ")";
    }
}
