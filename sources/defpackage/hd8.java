package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class hd8 implements mdg {
    public final u8e a;
    public final Inflater b;
    public int c;
    public boolean d;

    public hd8(u8e u8eVar, Inflater inflater) {
        this.a = u8eVar;
        this.b = inflater;
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws IOException {
        do {
            long jB = b(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.l());
        throw new EOFException("source exhausted prematurely");
    }

    public final long b(long j, l31 l31Var) throws IOException {
        Inflater inflater = this.b;
        if (j < 0) {
            c.o(zo5.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            ore.k("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                fcf fcfVarY = l31Var.Y(1);
                int iMin = (int) Math.min(j, 8192 - fcfVarY.c);
                boolean zNeedsInput = inflater.needsInput();
                u8e u8eVar = this.a;
                if (zNeedsInput && !u8eVar.l()) {
                    fcf fcfVar = u8eVar.b.a;
                    int i = fcfVar.c;
                    int i2 = fcfVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(fcfVar.a, i2, i3);
                }
                int iInflate = inflater.inflate(fcfVarY.a, fcfVarY.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    u8eVar.skip(remaining);
                }
                if (iInflate > 0) {
                    fcfVarY.c += iInflate;
                    long j2 = iInflate;
                    l31Var.b += j2;
                    return j2;
                }
                if (fcfVarY.b == fcfVarY.c) {
                    l31Var.a = fcfVarY.a();
                    vcf.a(fcfVarY);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.a.a.m();
    }
}
