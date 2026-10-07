package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g50 extends h50 {
    public final long a;
    public final float b;
    public final ynh c;
    public final String d;

    public g50(long j, float f, ynh ynhVar, String str) {
        this.a = j;
        this.b = f;
        this.c = ynhVar;
        this.d = str;
    }

    @Override // defpackage.h50
    public final String a() {
        return this.d;
    }

    @Override // defpackage.h50
    public final long b() {
        return this.a;
    }

    @Override // defpackage.h50
    public final ynh c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return this.a == g50Var.a && Float.compare(this.b, g50Var.b) == 0 && this.c.equals(g50Var.c) && cqk.d(this.d, g50Var.d);
    }

    public final int hashCode() {
        int iH = bc1.h(nbh.m(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c);
        String str = this.d;
        return iH + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ", attachId=" + this.d + ")";
    }
}
