package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jac extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] v = {new z8b(jac.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), zo5.e(zfe.a, jac.class, "showLengthLimitWhileFocused", "getShowLengthLimitWhileFocused()Z"), new z8b(jac.class, "endIconDrawable", "getEndIconDrawable()Lkotlin/Lazy;"), new z8b(jac.class, "maxLengthForLabel", "getMaxLengthForLabel()I"), new z8b(jac.class, "typingMode", "getTypingMode()Lone/me/sdk/uikit/common/views/OneMeTextInput$TypingMode;"), new z8b(jac.class, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new z8b(jac.class, "hint", "getHint()Ljava/lang/String;"), new z8b(jac.class, "filters", "getFilters()[Landroid/text/InputFilter;"), new z8b(jac.class, "textColorAttr", "getTextColorAttr()I"), new z8b(jac.class, "hintColorAttr", "getHintColorAttr()I"), new z8b(jac.class, "showLimitError", "getShowLimitError()Z"), new z8b(jac.class, "currentPlaceholderType", "getCurrentPlaceholderType()Lone/me/sdk/uikit/common/views/OneMeTextInput$PlaceholderType;")};
    public final iac a;
    public final p1c b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final iac i;
    public cf7 j;
    public final iac k;
    public final iac l;
    public final iac m;
    public final iac n;
    public final iac o;
    public final iac p;
    public final iac q;
    public final iac r;
    public Integer s;
    public final iac t;
    public final iac u;

    public jac(final Context context) {
        super(context, null);
        final int i = 0;
        this.a = new iac(this, 3, false);
        p1c p1cVar = new p1c(context, 14);
        p1cVar.setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        p1cVar.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), p1cVar.getLineHeight());
        np4.D(p1cVar, gradientDrawable);
        q9i.a(q9i.e, p1cVar);
        p1cVar.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), p1cVar.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), p1cVar.getPaddingBottom());
        final int i2 = 1;
        p1cVar.setClipToOutline(true);
        p1cVar.setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        p1cVar.setImportantForAutofill(1);
        p1cVar.setSingleLine(true);
        p1cVar.setInputType(p1cVar.getInputType() | 16384);
        p1cVar.addTextChangedListener(new a3(7, this));
        this.b = p1cVar;
        this.c = rx8.P(3, new af7() { // from class: eac
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                jac jacVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.i, textView);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        jacVar.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                        qyj.z(iK, iK, iK, iK, imageView, imageView);
                        qe7.H(imageView, 300L, new o37(27, jacVar));
                        jacVar.addView(imageView);
                        return imageView;
                    default:
                        return jac.a(context2, jacVar);
                }
            }
        });
        ny8 ny8VarP = rx8.P(3, new af7(this) { // from class: fac
            public final /* synthetic */ jac b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                jac jacVar = this.b;
                switch (i3) {
                    case 0:
                        return jac.c(jacVar);
                    case 1:
                        return jac.d(jacVar);
                    default:
                        return jac.b(jacVar);
                }
            }
        });
        this.d = ny8VarP;
        this.e = rx8.P(3, new af7(this) { // from class: fac
            public final /* synthetic */ jac b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                jac jacVar = this.b;
                switch (i3) {
                    case 0:
                        return jac.c(jacVar);
                    case 1:
                        return jac.d(jacVar);
                    default:
                        return jac.b(jacVar);
                }
            }
        });
        final int i3 = 2;
        this.f = rx8.P(3, new af7(this) { // from class: fac
            public final /* synthetic */ jac b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                jac jacVar = this.b;
                switch (i4) {
                    case 0:
                        return jac.c(jacVar);
                    case 1:
                        return jac.d(jacVar);
                    default:
                        return jac.b(jacVar);
                }
            }
        });
        this.g = rx8.P(3, new af7() { // from class: eac
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i2;
                jac jacVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.i, textView);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        jacVar.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                        qyj.z(iK, iK, iK, iK, imageView, imageView);
                        qe7.H(imageView, 300L, new o37(27, jacVar));
                        jacVar.addView(imageView);
                        return imageView;
                    default:
                        return jac.a(context2, jacVar);
                }
            }
        });
        this.h = rx8.P(3, new af7() { // from class: eac
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                jac jacVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.i, textView);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        jacVar.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                        qyj.z(iK, iK, iK, iK, imageView, imageView);
                        qe7.H(imageView, 300L, new o37(27, jacVar));
                        jacVar.addView(imageView);
                        return imageView;
                    default:
                        return jac.a(context2, jacVar);
                }
            }
        });
        this.i = new iac(this, 4);
        this.k = new iac(ny8VarP, this, 5);
        this.l = new iac(this, 6);
        this.m = new iac(this, 7);
        this.n = new iac(this, 8, false);
        this.o = new iac(this, 9);
        this.p = new iac(new InputFilter[0], this, 10);
        this.q = new iac(Integer.valueOf(R.attr.text_primary), this, 11);
        this.r = new iac(Integer.valueOf(R.attr.text_tertiary), this, 0);
        this.t = new iac(this, 1);
        this.u = new iac(this, 2, false);
        addView(p1cVar);
    }

    public static TextView a(Context context, jac jacVar) {
        TextView textView = new TextView(context);
        q9i.a(q9i.m, textView);
        textView.setTextColor(jacVar.getCurrentTheme().getText().d);
        jacVar.addView(textView);
        return textView;
    }

    public static Drawable b(jac jacVar) {
        int i = jacVar.getCurrentTheme().getIcon().b;
        Drawable drawableMutate = jacVar.getContext().getDrawable(R.drawable.icon_eye_crossed).mutate();
        sb8.m0(i, drawableMutate);
        drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        return drawableMutate;
    }

    public static Drawable c(jac jacVar) {
        int i = jacVar.getCurrentTheme().getIcon().d;
        Drawable drawableMutate = jacVar.getContext().getDrawable(R.drawable.icon_cross).mutate();
        sb8.m0(i, drawableMutate);
        drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        return drawableMutate;
    }

    public static Drawable d(jac jacVar) {
        int i = jacVar.getCurrentTheme().getIcon().b;
        Drawable drawableMutate = jacVar.getContext().getDrawable(R.drawable.icon_eye).mutate();
        sb8.m0(i, drawableMutate);
        drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        return drawableMutate;
    }

    public static final void f(jac jacVar) {
        p1c p1cVar = jacVar.b;
        if (n7j.o(jacVar.h) && jacVar.getMaxLengthLabelView().getMeasuredWidth() == 0) {
            jacVar.getMaxLengthLabelView().measure(View.MeasureSpec.makeMeasureSpec((jacVar.getMeasuredWidth() - jacVar.getPaddingStart()) - jacVar.getPaddingEnd(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int endPaddingByVisibleViews = jacVar.getEndPaddingByVisibleViews();
        if (p1cVar.getPaddingEnd() != endPaddingByVisibleViews) {
            p1cVar.setPaddingRelative(p1cVar.getPaddingStart(), p1cVar.getPaddingTop(), endPaddingByVisibleViews, p1cVar.getPaddingBottom());
        }
    }

    public static final void g(jac jacVar, ny8 ny8Var) {
        if (jacVar.getText().length() != 0 && ny8Var != null && jacVar.b.isEnabled()) {
            ImageView endIconView = jacVar.getEndIconView();
            endIconView.setVisibility(0);
            endIconView.setImageDrawable((Drawable) ny8Var.getValue());
        } else {
            ny8 ny8Var2 = jacVar.g;
            if (ny8Var2.d()) {
                ((ImageView) ny8Var2.getValue()).setVisibility(8);
            }
        }
    }

    private final gac getCurrentPlaceholderType() {
        zv8 zv8Var = v[11];
        return (gac) this.u.b;
    }

    public final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final ImageView getEndIconView() {
        return (ImageView) this.g.getValue();
    }

    private final int getEndPaddingByVisibleViews() {
        ny8 ny8Var = this.g;
        boolean zO = n7j.o(ny8Var);
        ny8 ny8Var2 = this.h;
        if (zO && n7j.o(ny8Var2)) {
            return zo5.b(20.0f, yl5.d().getDisplayMetrics().density, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getMaxLengthLabelView().getMeasuredWidth() + c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2)));
        }
        if (n7j.o(ny8Var)) {
            return zo5.b(20.0f, yl5.d().getDisplayMetrics().density, c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2));
        }
        if (!n7j.o(ny8Var2)) {
            return gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        }
        return getMaxLengthLabelView().getMeasuredWidth() + c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2);
    }

    private final TextView getMaxLengthLabelView() {
        return (TextView) this.h.getValue();
    }

    private final TextView getPlaceholderView() {
        return (TextView) this.c.getValue();
    }

    private final boolean getShowLimitError() {
        zv8 zv8Var = v[10];
        return ((Boolean) this.t.b).booleanValue();
    }

    public static final void h(jac jacVar, int i, int i2) {
        boolean zIsFocused;
        p1c p1cVar = jacVar.b;
        if (jacVar.getShowLengthLimitWhileFocused()) {
            zIsFocused = p1cVar.isFocused();
        } else {
            zIsFocused = (jacVar.getText().length() == 0 || i == 0 || i2 == 0 || !p1cVar.isEnabled()) ? false : true;
        }
        TextView maxLengthLabelView = jacVar.getMaxLengthLabelView();
        maxLengthLabelView.setVisibility(zIsFocused ? 0 : 8);
        if (zIsFocused) {
            int i3 = i - i2;
            maxLengthLabelView.setText(String.valueOf(i3));
            jacVar.setShowLimitError(i3 <= 0);
        }
    }

    public static final void i(jac jacVar, hac hacVar) {
        p1c p1cVar = jacVar.b;
        int iOrdinal = hacVar.ordinal();
        if (iOrdinal == 0) {
            if (jacVar.getEndIconDrawable() != null) {
                jacVar.setEndIconDrawable(jacVar.d);
            }
            if (p1cVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
                p1cVar.setTransformationMethod(SingleLineTransformationMethod.getInstance());
            }
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            p1cVar.setInputType(np0.m);
            p1cVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
            jacVar.setEndIconDrawable(jacVar.e);
        }
        jacVar.setEndIconTint(jacVar.getCurrentTheme());
    }

    public static void o(jac jacVar) {
        nl9.d(jacVar.b, true);
    }

    private final void setCurrentPlaceholderType(gac gacVar) {
        this.u.B(this, v[11], gacVar);
    }

    private final void setEndIconTint(kbc kbcVar) {
        if (this.g.d()) {
            getEndIconView().setImageTintList(ColorStateList.valueOf(getTypingMode() == hac.b ? kbcVar.getIcon().b : kbcVar.getIcon().d));
        }
    }

    private final void setShowLimitError(boolean z) {
        this.t.B(this, v[10], Boolean.valueOf(z));
    }

    public final Integer getBackgroundColorAttr() {
        zv8 zv8Var = v[5];
        return (Integer) this.n.b;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = v[0];
        return (kbc) this.a.b;
    }

    public final cf7 getEndIconAction() {
        return this.j;
    }

    public final ny8 getEndIconDrawable() {
        zv8 zv8Var = v[2];
        return (ny8) this.k.b;
    }

    public final InputFilter[] getFilters() {
        zv8 zv8Var = v[7];
        return (InputFilter[]) this.p.b;
    }

    public final String getHint() {
        zv8 zv8Var = v[6];
        return (String) this.o.b;
    }

    public final int getHintColorAttr() {
        zv8 zv8Var = v[9];
        return ((Number) this.r.b).intValue();
    }

    public final int getInputHeight() {
        return this.b.getMeasuredHeight();
    }

    public final Integer getLimitErrorTextColorAttr() {
        return this.s;
    }

    public final int getMaxLengthForLabel() {
        zv8 zv8Var = v[3];
        return ((Number) this.l.b).intValue();
    }

    public final boolean getShowLengthLimitWhileFocused() {
        zv8 zv8Var = v[1];
        return ((Boolean) this.i.b).booleanValue();
    }

    public final CharSequence getText() {
        Editable text = this.b.getText();
        CharSequence charSequenceD0 = text != null ? lvb.d0(text) : null;
        return charSequenceD0 == null ? "" : charSequenceD0;
    }

    public final int getTextColor() {
        return this.b.getTextColors().getDefaultColor();
    }

    public final int getTextColorAttr() {
        zv8 zv8Var = v[8];
        return ((Number) this.q.b).intValue();
    }

    public final hac getTypingMode() {
        zv8 zv8Var = v[4];
        return (hac) this.m.b;
    }

    public final void j() {
        getPlaceholderView().setText((CharSequence) null);
        getPlaceholderView().setVisibility(8);
        setCurrentPlaceholderType(null);
    }

    public final TextWatcher k(cf7 cf7Var) {
        a3 a3Var = new a3(5, cf7Var);
        this.b.addTextChangedListener(a3Var);
        return a3Var;
    }

    public final boolean l() {
        return getCurrentPlaceholderType() == gac.a && n7j.o(this.c);
    }

    public final void m(String str, gac gacVar) {
        if (cqk.d(getPlaceholderView().getText(), str) && gacVar == getCurrentPlaceholderType()) {
            return;
        }
        getPlaceholderView().setText(str);
        getPlaceholderView().setVisibility(0);
        setCurrentPlaceholderType(gacVar);
    }

    public final void n(kbc kbcVar, gac gacVar) {
        int i;
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            i = kbcVar.getText().j;
        } else if (iOrdinal == 1) {
            i = kbcVar.getText().b;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            i = kbcVar.getText().e;
        }
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setTextColor(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD;
        int measuredWidth;
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        p1c p1cVar = this.b;
        qyj.M(p1cVar, paddingStart, paddingTop, 0, 12);
        int measuredHeight = p1cVar.getMeasuredHeight() + paddingTop;
        ny8 ny8Var = this.g;
        if (n7j.o(ny8Var)) {
            qyj.M(getEndIconView(), zo5.D(12.0f, yl5.d().getDisplayMetrics().density, yab.J(p1cVar)) - getEndIconView().getMeasuredWidth(), (p1cVar.getMeasuredHeight() / 2) - (getEndIconView().getMeasuredHeight() / 2), 0, 12);
        }
        if (n7j.o(this.h)) {
            if (n7j.o(ny8Var)) {
                iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(getEndIconView()));
                measuredWidth = getMaxLengthLabelView().getMeasuredWidth();
            } else {
                iD = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, yab.J(p1cVar));
                measuredWidth = getMaxLengthLabelView().getMeasuredWidth();
            }
            int i5 = iD - measuredWidth;
            qyj.M(getMaxLengthLabelView(), i5, (p1cVar.getMeasuredHeight() / 2) - (getMaxLengthLabelView().getMeasuredHeight() / 2), 0, 12);
        }
        if (n7j.o(this.c)) {
            qyj.M(getPlaceholderView(), paddingStart, zo5.b(4.0f, yl5.d().getDisplayMetrics().density, measuredHeight), 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd(), 1073741824);
        p1c p1cVar = this.b;
        p1cVar.measure(iMakeMeasureSpec, i2);
        int measuredHeight = p1cVar.getMeasuredHeight();
        ny8 ny8Var = this.g;
        if (n7j.o(ny8Var)) {
            int iA = qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824);
            ((ImageView) ny8Var.getValue()).measure(iA, iA);
        }
        if (n7j.o(this.c)) {
            getPlaceholderView().measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, getPlaceholderView().getMeasuredHeight(), measuredHeight);
        }
        if (n7j.o(this.h)) {
            getMaxLengthLabelView().measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iMakeMeasureSpec), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(iMakeMeasureSpec), measuredHeight);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Integer num;
        kbc customTheme = getCustomTheme();
        if (customTheme != null) {
            kbcVar = customTheme;
        }
        p1c p1cVar = this.b;
        Drawable drawableR = np4.r(p1cVar);
        GradientDrawable gradientDrawable = drawableR instanceof GradientDrawable ? (GradientDrawable) drawableR : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(kbcVar.getText().h));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        if (backgroundColorAttr != null) {
            p1cVar.setBackgroundColor(oc9.Z(backgroundColorAttr.intValue(), kbcVar));
        }
        p1cVar.setTextColor(oc9.Z(getTextColorAttr(), kbcVar));
        p1cVar.setHintTextColor(oc9.Z(getHintColorAttr(), kbcVar));
        f55.f(p1cVar, kbcVar);
        setEndIconTint(kbcVar);
        if (this.h.d()) {
            getMaxLengthLabelView().setTextColor(oc9.Z((!getShowLimitError() || (num = this.s) == null) ? R.attr.text_tertiary : num.intValue(), kbcVar));
        }
        gac currentPlaceholderType = getCurrentPlaceholderType();
        if (currentPlaceholderType != null) {
            n(kbcVar, currentPlaceholderType);
        }
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.n.B(this, v[5], num);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.a.B(this, v[0], kbcVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
    }

    public final void setEndIconAction(cf7 cf7Var) {
        this.j = cf7Var;
    }

    public final void setEndIconDrawable(ny8 ny8Var) {
        this.k.B(this, v[2], ny8Var);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.p.B(this, v[7], inputFilterArr);
    }

    public final void setHint(String str) {
        this.o.B(this, v[6], str);
    }

    public final void setHintColorAttr(int i) {
        this.r.B(this, v[9], Integer.valueOf(i));
    }

    public final void setImeOptions(Integer num) {
        this.b.setImeOptions(num != null ? num.intValue() : 0);
    }

    public final void setInputType(int i) {
        this.b.setInputType(i);
    }

    public final void setLimitErrorTextColorAttr(Integer num) {
        this.s = num;
    }

    public final void setMaxLengthForLabel(int i) {
        this.l.B(this, v[3], Integer.valueOf(i));
    }

    public final void setOnEditorActionListener(cf7 cf7Var) {
        this.b.setOnEditorActionListener(new l7c(1, cf7Var));
    }

    public final void setOnKeyListener(final qf7 qf7Var) {
        this.b.setOnKeyListener(new View.OnKeyListener() { // from class: dac
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                qf7 qf7Var2 = qf7Var;
                return qf7Var2 != null && ((Boolean) qf7Var2.invoke(Integer.valueOf(i), keyEvent)).booleanValue();
            }
        });
    }

    public final void setSelection(int i) {
        this.b.setSelection(i);
    }

    public final void setShowLengthLimitWhileFocused(boolean z) {
        this.i.B(this, v[1], Boolean.valueOf(z));
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }

    public final void setTextColorAttr(int i) {
        this.q.B(this, v[8], Integer.valueOf(i));
    }

    public final void setTypingMode(hac hacVar) {
        this.m.B(this, v[4], hacVar);
    }
}
