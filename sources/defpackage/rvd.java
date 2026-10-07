package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class rvd implements kyh {
    public final wye a;
    public final wye b;
    public final nm5 c = new nm5();
    public final AtomicReference d = new AtomicReference(qvd.a);

    public rvd(wye wyeVar) {
        this.a = wyeVar;
        this.b = wyeVar;
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        h().a(j, i, i2, i3, jyhVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == qvd.b) {
            this.b.D(false);
            atomicReference.set(qvd.c);
        }
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        h().b(nmcVar, i, i2);
    }

    @Override // defpackage.kyh
    public final int c(q25 q25Var, int i, boolean z) {
        return h().c(q25Var, i, z);
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) {
        return h().d(q25Var, i, z);
    }

    @Override // defpackage.kyh
    public final void e(long j) {
    }

    @Override // defpackage.kyh
    public final void f(int i, nmc nmcVar) {
        h().f(i, nmcVar);
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        this.a.g(b87Var);
    }

    public final kyh h() {
        return this.d.get() == qvd.c ? this.c : this.b;
    }
}
