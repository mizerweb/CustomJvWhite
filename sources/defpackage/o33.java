package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o33 extends mk0 {
    public final String b;

    public o33(String str) {
        super(3);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o33) && cqk.d(this.b, ((o33) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("ShareLink(link=", this.b, ")");
    }
}
