package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class id6 implements mdg {
    public final mdg a;
    public final long b;
    public long c;
    public boolean d = true;
    public boolean e;
    public boolean f;
    public final /* synthetic */ yf2 g;

    public id6(yf2 yf2Var, mdg mdgVar, long j) {
        this.g = yf2Var;
        this.a = mdgVar;
        this.b = j;
        if (j == 0) {
            y(null);
        }
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws IOException {
        if (this.f) {
            ore.k("closed");
            return 0L;
        }
        try {
            long jS = this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var);
            if (this.d) {
                this.d = false;
            }
            if (jS == -1) {
                y(null);
                return -1L;
            }
            long j2 = this.c + jS;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.c = j2;
                if (j2 == j3) {
                    y(null);
                }
                return jS;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw y(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            l();
            y(null);
        } catch (IOException e) {
            throw y(e);
        }
    }

    public final void l() throws IOException {
        this.a.close();
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.a.m();
    }

    public final String toString() {
        return id6.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException y(IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        if (iOException == null && this.d) {
            this.d = false;
        }
        return this.g.a(true, false, iOException);
    }
}
