package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n83 extends mdh implements qf7 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n83() {
        super(2, null);
        this.e = 0;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new n83(2, lq4Var, 0);
            case 1:
                return new n83(2, lq4Var, 1);
            case 2:
                return new n83(2, lq4Var, 2);
            case 3:
                return new n83(2, lq4Var, 3);
            case 4:
                return new n83(2, lq4Var, 4);
            case 5:
                return new n83(2, lq4Var, 5);
            default:
                return new n83(2, lq4Var, 6);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return r66.a;
            case 1:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((n83) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ch3.d0(obj);
                return r66.a;
            case 1:
                ch3.d0(obj);
                c1a.b.l();
                return sbiVar;
            case 2:
                ch3.d0(obj);
                c1a.b.l();
                return sbiVar;
            case 3:
                ch3.d0(obj);
                trd.b.r();
                return sbiVar;
            case 4:
                ch3.d0(obj);
                h6f h6fVarH = oxl.h();
                gm0.l("ThreadsDeveloperTools", "Threads count: " + ((Map) h6fVarH.b), (Throwable) h6fVarH.c);
                return sbiVar;
            case 5:
                ch3.d0(obj);
                return sbiVar;
            default:
                ch3.d0(obj);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n83(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
