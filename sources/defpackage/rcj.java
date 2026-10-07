package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rcj implements jj6 {
    public lj6 a;
    public kyh b;
    public pcj e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.a = lj6Var;
        this.b = lj6Var.G(0, 1);
        lj6Var.D();
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return wpk.a(kj6Var);
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        pcj pcjVar = this.e;
        if (pcjVar != null) {
            pcjVar.b(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = vqi.a;
        int i2 = this.c;
        int iH = 4;
        if (i2 == 0) {
            lvb.b0(kj6Var.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                kj6Var.E(i3);
                this.c = 4;
                return 0;
            }
            if (!wpk.a(kj6Var)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            kj6Var.E((int) (kj6Var.y() - kj6Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i2 == 1) {
            nmc nmcVar = new nmc(8);
            dc1 dc1VarH = dc1.h(kj6Var, nmcVar);
            if (dc1VarH.a != 1685272116) {
                kj6Var.q();
            } else {
                kj6Var.z(8);
                nmcVar.N(0);
                kj6Var.u(0, nmcVar.a, 8);
                jP = nmcVar.p();
                kj6Var.E(((int) dc1VarH.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    c.t();
                    return 0;
                }
                lvb.b0(this.g != -1);
                long position = this.g - kj6Var.getPosition();
                pcj pcjVar = this.e;
                pcjVar.getClass();
                return pcjVar.c(kj6Var, position) ? -1 : 0;
            }
            kj6Var.q();
            dc1 dc1VarD = wpk.d(1684108385, kj6Var, new nmc(8));
            kj6Var.E(8);
            Pair pairCreate = Pair.create(Long.valueOf(kj6Var.getPosition()), Long.valueOf(dc1VarD.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = kj6Var.getLength();
            if (length != -1 && this.g > length) {
                lvb.G0("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            pcj pcjVar2 = this.e;
            pcjVar2.getClass();
            pcjVar2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        nmc nmcVar2 = new nmc(16);
        long j2 = wpk.d(1718449184, kj6Var, nmcVar2).b;
        lvb.b0(j2 >= 16);
        kj6Var.u(0, nmcVar2.a, 16);
        nmcVar2.N(0);
        int iT = nmcVar2.t();
        int iT2 = nmcVar2.t();
        int iS = nmcVar2.s();
        nmcVar2.s();
        int iT3 = nmcVar2.t();
        int iT4 = nmcVar2.t();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            kj6Var.u(0, bArr, i4);
            if (iT == 65534 && i4 == 24) {
                nmc nmcVar3 = new nmc(bArr);
                nmcVar3.t();
                int iT5 = nmcVar3.t();
                if (iT5 != 0 && iT5 != iT4) {
                    throw ParserException.c("validBits ( " + iT5 + ")  != bitsPerSample( " + iT4 + ") are not supported");
                }
                int iS2 = nmcVar3.s();
                if ((iS2 >> 18) != 0) {
                    throw ParserException.c("invalid channel mask " + iS2);
                }
                if (iS2 != 0 && Integer.bitCount(iS2) != iT2) {
                    throw ParserException.c("invalid number of channels (" + Integer.bitCount(iS2) + ") in channel mask " + iS2);
                }
                iT = nmcVar3.t();
                byte[] bArr2 = new byte[14];
                nmcVar3.k(0, bArr2, 14);
                if (!Arrays.equals(bArr2, wpk.a) && !Arrays.equals(bArr2, wpk.b)) {
                    throw ParserException.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = vqi.b;
        }
        kj6Var.E((int) (kj6Var.y() - kj6Var.getPosition()));
        c70 c70Var = new c70();
        c70Var.a = iT2;
        c70Var.b = iS;
        c70Var.c = iT3;
        c70Var.d = iT4;
        c70Var.e = bArr;
        if (iT == 17) {
            this.e = new ocj(this.a, this.b, c70Var);
        } else if (iT == 6) {
            this.e = new qcj(this.a, this.b, c70Var, "audio/g711-alaw", -1);
        } else if (iT == 7) {
            this.e = new qcj(this.a, this.b, c70Var, "audio/g711-mlaw", -1);
        } else {
            if (iT == 1) {
                iH = vqi.H(iT4, ByteOrder.LITTLE_ENDIAN);
                i = iH;
            } else {
                if (iT != 3) {
                    if (iT == 65534) {
                        iH = vqi.H(iT4, ByteOrder.LITTLE_ENDIAN);
                        i = iH;
                    }
                } else if (iT4 == 32) {
                    i = iH;
                }
                i = 0;
            }
            if (i == 0) {
                throw ParserException.c("Unsupported WAV format type: " + iT);
            }
            this.e = new qcj(this.a, this.b, c70Var, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
