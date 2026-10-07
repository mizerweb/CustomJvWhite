package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class vh8 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ TextView f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh8(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        TextView textView = (TextView) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                vh8 vh8Var = new vh8(i2, lq4Var, 0);
                vh8Var.f = textView;
                vh8Var.g = kbcVar;
                vh8Var.invokeSuspend(sbiVar);
                break;
            default:
                vh8 vh8Var2 = new vh8(i2, lq4Var, 1);
                vh8Var2.f = textView;
                vh8Var2.g = kbcVar;
                vh8Var2.invokeSuspend(sbiVar);
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
                TextView textView = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                textView.setTextColor(kbcVar.getText().d);
                break;
            default:
                TextView textView2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                textView2.setTextColor(kbcVar2.getText().b);
                break;
        }
        return sbiVar;
    }
}
