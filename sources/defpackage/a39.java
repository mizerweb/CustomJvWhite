package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a39 extends e39 {
    public final String a;

    public a39(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a39) && this.a.equals(((a39) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenExternalLink(url=", this.a, ")");
    }
}
