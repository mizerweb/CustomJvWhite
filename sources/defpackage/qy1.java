package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qy1 extends ry1 {
    public final vnh F;
    public final wre G;

    public qy1(vnh vnhVar, wre wreVar) {
        this.F = vnhVar;
        this.G = wreVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qy1) {
            qy1 qy1Var = (qy1) obj;
            return this.F.equals(qy1Var.F) && this.G == qy1Var.G;
        }
        return false;
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + (xx1.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowTimerSnackbar(priority=" + xx1.b + ", textSource=" + this.F + ", action=" + this.G + ")";
    }
}
