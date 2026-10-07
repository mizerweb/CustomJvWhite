package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ydh extends mdh implements tf7 {
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ceh g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydh(boolean z, ceh cehVar, long j, lq4 lq4Var) {
        super(3, lq4Var);
        this.f = z;
        this.g = cehVar;
        this.h = j;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        ceh cehVar = this.g;
        long j = this.h;
        return new ydh(this.f, cehVar, j, (lq4) obj3).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (this.f) {
                List listS = c0a.s(this.h);
                this.e = 1;
                Object objC = this.g.c(listS, this);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
                }
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
