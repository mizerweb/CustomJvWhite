package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class k08 extends h08 {
    public long d;
    public final /* synthetic */ ma e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k08(ma maVar, long j) {
        super(maVar);
        this.e = maVar;
        this.d = j;
        if (j == 0) {
            l();
        }
    }

    @Override // defpackage.h08, defpackage.mdg
    public final long S(long j, l31 l31Var) throws ProtocolException {
        if (this.b) {
            ore.k("closed");
            return 0L;
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jS = super.S(Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_URI), l31Var);
        if (jS == -1) {
            ((c9e) this.e.c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            l();
            throw protocolException;
        }
        long j3 = this.d - jS;
        this.d = j3;
        if (j3 == 0) {
            l();
        }
        return jS;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zU;
        if (this.b) {
            return;
        }
        if (this.d != 0) {
            try {
                zU = uqi.u(this, 100);
            } catch (IOException unused) {
                zU = false;
            }
            if (!zU) {
                ((c9e) this.e.c).k();
                l();
            }
        }
        this.b = true;
    }
}
