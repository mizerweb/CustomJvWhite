package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lgc extends rbb {
    public final long b;
    public final long c;
    public final String d;

    public lgc(long j, long j2, String str) {
        super(sbi.a);
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgc)) {
            return false;
        }
        lgc lgcVar = (lgc) obj;
        return this.b == lgcVar.b && this.c == lgcVar.c && cqk.d(this.d, lgcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qt4.g(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "OpenVideoWebView(chatId=", ", messageId=");
        qv1.s(this.c, ", videoUrl=", this.d, sbS);
        sbS.append(")");
        return sbS.toString();
    }
}
