package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class amd extends cmd {
    public final long b;
    public final int c;

    public amd(long j, int i) {
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amd)) {
            return false;
        }
        amd amdVar = (amd) obj;
        return this.b == amdVar.b && this.c == amdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (((Long.hashCode(this.b) * 31) + 3052376) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.c, this.b, "ShowQrCode(id=", ", type=chat, qrCodeHeight=");
        sbQ.append(")");
        return sbQ.toString();
    }
}
