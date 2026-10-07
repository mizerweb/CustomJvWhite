package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class o77 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ kbc f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ TextView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o77(TextView textView, TextView textView2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = textView;
        this.h = textView2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        TextView textView = this.h;
        TextView textView2 = this.g;
        switch (i) {
            case 0:
                o77 o77Var = new o77(textView2, textView, (lq4) obj3, 0);
                o77Var.f = (kbc) obj2;
                o77Var.invokeSuspend(sbiVar);
                break;
            case 1:
                o77 o77Var2 = new o77(textView2, textView, (lq4) obj3, 1);
                o77Var2.f = (kbc) obj2;
                o77Var2.invokeSuspend(sbiVar);
                break;
            default:
                o77 o77Var3 = new o77(textView2, textView, (lq4) obj3, 2);
                o77Var3.f = (kbc) obj2;
                o77Var3.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        TextView textView = this.h;
        TextView textView2 = this.g;
        kbc kbcVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                textView2.setTextColor(kbcVar.getText().b);
                textView.setTextColor(kbcVar.getText().b);
                break;
            case 1:
                ch3.d0(obj);
                textView2.setTextColor(kbcVar.getText().b);
                textView.setTextColor(kbcVar.getText().d);
                break;
            default:
                ch3.d0(obj);
                textView2.setTextColor(kbcVar.getText().b);
                textView.setTextColor(kbcVar.getText().e);
                break;
        }
        return sbiVar;
    }
}
