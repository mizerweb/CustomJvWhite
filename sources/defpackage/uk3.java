package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class uk3 extends mdh implements tf7 {
    public int e;
    public /* synthetic */ long f;
    public /* synthetic */ String g;
    public final /* synthetic */ rl3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk3(rl3 rl3Var, lq4 lq4Var) {
        super(3, lq4Var);
        this.h = rl3Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        uk3 uk3Var = new uk3(this.h, (lq4) obj3);
        uk3Var.f = jLongValue;
        uk3Var.g = (String) obj2;
        return uk3Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.f;
        String str = this.g;
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
        yt2 yt2Var = (yt2) this.h.s.getValue();
        this.g = null;
        this.f = j;
        this.e = 1;
        Serializable serializableA = yt2Var.a(j, this, str);
        hu4 hu4Var = hu4.a;
        return serializableA == hu4Var ? hu4Var : serializableA;
    }
}
