package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i9c implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9c b;

    public /* synthetic */ i9c(l9c l9cVar, int i) {
        this.a = i;
        this.b = l9cVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        l9c l9cVar = this.b;
        switch (i) {
            case 0:
                return l9c.u(l9cVar);
            case 1:
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(pq3.j.h(l9cVar).k().f, -9956353);
                valueAnimatorOfArgb.addUpdateListener(new ak(22, l9cVar));
                valueAnimatorOfArgb.setDuration(650L);
                valueAnimatorOfArgb.setStartDelay(800L);
                return valueAnimatorOfArgb;
            default:
                p0m.a(l9cVar, lt7.CONFIRM);
                return sbi.a;
        }
    }
}
