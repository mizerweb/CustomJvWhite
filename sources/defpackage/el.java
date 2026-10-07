package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class el extends il {
    public final float a;

    public el(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el) && Float.compare(this.a, ((el) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("FloatNumber(value=", ")", this.a);
    }
}
