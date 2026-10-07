package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class are extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ bre f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public are(bre breVar, Map map, boolean z, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = breVar;
        this.g = map;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new are(this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((are) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            this.e = 1;
            Object objF = bre.f(this.f, this.g, this.h, this);
            hu4 hu4Var = hu4.a;
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
