package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bni extends ViewGroup implements eph {
    public ymi a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ImageView e;
    public final TextView f;
    public final ImageView g;

    public bni(ymi ymiVar, Context context) {
        super(context);
        this.a = ymiVar;
        final int i = 0;
        this.b = rx8.P(3, new af7(this) { // from class: ani
            public final /* synthetic */ bni b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                bni bniVar = this.b;
                switch (i2) {
                    case 0:
                        return bniVar.getContext().getDrawable(R.drawable.icon_message).mutate();
                    case 1:
                        return bniVar.getContext().getDrawable(R.drawable.icon_reorder).mutate();
                    default:
                        return bniVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7(this) { // from class: ani
            public final /* synthetic */ bni b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                bni bniVar = this.b;
                switch (i3) {
                    case 0:
                        return bniVar.getContext().getDrawable(R.drawable.icon_message).mutate();
                    case 1:
                        return bniVar.getContext().getDrawable(R.drawable.icon_reorder).mutate();
                    default:
                        return bniVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                }
            }
        });
        final int i3 = 2;
        this.d = rx8.P(3, new af7(this) { // from class: ani
            public final /* synthetic */ bni b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                bni bniVar = this.b;
                switch (i4) {
                    case 0:
                        return bniVar.getContext().getDrawable(R.drawable.icon_message).mutate();
                    case 1:
                        return bniVar.getContext().getDrawable(R.drawable.icon_reorder).mutate();
                    default:
                        return bniVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                }
            }
        });
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        x05.j(6.0f, yl5.d().getDisplayMetrics().density, imageView);
        this.e = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        q9i.a(q9i.f, textView);
        l8j.a(textView);
        this.f = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        this.g = imageView2;
        addView(imageView);
        addView(textView);
        addView(imageView2);
        setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        onThemeChanged(pq3.j.h(this));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
    }

    private final Drawable getAddDrawable() {
        return (Drawable) this.d.getValue();
    }

    private final Drawable getMessageDrawable() {
        return (Drawable) this.b.getValue();
    }

    private final Drawable getReorderDrawable() {
        return (Drawable) this.c.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextView textView = this.f;
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), FitFontImageSpan.class) : null;
        if (spans == null) {
            spans = new FitFontImageSpan[0];
        }
        for (Object obj : spans) {
            FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj;
            fitFontImageSpan.updateDrawableSize(gm0.K(15.0f * yl5.d().getDisplayMetrics().density), kw6.c, false);
            fitFontImageSpan.setOverrideAlpha(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ymi ymiVar = this.a;
        ymi ymiVar2 = ymi.d;
        TextView textView = this.f;
        if (ymiVar != ymiVar2) {
            int paddingStart = getPaddingStart();
            int measuredHeight = getMeasuredHeight();
            ImageView imageView = this.e;
            qyj.M(imageView, paddingStart, (measuredHeight - imageView.getMeasuredHeight()) / 2, 0, 12);
            qyj.M(textView, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, yab.J(imageView)), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        } else {
            qyj.M(textView, getPaddingStart(), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        }
        int measuredWidth = getMeasuredWidth() - getPaddingEnd();
        ImageView imageView2 = this.g;
        qyj.M(imageView2, measuredWidth - imageView2.getMeasuredWidth(), (getMeasuredHeight() - imageView2.getMeasuredHeight()) / 2, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        if (this.a != ymi.d) {
            int iA = qv1.a(36.0f, yl5.d().getDisplayMetrics().density, 1073741824);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), 1073741824);
            ImageView imageView = this.e;
            imageView.measure(iA, iMakeMeasureSpec);
            paddingStart -= imageView.getMeasuredWidth() - gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        }
        int iA2 = qv1.a(28.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        ImageView imageView2 = this.g;
        imageView2.measure(iA2, iMakeMeasureSpec2);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(paddingStart - (imageView2.getMeasuredWidth() - gm0.K(12.0f * yl5.d().getDisplayMetrics().density)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE));
        setMeasuredDimension(size, iK);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackground(col.d(kbcVar, kbcVar.b().f, ((bs0) pq3.j.h(this).u().c.g).c, 4));
        int iOrdinal = this.a.ordinal();
        ImageView imageView = this.g;
        TextView textView = this.f;
        ImageView imageView2 = this.e;
        if (iOrdinal == 0 || iOrdinal == 1) {
            imageView2.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
            textView.setTextColor(kbcVar.getText().b);
            imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
            return;
        }
        if (iOrdinal == 2) {
            imageView2.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
            textView.setTextColor(kbcVar.getText().h);
            imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
            textView.setTextColor(kbcVar.getText().b);
            Drawable drawable = imageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                lvb.A0(enhancedVectorDrawable, "background", kbcVar.h().a);
                lvb.A0(enhancedVectorDrawable, "plus", -1);
            }
        }
    }

    public final void setActionMenuIconClickListener(cf7 cf7Var) {
        qe7.H(this.g, 300L, new jvf(cf7Var, 19, this));
    }

    public final void setOnDragIconTouchListener(qf7 qf7Var) {
        this.e.setOnTouchListener(new y5d(qf7Var, 1));
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f;
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), FitFontImageSpan.class) : null;
        if (spans == null) {
            spans = new FitFontImageSpan[0];
        }
        for (Object obj : spans) {
            FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj;
            fitFontImageSpan.updateDrawableSize(gm0.K(15.0f * yl5.d().getDisplayMetrics().density), kw6.c, false);
            fitFontImageSpan.setOverrideAlpha(true);
        }
        invalidate();
        requestLayout();
    }

    public final void setType(ymi ymiVar) {
        Drawable messageDrawable;
        this.a = ymiVar;
        ymi ymiVar2 = ymi.d;
        int i = ymiVar != ymiVar2 ? 0 : 8;
        ImageView imageView = this.e;
        imageView.setVisibility(i);
        int iOrdinal = ymiVar.ordinal();
        if (iOrdinal == 0) {
            messageDrawable = getMessageDrawable();
        } else if (iOrdinal == 1) {
            messageDrawable = getReorderDrawable();
        } else if (iOrdinal == 2) {
            messageDrawable = getAddDrawable();
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            messageDrawable = null;
        }
        imageView.setImageDrawable(messageDrawable);
        int i2 = (ymiVar == ymi.b || ymiVar == ymiVar2) ? 0 : 8;
        ImageView imageView2 = this.g;
        imageView2.setVisibility(i2);
        int iOrdinal2 = ymiVar.ordinal();
        a8g a8gVar = pq3.j;
        if (iOrdinal2 == 1) {
            int i3 = ((bs0) a8gVar.h(this).u().c.g).c;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            setBackground(col.b(i3, null, shapeDrawable));
            imageView2.setImageResource(R.drawable.icon_dots_vertical);
        } else if (iOrdinal2 == 3) {
            imageView2.setImageDrawable(new EnhancedVectorDrawable(getContext(), R.drawable.ic_add_button_28));
        }
        invalidate();
        requestLayout();
        onThemeChanged(a8gVar.h(this));
    }
}
