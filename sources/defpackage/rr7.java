package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class rr7 implements mdg {
    public byte a;
    public final u8e b;
    public final Inflater c;
    public final hd8 d;
    public final CRC32 e;

    public rr7(mdg mdgVar) {
        u8e u8eVar = new u8e(mdgVar);
        this.b = u8eVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new hd8(u8eVar, inflater);
        this.e = new CRC32();
    }

    public static void b(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws IOException {
        long j2;
        rr7 rr7Var = this;
        byte b = rr7Var.a;
        CRC32 crc32 = rr7Var.e;
        u8e u8eVar = rr7Var.b;
        if (b == 0) {
            u8eVar.c0(10L);
            l31 l31Var2 = u8eVar.b;
            byte bY = l31Var2.y(3L);
            boolean z = ((bY >> 1) & 1) == 1;
            if (z) {
                rr7Var.g(l31Var2, 0L, 10L);
            }
            b(8075, u8eVar.readShort(), "ID1ID2");
            u8eVar.skip(8L);
            if (((bY >> 2) & 1) == 1) {
                u8eVar.c0(2L);
                if (z) {
                    g(l31Var2, 0L, 2L);
                }
                short s = l31Var2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                u8eVar.c0(j3);
                if (z) {
                    g(l31Var2, 0L, j3);
                }
                u8eVar.skip(j3);
            }
            if (((bY >> 3) & 1) == 1) {
                long jY = u8eVar.y((byte) 0, 0L, BuildConfig.MAX_TIME_TO_UPLOAD);
                if (jY == -1) {
                    c.n();
                    return 0L;
                }
                if (z) {
                    j2 = 2;
                    g(l31Var2, 0L, jY + 1);
                } else {
                    j2 = 2;
                }
                u8eVar.skip(jY + 1);
            } else {
                j2 = 2;
            }
            if (((bY >> 4) & 1) == 1) {
                j2 = j2;
                long jY2 = u8eVar.y((byte) 0, 0L, BuildConfig.MAX_TIME_TO_UPLOAD);
                if (jY2 == -1) {
                    c.n();
                    return 0L;
                }
                if (z) {
                    rr7Var = this;
                    rr7Var.g(l31Var2, 0L, jY2 + 1);
                } else {
                    rr7Var = this;
                }
                u8eVar.skip(jY2 + 1);
            } else {
                rr7Var = this;
            }
            if (z) {
                u8eVar.c0(j2);
                short s2 = l31Var2.readShort();
                b((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            rr7Var.a = (byte) 1;
        }
        if (rr7Var.a == 1) {
            long j4 = l31Var.b;
            long jS = rr7Var.d.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var);
            if (jS != -1) {
                rr7Var.g(l31Var, j4, jS);
                return jS;
            }
            rr7Var.a = (byte) 2;
        }
        if (rr7Var.a == 2) {
            b(u8eVar.A(), (int) crc32.getValue(), "CRC");
            b(u8eVar.A(), (int) rr7Var.c.getBytesWritten(), "ISIZE");
            rr7Var.a = (byte) 3;
            if (!u8eVar.l()) {
                qr7.k("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final void g(l31 l31Var, long j, long j2) {
        fcf fcfVar = l31Var.a;
        while (true) {
            int i = fcfVar.c;
            int i2 = fcfVar.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            fcfVar = fcfVar.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) fcfVar.b) + j);
            int iMin = (int) Math.min(fcfVar.c - i3, j2);
            this.e.update(fcfVar.a, i3, iMin);
            j2 -= (long) iMin;
            fcfVar = fcfVar.f;
            j = 0;
        }
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.b.a.m();
    }
}
