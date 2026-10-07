package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wc5 {
    public final String a;
    public int b;
    public long c;
    public final x4a d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ xc5 g;

    public wc5(xc5 xc5Var, String str, int i, x4a x4aVar) {
        this.g = xc5Var;
        this.a = str;
        this.b = i;
        this.c = x4aVar == null ? -1L : x4aVar.d;
        if (x4aVar == null || !x4aVar.b()) {
            return;
        }
        this.d = x4aVar;
    }

    public final boolean i(int i, x4a x4aVar) {
        if (x4aVar != null) {
            long j = x4aVar.d;
            if (j != -1) {
                x4a x4aVar2 = this.d;
                if (x4aVar2 == null) {
                    return !x4aVar.b() && j == this.c;
                }
                return j == x4aVar2.d && x4aVar.b == x4aVar2.b && x4aVar.c == x4aVar2.c;
            }
        }
        return i == this.b;
    }

    public final boolean j(wf wfVar) {
        x4a x4aVar = wfVar.d;
        ush ushVar = wfVar.b;
        if (x4aVar == null) {
            return this.b != wfVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (x4aVar.d > j) {
            return true;
        }
        x4a x4aVar2 = this.d;
        if (x4aVar2 == null) {
            return false;
        }
        int i = x4aVar2.b;
        int iB = ushVar.b(x4aVar.a);
        int iB2 = ushVar.b(x4aVar2.a);
        if (x4aVar.d < x4aVar2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!x4aVar.b()) {
            int i2 = x4aVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = x4aVar.b;
        int i4 = x4aVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > x4aVar2.c;
        }
        return true;
    }

    public final void k(int i, x4a x4aVar) {
        if (this.c == -1 && i == this.b && x4aVar != null) {
            long j = x4aVar.d;
            if (j >= this.g.b()) {
                this.c = j;
            }
        }
    }

    public final boolean l(ush ushVar, ush ushVar2) {
        x4a x4aVar;
        int i = this.b;
        if (i < ushVar.o()) {
            xc5 xc5Var = this.g;
            tsh tshVar = xc5Var.a;
            ushVar.n(i, tshVar);
            int i2 = tshVar.m;
            while (true) {
                if (i2 > tshVar.n) {
                    i = -1;
                    break;
                }
                int iB = ushVar2.b(ushVar.l(i2));
                if (iB != -1) {
                    i = ushVar2.f(iB, xc5Var.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= ushVar2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((x4aVar = this.d) == null || ushVar2.b(x4aVar.a) != -1);
    }
}
