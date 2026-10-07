package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z2b implements r36 {
    public final nmc a;
    public final a3b b;
    public final String c;
    public final int d;
    public final String e;
    public kyh f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public z2b(String str, int i, String str2) {
        nmc nmcVar = new nmc(4);
        this.a = nmcVar;
        nmcVar.a[0] = -1;
        this.b = new a3b();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        this.f.getClass();
        while (nmcVar.a() > 0) {
            int i = this.h;
            nmc nmcVar2 = this.a;
            if (i == 0) {
                byte[] bArr = nmcVar.a;
                int i2 = nmcVar.b;
                int i3 = nmcVar.c;
                while (true) {
                    if (i2 >= i3) {
                        nmcVar.N(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        nmcVar.N(i2 + 1);
                        this.k = false;
                        nmcVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(nmcVar.a(), 4 - this.i);
                nmcVar.k(this.i, nmcVar2.a, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    nmcVar2.N(0);
                    int iM = nmcVar2.m();
                    a3b a3bVar = this.b;
                    if (a3bVar.a(iM)) {
                        this.m = a3bVar.b;
                        if (!this.j) {
                            this.l = (((long) a3bVar.f) * 1000000) / ((long) a3bVar.c);
                            a87 a87Var = new a87();
                            a87Var.a = this.g;
                            a87Var.l = uya.n(this.e);
                            a87Var.m = uya.n((String) a3bVar.g);
                            a87Var.n = np0.r;
                            a87Var.E = a3bVar.d;
                            a87Var.F = a3bVar.c;
                            a87Var.d = this.c;
                            a87Var.f = this.d;
                            this.f.g(new b87(a87Var));
                            this.j = true;
                        }
                        nmcVar2.N(0);
                        this.f.f(4, nmcVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    c.t();
                    return;
                }
                int iMin2 = Math.min(nmcVar.a(), this.m - this.i);
                this.f.f(iMin2, nmcVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    lvb.b0(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.g = m5iVar.e;
        m5iVar.b();
        this.f = lj6Var.G(m5iVar.d, 1);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.n = j;
    }
}
