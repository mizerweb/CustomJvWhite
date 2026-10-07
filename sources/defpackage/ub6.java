package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ub6 implements bc6 {
    public final float a;

    public ub6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub6) && Float.compare(this.a, ((ub6) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SetPlaybackSpeed(speed=", ")", this.a);
    }
}
