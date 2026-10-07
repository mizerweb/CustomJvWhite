package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class b83 implements vnd {
    public final String a;
    public final tnh b;
    public final sx3 c;
    public final int d;

    public b83(String str, tnh tnhVar, sx3 sx3Var, int i) {
        this.a = str;
        this.b = tnhVar;
        this.c = sx3Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b83)) {
            return false;
        }
        b83 b83Var = (b83) obj;
        return cqk.d(this.a, b83Var.a) && this.b.equals(b83Var.b) && cqk.d(this.c, b83Var.c) && this.d == b83Var.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_URI == k79Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iC = zo5.c(this.b.c, (str == null ? 0 : str.hashCode()) * 31, 31);
        sx3 sx3Var = this.c;
        return Integer.hashCode(this.d) + ((iC + (sx3Var != null ? sx3Var.a.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 131072;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (k79Var instanceof b83) {
            return new hod(((b83) k79Var).c);
        }
        return null;
    }

    public final String toString() {
        return "ChatNameItem(text=" + this.a + ", hintText=" + this.b + ", errorText=" + this.c + ", limitCharacters=" + this.d + ")";
    }
}
