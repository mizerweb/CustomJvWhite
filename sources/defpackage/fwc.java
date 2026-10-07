package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fwc {
    public final long a;
    public final long b;
    public final m8b c;

    public fwc(long j, long j2, m8b m8bVar) {
        this.a = j;
        this.b = j2;
        this.c = m8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwc)) {
            return false;
        }
        fwc fwcVar = (fwc) obj;
        return this.a == fwcVar.a && this.b == fwcVar.b && this.c.equals(fwcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PhotosUpdate(chatId=", ", messageId=");
        sbS.append(this.b);
        sbS.append(", photoIds=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
