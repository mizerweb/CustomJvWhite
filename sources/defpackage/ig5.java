package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class ig5 implements kag {
    public final s8e a;
    public final Deflater b;
    public boolean c;

    public ig5(l31 l31Var, Deflater deflater) {
        this.a = new s8e(l31Var);
        this.b = deflater;
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) throws IOException {
        gm0.g(l31Var.b, 0L, j);
        while (j > 0) {
            fcf fcfVar = l31Var.a;
            int iMin = (int) Math.min(j, fcfVar.c - fcfVar.b);
            this.b.setInput(fcfVar.a, fcfVar.b, iMin);
            b(false);
            long j2 = iMin;
            l31Var.b -= j2;
            int i = fcfVar.b + iMin;
            fcfVar.b = i;
            if (i == fcfVar.c) {
                l31Var.a = fcfVar.a();
                vcf.a(fcfVar);
            }
            j -= j2;
        }
    }

    public final void b(boolean z) throws IOException {
        fcf fcfVarY;
        int iDeflate;
        s8e s8eVar = this.a;
        l31 l31Var = s8eVar.b;
        while (true) {
            fcfVarY = l31Var.Y(1);
            byte[] bArr = fcfVarY.a;
            int i = fcfVarY.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                fcfVarY.c += iDeflate;
                l31Var.b += (long) iDeflate;
                s8eVar.l();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (fcfVarY.b == fcfVarY.c) {
            l31Var.a = fcfVarY.a();
            vcf.a(fcfVarY);
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        deflater.finish();
        b(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.kag, java.io.Flushable
    public final void flush() throws IOException {
        b(true);
        this.a.flush();
    }

    @Override // defpackage.kag
    public final xsh m() {
        return this.a.a.m();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }
}
