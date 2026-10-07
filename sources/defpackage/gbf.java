package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gbf implements n5i {
    public final fbf a;
    public final nmc b = new nmc(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public gbf(fbf fbfVar) {
        this.a = fbfVar;
    }

    @Override // defpackage.n5i
    public final void a(int i, nmc nmcVar) {
        int iA;
        boolean z = (i & 1) != 0;
        if (z) {
            iA = nmcVar.b + nmcVar.A();
        } else {
            iA = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            nmcVar.N(iA);
            this.d = 0;
        }
        while (nmcVar.a() > 0) {
            int i2 = this.d;
            nmc nmcVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iA2 = nmcVar.A();
                    nmcVar.N(nmcVar.b - 1);
                    if (iA2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(nmcVar.a(), 3 - this.d);
                nmcVar.k(this.d, nmcVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    nmcVar2.N(0);
                    nmcVar2.M(3);
                    nmcVar2.O(1);
                    int iA3 = nmcVar2.A();
                    int iA4 = nmcVar2.A();
                    this.e = (iA3 & np0.m) != 0;
                    int i4 = (((iA3 & 15) << 8) | iA4) + 3;
                    this.c = i4;
                    byte[] bArr = nmcVar2.a;
                    if (bArr.length < i4) {
                        nmcVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(nmcVar.a(), this.c - this.d);
                nmcVar.k(this.d, nmcVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        nmcVar2.M(i6);
                    } else {
                        if (vqi.o(0, i6, -1, nmcVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        nmcVar2.M(this.c - 4);
                    }
                    nmcVar2.N(0);
                    this.a.d(nmcVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.n5i
    public final void e(dth dthVar, lj6 lj6Var, m5i m5iVar) {
        this.a.e(dthVar, lj6Var, m5iVar);
        this.f = true;
    }

    @Override // defpackage.n5i
    public final void f() {
        this.f = true;
    }
}
