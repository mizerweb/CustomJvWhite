package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kfi extends zq0 {
    public final long b;
    public final long c;
    public final boolean d;

    public kfi(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfi)) {
            return false;
        }
        kfi kfiVar = (kfi) obj;
        return this.b == kfiVar.b && this.c == kfiVar.c && this.d == kfiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qt4.g(Long.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "UpdateMessageEvent(chatId=", ", messageId=");
        sbS.append(this.c);
        sbS.append(", reactionsChanged=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}
