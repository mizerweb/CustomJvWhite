package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedHashSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public class r1c extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] n = {new z8b(r1c.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), zo5.e(zfe.a, r1c.class, "allowAnimate", "getAllowAnimate()Z")};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final cyb h;
    public final q1c i;
    public final q1c j;
    public final ny8 k;
    public final b1g l;
    public final LinkedHashSet m;

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
    public r1c(Context context) {
        super(context, null);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 32.0f);
        this.a = iK;
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        this.b = iK2;
        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.c = iK3;
        this.d = gm0.K(yl5.d().getDisplayMetrics().density * 80.0f);
        ImageView imageViewD = qv1.d(context, R.id.oneme_empty_view_icon);
        imageViewD.setScaleType(ImageView.ScaleType.CENTER);
        imageViewD.setElevation(yl5.d().getDisplayMetrics().density * 8.0f);
        a8g a8gVar = pq3.j;
        imageViewD.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageViewD).getIcon().g));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, wk8.c(a8gVar.e(context).m()));
        gradientDrawable.setShape(1);
        imageViewD.setBackground(gradientDrawable);
        this.e = imageViewD;
        TextView textViewE = qv1.e(context, R.id.oneme_empty_view_title);
        q9i.a(q9i.c, textViewE);
        this.f = textViewE;
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_empty_view_subtitle);
        textView.setMaxLines(4);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        q9i.a(q9i.i, textView);
        textView.setVisibility(8);
        this.g = textView;
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.oneme_empty_view_main_action);
        cybVar.setVisibility(8);
        cybVar.setSize(ayb.i);
        this.h = cybVar;
        this.i = new q1c(this, 0);
        this.j = new q1c(this, 1);
        this.k = rx8.P(3, new rgb(context, 10));
        this.l = getShineEmptyStateDrawable();
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        addView(imageViewD, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 80.0f));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = iK;
        addView(textViewE, marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.topMargin = iK2;
        addView(textView, marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams3.topMargin = iK3;
        addView(cybVar, marginLayoutParams3);
        onThemeChanged(a8gVar.e(context).m());
        n1g.N(new adh(context, (lq4) null, 12), this);
        setBackground(getShineEmptyStateDrawable());
        this.m = new LinkedHashSet();
    }

    public static int b(View view, int i, int i2) {
        if (view.getVisibility() != 0) {
            return 0;
        }
        qyj.M(view, (((View) view.getParent()).getMeasuredWidth() - view.getMeasuredWidth()) / 2, i + i2, 0, 12);
        return view.getMeasuredHeight() + i2;
    }

    public static int c(View view, int i, int i2, int i3) {
        if (view.getVisibility() != 0) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight() + i3;
    }

    public static final boolean e(r1c r1cVar, ufe ufeVar, View view, int i) {
        if (view.getVisibility() == 0) {
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i2 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            if ((((r1cVar.getMeasuredHeight() - ufeVar.a) - i2) - r1cVar.getPaddingTop()) - r1cVar.getPaddingBottom() >= i) {
                r1cVar.m.add(view);
                ufeVar.a += i2;
                return true;
            }
        }
        return false;
    }

    public final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final b1g getShineEmptyStateDrawable() {
        return (b1g) this.k.getValue();
    }

    public final void d(boolean z) {
        if (!z) {
            setBackground(null);
            g(false);
            return;
        }
        setBackground(getShineEmptyStateDrawable());
        ImageView imageView = this.e;
        int bottom = imageView.getBottom() - (imageView.getMeasuredHeight() / 2);
        b1g shineEmptyStateDrawable = getShineEmptyStateDrawable();
        shineEmptyStateDrawable.f = bottom;
        if (!shineEmptyStateDrawable.getBounds().isEmpty()) {
            shineEmptyStateDrawable.a(bottom, shineEmptyStateDrawable.getBounds());
        }
        g(getAllowAnimate());
    }

    public final void f(String str, View.OnClickListener onClickListener) {
        cyb cybVar = this.h;
        cybVar.setVisibility(0);
        cybVar.setText(str);
        qe7.H(cybVar, 300L, onClickListener);
    }

    public final void g(boolean z) {
        b1g background = getBackground();
        if (!z || getVisibility() != 0 || !isAttachedToWindow()) {
            if (background != null) {
                background.stop();
            }
        } else {
            if (background == null || background.isRunning()) {
                return;
            }
            background.start();
        }
    }

    public final boolean getAllowAnimate() {
        zv8 zv8Var = n[1];
        return ((Boolean) this.j.b).booleanValue();
    }

    @Override // android.view.View
    public b1g getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof b1g) {
            return (b1g) background;
        }
        return null;
    }

    public final int getBlurPadding() {
        z0g z0gVar = this.l.c.i;
        zv8 zv8Var = a1g.n[1];
        return ((Number) z0gVar.b).intValue();
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = n[0];
        return (kbc) this.i.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        g(getAllowAnimate());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g(false);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        int i5;
        LinkedHashSet linkedHashSet = this.m;
        linkedHashSet.clear();
        if (getContext().getResources().getConfiguration().orientation == 1) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() == 0) {
                    int measuredHeight = childAt2.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    i6 += measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                }
            }
            int measuredHeight2 = (getMeasuredHeight() / 2) - (i6 / 2);
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt3 = getChildAt(i8);
                if (childAt3.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams2 = childAt3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    measuredHeight2 = b(childAt3, measuredHeight2, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + measuredHeight2;
                }
            }
            d(true);
            return;
        }
        ufe ufeVar = new ufe();
        e(this, ufeVar, this.h, 0);
        e(this, ufeVar, this.f, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        e(this, ufeVar, this.g, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        boolean zE = e(this, ufeVar, this.e, gm0.K(150.0f * yl5.d().getDisplayMetrics().density));
        int i9 = 0;
        while (true) {
            if (i9 >= getChildCount()) {
                childAt = null;
                break;
            }
            int i10 = i9 + 1;
            childAt = getChildAt(i9);
            if (childAt == null) {
                ore.i();
                return;
            } else if (linkedHashSet.contains(childAt)) {
                break;
            } else {
                i9 = i10;
            }
        }
        if (childAt == null) {
            return;
        }
        int i11 = ufeVar.a;
        ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        ufeVar.a = i11 - (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
        int measuredHeight3 = (getMeasuredHeight() / 2) - (ufeVar.a / 2);
        int childCount3 = getChildCount();
        for (int i12 = 0; i12 < childCount3; i12++) {
            View childAt4 = getChildAt(i12);
            if (linkedHashSet.contains(childAt4)) {
                if (cqk.d(childAt4, childAt)) {
                    i5 = 0;
                } else {
                    ViewGroup.LayoutParams layoutParams4 = childAt4.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (marginLayoutParams4 != null) {
                        i5 = marginLayoutParams4.topMargin;
                    } else {
                        i5 = 0;
                    }
                }
                measuredHeight3 = b(childAt4, measuredHeight3, i5) + measuredHeight3;
            }
        }
        d(zE);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = this.d;
        c(this.e, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        c(this.f, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.a);
        c(this.g, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.b);
        c(this.h, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.c);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        b1g background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        getCurrentTheme().getIcon();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
        ImageView imageView = this.e;
        imageView.setImageTintList(colorStateListValueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(wk8.c(getCurrentTheme()));
        this.f.setTextColor(getCurrentTheme().getText().b);
        this.g.setTextColor(getCurrentTheme().getText().d);
        this.h.setCustomTheme(getCustomTheme());
    }

    public final void setAllowAnimate(boolean z) {
        this.j.B(this, n[1], Boolean.valueOf(z));
    }

    public final void setBackgroundShineDrawable(int i) {
        b1g shineEmptyStateDrawable = getShineEmptyStateDrawable();
        shineEmptyStateDrawable.h.B(shineEmptyStateDrawable, b1g.i[0], Integer.valueOf(i));
    }

    public final void setBlurPadding(int i) {
        a1g a1gVar = this.l.c;
        a1gVar.i.B(a1gVar, a1g.n[1], Integer.valueOf(i));
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.i.B(this, n[0], kbcVar);
    }

    public final void setIcon(int i) {
        this.e.setImageResource(i);
    }

    public final void setSubtitle(ynh ynhVar) {
        TextView textView = this.g;
        textView.setText(ynhVar.b(textView.getContext()));
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }

    public final void setTitle(ynh ynhVar) {
        TextView textView = this.f;
        textView.setText(ynhVar.b(textView.getContext()));
    }

    public final void setTitleGravity(int i) {
        this.f.setGravity(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        b1g background = getBackground();
        if (background != null) {
            if (drawable == background) {
                return true;
            }
            int numberOfLayers = background.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                if (background.getDrawable(i) == drawable) {
                    return true;
                }
            }
        }
        return false;
    }
}
