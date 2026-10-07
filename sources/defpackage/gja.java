package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gja {
    public final long a;
    public final s5e b;

    public gja(long j, s5e s5eVar) {
        this.a = j;
        this.b = s5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gja)) {
            return false;
        }
        gja gjaVar = (gja) obj;
        return this.a == gjaVar.a && this.b.equals(gjaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + ((Object) this.b) + ")";
    }
}
