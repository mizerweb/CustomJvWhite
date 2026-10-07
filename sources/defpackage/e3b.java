package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e3b extends kih {
    public final hja c;

    public e3b(hja hjaVar) {
        this.c = hjaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3b) && cqk.d(this.c, ((e3b) obj).c);
    }

    public final int hashCode() {
        hja hjaVar = this.c;
        if (hjaVar == null) {
            return 0;
        }
        return hjaVar.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(reactionInfo=" + this.c + ")";
    }
}
