package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wrd extends mk0 {
    public final String b;

    public wrd(String str) {
        super(14);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrd) && this.b.equals(((wrd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("CallByNumber(phone=", this.b, ")");
    }
}
