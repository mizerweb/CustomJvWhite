package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eb4 extends mk0 {
    public final i65 b;

    public eb4(i65 i65Var) {
        super(6);
        this.b = i65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb4) && this.b == ((eb4) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TwoFACheckPassword(twoFALink=" + this.b + ")";
    }
}
