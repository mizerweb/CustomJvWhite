package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class oa7 extends xsh {
    public xsh e;

    public oa7(xsh xshVar) {
        this.e = xshVar;
    }

    @Override // defpackage.xsh
    public final xsh a() {
        return this.e.a();
    }

    @Override // defpackage.xsh
    public final xsh b() {
        return this.e.b();
    }

    @Override // defpackage.xsh
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.xsh
    public final xsh d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.xsh
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.xsh
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.xsh
    public final xsh g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.xsh
    public final long h() {
        return this.e.h();
    }
}
