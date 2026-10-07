package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class si6 extends rbb {
    public final String b;

    public si6(String str) {
        super(sbi.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si6) && this.b.equals(((si6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("ExternalCallback(params=", this.b, ")");
    }
}
