package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q9g implements y99 {
    public final a35 a;
    public final lkg b;
    public byte[] c;

    public q9g(u25 u25Var, a35 a35Var) {
        t99.g.getAndIncrement();
        this.a = a35Var;
        this.b = new lkg(u25Var);
    }

    @Override // defpackage.y99
    public final void load() {
        lkg lkgVar = this.b;
        lkgVar.b = 0L;
        try {
            lkgVar.f(this.a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) lkgVar.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = lkgVar.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            gz8.a(lkgVar);
        }
    }

    @Override // defpackage.y99
    public final void z() {
    }
}
