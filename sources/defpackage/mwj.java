package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class mwj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ swj a;
    public final /* synthetic */ ixj b;
    public final /* synthetic */ ixj c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public mwj(swj swjVar, ixj ixjVar, ixj ixjVar2, int i, View view) {
        this.a = swjVar;
        this.b = ixjVar;
        this.c = ixjVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        xwj uwjVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        swj swjVar = this.a;
        rwj rwjVar = swjVar.a;
        rwjVar.d(animatedFraction);
        float fB = rwjVar.b();
        PathInterpolator pathInterpolator = owj.e;
        int i = Build.VERSION.SDK_INT;
        ixj ixjVar = this.b;
        if (i >= 34) {
            uwjVar = new wwj(ixjVar);
        } else if (i >= 30) {
            uwjVar = new vwj(ixjVar);
        } else {
            uwjVar = i >= 29 ? new uwj(ixjVar) : new twj(ixjVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            exj exjVar = ixjVar.a;
            if (i3 == 0) {
                uwjVar.c(i2, exjVar.f(i2));
            } else {
                mi8 mi8VarF = exjVar.f(i2);
                mi8 mi8VarF2 = this.c.a.f(i2);
                float f = 1.0f - fB;
                uwjVar.c(i2, ixj.e(mi8VarF, (int) (((double) ((mi8VarF.a - mi8VarF2.a) * f)) + 0.5d), (int) (((double) ((mi8VarF.b - mi8VarF2.b) * f)) + 0.5d), (int) (((double) ((mi8VarF.c - mi8VarF2.c) * f)) + 0.5d), (int) (((double) ((mi8VarF.d - mi8VarF2.d) * f)) + 0.5d)));
            }
        }
        owj.g(this.e, uwjVar.b(), Collections.singletonList(swjVar));
    }
}
