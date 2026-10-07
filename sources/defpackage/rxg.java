package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rxg implements vxg {
    public final u8b a;

    public rxg(u8b u8bVar) {
        this.a = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxg) && cqk.d(this.a, ((rxg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(files=" + this.a + ")";
    }
}
