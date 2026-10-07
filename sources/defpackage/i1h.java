package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i1h implements k1h {
    public final String a;

    public i1h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1h) && cqk.d(this.a, ((i1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Emoji(id=", this.a, ")");
    }
}
