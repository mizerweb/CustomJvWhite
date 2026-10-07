package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wn6 {
    public final ilb a;
    public final long b;

    public wn6(ilb ilbVar, long j) {
        this.a = ilbVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn6)) {
            return false;
        }
        wn6 wn6Var = (wn6) obj;
        return this.a.equals(wn6Var.a) && this.b == wn6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FcmMessageRemovedData(chatRef=" + this.a + ", messageId=" + this.b + ")";
    }
}
