package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tfc extends rbb {
    public final String b;

    public tfc(String str) {
        super(sbi.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfc) && this.b.equals(((tfc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenExternalLink(url=", this.b, ")");
    }
}
