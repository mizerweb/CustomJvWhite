package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class e03 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e03(long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                e03 e03Var = new e03(this.g, lq4Var, 0);
                e03Var.f = obj;
                return e03Var;
            case 1:
                e03 e03Var2 = new e03(this.g, lq4Var, 1);
                e03Var2.f = obj;
                return e03Var2;
            case 2:
                e03 e03Var3 = new e03(this.g, lq4Var, 2);
                e03Var3.f = obj;
                return e03Var3;
            case 3:
                e03 e03Var4 = new e03(this.g, lq4Var, 3);
                e03Var4.f = obj;
                return e03Var4;
            default:
                e03 e03Var5 = new e03(this.g, lq4Var, 4);
                e03Var5.f = obj;
                return e03Var5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((e03) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((e03) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                return ((e03) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((e03) create((ek4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((e03) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                tw2 tw2Var = (tw2) this.f;
                ch3.d0(obj);
                long j = tw2Var.a0;
                long j2 = this.g;
                if (j < j2 || j2 == 0) {
                    tw2Var.a0 = j2;
                }
                return sbi.a;
            case 1:
                tw2 tw2Var2 = (tw2) this.f;
                ch3.d0(obj);
                long j3 = this.g;
                tw2Var2.n0 = j3;
                if (j3 == 0) {
                    tw2Var2.o0 = -1L;
                }
                return sbi.a;
            case 2:
                rt2 rt2Var = (rt2) this.f;
                ch3.d0(obj);
                long j4 = this.g;
                long jQ = rt2Var.q();
                String strF = rt2Var.F();
                String strS = rt2Var.s(us0.a, rs0.a);
                String str = strS == null ? "" : strS;
                rt2Var.L0();
                return new oyc(j4, jQ, rt2Var.m, strF, str);
            case 3:
                ek4 ek4Var = (ek4) this.f;
                ch3.d0(obj);
                long j5 = this.g;
                long j6 = ek4Var.a;
                String string = ek4Var.b.toString();
                Uri uri = ek4Var.g;
                String string2 = uri != null ? uri.toString() : null;
                return new oyc(j5, j6, ek4Var.j, string, string2 == null ? "" : string2);
            default:
                vg4 vg4Var = (vg4) this.f;
                ch3.d0(obj);
                long j7 = this.g;
                long jV = vg4Var.v();
                String strK = vg4Var.k();
                String str2 = strK == null ? "" : strK;
                String strZ = vg4Var.z(us0.a);
                return new oyc(j7, jV, vg4Var.u(), str2, strZ == null ? "" : strZ);
        }
    }
}
