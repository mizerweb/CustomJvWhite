package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class csb {
    public int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public csb(bak bakVar, dik dikVar) {
        this.e = bakVar;
        int i = dikVar.c;
        ByteBuffer byteBuffer = dikVar.e;
        this.a = i;
        this.b |= (dikVar.a & 4) != 0;
        if ((dikVar.a & 4) != 0) {
            this.d = new ByteArrayOutputStream(600000);
        } else {
            this.d = new ByteArrayOutputStream(34000);
        }
        while (true) {
            int iMin = Math.min(byteBuffer.remaining(), ((bak) this.e).c.length);
            if (iMin == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((bak) this.e).c, 0, iMin);
                ((ByteArrayOutputStream) this.d).write(((bak) this.e).c, 0, iMin);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3 = 0;
        this.c = 0;
        do {
            int i4 = this.c;
            int i5 = i + i4;
            dsb dsbVar = (dsb) this.d;
            if (i5 >= dsbVar.c) {
                break;
            }
            int[] iArr = dsbVar.f;
            this.c = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public boolean b(kj6 kj6Var) {
        int i;
        dsb dsbVar = (dsb) this.d;
        nmc nmcVar = (nmc) this.e;
        lvb.b0(kj6Var != null);
        if (this.b) {
            this.b = false;
            nmcVar.K(0);
        }
        while (!this.b) {
            if (this.a < 0) {
                if (dsbVar.b(kj6Var, -1L) && dsbVar.a(kj6Var, true)) {
                    int iA = dsbVar.d;
                    if ((dsbVar.a & 1) == 1 && nmcVar.c == 0) {
                        iA += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        kj6Var.E(iA);
                        this.a = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.a);
            int i2 = this.a + this.c;
            if (iA2 > 0) {
                nmcVar.c(nmcVar.c + iA2);
                try {
                    kj6Var.readFully(nmcVar.a, nmcVar.c, iA2);
                    nmcVar.M(nmcVar.c + iA2);
                    this.b = dsbVar.f[i2 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i2 == dsbVar.c) {
                i2 = -1;
            }
            this.a = i2;
        }
        return true;
    }

    public csb() {
        this.d = new dsb();
        this.e = new nmc(0, new byte[65025]);
        this.a = -1;
    }
}
