package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j57 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ k57 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j57(k57 k57Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = k57Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        k57 k57Var = this.f;
        switch (i) {
            case 0:
                return new j57(k57Var, lq4Var, 0);
            default:
                return new j57(k57Var, lq4Var, 1);
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
                ((j57) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((j57) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        k57 k57Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = k57.r;
                h8c h8cVar = (h8c) k57Var.i.getValue();
                h8cVar.m(new tnh(R.string.snack_network_error_title));
                h8cVar.a(new tnh(R.string.snack_network_error_description));
                h8cVar.p();
                return sbi.a;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = k57.r;
                h8c h8cVar2 = (h8c) k57Var.i.getValue();
                h8cVar2.m(new tnh(R.string.snack_network_error_title));
                h8cVar2.a(new tnh(R.string.snack_network_error_description));
                return h8cVar2.p();
        }
    }
}
