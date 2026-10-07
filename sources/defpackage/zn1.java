package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zn1 extends mk0 {
    public final String b;

    public zn1(String str) {
        super(2);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn1) && cqk.d(this.b, ((zn1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("StartNewCall(link=", this.b, ")");
    }
}
