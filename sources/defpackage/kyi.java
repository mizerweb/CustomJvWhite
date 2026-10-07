package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kyi implements lyi {
    public final float a;

    public kyi(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyi) && Float.compare(this.a, ((kyi) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SeekStart(progress=", ")", this.a);
    }
}
