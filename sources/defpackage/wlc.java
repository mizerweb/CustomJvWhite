package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class wlc extends a29 {
    public final /* synthetic */ int q;
    public final /* synthetic */ ecg r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlc(ecg ecgVar, Context context, int i) {
        super(context);
        this.q = i;
        this.r = ecgVar;
    }

    @Override // defpackage.a29
    public final float d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.q) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // defpackage.a29
    public int f(int i) {
        switch (this.q) {
            case 0:
                return Math.min(100, super.f(i));
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.a29
    public final void p(View view, hfe hfeVar, ffe ffeVar) {
        int i = this.q;
        DecelerateInterpolator decelerateInterpolator = this.j;
        ecg ecgVar = this.r;
        switch (i) {
            case 0:
                v8j v8jVar = (v8j) ecgVar;
                int[] iArrC = v8jVar.c(v8jVar.a.getLayoutManager(), view);
                int i2 = iArrC[0];
                int i3 = iArrC[1];
                int iE = e(Math.max(Math.abs(i2), Math.abs(i3)));
                if (iE > 0) {
                    ffeVar.b(i2, i3, iE, decelerateInterpolator);
                }
                break;
            default:
                RecyclerView recyclerView = ecgVar.a;
                if (recyclerView != null) {
                    int[] iArrC2 = ecgVar.c(recyclerView.getLayoutManager(), view);
                    int i4 = iArrC2[0];
                    int i5 = iArrC2[1];
                    int iE2 = e(Math.max(Math.abs(i4), Math.abs(i5)));
                    if (iE2 > 0) {
                        ffeVar.b(i4, i5, iE2, decelerateInterpolator);
                    }
                    break;
                }
                break;
        }
    }
}
