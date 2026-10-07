package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class u8e implements y41 {
    public final mdg a;
    public final l31 b = new l31();
    public boolean c;

    public u8e(mdg mdgVar) {
        this.a = mdgVar;
    }

    public final int A() throws EOFException {
        c0(4L);
        int i = this.b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final boolean E(long j) {
        l31 l31Var;
        if (j < 0) {
            c.o(zo5.j(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            ore.k("closed");
            return false;
        }
        do {
            l31Var = this.b;
            if (l31Var.b >= j) {
                return true;
            }
        } while (this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) != -1);
        return false;
    }

    @Override // defpackage.y41
    public final int K0(chc chcVar) throws EOFException {
        l31 l31Var;
        if (this.c) {
            ore.k("closed");
            return 0;
        }
        do {
            l31Var = this.b;
            int iB = b.b(l31Var, chcVar, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                l31Var.skip(chcVar.a[iB].a());
                return iB;
            }
        } while (this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) != -1);
        return -1;
    }

    @Override // defpackage.y41
    public final long N0() throws EOFException {
        l31 l31Var;
        c0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zE = E(i2);
            l31Var = this.b;
            if (!zE) {
                break;
            }
            byte bY = l31Var.y(i);
            if ((bY < 48 || bY > 57) && ((bY < 97 || bY > 102) && (bY < 65 || bY > 70))) {
                if (i != 0) {
                    break;
                }
                tre.M(16);
                tre.M(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bY, 16)));
            }
            i = i2;
        }
        return l31Var.N0();
    }

    @Override // defpackage.y41
    public final InputStream Q0() {
        return new t8e(this);
    }

    @Override // defpackage.y41
    public final String R() {
        return j(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) {
        if (j < 0) {
            c.o(zo5.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ore.k("closed");
            return 0L;
        }
        l31 l31Var2 = this.b;
        if (l31Var2.b == 0 && this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var2) == -1) {
            return -1L;
        }
        return l31Var2.S(Math.min(j, l31Var2.b), l31Var);
    }

    @Override // defpackage.y41
    public final void c0(long j) throws EOFException {
        if (E(j)) {
            return;
        }
        c.n();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        l31 l31Var = this.b;
        l31Var.skip(l31Var.b);
    }

    @Override // defpackage.y41
    public final d71 f0(long j) throws EOFException {
        c0(j);
        return this.b.f0(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.y41
    public final String j(long j) throws EOFException {
        if (j < 0) {
            c.o(zo5.j(j, "limit < 0: "));
            return null;
        }
        long j2 = j == BuildConfig.MAX_TIME_TO_UPLOAD ? Long.MAX_VALUE : j + 1;
        long jY = y((byte) 10, 0L, j2);
        l31 l31Var = this.b;
        if (jY != -1) {
            return b.a(jY, l31Var);
        }
        if (j2 < BuildConfig.MAX_TIME_TO_UPLOAD && E(j2) && l31Var.y(j2 - 1) == 13 && E(j2 + 1) && l31Var.y(j2) == 10) {
            return b.a(j2, l31Var);
        }
        l31 l31Var2 = new l31();
        l31Var.b(l31Var2, 0L, Math.min(32L, l31Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(l31Var.b, j) + " content=" + l31Var2.f0(l31Var2.b).h() + (char) 8230);
    }

    public final boolean l() {
        if (this.c) {
            ore.k("closed");
            return false;
        }
        l31 l31Var = this.b;
        return l31Var.l() && this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1;
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.a.m();
    }

    @Override // defpackage.y41
    public final byte[] n0() {
        mdg mdgVar = this.a;
        l31 l31Var = this.b;
        l31Var.r0(mdgVar);
        return l31Var.I(l31Var.b);
    }

    @Override // defpackage.y41
    public final void q0(long j, l31 l31Var) throws EOFException {
        l31 l31Var2 = this.b;
        try {
            c0(j);
            l31Var2.q0(j, l31Var);
        } catch (EOFException e) {
            l31Var.r0(l31Var2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        l31 l31Var = this.b;
        if (l31Var.b == 0 && this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1) {
            return -1;
        }
        return l31Var.read(byteBuffer);
    }

    @Override // defpackage.y41
    public final byte readByte() {
        c0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.y41
    public final void readFully(byte[] bArr) throws EOFException {
        l31 l31Var = this.b;
        try {
            c0(bArr.length);
            l31Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = l31Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = l31Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.y41
    public final int readInt() throws EOFException {
        c0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.y41
    public final long readLong() throws EOFException {
        c0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.y41
    public final short readShort() throws EOFException {
        c0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.y41
    public final void skip(long j) throws EOFException {
        if (this.c) {
            ore.k("closed");
            return;
        }
        while (j > 0) {
            l31 l31Var = this.b;
            if (l31Var.b == 0 && this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1) {
                c.n();
                return;
            } else {
                long jMin = Math.min(j, l31Var.b);
                l31Var.skip(jMin);
                j -= jMin;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    public final long y(byte b, long j, long j2) {
        if (this.c) {
            ore.k("closed");
            return 0L;
        }
        if (0 > j2) {
            c.o(zo5.j(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            l31 l31Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jA = l31Var.A(b2, jMax, j3);
            if (jA != -1) {
                return jA;
            }
            long j4 = l31Var.b;
            if (j4 >= j3 || this.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // defpackage.y41
    public final String y0(Charset charset) {
        mdg mdgVar = this.a;
        l31 l31Var = this.b;
        l31Var.r0(mdgVar);
        return l31Var.K(l31Var.b, charset);
    }
}
