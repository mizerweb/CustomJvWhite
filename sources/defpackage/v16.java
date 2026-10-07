package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v16 implements x16 {
    public final float a;

    public v16(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v16) && Float.compare(this.a, ((v16) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("SeekStart(progress=", ")", this.a);
    }
}
