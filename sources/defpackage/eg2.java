package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eg2 {
    public final int a;

    public eg2(int i) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg2) && this.a == ((eg2) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        return "CameraParams(facing=" + bc1.x(this.a) + ")";
    }
}
