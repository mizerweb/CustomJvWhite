package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class kqd extends erd {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kqd);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public final int hashCode() {
        return Integer.hashCode(262144);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 262144;
    }

    public final String toString() {
        return c0a.o("ChannelStats(itemViewType=", jll.b(262144), ")");
    }
}
