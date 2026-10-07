package defpackage;

import android.util.SparseLongArray;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class gj2 implements x15, swi, kj6, lj6, it9 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public gj2(kj6 kj6Var, long j) {
        this.a = 10;
        this.c = kj6Var;
        lvb.R(kj6Var.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.it9
    public long A() {
        return this.b;
    }

    @Override // defpackage.kj6
    public int B(int i, byte[] bArr, int i2) {
        return ((kj6) this.c).B(i, bArr, i2);
    }

    @Override // defpackage.kj6
    public int C(int i) {
        return ((kj6) this.c).C(i);
    }

    @Override // defpackage.lj6
    public void D() {
        ((lj6) this.c).D();
    }

    @Override // defpackage.kj6
    public void E(int i) {
        ((kj6) this.c).E(i);
    }

    @Override // defpackage.x15
    public boolean F() {
        return true;
    }

    @Override // defpackage.lj6
    public kyh G(int i, int i2) {
        return ((lj6) this.c).G(i, i2);
    }

    @Override // defpackage.x15
    public long H() {
        return 0L;
    }

    @Override // defpackage.kj6
    public boolean I(int i, boolean z) {
        return ((kj6) this.c).I(i, true);
    }

    @Override // defpackage.x15
    public long J(long j, long j2) {
        return ((vq3) this.c).a;
    }

    public long K() {
        xj xjVar = (xj) this.c;
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0L;
        int iB = xjVar.b();
        int i = 0;
        while (true) {
            long j2 = this.b;
            if (i >= iB) {
                return j2;
            }
            this.b = j2 + ((long) xjVar.c(i));
            i++;
        }
    }

    public void L(String str) {
        long jNanoTime = System.nanoTime() - this.b;
        long j = jNanoTime / 1000000000;
        float nanos = (jNanoTime - TimeUnit.SECONDS.toNanos(j)) / 1000000.0f;
        String str2 = j == 0 ? String.format(Locale.ROOT, "%.1f ms", Float.valueOf(nanos)) : String.format(Locale.ROOT, "%d seconds and %.1f ms", Long.valueOf(j), Float.valueOf(nanos));
        ((CidLogger) this.c).log("OKRTCCall", str + " completed in " + str2);
    }

    public void M(ImageCaptureException imageCaptureException) {
        ((hj2) this.c).i = false;
        gm0.n(gj2.class.getName(), "capture image with error");
        ((hj2) this.c).getFreezeCameraDetector().a();
        zf2 zf2Var = ((hj2) this.c).f;
        if (zf2Var != null) {
            ((ft0) zf2Var).y(new CameraExceptionImpl(imageCaptureException));
        }
    }

    public void N(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                String str = vqi.a;
                if (sparseLongArray.size() == 0) {
                    qr7.d();
                    return;
                }
                long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
                }
                this.b = jMin;
            }
        }
    }

    @Override // defpackage.swi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((n8g) this.c).f.execute(new yde(this, 27, videoFrameProcessingException));
    }

    @Override // defpackage.x15
    public long b(long j) {
        return ((vq3) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.it9
    public s2d c() {
        return s2d.d;
    }

    @Override // defpackage.x15
    public long d(long j, long j2) {
        return ((vq3) this.c).d[(int) j];
    }

    @Override // defpackage.swi
    public void e(long j, boolean z) {
        if (j == 0) {
            ((n8g) this.c).l = true;
        }
        this.b = j;
        ((n8g) this.c).f.execute(new k7b(this, j, z, 1));
    }

    @Override // defpackage.x15
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.kj6
    public long getLength() {
        return ((kj6) this.c).getLength() - this.b;
    }

    @Override // defpackage.kj6
    public long getPosition() {
        return ((kj6) this.c).getPosition() - this.b;
    }

    @Override // defpackage.swi
    public void h(int i, int i2) {
        ((n8g) this.c).f.execute(new q31(this, i, i2, 5));
    }

    @Override // defpackage.x15
    public long i(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.x15
    public l4e j(long j) {
        vq3 vq3Var = (vq3) this.c;
        int i = (int) j;
        return new l4e(null, vq3Var.c[i], vq3Var.b[i]);
    }

    @Override // defpackage.kj6
    public boolean k(int i, boolean z) {
        return ((kj6) this.c).k(i, true);
    }

    @Override // defpackage.swi
    public void l(float f) {
        ((n8g) this.c).f.execute(new j7b(this, f, 1));
    }

    @Override // defpackage.kj6
    public boolean m(byte[] bArr, int i, int i2, boolean z) {
        return ((kj6) this.c).m(bArr, i, i2, z);
    }

    @Override // defpackage.x15
    public long n(long j, long j2) {
        return vqi.f(((vq3) this.c).e, j + this.b, true);
    }

    @Override // defpackage.kj6
    public void q() {
        ((kj6) this.c).q();
    }

    @Override // defpackage.lj6
    public void r(xbf xbfVar) {
        ((lj6) this.c).r(new hig(this, xbfVar, xbfVar));
    }

    @Override // defpackage.q25
    public int read(byte[] bArr, int i, int i2) {
        return ((kj6) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.kj6
    public void readFully(byte[] bArr, int i, int i2) {
        ((kj6) this.c).readFully(bArr, i, i2);
    }

    @Override // defpackage.x15
    public long s(long j) {
        return ((vq3) this.c).a;
    }

    @Override // defpackage.kj6
    public boolean t(byte[] bArr, int i, int i2, boolean z) {
        return ((kj6) this.c).t(bArr, 0, i2, z);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "LiveStream{updateTime=" + this.b + ", media=" + ((e70) this.c) + '}';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kj6
    public void u(int i, byte[] bArr, int i2) {
        ((kj6) this.c).u(i, bArr, i2);
    }

    @Override // defpackage.swi
    public void v() {
        ((n8g) this.c).f.execute(new f4g(4, this));
    }

    @Override // defpackage.it9
    public void x(s2d s2dVar) {
    }

    @Override // defpackage.kj6
    public long y() {
        return ((kj6) this.c).y() - this.b;
    }

    @Override // defpackage.kj6
    public void z(int i) {
        ((kj6) this.c).z(i);
    }

    public /* synthetic */ gj2(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ gj2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public gj2(xj xjVar) {
        this.a = 4;
        this.c = xjVar;
        this.b = -1L;
    }

    public /* synthetic */ gj2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public gj2(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.c = new SparseLongArray();
                break;
        }
    }
}
