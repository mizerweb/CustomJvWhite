package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class myi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pyi b;

    public /* synthetic */ myi(pyi pyiVar, int i) {
        this.a = i;
        this.b = pyiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        pyi pyiVar = this.b;
        switch (i) {
            case 0:
                pyiVar.setProgressForced(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pyiVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pyiVar.invalidate();
                break;
        }
    }
}
