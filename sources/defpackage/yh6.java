package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yh6 implements eme {
    public final jme a;
    public final long b;

    public yh6(jme jmeVar, long j) {
        this.a = jmeVar;
        this.b = j;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yh6) {
            yh6 yh6Var = (yh6) obj;
            return cqk.d(this.a, yh6Var.a) && this.b == yh6Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qt4.g(nbh.n(this.a.hashCode() * 31, 31, false), 31, this.b);
    }

    @Override // defpackage.eme
    public final boolean l() {
        return false;
    }

    @Override // defpackage.eme
    public final int r0() {
        return 0;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.a + ", wasImageCaptured=false, frameNumber=" + ((Object) tc7.a(this.b)) + ", reason=0)";
    }
}
