package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m0e extends rbb {
    public final o1f b;

    public m0e(o1f o1fVar) {
        super(sbi.a);
        this.b = o1fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0e) && this.b.equals(((m0e) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PopWithResult(result=" + this.b + ")";
    }
}
