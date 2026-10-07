package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k33 extends mk0 {
    public final String b;

    public k33(String str) {
        super(3);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k33) && cqk.d(this.b, ((k33) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenLink(attachUrl=", this.b, ")");
    }
}
