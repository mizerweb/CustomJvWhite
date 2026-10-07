package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v3b extends kih {
    public final u8b c;

    public v3b(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3b) && cqk.d(this.c, ((v3b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(polls=" + this.c + ")";
    }
}
