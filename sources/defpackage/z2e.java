package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class z2e extends ViewGroup implements eph {
    public final TextView a;
    public final urb b;
    public final v2e c;
    public final ny8 d;
    public final Paint e;
    public final ny8 f;
    public final ny8 g;
    public final int h;
    public final int i;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public z2e(Context context) {
        super(context);
        TextView textView = new TextView(context);
        q9i.a(q9i.k, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().d);
        textView.setSingleLine();
        np4.C(textView, false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        urb urbVar = new urb(context);
        q9i.a(q9i.g, urbVar);
        urbVar.setTextColor(a8gVar.h(urbVar).getText().c);
        urbVar.setSingleLine();
        np4.C(urbVar, false);
        urbVar.setEllipsize(truncateAt);
        urbVar.setFocusable(0);
        l8j.a(urbVar);
        urbVar.setVisibility(8);
        this.b = urbVar;
        v2e v2eVar = new v2e(context);
        v2eVar.setVisibility(8);
        this.c = v2eVar;
        this.d = rx8.P(3, new bzb(context, 21));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(a8gVar.h(this).l().a);
        this.e = paint;
        this.f = rx8.P(3, new bzb(context, 22));
        this.g = rx8.P(3, new bzb(context, 23));
        this.h = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        addView(textView);
        addView(urbVar);
        addView(v2eVar);
        onThemeChanged(a8gVar.h(this));
    }

    private final void setCounter(int i) {
        ny8 ny8Var = this.d;
        v0c v0cVar = (v0c) ny8Var.getValue();
        v0cVar.setVisibility(0);
        pu4.c(v0cVar, Integer.valueOf(i), false, 4);
        n7j.a(this, (View) ny8Var.getValue(), null);
        requestLayout();
        invalidate();
    }

    public final void a(String str, String str2, Integer num, boolean z, boolean z2) {
        v2e v2eVar = this.c;
        ny8 ny8Var = v2eVar.d;
        l1c l1cVar = v2eVar.b;
        v2eVar.setVisibility((str == null && (str2 == null || r5h.X0(str2)) && num == null && !z2) ? 8 : 0);
        Object obj = null;
        l1c.j(l1cVar, str2 != null ? v78.b(str2) : null, null, 6);
        ((wj7) l1cVar.getHierarchy()).m(z ? eve.a() : null);
        v2eVar.g = null;
        if (z2) {
            l1cVar.setVisibility(0);
            l1c.j(l1cVar, null, null, 6);
            ((wj7) l1cVar.getHierarchy()).i(1, (Drawable) v2eVar.f.getValue());
            v2eVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (str2 != null && !r5h.X0(str2)) {
            l1cVar.setVisibility(0);
            if (ny8Var.d()) {
                ((View) ny8Var.getValue()).setVisibility(8);
            }
            ((wj7) l1cVar.getHierarchy()).i(1, null);
            v2eVar.setPadding(0, 0, 0, 0);
            v2eVar.setBackgroundColor(0);
            return;
        }
        if (str == null) {
            if (num != null) {
                l1cVar.setVisibility(0);
                if (ny8Var.d()) {
                    ((View) ny8Var.getValue()).setVisibility(8);
                }
                Context context = v2eVar.getContext();
                int iIntValue = num.intValue();
                a8g a8gVar = pq3.j;
                v2eVar.g = sb8.D(iIntValue, a8gVar.h(v2eVar).getIcon().c, context);
                ((wj7) l1cVar.getHierarchy()).i(1, v2eVar.g);
                int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                v2eVar.setPadding(iK, iK, iK, iK);
                v2eVar.setBackgroundColor(a8gVar.h(v2eVar).h().b);
                return;
            }
            return;
        }
        l1cVar.setVisibility(8);
        ((View) ny8Var.getValue()).setVisibility(0);
        v2eVar.setPadding(0, 0, 0, 0);
        String strR1 = r5h.r1('.', str, str);
        for (Object obj2 : xp6.c) {
            if (z5h.G0(((xp6) obj2).name(), strR1, true)) {
                obj = obj2;
                break;
            }
        }
        zp6 zp6VarC = (xp6) obj;
        if (zp6VarC == null) {
            yp6 yp6Var = yp6.c;
            zp6VarC = mxl.c(strR1);
        }
        ((jr6) v2eVar.c.getValue()).a(zp6VarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingStart;
        float strokeWidth;
        float f;
        float measuredWidth;
        float strokeWidth2;
        boolean zG0 = yab.g0(this);
        Paint paint = this.e;
        ny8 ny8Var = this.f;
        if (zG0) {
            if (n7j.o(ny8Var)) {
                measuredWidth = zo5.D(2.0f, yl5.d().getDisplayMetrics().density, (getMeasuredWidth() - getPaddingEnd()) - n7j.k(ny8Var));
                strokeWidth2 = paint.getStrokeWidth();
            } else {
                measuredWidth = getMeasuredWidth() - getPaddingEnd();
                strokeWidth2 = paint.getStrokeWidth();
            }
            f = measuredWidth - (strokeWidth2 / 2.0f);
        } else {
            if (n7j.o(ny8Var)) {
                paddingStart = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, n7j.k(ny8Var) + getPaddingStart());
                strokeWidth = paint.getStrokeWidth();
            } else {
                paddingStart = getPaddingStart();
                strokeWidth = paint.getStrokeWidth();
            }
            f = paddingStart + (strokeWidth / 2.0f);
        }
        float f2 = f;
        canvas.drawLine(f2, getPaddingTop(), f2, getMeasuredHeight() - getPaddingBottom(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ny8 ny8Var = this.d;
        if (ny8Var.d() && view == ny8Var.getValue() && this.c.getVisibility() != 0) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final TextView getTitleView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        ny8 ny8Var = this.f;
        if (n7j.o(ny8Var)) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            qyj.L(imageView, paddingStart, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingStart, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            paddingStart = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, imageView.getMeasuredWidth(), paddingStart);
        }
        int iK = gm0.K(this.e.getStrokeWidth());
        int i5 = this.h;
        int measuredWidth = iK + i5 + paddingStart;
        v2e v2eVar = this.c;
        if (v2eVar.getVisibility() == 0) {
            qyj.L(v2eVar, measuredWidth, (getMeasuredHeight() / 2) - (v2eVar.getMeasuredHeight() / 2), v2eVar.getMeasuredWidth() + measuredWidth, (v2eVar.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            measuredWidth += v2eVar.getMeasuredWidth() + i5;
            ny8 ny8Var2 = this.d;
            if (ny8Var2.d()) {
                v0c v0cVar = (v0c) ny8Var2.getValue();
                qyj.L(v0cVar, zo5.D(2.0f, yl5.d().getDisplayMetrics().density, v2eVar.getLeft()), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, v2eVar.getBottom()) - v0cVar.getMeasuredHeight(), v0cVar.getMeasuredWidth() + zo5.D(2.0f, yl5.d().getDisplayMetrics().density, v2eVar.getLeft()), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, v2eVar.getBottom()));
            }
        }
        urb urbVar = this.b;
        int visibility = urbVar.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            qyj.M(textView, measuredWidth, zo5.b(4.0f, yl5.d().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int iD = zo5.D(4.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            qyj.L(urbVar, measuredWidth, iD - urbVar.getMeasuredHeight(), urbVar.getMeasuredWidth() + measuredWidth, iD);
        } else {
            qyj.L(textView, measuredWidth, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + measuredWidth, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        ny8 ny8Var3 = this.g;
        if (n7j.o(ny8Var3)) {
            ImageView imageView2 = (ImageView) ny8Var3.getValue();
            int iD2 = zo5.D(36.0f, yl5.d().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            qyj.L(imageView2, iD2, (getMeasuredHeight() / 2) - (imageView2.getMeasuredHeight() / 2), imageView2.getMeasuredWidth() + iD2, (imageView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = yl5.d().getDisplayMetrics().density * 2.0f;
        Paint paint = this.e;
        paint.setStrokeWidth(f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int iK = gm0.K(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.h;
        int paddingEnd = getPaddingEnd() + iK + i3;
        ny8 ny8Var = this.f;
        if (n7j.o(ny8Var)) {
            int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
            ((ImageView) ny8Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK2, 1073741824), View.MeasureSpec.makeMeasureSpec(iK2, 1073741824));
            paddingEnd = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, ((ImageView) ny8Var.getValue()).getMeasuredWidth(), paddingEnd);
        }
        v2e v2eVar = this.c;
        if (v2eVar.getVisibility() == 0) {
            int iK3 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
            v2eVar.measure(View.MeasureSpec.makeMeasureSpec(iK3, 1073741824), View.MeasureSpec.makeMeasureSpec(iK3, 1073741824));
            paddingEnd += v2eVar.getMeasuredWidth() + i3;
            ny8 ny8Var2 = this.d;
            if (ny8Var2.d()) {
                ((v0c) ny8Var2.getValue()).measure(0, 0);
            }
        }
        ny8 ny8Var3 = this.g;
        if (n7j.o(ny8Var3)) {
            int iK4 = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
            ((ImageView) ny8Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK4, 1073741824), View.MeasureSpec.makeMeasureSpec(iK4, 1073741824));
            paddingEnd = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, ((ImageView) ny8Var3.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int i4 = size - paddingEnd;
        if (i4 < 0) {
            i4 = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec, 0);
        urb urbVar = this.b;
        urbVar.measure(iMakeMeasureSpec, 0);
        int measuredHeight = urbVar.getMeasuredHeight() + textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom() + this.i;
        if (v2eVar.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + bc1.g(2.0f, yl5.d().getDisplayMetrics().density, 2, v2eVar.getMeasuredHeight()));
        } else {
            setMeasuredDimension(size, measuredHeight);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setTextColor(kbcVar.getText().d);
        this.b.setTextColor(kbcVar.getText().c);
        this.e.setColor(kbcVar.l().a);
        ny8 ny8Var = this.d;
        if (ny8Var.d()) {
            ((v0c) ny8Var.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var2 = this.f;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
        }
        ny8 ny8Var3 = this.g;
        if (ny8Var3.d()) {
            ((ImageView) ny8Var3.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().c));
        }
        v2e v2eVar = this.c;
        ny8 ny8Var4 = v2eVar.f;
        ny8 ny8Var5 = v2eVar.e;
        ny8 ny8Var6 = v2eVar.c;
        if (ny8Var6.d()) {
            ((jr6) ny8Var6.getValue()).onThemeChanged(kbcVar);
        }
        if (((wj7) v2eVar.b.getHierarchy()).e.d(1) != null) {
            v2eVar.setBackgroundColor(kbcVar.h().b);
            sb8.m0(kbcVar.getIcon().c, v2eVar.g);
        }
        if (ny8Var5.d() && ((LayerDrawable) ny8Var5.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable = (LayerDrawable) ny8Var5.getValue();
            int i = kbcVar.b().g;
            Drawable drawable = layerDrawable.getDrawable(0);
            sb8.m0(i, drawable);
            layerDrawable.setDrawable(0, drawable);
            LayerDrawable layerDrawable2 = (LayerDrawable) ny8Var5.getValue();
            int i2 = kbcVar.getIcon().g;
            Drawable drawable2 = layerDrawable2.getDrawable(1);
            sb8.m0(i2, drawable2);
            layerDrawable2.setDrawable(1, drawable2);
        }
        if (ny8Var4.d() && ((LayerDrawable) ny8Var4.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable3 = (LayerDrawable) ny8Var4.getValue();
            int i3 = ((xac) kbcVar.f().a).a.e;
            Drawable drawable3 = layerDrawable3.getDrawable(0);
            sb8.m0(i3, drawable3);
            layerDrawable3.setDrawable(0, drawable3);
            LayerDrawable layerDrawable4 = (LayerDrawable) ny8Var4.getValue();
            int i4 = kbcVar.getIcon().d;
            Drawable drawable4 = layerDrawable4.getDrawable(1);
            sb8.m0(i4, drawable4);
            layerDrawable4.setDrawable(1, drawable4);
        }
        setBackgroundColor(pq3.j.h(this).k().b);
    }

    public final void setAttachDescription(n40 n40Var) {
        setBody(n40Var != null ? n40Var.a : null);
        a(n40Var != null ? n40Var.b : null, n40Var != null ? n40Var.c : null, n40Var != null ? n40Var.d : null, n40Var != null && n40Var.f, n40Var != null && n40Var.g);
        setCounter(n40Var != null ? n40Var.e : null);
    }

    public final void setBody(CharSequence charSequence) {
        urb urbVar = this.b;
        if (charSequence == null || r5h.X0(charSequence)) {
            urbVar.setVisibility(8);
            return;
        }
        urbVar.setVisibility(0);
        urbVar.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z) {
        this.c.setDrawOverlay(z);
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        ny8 ny8Var = this.g;
        if (ny8Var.d()) {
            qe7.H((ImageView) ny8Var.getValue(), 300L, onClickListener);
        }
    }

    public final void setEndIconDrawable(Drawable drawable) {
        ny8 ny8Var = this.g;
        if (drawable != null) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            n7j.a(this, (View) ny8Var.getValue(), -1);
        } else if (ny8Var.d()) {
            ImageView imageView2 = (ImageView) ny8Var.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.c, 300L, onClickListener);
    }

    public final void setStartIconClickListener(View.OnClickListener onClickListener) {
        ny8 ny8Var = this.f;
        if (ny8Var.d()) {
            qe7.H((ImageView) ny8Var.getValue(), 300L, onClickListener);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        ny8 ny8Var = this.f;
        if (drawable != null) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            n7j.a(this, (View) ny8Var.getValue(), -1);
        } else if (ny8Var.d()) {
            ImageView imageView2 = (ImageView) ny8Var.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setCounter(Integer num) {
        if (num == null) {
            ny8 ny8Var = this.d;
            if (ny8Var.d()) {
                ((v0c) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
