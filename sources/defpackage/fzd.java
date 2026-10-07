package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class fzd {
    public static final ezd Companion = new ezd();
    public final long a;

    public /* synthetic */ fzd(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fzd a(long j) {
        return new fzd(j);
    }

    public static String b(long j) {
        StringBuilder sbS = qt4.s(j, "PushOptions(", "|debug=");
        sbS.append((PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID & j) != 0);
        sbS.append(",notif_disabled=");
        return c0a.p(sbS, (j & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) != 0, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fzd) {
            return this.a == ((fzd) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
