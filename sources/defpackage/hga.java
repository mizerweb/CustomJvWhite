package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hga implements sga {
    public final long a;
    public final m8b b;
    public final boolean c;

    public hga(long j, m8b m8bVar, boolean z) {
        this.a = j;
        this.b = m8bVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hga)) {
            return false;
        }
        hga hgaVar = (hga) obj;
        return this.a == hgaVar.a && this.b.equals(hgaVar.b) && this.c == hgaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Add(chatId=");
        sb.append(this.a);
        sb.append(", messageIds=");
        sb.append(this.b);
        return nbh.z(sb, ", isSelf=", this.c, ")");
    }
}
