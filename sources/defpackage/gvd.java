package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gvd implements jz4 {
    public final float a;

    public gvd(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvd) && Float.compare(this.a, ((gvd) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("ProgressDiffForNotify(value=", ")", this.a);
    }
}
