package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e0h implements g0h {
    public final float a;

    public e0h(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0h) && Float.compare(this.a, ((e0h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("Loading(progress=", ")", this.a);
    }
}
