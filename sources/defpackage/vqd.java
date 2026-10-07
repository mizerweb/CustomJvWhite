package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class vqd extends erd {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vqd);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
    }

    public final int hashCode() {
        return Integer.hashCode(541065216);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 541065216;
    }

    public final String toString() {
        return c0a.o("InviteLink(itemViewType=", jll.b(541065216), ")");
    }
}
