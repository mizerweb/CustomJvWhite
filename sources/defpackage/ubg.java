package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ubg implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wbg b;
    public final /* synthetic */ int c;

    public /* synthetic */ ubg(wbg wbgVar, int i, int i2) {
        this.a = i2;
        this.b = wbgVar;
        this.c = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = this.c;
        wbg wbgVar = this.b;
        tg8 tg8Var = (tg8) obj;
        switch (i) {
            case 0:
                wbgVar.getClass();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new vbg(tg8Var, 0));
                valueAnimatorOfFloat.addListener(new ea0(tg8Var, i2, 3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                wbgVar.getClass();
                wbg.a(tg8Var, i2);
                break;
            default:
                wbgVar.getClass();
                wbg.a(tg8Var, i2);
                break;
        }
        return sbiVar;
    }
}
