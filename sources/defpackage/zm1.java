package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zm1 extends mk0 {
    public final String b;

    public zm1(String str) {
        super(1);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm1) && cqk.d(this.b, ((zm1) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenActiveCall(action=", this.b, ")");
    }
}
