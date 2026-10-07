package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yq9 implements cr9 {
    public final jef a;
    public final int b;

    public yq9(jef jefVar, int i) {
        this.a = jefVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq9)) {
            return false;
        }
        yq9 yq9Var = (yq9) obj;
        return cqk.d(this.a, yq9Var.a) && this.b == yq9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
