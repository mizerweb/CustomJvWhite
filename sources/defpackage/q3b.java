package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q3b extends kih {
    public final long c;
    public final hm4 d;

    public q3b(long j, hm4 hm4Var) {
        this.c = j;
        this.d = hm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3b)) {
            return false;
        }
        q3b q3bVar = (q3b) obj;
        return this.c == q3bVar.c && this.d.equals(q3bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chatId=" + this.c + ", messages=" + this.d + ")";
    }
}
