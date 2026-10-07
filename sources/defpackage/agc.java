package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class agc extends rbb {
    public final long b;
    public final long c;
    public final long d;

    public agc(long j, long j2, long j3) {
        super(sbi.a);
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agc)) {
            return false;
        }
        agc agcVar = (agc) obj;
        return this.b == agcVar.b && this.c == agcVar.c && this.d == agcVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "OpenFinishPollBottomSheet(chatId=", ", messageId=");
        sbS.append(this.c);
        return zo5.k(this.d, ", pollId=", ")", sbS);
    }
}
