package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class z5d extends ViewGroup implements eph {
    public final ImageView a;
    public final jac b;

    public z5d(Context context) {
        super(context, null);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.icon_reorder).mutate());
        x05.j(6.0f, yl5.d().getDisplayMetrics().density, imageView);
        a8g a8gVar = pq3.j;
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().d));
        this.a = imageView;
        jac jacVar = new jac(context);
        jacVar.setEndIconDrawable(null);
        jacVar.setFilters(new InputFilter[]{new x5d()});
        jacVar.setLimitErrorTextColorAttr(Integer.valueOf(R.attr.text_negative));
        this.b = jacVar;
        addView(imageView);
        addView(jacVar);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 16.0f);
        setBackground(gradientDrawable);
        setDescendantFocusability(262144);
        onThemeChanged(a8gVar.h(this));
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.b.b.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int measuredHeight = getMeasuredHeight();
        ImageView imageView = this.a;
        qyj.M(imageView, paddingStart, (measuredHeight - imageView.getMeasuredHeight()) / 2, 0, 12);
        int iJ = yab.J(imageView);
        int measuredHeight2 = getMeasuredHeight();
        jac jacVar = this.b;
        qyj.M(jacVar, iJ, (measuredHeight2 - jacVar.getMeasuredHeight()) / 2, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iK = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int iA = qv1.a(30.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(30.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        ImageView imageView = this.a;
        imageView.measure(iA, iMakeMeasureSpec);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(paddingStart - (imageView.getMeasuredWidth() - gm0.K(12.0f * yl5.d().getDisplayMetrics().density)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE));
        setMeasuredDimension(size, iK);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return nl9.d(this.b.b, true);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        this.b.onThemeChanged(kbcVar);
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(kbcVar.b().f));
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.b.setHint(charSequence.toString());
    }

    public final void setImeOptions(Integer num) {
        this.b.setImeOptions(num);
    }

    public final void setLengthLimit(int i) {
        jac jacVar = this.b;
        jacVar.setMaxLengthForLabel(i);
        jacVar.setFilters((InputFilter[]) a.j1(jacVar.getFilters(), new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)}));
    }

    public final void setOnDragIconTouchListener(qf7 qf7Var) {
        this.a.setOnTouchListener(new y5d(qf7Var, 0));
    }

    public final void setOnEditorActionListener(cf7 cf7Var) {
        jac jacVar = this.b;
        if (cf7Var == null) {
            jacVar.b.setOnEditorActionListener(null);
        } else {
            jacVar.setOnEditorActionListener(new n94(2, cf7Var));
        }
    }

    public final void setOnRemoveListener(af7 af7Var) {
        this.b.setOnKeyListener(new uv2(this, 5, af7Var));
    }

    public final void setShowLengthLimitWhileFocused(boolean z) {
        this.b.setShowLengthLimitWhileFocused(z);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
