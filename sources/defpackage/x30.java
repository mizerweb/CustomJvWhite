package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class x30 implements mt9 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public jf c;
    public final AtomicReference d;
    public final r94 e;
    public boolean f;

    public x30(MediaCodec mediaCodec, HandlerThread handlerThread) {
        r94 r94Var = new r94();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = r94Var;
        this.d = new AtomicReference();
    }

    public static w30 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new w30();
                }
                return (w30) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mt9
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.mt9
    public final void e(int i, ty4 ty4Var, long j, int i2) {
        a();
        w30 w30VarB = b();
        w30VarB.a = i;
        w30VarB.b = 0;
        w30VarB.d = j;
        w30VarB.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = w30VarB.c;
        cryptoInfo.numSubSamples = ty4Var.f;
        int[] iArr = ty4Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = ty4Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = ty4Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = ty4Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = ty4Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ty4Var.g, ty4Var.h));
        jf jfVar = this.c;
        String str = vqi.a;
        jfVar.obtainMessage(2, w30VarB).sendToTarget();
    }

    @Override // defpackage.mt9
    public final void flush() {
        if (this.f) {
            try {
                jf jfVar = this.c;
                jfVar.getClass();
                jfVar.removeCallbacksAndMessages(null);
                r94 r94Var = this.e;
                r94Var.d();
                jf jfVar2 = this.c;
                jfVar2.getClass();
                jfVar2.obtainMessage(3).sendToTarget();
                r94Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                qr7.w(e);
            }
        }
    }

    @Override // defpackage.mt9
    public final void h(long j, int i, int i2, int i3) {
        a();
        w30 w30VarB = b();
        w30VarB.a = i;
        w30VarB.b = i2;
        w30VarB.d = j;
        w30VarB.e = i3;
        jf jfVar = this.c;
        String str = vqi.a;
        jfVar.obtainMessage(1, w30VarB).sendToTarget();
    }

    @Override // defpackage.mt9
    public final void setParameters(Bundle bundle) {
        a();
        jf jfVar = this.c;
        String str = vqi.a;
        jfVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.mt9
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.mt9
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new jf(1, handlerThread.getLooper(), this);
        this.f = true;
    }
}
