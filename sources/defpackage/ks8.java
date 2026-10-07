package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ks8 extends ms8 {
    public final ns8 d;

    public ks8(ns8 ns8Var) {
        super("client", 1, ns8Var);
        this.d = ns8Var;
    }

    @Override // defpackage.ms8
    public final ns8 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks8) && this.d.equals(((ks8) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
