package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qx9 extends prk {
    public final boolean a;

    public qx9(boolean z) {
        this.a = z;
    }

    @Override // defpackage.prk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.prk
    public final void c(nv4 nv4Var) {
        nv4Var.invoke("type=Keep.H264");
        nv4Var.invoke("fast_transform_requested=" + this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx9) && this.a == ((qx9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("H264(isFastTransformRequested=", ")", this.a);
    }
}
