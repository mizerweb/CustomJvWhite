package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ofc extends rbb {
    public final long b;
    public final boolean c;
    public final String d;

    public ofc(long j, String str, boolean z) {
        super(sbi.a);
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofc)) {
            return false;
        }
        ofc ofcVar = (ofc) obj;
        return this.b == ofcVar.b && this.c == ofcVar.c && cqk.d(this.d, ofcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nbh.n(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return qt4.q(qt4.u(this.b, "OpenChatCall(chatId=", ", isVideo=", this.c), ", link=", this.d, ")");
    }
}
