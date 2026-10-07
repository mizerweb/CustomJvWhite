package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class isd extends mk0 {
    public final String b;

    public isd(String str) {
        super(14);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isd) && this.b.equals(((isd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenExternalLink(link=", this.b, ")");
    }
}
