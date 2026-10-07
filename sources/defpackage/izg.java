package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class izg implements jzg {
    public final float a;

    public izg(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izg) && Float.compare(this.a, ((izg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("Preparing(progress=", ")", this.a);
    }
}
