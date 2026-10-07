package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zhb extends n0 implements vo8 {
    public static final zhb b = new zhb(nhb.h);

    @Override // defpackage.vo8
    public final CancellationException A() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.vo8
    public final no5 K(boolean z, boolean z2, fz7 fz7Var) {
        return dib.a;
    }

    @Override // defpackage.vo8
    public final boolean W() {
        return false;
    }

    @Override // defpackage.vo8
    public final no5 Y(cf7 cf7Var) {
        return dib.a;
    }

    @Override // defpackage.vo8, defpackage.hr2
    public final void b(CancellationException cancellationException) {
    }

    @Override // defpackage.vo8
    public final Object g(lq4 lq4Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.vo8
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.vo8
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.vo8
    public final vp3 o0(up8 up8Var) {
        return dib.a;
    }

    @Override // defpackage.vo8
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.vo8
    public final ki3 v0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.vo8
    public final ohf y() {
        return b76.a;
    }
}
