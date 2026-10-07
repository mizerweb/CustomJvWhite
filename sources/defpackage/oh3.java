package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class oh3 extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ ph3 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ nx2 h;
    public final /* synthetic */ ConcurrentHashMap i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh3(ph3 ph3Var, long j, nx2 nx2Var, ConcurrentHashMap concurrentHashMap, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = ph3Var;
        this.g = j;
        this.h = nx2Var;
        this.i = concurrentHashMap;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new oh3(this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((oh3) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        this.e = 1;
        Object objA = gh3.a(this.f, this.g, this.h, this.i, this);
        hu4 hu4Var = hu4.a;
        return objA == hu4Var ? hu4Var : objA;
    }
}
