package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tw9 implements ww9 {
    public final float a;

    public tw9(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw9) && Float.compare(this.a, ((tw9) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SeekProgress(progress=", ")", this.a);
    }
}
