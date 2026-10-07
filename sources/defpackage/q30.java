package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class q30 implements kag {
    public final /* synthetic */ int a = 1;
    public final tcg b;
    public final Object c;

    public q30(OutputStream outputStream, tcg tcgVar) {
        this.c = outputStream;
        this.b = tcgVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b A[LOOP:1: B:12:0x005e->B:25:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d A[SYNTHETIC] */
    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) throws IOException {
        long j2;
        int i = this.a;
        Object obj = this.c;
        tcg tcgVar = this.b;
        switch (i) {
            case 0:
                gm0.g(l31Var.b, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    fcf fcfVar = l31Var.a;
                    j2 = 0;
                    try {
                        try {
                            while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                                j2 += (long) (fcfVar.c - fcfVar.b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    q30 q30Var = (q30) obj;
                                    tcgVar.i();
                                    q30Var.X(j2, l31Var);
                                    if (!tcgVar.j()) {
                                        throw tcgVar.l(null);
                                    }
                                } else {
                                    fcfVar = fcfVar.f;
                                }
                            }
                            q30Var.X(j2, l31Var);
                            if (!tcgVar.j()) {
                                throw tcgVar.l(null);
                            }
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
                    q30 q30Var2 = (q30) obj;
                    tcgVar.i();
                }
                return;
            default:
                gm0.g(l31Var.b, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    tcgVar.f();
                    fcf fcfVar2 = l31Var.a;
                    int iMin = (int) Math.min(j4, fcfVar2.c - fcfVar2.b);
                    ((OutputStream) obj).write(fcfVar2.a, fcfVar2.b, iMin);
                    int i2 = fcfVar2.b + iMin;
                    fcfVar2.b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    l31Var.b -= j5;
                    if (i2 == fcfVar2.c) {
                        l31Var.a = fcfVar2.a();
                        vcf.a(fcfVar2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                q30 q30Var = (q30) obj;
                tcg tcgVar = this.b;
                tcgVar.i();
                try {
                    try {
                        q30Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.kag, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                q30 q30Var = (q30) obj;
                tcg tcgVar = this.b;
                tcgVar.i();
                try {
                    try {
                        q30Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.kag
    public final xsh m() {
        int i = this.a;
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return "AsyncTimeout.sink(" + ((q30) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public q30(tcg tcgVar, q30 q30Var) {
        this.b = tcgVar;
        this.c = q30Var;
    }
}
