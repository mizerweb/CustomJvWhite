package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fla {
    public final long a;
    public final CharSequence b;
    public final lla c;
    public final boolean d;
    public final boolean e;

    public fla(long j, CharSequence charSequence, lla llaVar, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = llaVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fla)) {
            return false;
        }
        fla flaVar = (fla) obj;
        return this.a == flaVar.a && cqk.d(this.b, flaVar.b) && this.c.equals(flaVar.c) && this.d == flaVar.d && this.e == flaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n((this.c.hashCode() + mw7.f(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditMessageData(messageId=");
        sb.append(this.a);
        sb.append(", messageText=");
        sb.append((Object) this.b);
        sb.append(", quoteData=");
        sb.append(this.c);
        sb.append(", hasMediaAttaches=");
        sb.append(this.d);
        return nbh.z(sb, ", shouldInsertOriginalText=", this.e, ")");
    }
}
