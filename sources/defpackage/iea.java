package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class iea extends ViewGroup {
    public boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public ViewGroup g;
    public View h;
    public final ny8 i;
    public long j;
    public final RectF k;
    public cf7 l;

    public iea(Context context, ny8 ny8Var) {
        super(context);
        this.b = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        this.c = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        this.d = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.e = gm0.K(38.0f * yl5.d().getDisplayMetrics().density);
        this.f = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.i = ny8Var;
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.k = new RectF();
    }

    private final a31 getBubbleUiOptions() {
        return (a31) this.i.getValue();
    }

    public final int a(int i, hea heaVar) {
        if (this.a) {
            i -= this.e;
        }
        return i - (heaVar.getMarginEnd() + (getPaddingEnd() + (getPaddingStart() + heaVar.getMarginStart())));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cf7 cf7Var;
        RectF rectF = this.k;
        if (!rectF.isEmpty()) {
            long j = this.j;
            if (j != -1 && j != 0 && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1 && (cf7Var = this.l) != null) {
                    cf7Var.invoke(Long.valueOf(this.j));
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final long getAvatarId() {
        return this.j;
    }

    public final View getContentView$message_list() {
        return this.g;
    }

    public final int getContentViewTopMargin() {
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final int getMaxAvailableWidth$message_list() {
        View view = this.h;
        ViewGroup viewGroup = this.g;
        if (view != null && view.getVisibility() == 0) {
            return a(getMeasuredWidth(), (hea) view.getLayoutParams());
        }
        if (viewGroup == null) {
            return getMeasuredWidth();
        }
        return a(getMeasuredWidth(), (hea) viewGroup.getLayoutParams());
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final cf7 getOnAvatarClickListener$message_list() {
        return this.l;
    }

    public final View getOutsideBubbleView$message_list() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            int paddingStart = getPaddingStart();
            hea heaVar = (hea) viewGroup.getLayoutParams();
            if (heaVar.a) {
                if (this.a) {
                    paddingStart += this.b + this.d;
                }
                marginEnd = heaVar.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - viewGroup.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                marginEnd = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i5 = ((ViewGroup.MarginLayoutParams) heaVar).topMargin;
            qyj.M(viewGroup, marginEnd, i5, 0, 12);
            View view = this.h;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            qyj.M(view, marginEnd, viewGroup.getMeasuredHeight() + i5 + this.f, 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (this.a) {
            iMax = this.b + this.c;
        } else {
            iMax = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            View view = this.h;
            int i3 = (view == null || view.getVisibility() != 0) ? Integer.MIN_VALUE : 1073741824;
            hea heaVar = (hea) viewGroup.getLayoutParams();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((gm0.K(10.0f * yl5.d().getDisplayMetrics().density) * 2) + ((vxb) getBubbleUiOptions()).e(sfl.c(sfl.b(0, this.a), heaVar.a)), i3), i2);
            iMax = Math.max(iMax, viewGroup.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) heaVar).topMargin + ((ViewGroup.MarginLayoutParams) heaVar).bottomMargin);
            if (view != null && view.getVisibility() == 0) {
                hea heaVar2 = (hea) view.getLayoutParams();
                Drawable background = viewGroup.getBackground();
                fea feaVar = background instanceof fea ? (fea) background : null;
                view.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth() - (feaVar != null ? (int) feaVar.s : 0), 1073741824), i2);
                iMax = view.getMeasuredHeight() + this.f + ((ViewGroup.MarginLayoutParams) heaVar2).topMargin + ((ViewGroup.MarginLayoutParams) heaVar2).bottomMargin + iMax;
            }
        }
        setMeasuredDimension(defaultSize, iMax);
    }

    public final void setAvatarId(long j) {
        this.j = j;
    }

    public final void setOffsetBubbleByAvatar(boolean z) {
        this.a = z;
    }

    public final void setOnAvatarClickListener$message_list(cf7 cf7Var) {
        this.l = cf7Var;
    }
}
