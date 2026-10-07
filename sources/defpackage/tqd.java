package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class tqd extends erd {
    public final long a;

    public tqd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqd) && this.a == ((tqd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // defpackage.k79
    public final int j() {
        return np0.r;
    }

    public final String toString() {
        return nbh.s(this.a, "DebugProfileInfo(id=", ")");
    }
}
