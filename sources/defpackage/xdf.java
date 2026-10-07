package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class xdf implements vnd {
    public final int a;
    public final boolean b;
    public final tnh c;
    public final tnh d;
    public final int e;

    public xdf(int i, boolean z, tnh tnhVar, tnh tnhVar2, int i2) {
        this.a = i;
        this.b = z;
        this.c = tnhVar;
        this.d = tnhVar2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdf)) {
            return false;
        }
        xdf xdfVar = (xdf) obj;
        return this.a == xdfVar.a && this.b == xdfVar.b && this.c.equals(xdfVar.c) && this.d.equals(xdfVar.d) && this.e == xdfVar.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_URI;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return PlaybackStateCompat.ACTION_PLAY_FROM_URI == k79Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(this.d.c, zo5.c(this.c.c, nbh.n(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableItem(valueId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", viewType=");
        return zo5.t(sb, this.e, ")");
    }
}
