package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d08 {
    public final u8e c;
    public int f;
    public int g;
    public int a = np0.r;
    public final ArrayList b = new ArrayList();
    public bu7[] d = new bu7[8];
    public int e = 7;

    public d08(y08 y08Var) {
        this.c = new u8e(y08Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            bu7[] bu7VarArr = this.d;
            System.arraycopy(bu7VarArr, i2 + 1, bu7VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final d71 b(int i) throws IOException {
        if (i >= 0) {
            bu7[] bu7VarArr = f08.a;
            if (i <= bu7VarArr.length - 1) {
                return bu7VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - f08.a.length);
        if (length >= 0) {
            bu7[] bu7VarArr2 = this.d;
            if (length < bu7VarArr2.length) {
                return bu7VarArr2[length].a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(bu7 bu7Var) {
        this.b.add(bu7Var);
        int i = bu7Var.c;
        int i2 = this.a;
        if (i > i2) {
            a.X0(this.d, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        bu7[] bu7VarArr = this.d;
        if (i3 > bu7VarArr.length) {
            bu7[] bu7VarArr2 = new bu7[bu7VarArr.length * 2];
            System.arraycopy(bu7VarArr, 0, bu7VarArr2, bu7VarArr.length, bu7VarArr.length);
            this.e = this.d.length - 1;
            this.d = bu7VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = bu7Var;
        this.f++;
        this.g += i;
    }

    public final d71 d() {
        u8e u8eVar = this.c;
        byte b = u8eVar.readByte();
        byte[] bArr = uqi.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return u8eVar.f0(jE);
        }
        l31 l31Var = new l31();
        jrc jrcVar = q28.c;
        jrc jrcVar2 = jrcVar;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = u8eVar.readByte();
            byte[] bArr2 = uqi.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                jrcVar2 = ((jrc[]) jrcVar2.d)[(i2 >>> (i3 - 8)) & 255];
                if (((jrc[]) jrcVar2.d) == null) {
                    l31Var.t0(jrcVar2.b);
                    i3 -= jrcVar2.c;
                    jrcVar2 = jrcVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            jrc jrcVar3 = ((jrc[]) jrcVar2.d)[(i2 << (8 - i3)) & 255];
            jrc[] jrcVarArr = (jrc[]) jrcVar3.d;
            int i4 = jrcVar3.c;
            if (jrcVarArr != null || i4 > i3) {
                break;
            }
            l31Var.t0(jrcVar3.b);
            i3 -= i4;
            jrcVar2 = jrcVar;
        }
        return l31Var.f0(l31Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = uqi.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
