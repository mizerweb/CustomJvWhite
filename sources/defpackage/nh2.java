package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nh2 extends jh2 {
    public final ne2 a;

    public nh2(ne2 ne2Var) {
        this.a = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh2) && cqk.d(this.a, ((nh2) obj).a);
    }

    public final int hashCode() {
        ne2 ne2Var = this.a;
        if (ne2Var == null) {
            return 0;
        }
        return Integer.hashCode(ne2Var.a);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.a + ')';
    }
}
