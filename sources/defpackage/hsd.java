package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hsd extends mk0 {
    public final long b;
    public final kmd c;

    public hsd(long j, kmd kmdVar) {
        super(14);
        this.b = j;
        this.c = kmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsd)) {
            return false;
        }
        hsd hsdVar = (hsd) obj;
        return this.b == hsdVar.b && this.c == hsdVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
