package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class apj extends rbb {
    public final i65 b;

    public apj(i65 i65Var) {
        super(sbi.a);
        this.b = i65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apj) && this.b == ((apj) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenAndClose(linkEvent=" + this.b + ")";
    }
}
