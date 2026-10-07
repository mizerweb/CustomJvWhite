package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fgc extends rbb {
    public final long b;
    public final long c;
    public final long d;

    public fgc(long j, long j2, long j3) {
        super(sbi.a);
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgc)) {
            return false;
        }
        fgc fgcVar = (fgc) obj;
        return this.b == fgcVar.b && this.c == fgcVar.c && this.d == fgcVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "OpenPollFinishBottomSheet(chatId=", ", messageId=");
        sbS.append(this.c);
        return zo5.k(this.d, ", pollId=", ")", sbS);
    }
}
