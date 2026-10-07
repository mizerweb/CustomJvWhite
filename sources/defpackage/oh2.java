package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oh2 extends jh2 {
    public final le2 a;

    public oh2(le2 le2Var) {
        this.a = le2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh2) && this.a.equals(((oh2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.a + ')';
    }
}
