package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c0i implements e0i {
    public final float a;
    public final long b;

    public c0i(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0i)) {
            return false;
        }
        c0i c0iVar = (c0i) obj;
        return Float.compare(this.a, c0iVar.a) == 0 && this.b == c0iVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InProgress(percent=" + this.a + ", fileSize=" + this.b + ")";
    }
}
