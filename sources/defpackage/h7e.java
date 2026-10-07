package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class h7e extends PopupWindow implements u6e {
    public final Context a;
    public final ExecutorService b;
    public v6e c;
    public Rect d;
    public View e;
    public ValueAnimator g;
    public AnimatorSet h;
    public Long i;
    public f7e l;
    public int m;
    public final int[] f = new int[2];
    public int j = 1;
    public int k = 1;

    public h7e(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // defpackage.u6e
    public final void G0() {
        Long l = this.i;
        if (l != null) {
            long jLongValue = l.longValue();
            f7e f7eVar = this.l;
            List listS = f7eVar != null ? f7eVar.S(jLongValue) : null;
            v6e v6eVar = this.c;
            if (listS == null || v6eVar == null) {
                return;
            }
            v6e.d(v6eVar, listS, null, null, 6);
            p0m.a(v6eVar.e, lt7.KEYBOARD_TAP);
            View view = this.e;
            Rect rect = this.d;
            if (view == null || rect == null) {
                gm0.n(h7e.class.getName(), "Can't calculate direction for expand reaction popup");
            } else {
                this.k = rect.bottom - (view.getHeight() + this.f[1]) >= gm0.K(240.0f * yl5.d().getDisplayMetrics().density) ? 1 : 2;
            }
            int iA = v6eVar.a(listS.size());
            View contentView = getContentView();
            FrameLayout frameLayout = contentView instanceof FrameLayout ? (FrameLayout) contentView : null;
            if (frameLayout == null) {
                gm0.n(h7e.class.getName(), "Can't find container for reactionView");
                return;
            }
            int height = frameLayout.getHeight();
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            e7e e7eVar = new e7e(this, iArr[0], iArr[1] + height);
            v6e v6eVar2 = this.c;
            View contentView2 = getContentView();
            ViewGroup viewGroup = contentView2 instanceof ViewGroup ? (ViewGroup) contentView2 : null;
            if (v6eVar2 == null || viewGroup == null) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, iA);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ak(27, e7eVar));
            valueAnimatorOfInt.addListener(new ea0(e7eVar, iA, 2));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, iA);
            valueAnimatorOfInt2.setDuration(300L);
            valueAnimatorOfInt2.setStartDelay(75L);
            valueAnimatorOfInt2.addUpdateListener(new d7e(v6eVar2, viewGroup, 1));
            valueAnimatorOfInt2.addListener(new g7e(v6eVar2, viewGroup, iA, 0));
            AnimatorSet animatorSet = this.h;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            animatorSet2.start();
            this.h = animatorSet2;
        }
    }

    @Override // defpackage.u6e
    public final void P0(g6e g6eVar) {
        Long l = this.i;
        if (l == null) {
            gm0.Y(h7e.class.getName(), "not found messageId when try to react on msg");
            return;
        }
        f7e f7eVar = this.l;
        if (f7eVar != null) {
            f7eVar.E(l.longValue(), g6eVar.b);
        }
        dismiss();
    }

    public final void a() {
        dismiss();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = null;
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g = null;
        this.c = null;
        this.e = null;
        this.d = null;
        this.i = null;
    }

    public final void b(List list, Integer num) {
        Context context = this.a;
        v6e v6eVar = new v6e(context, this.b);
        v6e.d(v6eVar, list, null, null, 6);
        v6eVar.c = this;
        this.c = v6eVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), frameLayout.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), frameLayout.getPaddingBottom());
        v6e v6eVar2 = this.c;
        RecyclerView recyclerView = v6eVar2 != null ? v6eVar2.e : null;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (num != null) {
            layoutParams.gravity = num.intValue();
        }
        frameLayout.addView(recyclerView, layoutParams);
        setContentView(frameLayout);
        View contentView = getContentView();
        Rect rect = this.d;
        contentView.measure(View.MeasureSpec.makeMeasureSpec(rect != null ? rect.width() : 0, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getContentView().getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = -2;
        }
        setWidth(measuredWidth);
        setHeight(-2);
        setElevation(yl5.d().getDisplayMetrics().density * 8.0f);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void c(final int i) {
        final v6e v6eVar = this.c;
        final View view = this.e;
        final Rect rect = this.d;
        if (v6eVar == null || view == null || rect == null || !view.isAttachedToWindow()) {
            gm0.n(h7e.class.getName(), "Can't show collapsed reaction popup");
        } else if (view.isLaidOut() && view.isAttachedToWindow()) {
            d(v6eVar, view, i, rect);
        } else {
            n7j.e(view, new af7() { // from class: c7e
                @Override // defpackage.af7
                public final Object invoke() {
                    this.a.d(v6eVar, view, i, rect);
                    return Boolean.TRUE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    public final void d(v6e v6eVar, View view, int i, Rect rect) {
        int iK;
        Integer numValueOf;
        int iWidth;
        int i2;
        int height;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        v6e v6eVar2 = this.c;
        RecyclerView recyclerView = v6eVar2 != null ? v6eVar2.e : null;
        Rect rect2 = this.d;
        if (recyclerView == null || rect2 == null) {
            gm0.n(h7e.class.getName(), "Can't calculate height for collapsed reactions popup");
            iK = 0;
        } else {
            iK = gm0.K(240.0f * yl5.d().getDisplayMetrics().density);
            View rootView = recyclerView.getRootView();
            if (rootView != null) {
                iWidth = rootView.getWidth();
            } else {
                Rect rect3 = this.d;
                if (rect3 != null) {
                    iWidth = rect3.width();
                } else {
                    numValueOf = null;
                }
                if (iK > 0 || numValueOf == null) {
                    iK = 0;
                } else {
                    recyclerView.measure(View.MeasureSpec.makeMeasureSpec(numValueOf.intValue(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE));
                    int measuredHeight = recyclerView.getMeasuredHeight();
                    if (measuredHeight <= iK) {
                        iK = measuredHeight;
                    }
                    if (iK < 1) {
                        iK = 1;
                    }
                }
                i2 = rect2.bottom;
                height = view.getHeight() + iArr[1];
                if (height < 0) {
                    height = 0;
                }
                if (i2 - height >= iK) {
                    z = true;
                } else {
                    z = false;
                }
                i3 = iArr[1] - rect2.top;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= iK) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    i4 = 1;
                } else if (z2) {
                    i4 = 2;
                } else {
                    i4 = 3;
                }
                this.j = i4;
            }
            numValueOf = Integer.valueOf(iWidth);
            if (iK > 0) {
                iK = 0;
            } else {
                iK = 0;
            }
            i2 = rect2.bottom;
            height = view.getHeight() + iArr[1];
            if (height < 0) {
                height = 0;
            }
            if (i2 - height >= iK) {
                z = true;
            } else {
                z = false;
            }
            i3 = iArr[1] - rect2.top;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= iK) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = 1;
            } else if (z2) {
                i4 = 2;
            } else {
                i4 = 3;
            }
            this.j = i4;
        }
        RecyclerView recyclerView2 = v6eVar.e;
        ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = this.j == 1 ? 48 : 80;
        recyclerView2.setLayoutParams(layoutParams2);
        int i5 = iArr[0];
        int i6 = iArr[1];
        int height2 = view.getHeight() + i6;
        int iD = qt4.D(this.j);
        if (iD == 0) {
            showAtLocation(view, i, i5, zo5.b(4.0f, yl5.d().getDisplayMetrics().density, height2) + this.m);
        } else if (iD == 1) {
            showAtLocation(view, i, i5, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, i6 - iK) - this.m);
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            showAtLocation(view, i, i5, zo5.D(24.0f, yl5.d().getDisplayMetrics().density, rect.bottom - iK) - this.m);
        }
        v6e v6eVar3 = this.c;
        View contentView = getContentView();
        ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
        if (v6eVar3 == null || viewGroup == null) {
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iK);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new d7e(v6eVar3, viewGroup, 0));
        valueAnimatorOfInt.addListener(new g7e(v6eVar3, viewGroup, iK, 1));
        valueAnimatorOfInt.start();
        this.g = valueAnimatorOfInt;
    }
}
