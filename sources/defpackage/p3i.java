package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p3i extends s3i {
    public final boolean a;
    public final boolean b;

    public p3i(boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        z = (i & 2) != 0 ? false : z;
        this.a = z2;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3i)) {
            return false;
        }
        p3i p3iVar = (p3i) obj;
        return this.a == p3iVar.a && this.b == p3iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Check(ignoreTime=", this.a, ", withInformer=", this.b, ")");
    }
}
