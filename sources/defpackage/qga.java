package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qga implements sga {
    public final long a;
    public final m8b b;

    public qga(long j, m8b m8bVar) {
        this.a = j;
        this.b = m8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qga)) {
            return false;
        }
        qga qgaVar = (qga) obj;
        return this.a == qgaVar.a && this.b.equals(qgaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Update(chatId=" + this.a + ", messageIds=" + this.b + ")";
    }
}
