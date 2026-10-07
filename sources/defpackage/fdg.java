package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class fdg implements fb0 {
    public final boolean b;
    public int c;
    public float d = 1.0f;
    public float e = 1.0f;
    public cb0 f;
    public cb0 g;
    public cb0 h;
    public cb0 i;
    public boolean j;
    public edg k;
    public ByteBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public fdg(boolean z) {
        cb0 cb0Var = cb0.e;
        this.f = cb0Var;
        this.g = cb0Var;
        this.h = cb0Var;
        this.i = cb0Var;
        ByteBuffer byteBuffer = fb0.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.b = z;
    }

    public final long a(long j) {
        if (this.o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / ((double) this.d));
        }
        long j2 = this.n;
        edg edgVar = this.k;
        edgVar.getClass();
        long jE = j2 - ((long) edgVar.e());
        int i = this.i.a;
        int i2 = this.h.a;
        long j3 = this.o;
        return i == i2 ? vqi.i0(j, j3, jE, RoundingMode.DOWN) : vqi.i0(j, j3 * ((long) i2), jE * ((long) i), RoundingMode.DOWN);
    }

    @Override // defpackage.fb0
    public final boolean c() {
        if (!this.p) {
            return false;
        }
        edg edgVar = this.k;
        return edgVar == null || edgVar.d() == 0;
    }

    @Override // defpackage.fb0
    public final ByteBuffer d() {
        int iD;
        edg edgVar = this.k;
        if (edgVar != null && (iD = edgVar.d()) > 0) {
            if (this.l.capacity() < iD) {
                this.l = ByteBuffer.allocateDirect(iD).order(ByteOrder.nativeOrder());
            } else {
                this.l.clear();
            }
            edgVar.c(this.l);
            this.l.flip();
            this.o += (long) iD;
            this.m = this.l;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = fb0.a;
        return byteBuffer;
    }

    @Override // defpackage.fb0
    public final void e(db0 db0Var) {
        if (isActive()) {
            cb0 cb0Var = this.f;
            this.h = cb0Var;
            cb0 cb0Var2 = this.g;
            this.i = cb0Var2;
            if (this.j) {
                this.k = new edg(this.d, this.e, cb0Var.a, cb0Var.b, cb0Var2.a, cb0Var.c == 4);
            } else {
                edg edgVar = this.k;
                if (edgVar != null) {
                    edgVar.b();
                }
            }
        }
        this.m = fb0.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            edg edgVar = this.k;
            edgVar.getClass();
            this.n += (long) byteBuffer.remaining();
            edgVar.h(byteBuffer);
        }
    }

    @Override // defpackage.fb0
    public final cb0 g(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = cb0Var.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
        }
        int i2 = this.c;
        if (i2 == -1) {
            i2 = cb0Var.a;
        }
        this.f = cb0Var;
        cb0 cb0Var2 = new cb0(i2, cb0Var.b, i);
        this.g = cb0Var2;
        this.j = true;
        return cb0Var2;
    }

    @Override // defpackage.fb0
    public final void h() {
        edg edgVar = this.k;
        if (edgVar != null) {
            edgVar.g();
        }
        this.p = true;
    }

    @Override // defpackage.fb0
    public final long i(long j) {
        return a(j);
    }

    @Override // defpackage.fb0
    public final boolean isActive() {
        if (this.g.a != -1) {
            return this.b || Math.abs(this.d - 1.0f) >= 1.0E-4f || Math.abs(this.e - 1.0f) >= 1.0E-4f || this.g.a != this.f.a;
        }
        return false;
    }

    @Override // defpackage.fb0
    public final void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        cb0 cb0Var = cb0.e;
        this.f = cb0Var;
        this.g = cb0Var;
        this.h = cb0Var;
        this.i = cb0Var;
        ByteBuffer byteBuffer = fb0.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
