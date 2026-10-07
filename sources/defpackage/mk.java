package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mk(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                hn1 hn1Var = (hn1) obj2;
                ik ikVar = (ik) obj;
                ViewGroup.LayoutParams layoutParams = hn1Var.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ikVar.a;
                    hn1Var.setLayoutParams(layoutParams);
                } else {
                    p51.d();
                }
                break;
            case 1:
                View view = (View) obj2;
                int i2 = g22.m;
                Rect rect = new Rect(0, -((int) (yl5.d().getDisplayMetrics().density * 16.0f)), view.getWidth(), ((ik) obj).a);
                float f = yl5.d().getDisplayMetrics().density * 16.0f;
                view.setClipToOutline(true);
                view.setOutlineProvider(new l7j(rect, f));
                break;
            case 2:
                ay4 ay4Var = (ay4) obj2;
                Matrix matrix = (Matrix) obj;
                boolean z = ay4Var.z;
                Matrix matrix2 = ay4Var.m;
                if (!z) {
                    float fFloatValue = 1.0f - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.0f);
                    matrix2.set(matrix);
                    matrix2.postScale(fFloatValue, 1.0f, ay4Var.k(), ay4Var.l());
                    ay4Var.l.set(matrix2);
                    z1k z1kVar = ay4Var.b;
                    if (z1kVar != null) {
                        z1kVar.h(matrix2);
                    }
                    break;
                }
                break;
            case 3:
                ((cf7) obj2).invoke((Float) valueAnimator.getAnimatedValue());
                ((su5) obj).invalidate();
                break;
            case 4:
                EditAndReplyScreen editAndReplyScreen = (EditAndReplyScreen) obj2;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                if (editAndReplyScreen.getView() != null) {
                    editAndReplyScreen.q1().setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
                break;
            case 5:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                zv8[] zv8VarArr2 = FakeInAppReviewBottomSheet.E;
                j8e j8eVar = fakeInAppReviewBottomSheet.v;
                zv8[] zv8VarArr3 = FakeInAppReviewBottomSheet.E;
                ((wf4) j8eVar.m(fakeInAppReviewBottomSheet, zv8VarArr3[0])).setAlpha(1.0f - valueAnimator3.getAnimatedFraction());
                ((FrameLayout) fakeInAppReviewBottomSheet.w.m(fakeInAppReviewBottomSheet, zv8VarArr3[1])).setAlpha(valueAnimator3.getAnimatedFraction());
                break;
            case 6:
                zv8[] zv8VarArr4 = MediaKeyboardWidget.u;
                float fFloatValue2 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                for (View view2 : (View[]) obj) {
                    view2.setScaleX(fFloatValue2);
                    view2.setScaleY(fFloatValue2);
                }
                break;
            case 7:
                int i3 = ogd.q;
                ((ogd) obj2).m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((View) obj).invalidateOutline();
                break;
            case 8:
                d0e d0eVar = (d0e) obj2;
                RectF rectF = (RectF) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                RectF rectF2 = d0eVar.d;
                RectF rectF3 = d0eVar.g;
                rectF2.set(tqk.c(rectF3.left, rectF.left, animatedFraction), tqk.c(rectF3.top, rectF.top, animatedFraction), tqk.c(rectF3.right, rectF.right, animatedFraction), tqk.c(rectF3.bottom, rectF.bottom, animatedFraction));
                d0eVar.invalidate();
                break;
            case 9:
                s6e s6eVar = (s6e) obj;
                RecyclerView recyclerView = ((t6e) obj2).a.e;
                ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    recyclerView.setLayoutParams(layoutParams2);
                    if (s6eVar != null) {
                        float animatedFraction2 = valueAnimator.getAnimatedFraction();
                        switch (s6eVar.a) {
                            case 0:
                                r6e r6eVar = s6eVar.b;
                                float f2 = s6eVar.c;
                                if (r6eVar != null) {
                                    r6eVar.b(((1.0f - f2) * animatedFraction2) + f2);
                                }
                                break;
                            default:
                                r6e r6eVar2 = s6eVar.b;
                                float f3 = s6eVar.c;
                                if (r6eVar2 != null) {
                                    r6eVar2.b((1.0f - animatedFraction2) * f3);
                                }
                                break;
                        }
                    }
                }
                break;
            default:
                ufe ufeVar = (ufe) obj;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((boh) obj2).scrollBy(iIntValue - ufeVar.a, 0);
                ufeVar.a = iIntValue;
                break;
        }
    }
}
