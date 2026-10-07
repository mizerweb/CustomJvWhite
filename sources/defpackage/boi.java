package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class boi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gpi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ boi(gpi gpiVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = gpiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gpi gpiVar = this.f;
        switch (i) {
            case 0:
                return new boi(gpiVar, lq4Var, 0);
            case 1:
                return new boi(gpiVar, lq4Var, 1);
            default:
                return new boi(gpiVar, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((boi) create((zi4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((boi) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((boi) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                a8j.x(this.f.r1, vpi.a);
                break;
            case 1:
                ch3.d0(obj);
                a8j.x(this.f.r1, opi.a);
                gpi gpiVar = this.f;
                p3c p3cVar = gpiVar.Y;
                zv8[] zv8VarArr = gpi.C1;
                p3cVar.B(gpiVar, zv8VarArr[0], null);
                gpi gpiVar2 = this.f;
                gpiVar2.Z.B(gpiVar2, zv8VarArr[1], null);
                this.f.o1 = 0;
                break;
            default:
                ch3.d0(obj);
                gpi gpiVar3 = this.f;
                if (gpiVar3.d != null || ((List) gpiVar3.A.getValue()).size() <= 1) {
                    a8j.x(gpiVar3.r1, ppi.a);
                }
                break;
        }
        return sbi.a;
    }
}
