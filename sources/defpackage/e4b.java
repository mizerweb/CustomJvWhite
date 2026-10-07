package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e4b extends kih {
    public final hja c;

    public e4b(hja hjaVar) {
        this.c = hjaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4b) && this.c.equals(((e4b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(reactionInfo=" + this.c + ")";
    }
}
