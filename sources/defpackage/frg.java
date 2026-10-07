package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class frg extends kih {
    public final gyg c;

    public frg(gyg gygVar) {
        this.c = gygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frg) && this.c.equals(((frg) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(story=" + this.c + ")";
    }
}
