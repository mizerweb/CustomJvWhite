package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dy7 implements kyh {
    public static final b87 f;
    public static final b87 g;
    public final kyh a;
    public final b87 b;
    public b87 c;
    public byte[] d;
    public int e;

    static {
        a87 a87Var = new a87();
        a87Var.m = uya.n("application/id3");
        f = new b87(a87Var);
        a87 a87Var2 = new a87();
        a87Var2.m = uya.n("application/x-emsg");
        g = new b87(a87Var2);
    }

    public dy7(kyh kyhVar, int i) {
        this.a = kyhVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                ore.p(zo5.h(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        nmc nmcVar = new nmc(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        b87 b87Var = this.b;
        String str2 = b87Var.n;
        String str3 = b87Var.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                lvb.G0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            tc6 tc6VarE = pt.e(nmcVar);
            b87 b87VarA = tc6VarE.a();
            if (b87VarA == null || !Objects.equals(str3, b87VarA.n)) {
                lvb.G0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + tc6VarE.a());
                return;
            }
            byte[] bArrC = tc6VarE.c();
            bArrC.getClass();
            nmcVar = new nmc(bArrC);
        }
        int iA = nmcVar.a();
        kyh kyhVar = this.a;
        kyhVar.f(iA, nmcVar);
        kyhVar.a(j, i, iA, 0, jyhVar);
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        nmcVar.k(this.e, this.d, i);
        this.e += i;
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = q25Var.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        c.n();
        return 0;
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        this.c = b87Var;
        this.a.g(this.b);
    }
}
