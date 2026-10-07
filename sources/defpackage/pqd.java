package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class pqd extends rqd {
    public final int a;

    public pqd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqd) && this.a == ((pqd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.a;
    }

    public final String toString() {
        return c0a.o("Loading(itemViewType=", jll.b(this.a), ")");
    }
}
