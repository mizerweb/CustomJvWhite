package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class yvf extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ TextView f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvf(int i, lq4 lq4Var, int i2) {
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
                yvf yvfVar = new yvf(i2, lq4Var, 0);
                yvfVar.f = textView;
                yvfVar.g = kbcVar;
                yvfVar.invokeSuspend(sbiVar);
                break;
            case 1:
                yvf yvfVar2 = new yvf(i2, lq4Var, 1);
                yvfVar2.f = textView;
                yvfVar2.g = kbcVar;
                yvfVar2.invokeSuspend(sbiVar);
                break;
            case 2:
                yvf yvfVar3 = new yvf(i2, lq4Var, 2);
                yvfVar3.f = textView;
                yvfVar3.g = kbcVar;
                yvfVar3.invokeSuspend(sbiVar);
                break;
            case 3:
                yvf yvfVar4 = new yvf(i2, lq4Var, i2);
                yvfVar4.f = textView;
                yvfVar4.g = kbcVar;
                yvfVar4.invokeSuspend(sbiVar);
                break;
            case 4:
                yvf yvfVar5 = new yvf(i2, lq4Var, 4);
                yvfVar5.f = textView;
                yvfVar5.g = kbcVar;
                yvfVar5.invokeSuspend(sbiVar);
                break;
            case 5:
                yvf yvfVar6 = new yvf(i2, lq4Var, 5);
                yvfVar6.f = textView;
                yvfVar6.g = kbcVar;
                yvfVar6.invokeSuspend(sbiVar);
                break;
            case 6:
                yvf yvfVar7 = new yvf(i2, lq4Var, 6);
                yvfVar7.f = textView;
                yvfVar7.g = kbcVar;
                yvfVar7.invokeSuspend(sbiVar);
                break;
            case 7:
                yvf yvfVar8 = new yvf(i2, lq4Var, 7);
                yvfVar8.f = textView;
                yvfVar8.g = kbcVar;
                yvfVar8.invokeSuspend(sbiVar);
                break;
            default:
                yvf yvfVar9 = new yvf(i2, lq4Var, 8);
                yvfVar9.f = textView;
                yvfVar9.g = kbcVar;
                yvfVar9.invokeSuspend(sbiVar);
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
            case 1:
                TextView textView2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                kbcVar2.getText();
                textView2.setTextColor(-1);
                break;
            case 2:
                TextView textView3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                textView3.setTextColor(kbcVar3.getText().d);
                break;
            case 3:
                TextView textView4 = this.f;
                kbc kbcVar4 = this.g;
                ch3.d0(obj);
                textView4.setTextColor(kbcVar4.getText().d);
                break;
            case 4:
                TextView textView5 = this.f;
                kbc kbcVar5 = this.g;
                ch3.d0(obj);
                textView5.setTextColor(kbcVar5.getText().d);
                break;
            case 5:
                TextView textView6 = this.f;
                kbc kbcVar6 = this.g;
                ch3.d0(obj);
                textView6.setTextColor(kbcVar6.getText().b);
                break;
            case 6:
                TextView textView7 = this.f;
                kbc kbcVar7 = this.g;
                ch3.d0(obj);
                textView7.setTextColor(kbcVar7.getText().d);
                break;
            case 7:
                TextView textView8 = this.f;
                kbc kbcVar8 = this.g;
                ch3.d0(obj);
                textView8.setTextColor(kbcVar8.getText().b);
                break;
            default:
                TextView textView9 = this.f;
                kbc kbcVar9 = this.g;
                ch3.d0(obj);
                textView9.setTextColor(kbcVar9.getText().d);
                break;
        }
        return sbiVar;
    }
}
