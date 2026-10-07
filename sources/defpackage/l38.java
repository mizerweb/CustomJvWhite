package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class l38 implements AutoCloseable {
    public final ep4 a;
    public final Object b;
    public int c;
    public final boolean d;
    public final x31 e;
    public final sa6 g;
    public final sa6 h;
    public final sa6 i;
    public byte[] j;
    public char[] k;
    public char[] l;
    public char[] m;
    public boolean f = true;
    public boolean n = false;

    public l38(sa6 sa6Var, sa6 sa6Var2, sa6 sa6Var3, x31 x31Var, ep4 ep4Var, boolean z) {
        this.g = sa6Var;
        this.h = sa6Var2;
        this.i = sa6Var3;
        this.e = x31Var;
        this.a = ep4Var;
        this.b = ep4Var.a;
        this.d = z;
    }

    public final void b(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.j;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                ore.p("Trying to release buffer smaller than original");
                return;
            }
            this.j = null;
            AtomicReferenceArray atomicReferenceArray = this.e.a;
            byte[] bArr3 = (byte[]) atomicReferenceArray.get(0);
            if (bArr3 == null || bArr.length > bArr3.length) {
                atomicReferenceArray.set(0, bArr);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (this.f) {
            this.f = false;
            this.e.getClass();
        }
    }
}
