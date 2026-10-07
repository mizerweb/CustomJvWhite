package defpackage;

import androidx.work.CoroutineWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class ku4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ CoroutineWorker g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku4(CoroutineWorker coroutineWorker, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = coroutineWorker;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CoroutineWorker coroutineWorker = this.g;
        switch (i) {
            case 0:
                return new ku4(coroutineWorker, lq4Var, 0);
            default:
                return new ku4(coroutineWorker, lq4Var, 1);
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
                ((ku4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((ku4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    ore.k("Not implemented");
                } else {
                    if (i == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this.f = 1;
                Object objD = this.g.d(this);
                hu4 hu4Var = hu4.a;
                return objD == hu4Var ? hu4Var : objD;
        }
    }
}
