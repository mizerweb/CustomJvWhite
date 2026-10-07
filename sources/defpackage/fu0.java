package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements a89 {
    public final a89 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public fu0(a89 a89Var) {
        this.a = a89Var;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        a89 a89Var = this.a;
        if (i == 1) {
            a89Var.b(this.c, this.d);
        } else if (i == 2) {
            a89Var.d(this.c, this.d);
        } else if (i == 3) {
            a89Var.f(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = 0;
    }

    @Override // defpackage.a89
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.a89
    public final void d(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.a89
    public final void f(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // defpackage.a89
    public final void g(int i, int i2) {
        a();
        this.a.g(i, i2);
    }
}
