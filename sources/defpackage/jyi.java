package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jyi implements lyi {
    public final float a;

    public jyi(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyi) && Float.compare(this.a, ((jyi) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SeekProgress(progress=", ")", this.a);
    }
}
