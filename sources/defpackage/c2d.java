package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class c2d implements vnd {
    public final tnh a;

    public c2d(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2d) && this.a.equals(((c2d) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH == k79Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (Integer.hashCode(this.a.c) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return -2147418112;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (k79Var instanceof h1g) {
            return new kod(((h1g) k79Var).a);
        }
        return null;
    }

    public final String toString() {
        return x05.g("PlaceholderItem(text=", this.a, ", viewType=-2147418112)");
    }
}
