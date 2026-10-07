package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jvh {
    public final vnh a;
    public final tnh b;

    public jvh(vnh vnhVar, tnh tnhVar) {
        this.a = vnhVar;
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvh)) {
            return false;
        }
        jvh jvhVar = (jvh) obj;
        return this.a.equals(jvhVar.a) && this.b.equals(jvhVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
