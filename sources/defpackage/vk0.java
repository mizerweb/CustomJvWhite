package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class vk0 implements xbf {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public vk0(long j, long j2) {
        this.a = 2;
        this.b = j;
        zbf zbfVar = j2 == 0 ? zbf.c : new zbf(0L, j2);
        this.c = new wbf(zbfVar, zbfVar);
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                wk0 wk0Var = (wk0) obj;
                wbf wbfVarB = wk0Var.i[0].b(j);
                while (true) {
                    wq3[] wq3VarArr = wk0Var.i;
                    if (i2 >= wq3VarArr.length) {
                        return wbfVarB;
                    }
                    wbf wbfVarB2 = wq3VarArr[i2].b(j);
                    if (wbfVarB2.a.b < wbfVarB.a.b) {
                        wbfVarB = wbfVarB2;
                    }
                    i2++;
                }
                break;
            case 1:
                bx6 bx6Var = (bx6) obj;
                bx6Var.k.getClass();
                xp9 xp9Var = bx6Var.k;
                long[] jArr = (long[]) xp9Var.b;
                long[] jArr2 = (long[]) xp9Var.c;
                int iF = vqi.f(jArr, vqi.k((((long) bx6Var.e) * j) / 1000000, 0L, bx6Var.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i3 = bx6Var.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                zbf zbfVar = new zbf(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new wbf(zbfVar, zbfVar);
                }
                int i4 = iF + 1;
                return new wbf(zbfVar, new zbf((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (wbf) obj;
        }
    }

    @Override // defpackage.xbf
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.xbf
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((bx6) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vk0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ vk0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
