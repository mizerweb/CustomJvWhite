package defpackage;

import one.me.pinbars.pinnedmessage.b;

/* JADX INFO: loaded from: classes3.dex */
public final class o0d extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ b f;
    public final /* synthetic */ rt2 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0d(int i, long j, long j2, rt2 rt2Var, lq4 lq4Var, b bVar) {
        super(2, lq4Var);
        this.f = bVar;
        this.g = rt2Var;
        this.h = j;
        this.i = i;
        this.j = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new o0d(this.i, this.h, this.j, this.g, lq4Var, this.f);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((o0d) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        rt2 rt2Var = this.g;
        b bVar = this.f;
        hu4 hu4Var = hu4.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
            } else {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        }
        ch3.d0(obj);
        ag3 ag3Var = bVar.c;
        long j = rt2Var.a;
        this.e = 1;
        ag3Var.a(j, this.h);
        if (sbiVar != hu4Var) {
        }
        lk9 lk9VarC = ((n0c) bVar.b).c();
        n0d n0dVar = new n0d(this.i, this.h, this.j, rt2Var, null, bVar);
        this.e = 2;
        return yab.K0(lk9VarC, n0dVar, this) == hu4Var ? hu4Var : sbiVar;
    }
}
