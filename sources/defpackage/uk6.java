package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class uk6 extends mdh implements tf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ AppCompatTextView f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk6(AppCompatTextView appCompatTextView, lq4 lq4Var) {
        super(3, lq4Var);
        this.f = appCompatTextView;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                uk6 uk6Var = new uk6(this.f, (lq4) obj3);
                uk6Var.g = (kbc) obj2;
                uk6Var.invokeSuspend(sbiVar);
                break;
            default:
                uk6 uk6Var2 = new uk6(3, (lq4) obj3);
                uk6Var2.f = (AppCompatTextView) obj;
                uk6Var2.g = (kbc) obj2;
                uk6Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                kbc kbcVar = this.g;
                ch3.d0(obj);
                this.f.setTextColor(kbcVar.getText().b);
                break;
            default:
                AppCompatTextView appCompatTextView = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                appCompatTextView.setTextColor(kbcVar2.getText().c);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ uk6(int i, lq4 lq4Var) {
        super(i, lq4Var);
    }
}
