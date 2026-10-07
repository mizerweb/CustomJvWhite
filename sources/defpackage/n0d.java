package defpackage;

import one.me.pinbars.pinnedmessage.b;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n0d extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ b f;
    public int g;
    public final /* synthetic */ rt2 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0d(int i, long j, long j2, rt2 rt2Var, lq4 lq4Var, b bVar) {
        super(2, lq4Var);
        this.f = bVar;
        this.g = i;
        this.h = rt2Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new n0d(this.f, this.h, this.i, this.j, lq4Var);
            default:
                return new n0d(this.g, this.i, this.j, this.h, lq4Var, this.f);
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
                return ((n0d) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                ((n0d) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                l93 l93Var = (l93) this.f.f.getValue();
                long j = this.h.a;
                this.g = 1;
                l93Var.b(j, this.i, false, this.j);
                hu4 hu4Var = hu4.a;
                return sbiVar == hu4Var ? hu4Var : sbiVar;
            default:
                ch3.d0(obj);
                b bVar = this.f;
                h8c h8cVar = (h8c) bVar.e.getValue();
                h8cVar.c(new o8c(0, 0, this.g, 11));
                h8cVar.m(new tnh(R.string.pinbars_snackbar_unpinned));
                h8cVar.h(z8c.a);
                h8cVar.j(new e9c(new tnh(R.string.cancellation)));
                h8cVar.e(new knd(bVar, this.h, this.i, this.j));
                h8cVar.p();
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0d(b bVar, rt2 rt2Var, long j, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = bVar;
        this.h = rt2Var;
        this.i = j;
        this.j = j2;
    }
}
