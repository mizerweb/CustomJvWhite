package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class r30 implements mdg {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ r30(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws IOException {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tcg tcgVar = (tcg) obj;
                r30 r30Var = (r30) obj2;
                tcgVar.i();
                try {
                    try {
                        long jS = r30Var.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var);
                        if (tcgVar.j()) {
                            throw tcgVar.l(null);
                        }
                        return jS;
                    } catch (IOException e) {
                        if (tcgVar.j()) {
                            throw tcgVar.l(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    tcgVar.j();
                    throw th;
                }
            default:
                try {
                    ((xsh) obj2).f();
                    fcf fcfVarY = l31Var.Y(1);
                    int i2 = ((InputStream) obj).read(fcfVarY.a, fcfVarY.c, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_URI, 8192 - fcfVarY.c));
                    if (i2 == -1) {
                        if (fcfVarY.b == fcfVarY.c) {
                            l31Var.a = fcfVarY.a();
                            vcf.a(fcfVarY);
                        }
                        return -1L;
                    }
                    fcfVarY.c += i2;
                    long j2 = i2;
                    l31Var.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    Logger logger = xsb.a;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? r5h.L0(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tcg tcgVar = (tcg) obj;
                r30 r30Var = (r30) this.c;
                tcgVar.i();
                try {
                    try {
                        r30Var.close();
                        if (tcgVar.j()) {
                            throw tcgVar.l(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!tcgVar.j()) {
                            throw e;
                        }
                        throw tcgVar.l(e);
                    }
                } catch (Throwable th) {
                    tcgVar.j();
                    throw th;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.mdg
    public final xsh m() {
        switch (this.a) {
            case 0:
                return (tcg) this.b;
            default:
                return (xsh) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((r30) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
