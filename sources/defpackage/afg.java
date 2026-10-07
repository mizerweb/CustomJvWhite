package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afg implements efg {
    public final u8b a;

    public afg(u8b u8bVar) {
        this.a = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afg) && cqk.d(this.a, ((afg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(files=" + this.a + ")";
    }
}
