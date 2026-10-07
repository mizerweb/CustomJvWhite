package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uw9 implements ww9 {
    public final float a;

    public uw9(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw9) && Float.compare(this.a, ((uw9) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SeekStart(progress=", ")", this.a);
    }
}
