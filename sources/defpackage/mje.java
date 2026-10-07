package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mje {
    public static final mje c = new mje(0, false);
    public final int a;
    public final boolean b;

    public mje(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mje.class == obj.getClass()) {
            mje mjeVar = (mje) obj;
            if (this.a == mjeVar.a && this.b == mjeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
