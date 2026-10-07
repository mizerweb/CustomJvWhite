package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q9c extends ViewGroup {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public o9c e;
    public final ny8 f;
    public final pj g;
    public final ArrayList h;
    public n9c i;
    public in2 j;
    public final Path k;

    public q9c(Context context) {
        super(context);
        this.a = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.c = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.e = o9c.a;
        this.f = rx8.P(3, new bzb(context, 12));
        this.g = new pj(5, this);
        this.h = new ArrayList();
        this.k = new Path();
    }

    public static void a(Canvas canvas, float f, Drawable drawable, in2 in2Var, int i) {
        if (in2Var == null) {
            drawable.draw(canvas);
            return;
        }
        Float f2 = (Float) a.d1(in2Var.e, i);
        float fFloatValue = f2 != null ? f2.floatValue() : 1.0f;
        int iSave = canvas.save();
        canvas.scale(fFloatValue, fFloatValue, f, f);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final int getAvatarsWidth() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return (arrayList.size() * this.a) - ((arrayList.size() - 1) * this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float fO0;
        float f2 = this.a / 2.0f;
        float measuredHeight = (getMeasuredHeight() / 2.0f) - f2;
        int iOrdinal = this.e.ordinal();
        ArrayList arrayList = this.h;
        if (iOrdinal == 0) {
            f = yl5.d().getDisplayMetrics().density;
            fO0 = 0.0f;
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            f = this.a - this.b;
            fO0 = xw3.O0(arrayList);
        }
        float f3 = f * fO0;
        int iOrdinal2 = this.e.ordinal();
        Path path = this.k;
        if (iOrdinal2 == 0) {
            int i = this.a;
            int i2 = i - this.b;
            float f4 = i / 2.0f;
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    xw3.V0();
                    throw null;
                }
                Drawable drawable = (Drawable) obj;
                int iSave = canvas.save();
                canvas.translate(f3, measuredHeight);
                float f5 = i2;
                f3 += f5;
                try {
                    if (i3 != xw3.O0(arrayList) || this.d) {
                        path.reset();
                        path.addCircle(f5 + f2, f4, this.c + f2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipOutPath(path);
                        a(canvas, f4, drawable, this.j, i3);
                        canvas.restore();
                    } else {
                        a(canvas, f4, drawable, this.j, i3);
                    }
                    canvas.restoreToCount(iSave);
                    i3 = i4;
                    f2 = f2;
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        } else {
            if (iOrdinal2 != 1) {
                ore.o();
                return;
            }
            int i5 = this.a;
            int i6 = i5 - this.b;
            float f6 = i5 / 2.0f;
            for (int iO0 = xw3.O0(arrayList); -1 < iO0; iO0--) {
                Drawable drawable2 = (Drawable) arrayList.get(iO0);
                int iSave2 = canvas.save();
                canvas.translate(f3, measuredHeight);
                if (iO0 == 0) {
                    try {
                        if (this.d) {
                            path.reset();
                            path.addCircle(f2 - i6, f6, this.c + f2, Path.Direction.CW);
                            canvas.save();
                            canvas.clipOutPath(path);
                            a(canvas, f6, drawable2, this.j, iO0);
                            canvas.restore();
                        } else {
                            a(canvas, f6, drawable2, this.j, iO0);
                        }
                    } catch (Throwable th2) {
                        canvas.restoreToCount(iSave2);
                        throw th2;
                    }
                } else {
                    path.reset();
                    path.addCircle(f2 - i6, f6, this.c + f2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipOutPath(path);
                    a(canvas, f6, drawable2, this.j, iO0);
                    canvas.restore();
                }
                f3 -= i6;
                canvas.restoreToCount(iSave2);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getAvatarsCount() {
        return this.h.size();
    }

    public final boolean getClipLastAvatar() {
        return this.d;
    }

    public final o9c getOverlayType() {
        return this.e;
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        in2 in2Var = this.j;
        if (in2Var != null) {
            in2Var.d(getAvatarsCount());
        }
        in2 in2Var2 = this.j;
        if (in2Var2 != null) {
            in2Var2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        in2 in2Var = this.j;
        if (in2Var != null) {
            in2Var.stop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewI = n7j.i(this.f);
        if (viewI == null) {
            return;
        }
        int iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getAvatarsWidth());
        viewI.layout(iB, c0a.g(viewI, 2, getMeasuredHeight() / 2), viewI.getMeasuredWidth() + iB, (viewI.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int avatarsWidth = getAvatarsWidth();
        int iMax = this.a;
        View viewI = n7j.i(this.f);
        if (viewI != null) {
            int iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, size - avatarsWidth);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = iD - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i4 = i3 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            if (i4 < 0) {
                i4 = 0;
            }
            viewI.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            avatarsWidth = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, viewI.getMeasuredWidth(), avatarsWidth);
            iMax = Math.max(this.a, viewI.getMeasuredHeight());
        }
        setMeasuredDimension(avatarsWidth, iMax);
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<ylc> list) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        for (ylc ylcVar : list) {
            tj0 tj0Var = (tj0) ylcVar.a;
            String str = (String) ylcVar.b;
            tvb tvbVar = new tvb(getContext());
            tvbVar.setCallback(this.g);
            int i = this.a;
            tvbVar.setBounds(0, 0, i, i);
            tvbVar.b(tj0Var, str);
            arrayList.add(tvbVar);
        }
        in2 in2Var = this.j;
        if (in2Var != null) {
            if (list.isEmpty()) {
                in2Var.stop();
            } else {
                in2Var.d(list.size());
                in2Var.start();
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setClipLastAvatar(boolean z) {
        this.d = z;
        requestLayout();
        invalidate();
    }

    public final void setListener(n9c n9cVar) {
        this.i = n9cVar;
    }

    public final void setOverlayType(o9c o9cVar) {
        this.e = o9cVar;
        requestLayout();
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setTitle(ynh ynhVar) {
        ny8 ny8Var = this.f;
        if (ynhVar == null) {
            ((TextView) ny8Var.getValue()).setText((CharSequence) null);
            ((TextView) ny8Var.getValue()).setVisibility(8);
        } else {
            yab.e(this, (View) ny8Var.getValue(), -1);
            ((TextView) ny8Var.getValue()).setText(ynhVar.b(getContext()));
            ((TextView) ny8Var.getValue()).setVisibility(0);
        }
    }
}
