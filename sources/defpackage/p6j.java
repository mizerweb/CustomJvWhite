package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p6j {
    public final int a;
    public final boolean b;

    public p6j(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6j)) {
            return false;
        }
        p6j p6jVar = (p6j) obj;
        return this.a == p6jVar.a && this.b == p6jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VideoWebViewState(orientation=" + this.a + ", isFullScreen=" + this.b + ")";
    }
}
