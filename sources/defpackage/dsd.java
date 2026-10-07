package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dsd extends mk0 {
    public final String b;

    public dsd(String str) {
        super(14);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsd) && this.b.equals(((dsd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("ExternalCallback(params=", this.b, ")");
    }
}
