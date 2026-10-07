package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zke extends ble implements x15 {
    public final hcf f;

    public zke(b87 b87Var, c98 c98Var, hcf hcfVar, ArrayList arrayList) {
        super(b87Var, c98Var, hcfVar, arrayList);
        this.f = hcfVar;
    }

    @Override // defpackage.x15
    public final boolean F() {
        return this.f.i();
    }

    @Override // defpackage.x15
    public final long H() {
        return this.f.d;
    }

    @Override // defpackage.x15
    public final long J(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // defpackage.ble
    public final String a() {
        return null;
    }

    @Override // defpackage.x15
    public final long b(long j) {
        return this.f.g(j);
    }

    @Override // defpackage.ble
    public final x15 c() {
        return this;
    }

    @Override // defpackage.x15
    public final long d(long j, long j2) {
        return this.f.e(j, j2);
    }

    @Override // defpackage.ble
    public final l4e e() {
        return null;
    }

    @Override // defpackage.x15
    public final long g(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // defpackage.x15
    public final long i(long j, long j2) {
        hcf hcfVar = this.f;
        if (hcfVar.f != null) {
            return -9223372036854775807L;
        }
        long jB = hcfVar.b(j, j2) + hcfVar.c(j, j2);
        return (hcfVar.e(jB, j) + hcfVar.g(jB)) - hcfVar.i;
    }

    @Override // defpackage.x15
    public final l4e j(long j) {
        return this.f.h(this, j);
    }

    @Override // defpackage.x15
    public final long n(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // defpackage.x15
    public final long s(long j) {
        return this.f.d(j);
    }
}
