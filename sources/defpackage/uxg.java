package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxg implements vxg {
    public final float a;

    public uxg(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxg) && Float.compare(this.a, ((uxg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("Progress(fraction=", ")", this.a);
    }
}
