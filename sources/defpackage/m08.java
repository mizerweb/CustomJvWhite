package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class m08 extends h08 {
    public boolean d;

    public m08(ma maVar) {
        super(maVar);
    }

    @Override // defpackage.h08, defpackage.mdg
    public final long S(long j, l31 l31Var) {
        if (this.b) {
            ore.k("closed");
            return 0L;
        }
        if (this.d) {
            return -1L;
        }
        long jS = super.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var);
        if (jS != -1) {
            return jS;
        }
        this.d = true;
        l();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
            l();
        }
        this.b = true;
    }
}
