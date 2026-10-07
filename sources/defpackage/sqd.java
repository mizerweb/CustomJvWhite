package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class sqd extends erd {
    public final CharSequence a;
    public final tnh b;
    public final int c;
    public final int d;

    public sqd(CharSequence charSequence, tnh tnhVar, int i) {
        this.a = charSequence;
        this.b = tnhVar;
        this.c = i;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqd)) {
            return false;
        }
        sqd sqdVar = (sqd) obj;
        return cqk.d(this.a, sqdVar.a) && this.b.equals(sqdVar.b) && this.c == sqdVar.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b.c, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.d;
    }

    public final String toString() {
        String strB = jll.b(this.c);
        StringBuilder sb = new StringBuilder("ContactDescription(text=");
        sb.append((Object) this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", itemViewType=");
        return zo5.w(sb, strB, ")");
    }
}
