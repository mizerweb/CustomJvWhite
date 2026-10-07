package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class nm5 implements kyh {
    public final byte[] a = new byte[np0.r];

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        nmcVar.O(i);
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = q25Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        c.n();
        return 0;
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
    }
}
