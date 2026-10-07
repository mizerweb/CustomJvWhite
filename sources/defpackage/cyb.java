package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class cyb extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] y = {new z8b(cyb.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), zo5.e(zfe.a, cyb.class, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;"), new z8b(cyb.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;"), new z8b(cyb.class, "textColor", "getTextColor()Ljava/lang/Integer;"), new z8b(cyb.class, "iconColor", "getIconColor()Ljava/lang/Integer;"), new z8b(cyb.class, "text", "getText()Ljava/lang/CharSequence;"), new z8b(cyb.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;"), new z8b(cyb.class, "count", "getCount()Ljava/lang/Integer;"), new z8b(cyb.class, "counterText", "getCounterText()Ljava/lang/String;"), new z8b(cyb.class, "isLoading", "isLoading()Z")};
    public final byb a;
    public final byb b;
    public final byb c;
    public final byb d;
    public final byb e;
    public final byb f;
    public final byb g;
    public final byb h;
    public final byb i;
    public final byb j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public int p;
    public int q;
    public final ShapeDrawable r;
    public final ShapeDrawable s;
    public final RippleDrawable t;
    public kbc u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;

    public cyb(final Context context) {
        super(context);
        final int i = 1;
        final int i2 = 0;
        this.a = new byb(this, 1, false);
        this.b = new byb(ayb.g, this);
        this.c = new byb(this, 3);
        this.d = new byb(this, 4, false);
        this.e = new byb(this, 5, false);
        this.f = new byb(this, 6);
        this.g = new byb(this, 7, false);
        this.h = new byb(this, 8, false);
        this.i = new byb(this, 9, false);
        this.j = new byb(this, 0);
        this.k = rx8.P(3, new af7() { // from class: xxb
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                cyb cybVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_button_start_imageview_id);
                        imageViewD.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        cybVar.addView(imageViewD, new ViewGroup.MarginLayoutParams(-2, -2));
                        return imageViewD;
                    case 1:
                        TextView textView = new TextView(context2);
                        textView.setId(R.id.oneme_button_textview_id);
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        cybVar.addView(textView, new ViewGroup.MarginLayoutParams(-2, -2));
                        return textView;
                    default:
                        v0c v0cVar = new v0c(context2);
                        v0cVar.setId(R.id.oneme_button_counter_id);
                        cybVar.addView(v0cVar, new ViewGroup.MarginLayoutParams(-2, -2));
                        return v0cVar;
                }
            }
        });
        this.l = rx8.P(3, new af7() { // from class: xxb
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                cyb cybVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_button_start_imageview_id);
                        imageViewD.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        cybVar.addView(imageViewD, new ViewGroup.MarginLayoutParams(-2, -2));
                        return imageViewD;
                    case 1:
                        TextView textView = new TextView(context2);
                        textView.setId(R.id.oneme_button_textview_id);
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        cybVar.addView(textView, new ViewGroup.MarginLayoutParams(-2, -2));
                        return textView;
                    default:
                        v0c v0cVar = new v0c(context2);
                        v0cVar.setId(R.id.oneme_button_counter_id);
                        cybVar.addView(v0cVar, new ViewGroup.MarginLayoutParams(-2, -2));
                        return v0cVar;
                }
            }
        });
        final int i3 = 2;
        this.m = rx8.P(3, new af7() { // from class: xxb
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                cyb cybVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_button_start_imageview_id);
                        imageViewD.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        cybVar.addView(imageViewD, new ViewGroup.MarginLayoutParams(-2, -2));
                        return imageViewD;
                    case 1:
                        TextView textView = new TextView(context2);
                        textView.setId(R.id.oneme_button_textview_id);
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        cybVar.addView(textView, new ViewGroup.MarginLayoutParams(-2, -2));
                        return textView;
                    default:
                        v0c v0cVar = new v0c(context2);
                        v0cVar.setId(R.id.oneme_button_counter_id);
                        cybVar.addView(v0cVar, new ViewGroup.MarginLayoutParams(-2, -2));
                        return v0cVar;
                }
            }
        });
        this.n = rx8.P(3, new rgb(context, 9));
        this.o = rx8.P(3, new j68(28));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.r = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.s = shapeDrawable2;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(0), shapeDrawable, shapeDrawable2);
        this.t = rippleDrawable;
        this.v = rx8.P(3, new j68(29));
        this.w = rx8.P(3, new yxb(0));
        this.x = rx8.P(3, new ap9(8, this));
        setBackground(rippleDrawable);
        e();
    }

    public static e1b a(cyb cybVar) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, cybVar.getPromoDrawablePressed());
        stateListDrawable.addState(StateSet.WILD_CARD, cybVar.getPromoDrawableEnabled());
        return new e1b(stateListDrawable);
    }

    public static void d(View view, int i, int i2) {
        int iG = c0a.g(view, 2, i2 / 2);
        view.layout(i, iG, view.getMeasuredWidth() + i, view.getMeasuredHeight() + iG);
    }

    private final qfg getCachedSquircleShape() {
        return (qfg) this.o.getValue();
    }

    private final e1b getPromoDrawable() {
        return (e1b) this.x.getValue();
    }

    private final ShapeDrawable getPromoDrawableEnabled() {
        return (ShapeDrawable) this.v.getValue();
    }

    private final ShapeDrawable getPromoDrawablePressed() {
        return (ShapeDrawable) this.w.getValue();
    }

    private final kbc getTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.e(getContext()).m() : customTheme;
    }

    public final boolean b() {
        zv8 zv8Var = y[9];
        return ((Boolean) this.j.b).booleanValue();
    }

    public final boolean c() {
        return r5h.X0(getText()) && getCount() == null && getCounterText() == null && getIcon() != null && !b();
    }

    public final void e() {
        int iZ;
        int iZ2;
        int iZ3;
        boolean zC = c();
        ShapeDrawable shapeDrawable = this.r;
        if (zC) {
            shapeDrawable.setShape(getCachedSquircleShape());
        } else if (this.p != getSize().a || !(shapeDrawable.getShape() instanceof RoundRectShape)) {
            this.p = getSize().a;
            float f = getSize().a;
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = f;
            }
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        }
        this.s.setShape(shapeDrawable.getShape());
        setMinimumHeight(getSize().b);
        setMinimumWidth(getSize().b);
        if (getAppearance() == zxb.PROMO) {
            if (!cqk.d(this.u, getTheme())) {
                this.u = getTheme();
                ShapeDrawable promoDrawableEnabled = getPromoDrawableEnabled();
                kbc theme = getTheme();
                zxb appearance = getAppearance();
                promoDrawableEnabled.setShaderFactory(new zvd(oc9.Y(isEnabled() ? appearance.a : appearance.c, theme)));
                ShapeDrawable promoDrawablePressed = getPromoDrawablePressed();
                kbc theme2 = getTheme();
                zxb appearance2 = getAppearance();
                isEnabled();
                promoDrawablePressed.setShaderFactory(new zvd(oc9.Y(appearance2.b, theme2)));
            }
            getPromoDrawableEnabled().setShape(shapeDrawable.getShape());
            getPromoDrawablePressed().setShape(shapeDrawable.getShape());
            getPromoDrawable().a(shapeDrawable.getShape());
            setBackground(getPromoDrawable());
            getPromoDrawableEnabled().setBounds(getBackground().getBounds());
            getPromoDrawablePressed().setBounds(getBackground().getBounds());
        } else {
            kbc theme3 = getTheme();
            zxb appearance3 = getAppearance();
            isEnabled();
            int iZ4 = oc9.Z(appearance3.b, theme3);
            int i2 = this.q;
            RippleDrawable rippleDrawable = this.t;
            if (i2 != iZ4) {
                this.q = iZ4;
                rippleDrawable.setColor(ColorStateList.valueOf(iZ4));
                rippleDrawable.jumpToCurrentState();
            }
            kbc theme4 = getTheme();
            zxb appearance4 = getAppearance();
            shapeDrawable.setTint(oc9.Z(isEnabled() ? appearance4.a : appearance4.c, theme4));
            setBackground(rippleDrawable);
        }
        Drawable icon = b() ? (Drawable) this.n.getValue() : getIcon();
        zxb zxbVar = zxb.GHOST;
        ny8 ny8Var = this.k;
        if (icon != null) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            Integer iconColor = getIconColor();
            if (getAppearance() != zxbVar || iconColor == null) {
                kbc theme5 = getTheme();
                zxb appearance5 = getAppearance();
                iZ = oc9.Z(isEnabled() ? appearance5.f : appearance5.g, theme5);
            } else {
                iZ = oc9.Z(iconColor.intValue(), getTheme());
            }
            imageView.setVisibility(0);
            imageView.setImageTintList(ColorStateList.valueOf(iZ));
            imageView.setImageDrawable(icon);
        } else if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setVisibility(8);
        }
        boolean zB = b();
        ny8 ny8Var2 = this.l;
        if (!zB && !r5h.X0(getText())) {
            TextView textView = (TextView) ny8Var2.getValue();
            textView.setVisibility(0);
            textView.setText(getText());
            Integer textColor = getTextColor();
            if (getAppearance() != zxbVar || textColor == null) {
                kbc theme6 = getTheme();
                zxb appearance6 = getAppearance();
                iZ3 = oc9.Z(isEnabled() ? appearance6.d : appearance6.e, theme6);
            } else {
                iZ3 = oc9.Z(textColor.intValue(), getTheme());
            }
            textView.setTextColor(iZ3);
            getSize().f.b(textView, bx5.b);
        } else if (ny8Var2.d()) {
            ((TextView) ny8Var2.getValue()).setVisibility(8);
        }
        String counterText = getCounterText();
        Integer count = getCount();
        boolean zB2 = b();
        ny8 ny8Var3 = this.m;
        if (!zB2 && (count != null || counterText != null)) {
            v0c v0cVar = (v0c) ny8Var3.getValue();
            v0cVar.setEnabled(isEnabled());
            v0cVar.setCustomTheme(getCustomTheme());
            v0cVar.setVisibility(0);
            if (counterText != null) {
                v0cVar.setText(counterText);
            } else if (count != null) {
                v0cVar.b(count, true, true);
            }
            try {
                kbc theme7 = getTheme();
                zxb appearance7 = getAppearance();
                iZ2 = oc9.Z(isEnabled() ? appearance7.j : appearance7.k, theme7);
            } catch (IllegalArgumentException unused) {
                kbc theme8 = getTheme();
                zxb appearance8 = getAppearance();
                iZ2 = oc9.Y(isEnabled() ? appearance8.j : appearance8.k, theme8)[0];
            }
            v0cVar.setTextColor(iZ2);
            kbc theme9 = getTheme();
            zxb appearance9 = getAppearance();
            v0cVar.setCircleColor(oc9.Z(isEnabled() ? appearance9.h : appearance9.i, theme9));
        } else if (ny8Var3.d()) {
            ((v0c) ny8Var3.getValue()).setVisibility(8);
        }
        if (c()) {
            setPadding(0, 0, 0, 0);
        } else {
            setPadding(getSize().e, 0, getSize().e, 0);
        }
        if (n7j.o(ny8Var)) {
            View view = (View) ny8Var.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = gm0.K((n7j.o(ny8Var2) || n7j.o(ny8Var3)) ? yl5.d().getDisplayMetrics().density * 8.0f : yl5.d().getDisplayMetrics().density * 0.0f);
                view.setLayoutParams(marginLayoutParams);
            }
        }
        if (n7j.o(ny8Var3)) {
            View view2 = (View) ny8Var3.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.leftMargin = n7j.o(ny8Var2) ? gm0.K(8.0f * yl5.d().getDisplayMetrics().density) : gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
            view2.setLayoutParams(marginLayoutParams2);
        }
    }

    public final zxb getAppearance() {
        zv8 zv8Var = y[2];
        return (zxb) this.c.b;
    }

    public final Integer getCount() {
        zv8 zv8Var = y[7];
        return (Integer) this.h.b;
    }

    public final String getCounterText() {
        zv8 zv8Var = y[8];
        return (String) this.i.b;
    }

    public final v0c getCounterView() {
        return (v0c) this.m.getValue();
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = y[0];
        return (kbc) this.a.b;
    }

    public final Drawable getIcon() {
        zv8 zv8Var = y[6];
        return (Drawable) this.g.b;
    }

    public final Integer getIconColor() {
        zv8 zv8Var = y[4];
        return (Integer) this.e.b;
    }

    public final ayb getSize() {
        zv8 zv8Var = y[1];
        return (ayb) this.b.b;
    }

    public final CharSequence getText() {
        zv8 zv8Var = y[5];
        return (CharSequence) this.f.b;
    }

    public final Integer getTextColor() {
        zv8 zv8Var = y[3];
        return (Integer) this.d.b;
    }

    public final TextView getTextView() {
        return (TextView) this.l.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        ny8 ny8Var = this.k;
        if (n7j.o(ny8Var)) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            int measuredWidth = imageView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            iMax = i5 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
        } else {
            iMax = 0;
        }
        ny8 ny8Var2 = this.l;
        if (n7j.o(ny8Var2)) {
            TextView textView = (TextView) ny8Var2.getValue();
            int measuredWidth2 = textView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i6 = measuredWidth2 + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            iMax += i6 + (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
        }
        ny8 ny8Var3 = this.m;
        if (n7j.o(ny8Var3)) {
            if (!n7j.o(ny8Var) || n7j.o(ny8Var2)) {
                v0c v0cVar = (v0c) ny8Var3.getValue();
                int measuredWidth3 = v0cVar.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams5 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                int i7 = measuredWidth3 + (marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams6 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                iMax += i7 + (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0);
            } else {
                v0c v0cVar2 = (v0c) ny8Var3.getValue();
                int measuredWidth4 = v0cVar2.getMeasuredWidth() + ((-((ImageView) ny8Var.getValue()).getMeasuredWidth()) / 2);
                ViewGroup.LayoutParams layoutParams7 = v0cVar2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                int i8 = measuredWidth4 + (marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams8 = v0cVar2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                iMax += Math.max(0, i8 + (marginLayoutParams8 != null ? marginLayoutParams8.rightMargin : 0));
            }
        }
        int i9 = i4 - i2;
        int i10 = ((i3 - i) / 2) - (iMax / 2);
        if (n7j.o(ny8Var)) {
            ImageView imageView2 = (ImageView) ny8Var.getValue();
            ViewGroup.LayoutParams layoutParams9 = imageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
            int i11 = i10 + (marginLayoutParams9 != null ? marginLayoutParams9.leftMargin : 0);
            d(imageView2, i11, i9);
            int measuredWidth5 = imageView2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams10 = imageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            i10 = i11 + measuredWidth5 + (marginLayoutParams10 != null ? marginLayoutParams10.rightMargin : 0);
        }
        if (n7j.o(ny8Var2)) {
            TextView textView2 = (TextView) ny8Var2.getValue();
            ViewGroup.LayoutParams layoutParams11 = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
            int i12 = i10 + (marginLayoutParams11 != null ? marginLayoutParams11.leftMargin : 0);
            d(textView2, i12, i9);
            int measuredWidth6 = textView2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams12 = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
            i10 = i12 + measuredWidth6 + (marginLayoutParams12 != null ? marginLayoutParams12.rightMargin : 0);
        }
        if (n7j.o(ny8Var3)) {
            v0c v0cVar3 = (v0c) ny8Var3.getValue();
            if (n7j.o(ny8Var) && !n7j.o(ny8Var2)) {
                ImageView imageView3 = (ImageView) ny8Var.getValue();
                qyj.M(v0cVar3, (imageView3.getMeasuredWidth() / 2) + imageView3.getLeft(), 0, 0, 12);
            } else {
                ViewGroup.LayoutParams layoutParams13 = v0cVar3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
                d(v0cVar3, i10 + (marginLayoutParams13 != null ? marginLayoutParams13.leftMargin : 0), i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iMax2;
        long jF = vd7.F(i, getMinimumWidth());
        int i4 = (int) (jF >> 32);
        long jF2 = vd7.F(i2, getMinimumHeight());
        int i5 = (int) (jF2 >> 32);
        int paddingRight = ((int) (jF & 4294967295L)) - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = ((int) (4294967295L & jF2)) - (getPaddingBottom() + getPaddingTop());
        ny8 ny8Var = this.k;
        if (n7j.o(ny8Var)) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            int i6 = c() ? getSize().d : getSize().c;
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            int measuredWidth = imageView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i7 = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i3 = i7 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            iMax = Math.max(0, imageView.getMeasuredHeight());
            int measuredWidth2 = imageView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i8 = measuredWidth2 + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            paddingRight -= i8 + (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
        } else {
            i3 = 0;
            iMax = 0;
        }
        ny8 ny8Var2 = this.m;
        boolean zO = n7j.o(ny8Var2);
        ny8 ny8Var3 = this.l;
        if (zO) {
            v0c v0cVar = (v0c) ny8Var2.getValue();
            v0cVar.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingBottom, Integer.MIN_VALUE));
            if (!n7j.o(ny8Var) || n7j.o(ny8Var3)) {
                v0cVar.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingBottom, Integer.MIN_VALUE));
                int measuredWidth3 = v0cVar.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams5 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                int i9 = measuredWidth3 + (marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams6 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                i3 += i9 + (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0);
                iMax = Math.max(iMax, v0cVar.getMeasuredHeight());
                int measuredWidth4 = v0cVar.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams7 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                int i10 = measuredWidth4 + (marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams8 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                iMax2 = i10 + (marginLayoutParams8 != null ? marginLayoutParams8.rightMargin : 0);
            } else {
                ImageView imageView2 = (ImageView) ny8Var.getValue();
                v0cVar.measure(View.MeasureSpec.makeMeasureSpec((imageView2.getMeasuredWidth() / 2) + paddingRight, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingBottom, Integer.MIN_VALUE));
                int measuredWidth5 = v0cVar.getMeasuredWidth() + ((-imageView2.getMeasuredWidth()) / 2);
                ViewGroup.LayoutParams layoutParams9 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
                int i11 = measuredWidth5 + (marginLayoutParams9 != null ? marginLayoutParams9.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams10 = v0cVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                iMax2 = Math.max(0, i11 + (marginLayoutParams10 != null ? marginLayoutParams10.rightMargin : 0));
                i3 += iMax2;
                iMax = Math.max(iMax, v0cVar.getMeasuredHeight());
            }
            paddingRight -= iMax2;
        }
        if (n7j.o(ny8Var3)) {
            TextView textView = (TextView) ny8Var3.getValue();
            textView.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingBottom, Integer.MIN_VALUE));
            int measuredWidth6 = textView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams11 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
            int i12 = measuredWidth6 + (marginLayoutParams11 != null ? marginLayoutParams11.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
            i3 += i12 + (marginLayoutParams12 != null ? marginLayoutParams12.rightMargin : 0);
            iMax = Math.max(iMax, textView.getMeasuredHeight());
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + i3;
        int iMax3 = Math.max(i5, getPaddingBottom() + getPaddingTop() + iMax);
        setMeasuredDimension(c() ? iMax3 : Math.max(i4, paddingRight2), iMax3);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        e();
    }

    public final void setAppearance(zxb zxbVar) {
        this.c.B(this, y[2], zxbVar);
    }

    public final void setCount(Integer num) {
        this.h.B(this, y[7], num);
    }

    public final void setCounterText(String str) {
        this.i.B(this, y[8], str);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.a.B(this, y[0], kbcVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        boolean z2 = isEnabled() != z;
        super.setEnabled(z);
        if (z2) {
            e();
        }
    }

    public final void setIcon(Drawable drawable) {
        this.g.B(this, y[6], drawable);
    }

    public final void setIconColor(Integer num) {
        this.e.B(this, y[4], num);
    }

    public final void setIconResource(int i) {
        setIcon(getContext().getDrawable(i));
    }

    public final void setLoading(boolean z) {
        this.j.B(this, y[9], Boolean.valueOf(z));
    }

    public final void setSize(ayb aybVar) {
        this.b.B(this, y[1], aybVar);
    }

    public final void setText(CharSequence charSequence) {
        this.f.B(this, y[5], charSequence);
    }

    public final void setTextColor(Integer num) {
        this.d.B(this, y[3], num);
    }
}
