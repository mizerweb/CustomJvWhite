package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r43 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ x43 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r43(x43 x43Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = x43Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x43 x43Var = this.f;
        switch (i) {
            case 0:
                return new r43(x43Var, lq4Var, 0);
            case 1:
                return new r43(x43Var, lq4Var, 1);
            case 2:
                return new r43(x43Var, lq4Var, 2);
            case 3:
                return new r43(x43Var, lq4Var, 3);
            default:
                return new r43(x43Var, lq4Var, 4);
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
                return ((r43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 1:
                ((r43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((r43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((r43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((r43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        x43 x43Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = x43.q1;
                h8c h8cVarJ = x43Var.J();
                h8cVarJ.m(new tnh(R.string.profile_media_save_video_snackbar_success));
                h8cVarJ.h(new w8c(R.drawable.icon_check));
                return h8cVarJ.p();
            case 1:
                ch3.d0(obj);
                x43.D(x43Var);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                x43.D(x43Var);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                x43.D(x43Var);
                return sbiVar;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = x43.q1;
                h8c h8cVarJ2 = x43Var.J();
                h8cVarJ2.m(new tnh(R.string.common_error_base_retry));
                h8cVarJ2.h(new w8c(R.drawable.icon_warning));
                return h8cVarJ2.p();
        }
    }
}
