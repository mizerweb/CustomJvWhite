package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ew4 implements sw4 {
    public final float a;

    public ew4(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew4) && Float.compare(this.a, ((ew4) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("ChangeAngle(angle=", ")", this.a);
    }
}
