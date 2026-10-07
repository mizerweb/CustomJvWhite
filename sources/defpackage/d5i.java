package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class d5i extends aq0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.aq0
    public final cb0 a(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!vqi.O(cb0Var.c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? cb0.e : cb0Var;
    }

    @Override // defpackage.aq0
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.aq0, defpackage.fb0
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // defpackage.aq0, defpackage.fb0
    public final ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferL = l(length);
        int iJ = vqi.j(length, 0, this.n);
        byteBufferL.put(this.m, 0, iJ);
        int iJ2 = vqi.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferL.flip();
    }

    @Override // defpackage.fb0
    public final long i(long j) {
        return Math.max(0L, j - vqi.g0(this.b.a, this.j + this.i));
    }

    @Override // defpackage.aq0
    public final void j() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.aq0
    public final void k() {
        this.m = vqi.b;
    }
}
