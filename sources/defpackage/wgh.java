package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wgh extends LinearLayout {
    public static final /* synthetic */ int l = 0;
    public ugh a;
    public TextView b;
    public ImageView c;
    public View d;
    public fo0 e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ xgh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgh(xgh xghVar, Context context) {
        super(context);
        this.k = xghVar;
        this.j = 2;
        d(context);
        int i = xghVar.e;
        int i2 = xghVar.f;
        int i3 = xghVar.g;
        int i4 = xghVar.h;
        WeakHashMap weakHashMap = i7j.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!xghVar.C ? 1 : 0);
        setClickable(true);
        a7j.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private fo0 getBadge() {
        return this.e;
    }

    private fo0 getOrCreateBadge() {
        if (this.e == null) {
            this.e = fo0.b(getContext());
        }
        b();
        fo0 fo0Var = this.e;
        if (fo0Var != null) {
            return fo0Var;
        }
        ore.k("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                fo0 fo0Var = this.e;
                if (fo0Var != null) {
                    if (fo0Var.e() != null) {
                        fo0Var.e().setForeground(null);
                    } else {
                        view.getOverlay().remove(fo0Var);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            if (this.f != null) {
                a();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                a();
                return;
            }
            if (this.d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            fo0 fo0Var = this.e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            fo0Var.setBounds(rect);
            fo0Var.j(textView2, null);
            if (fo0Var.e() != null) {
                fo0Var.e().setForeground(fo0Var);
            } else {
                textView2.getOverlay().add(fo0Var);
            }
            this.d = textView2;
        }
    }

    public final void c(View view) {
        fo0 fo0Var = this.e;
        if (fo0Var == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        fo0Var.setBounds(rect);
        fo0Var.j(view, null);
    }

    public final void d(Context context) {
        GradientDrawable gradientDrawable;
        xgh xghVar = this.k;
        int i = xghVar.s;
        if (i != 0) {
            Drawable drawableO = wk8.o(context, i);
            this.i = drawableO;
            if (drawableO != null && drawableO.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (xghVar.n != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListA = pqe.a(xghVar.n);
            boolean z = xghVar.G;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = i7j.a;
        setBackground(rippleDrawable);
        xghVar.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.k.invalidate();
        }
    }

    public final void e() {
        int i;
        ViewParent parent;
        ugh ughVar = this.a;
        View view = ughVar != null ? ughVar.b : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ru.oneme.app.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ru.oneme.app.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            xgh xghVar = this.k;
            textView4.setTextAppearance(xghVar.i);
            if (!isSelected() || (i = xghVar.k) == -1) {
                this.b.setTextAppearance(xghVar.j);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = xghVar.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            f(this.b, this.c, true);
            b();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new vgh(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new vgh(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                f(textView6, this.h, false);
            }
        }
        if (ughVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void f(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.a.getClass();
                z2 = true;
            }
            textView.setText((CharSequence) null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iJ = (z2 && imageView.getVisibility() == 0) ? (int) e9i.J(getContext(), 8) : 0;
            if (this.k.C) {
                if (iJ != wpk.b(marginLayoutParams)) {
                    wpk.c(marginLayoutParams, iJ);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iJ != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iJ;
                wpk.c(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        hvh.a(this, null);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public ugh getTab() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fo0 fo0Var = this.e;
        if (fo0Var != null && fo0Var.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.e.d());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) pgg.u(isSelected(), 0, 1, this.a.a, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) s4.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ru.oneme.app.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        xgh xghVar = this.k;
        int tabMaxWidth = xghVar.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(xghVar.t, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = xghVar.q;
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = xghVar.r;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (xghVar.B == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.a.a();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    public void setTab(ugh ughVar) {
        boolean z;
        if (ughVar != this.a) {
            this.a = ughVar;
            e();
            ugh ughVar2 = this.a;
            if (ughVar2 == null) {
                z = false;
            } else {
                xgh xghVar = ughVar2.c;
                if (xghVar == null) {
                    ore.p("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = xghVar.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != ughVar2.a) {
                    z = false;
                } else {
                    z = true;
                }
            }
            setSelected(z);
        }
    }
}
