package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class xw6 implements lw0 {
    public final bx6 a;
    public final int b;
    public final s8 c = new s8();

    public xw6(bx6 bx6Var, int i) {
        this.a = bx6Var;
        this.b = i;
    }

    public final long a(kj6 kj6Var) {
        s8 s8Var;
        bx6 bx6Var;
        int iB;
        while (true) {
            long jY = kj6Var.y();
            long length = kj6Var.getLength() - 6;
            s8Var = this.c;
            bx6Var = this.a;
            if (jY >= length) {
                break;
            }
            long jY2 = kj6Var.y();
            nmc nmcVar = new nmc(17);
            int i = 0;
            boolean zA = false;
            kj6Var.u(0, nmcVar.a, 2);
            char cG = nmcVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (cG != i2) {
                kj6Var.q();
                kj6Var.z((int) (jY2 - kj6Var.getPosition()));
            } else {
                byte[] bArr = nmcVar.a;
                while (i < 15 && (iB = kj6Var.B(2 + i, bArr, 15 - i)) != -1) {
                    i += iB;
                }
                nmcVar.M(i + 2);
                kj6Var.q();
                kj6Var.z((int) (jY2 - kj6Var.getPosition()));
                zA = ayl.a(nmcVar, bx6Var, i2, s8Var);
            }
            if (zA) {
                break;
            }
            kj6Var.z(1);
        }
        if (kj6Var.y() < kj6Var.getLength() - 6) {
            return s8Var.a;
        }
        kj6Var.z((int) (kj6Var.getLength() - kj6Var.y()));
        return bx6Var.j;
    }

    @Override // defpackage.lw0
    public final kw0 e(kj6 kj6Var, long j) {
        long position = kj6Var.getPosition();
        long jA = a(kj6Var);
        long jY = kj6Var.y();
        kj6Var.z(Math.max(6, this.a.c));
        long jA2 = a(kj6Var);
        long jY2 = kj6Var.y();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new kw0(-2, jA2, jY2) : new kw0(-1, jA, position);
        }
        return new kw0(0, -9223372036854775807L, jY);
    }
}
