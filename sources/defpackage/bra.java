package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bra extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jsa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bra(lq4 lq4Var, jsa jsaVar) {
        super(2, lq4Var);
        this.e = 2;
        this.g = jsaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        jsa jsaVar = this.g;
        switch (i) {
            case 0:
                bra braVar = new bra(jsaVar, lq4Var, 0);
                braVar.f = obj;
                return braVar;
            case 1:
                bra braVar2 = new bra(jsaVar, lq4Var, 1);
                braVar2.f = obj;
                return braVar2;
            default:
                bra braVar3 = new bra(lq4Var, jsaVar);
                braVar3.f = obj;
                return braVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((bra) create((it4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((bra) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((bra) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        n3g n3gVar;
        ArrayList arrayListD;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Integer num = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        jsa jsaVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                it4 it4Var = (it4) obj2;
                ch3.d0(obj);
                int i2 = 6;
                if (it4Var instanceof ht4) {
                    n3gVar = new n3g(((ht4) it4Var).a, num, b3 == true ? 1 : 0, i2);
                } else {
                    if (!(it4Var instanceof gt4)) {
                        ore.o();
                        return null;
                    }
                    n3gVar = new n3g(((gt4) it4Var).a, b2 == true ? 1 : 0, b == true ? 1 : 0, i2);
                }
                a8j.x(jsaVar.E2, n3gVar);
                return sbiVar;
            case 1:
                Set set = (Set) obj2;
                ch3.d0(obj);
                rt2 rt2Var = (rt2) jsaVar.w2.a.getValue();
                if (rt2Var != null) {
                    dg0 dg0Var = (dg0) jsaVar.Y1.getValue();
                    long j = rt2Var.a;
                    if (((Boolean) ((e5d) dg0Var.h.getValue()).k().i()).booleanValue() && (arrayListD = dg0Var.d(set, j)) != null) {
                        dg0Var.p.b(new yf0(set, arrayListD));
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                mjg mjgVar = jsaVar.I2;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bra(jsa jsaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = jsaVar;
    }
}
