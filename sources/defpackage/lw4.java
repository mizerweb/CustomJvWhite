package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lw4 implements sw4 {
    public final float a;

    public lw4(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw4) && Float.compare(this.a, ((lw4) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SetCropWheelAngle(angle=", ")", this.a);
    }
}
