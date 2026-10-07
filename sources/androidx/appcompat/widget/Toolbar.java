package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.a65;
import defpackage.ab7;
import defpackage.avh;
import defpackage.bs;
import defpackage.bvh;
import defpackage.cca;
import defpackage.cs;
import defpackage.cwe;
import defpackage.e0;
import defpackage.gvh;
import defpackage.hvh;
import defpackage.i1m;
import defpackage.i7j;
import defpackage.ki3;
import defpackage.l3e;
import defpackage.m8;
import defpackage.r9j;
import defpackage.rda;
import defpackage.uik;
import defpackage.vbf;
import defpackage.wk8;
import defpackage.x62;
import defpackage.x7;
import defpackage.xuh;
import defpackage.yah;
import defpackage.yba;
import defpackage.yuh;
import defpackage.zuh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final ki3 G;
    public ArrayList H;
    public final uik I;
    public gvh J;
    public m8 K;
    public ActionMenuView a;
    public AppCompatTextView b;
    public AppCompatTextView c;
    public bs d;
    public cs e;
    public final Drawable f;
    public final CharSequence g;
    public bs h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public zuh n1;
    public final int o;
    public boolean o1;
    public int p;
    public OnBackInvokedCallback p1;
    public int q;
    public OnBackInvokedDispatcher q1;
    public int r;
    public boolean r1;
    public int s;
    public final rda s1;
    public cwe t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new ki3(new xuh(this, 1));
        this.H = new ArrayList();
        this.I = new uik(27, this);
        this.s1 = new rda(16, this);
        Context context2 = getContext();
        int[] iArr = l3e.x;
        vbf vbfVarK = vbf.k(context2, attributeSet, iArr, i);
        i7j.k(this, context, iArr, attributeSet, (TypedArray) vbfVarK.b, i, 0);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        this.l = typedArray.getResourceId(28, 0);
        this.m = typedArray.getResourceId(19, 0);
        this.w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        cwe cweVar = this.t;
        cweVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            cweVar.e = dimensionPixelSize;
            cweVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            cweVar.f = dimensionPixelSize2;
            cweVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            cweVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = vbfVarK.d(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableD = vbfVarK.d(16);
        if (drawableD != null) {
            setNavigationIcon(drawableD);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableD2 = vbfVarK.d(11);
        if (drawableD2 != null) {
            setLogo(drawableD2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(vbfVarK.c(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(vbfVarK.c(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        vbfVarK.l();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new yah(getContext());
    }

    public static avh h() {
        avh avhVar = new avh(-2, -2);
        avhVar.b = 0;
        avhVar.a = 8388627;
        return avhVar;
    }

    public static avh i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof avh;
        if (z) {
            avh avhVar = (avh) layoutParams;
            avh avhVar2 = new avh(avhVar);
            avhVar2.b = 0;
            avhVar2.b = avhVar.b;
            return avhVar2;
        }
        if (z) {
            avh avhVar3 = new avh((avh) layoutParams);
            avhVar3.b = 0;
            return avhVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            avh avhVar4 = new avh(layoutParams);
            avhVar4.b = 0;
            return avhVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        avh avhVar5 = new avh(marginLayoutParams);
        avhVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) avhVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) avhVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) avhVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) avhVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return avhVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                avh avhVar = (avh) childAt.getLayoutParams();
                if (avhVar.b == 0 && t(childAt)) {
                    int i3 = avhVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            avh avhVar2 = (avh) childAt2.getLayoutParams();
            if (avhVar2.b == 0 && t(childAt2)) {
                int i5 = avhVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        avh avhVarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            avhVarI = h();
        } else {
            avhVarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (avh) layoutParams;
        }
        avhVarI.b = 1;
        if (!z || this.i == null) {
            addView(view, avhVarI);
        } else {
            view.setLayoutParams(avhVarI);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            bs bsVar = new bs(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = bsVar;
            bsVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            avh avhVarH = h();
            avhVarH.a = (this.n & 112) | 8388611;
            avhVarH.b = 2;
            this.h.setLayoutParams(avhVarH);
            this.h.setOnClickListener(new x7(10, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof avh);
    }

    public final void d() {
        if (this.t == null) {
            cwe cweVar = new cwe();
            cweVar.a = 0;
            cweVar.b = 0;
            cweVar.c = Integer.MIN_VALUE;
            cweVar.d = Integer.MIN_VALUE;
            cweVar.e = 0;
            cweVar.f = 0;
            cweVar.g = false;
            cweVar.h = false;
            this.t = cweVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.p == null) {
            yba ybaVar = (yba) actionMenuView.getMenu();
            if (this.n1 == null) {
                this.n1 = new zuh(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            ybaVar.c(this.n1, this.j);
            u();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.a;
            i1m i1mVar = new i1m(this);
            actionMenuView2.getClass();
            actionMenuView2.u = i1mVar;
            avh avhVarH = h();
            avhVarH.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(avhVarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new bs(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            avh avhVarH = h();
            avhVarH.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(avhVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        avh avhVar = new avh(context, attributeSet);
        avhVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l3e.b);
        avhVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        avhVar.b = 0;
        return avhVar;
    }

    public CharSequence getCollapseContentDescription() {
        bs bsVar = this.h;
        if (bsVar != null) {
            return bsVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        bs bsVar = this.h;
        if (bsVar != null) {
            return bsVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        cwe cweVar = this.t;
        if (cweVar != null) {
            return cweVar.g ? cweVar.a : cweVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        cwe cweVar = this.t;
        if (cweVar != null) {
            return cweVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        cwe cweVar = this.t;
        if (cweVar != null) {
            return cweVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        cwe cweVar = this.t;
        if (cweVar != null) {
            return cweVar.g ? cweVar.b : cweVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        yba ybaVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ybaVar = actionMenuView.p) == null || !ybaVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        cs csVar = this.e;
        if (csVar != null) {
            return csVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        cs csVar = this.e;
        if (csVar != null) {
            return csVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        bs bsVar = this.d;
        if (bsVar != null) {
            return bsVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        bs bsVar = this.d;
        if (bsVar != null) {
            return bsVar.getDrawable();
        }
        return null;
    }

    public m8 getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public a65 getWrapper() {
        Drawable drawable;
        if (this.J == null) {
            gvh gvhVar = new gvh();
            gvhVar.n = 0;
            gvhVar.a = this;
            gvhVar.h = getTitle();
            gvhVar.i = getSubtitle();
            gvhVar.g = gvhVar.h != null;
            gvhVar.f = getNavigationIcon();
            vbf vbfVarK = vbf.k(getContext(), null, l3e.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) vbfVarK.b;
            gvhVar.o = vbfVarK.d(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                gvhVar.g = true;
                gvhVar.h = text;
                if ((gvhVar.b & 8) != 0) {
                    setTitle(text);
                    if (gvhVar.g) {
                        i7j.m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                gvhVar.i = text2;
                if ((gvhVar.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableD = vbfVarK.d(20);
            if (drawableD != null) {
                gvhVar.e = drawableD;
                gvhVar.c();
            }
            Drawable drawableD2 = vbfVarK.d(17);
            if (drawableD2 != null) {
                gvhVar.d = drawableD2;
                gvhVar.c();
            }
            if (gvhVar.f == null && (drawable = gvhVar.o) != null) {
                gvhVar.f = drawable;
                if ((gvhVar.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            gvhVar.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = gvhVar.c;
                if (view != null && (gvhVar.b & 16) != 0) {
                    removeView(view);
                }
                gvhVar.c = viewInflate;
                if (viewInflate != null && (gvhVar.b & 16) != 0) {
                    addView(viewInflate);
                }
                gvhVar.a(gvhVar.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                s(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.l = resourceId2;
                AppCompatTextView appCompatTextView = this.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.m = resourceId3;
                AppCompatTextView appCompatTextView2 = this.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            vbfVarK.l();
            if (R.string.abc_action_bar_up_description != gvhVar.n) {
                gvhVar.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = gvhVar.n;
                    gvhVar.j = i != 0 ? getContext().getString(i) : null;
                    gvhVar.b();
                }
            }
            gvhVar.j = getNavigationContentDescription();
            setNavigationOnClickListener(new x62(gvhVar));
            this.J = gvhVar;
        }
        return this.J;
    }

    public final int j(View view, int i) {
        avh avhVar = (avh) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = avhVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) avhVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) avhVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) avhVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.b).iterator();
        while (it2.hasNext()) {
            ((ab7) it2.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        avh avhVar = (avh) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) avhVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) avhVar).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.s1);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        avh avhVar;
        avh avhVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        cs csVar;
        View view;
        ActionMenuView actionMenuView;
        bs bsVar;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = i7j.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.d)) {
            bs bsVar2 = this.d;
            if (z3) {
                iP = p(bsVar2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(bsVar2, paddingLeft, iMin2, iArr);
            }
            if (t(this.h)) {
                bsVar = this.h;
                if (z3) {
                    iP = p(bsVar, iP, iMin2, iArr);
                } else {
                    iO = o(bsVar, iO, iMin2, iArr);
                }
            }
            if (t(this.a)) {
                actionMenuView = this.a;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (t(this.i)) {
                view = this.i;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (t(this.e)) {
                csVar = this.e;
                if (z3) {
                    iMin = p(csVar, iMin, iMin2, iArr);
                } else {
                    iMax = o(csVar, iMax, iMin2, iArr);
                }
            }
            zT = t(this.b);
            zT2 = t(this.c);
            if (zT) {
                avh avhVar3 = (avh) this.b.getLayoutParams();
                measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) avhVar3).topMargin + ((ViewGroup.MarginLayoutParams) avhVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                avh avhVar4 = (avh) this.c.getLayoutParams();
                measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) avhVar4).topMargin + ((ViewGroup.MarginLayoutParams) avhVar4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    appCompatTextView = this.b;
                } else {
                    appCompatTextView = this.c;
                }
                if (zT2) {
                    appCompatTextView2 = this.c;
                } else {
                    appCompatTextView2 = this.b;
                }
                avhVar = (avh) appCompatTextView.getLayoutParams();
                avhVar2 = (avh) appCompatTextView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zT && this.b.getMeasuredWidth() > 0) || (zT2 && this.c.getMeasuredWidth() > 0);
                i6 = this.w & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) avhVar).bottomMargin;
                        i17 = this.s;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin) - this.s) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.p;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zT) {
                        avh avhVar5 = (avh) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) avhVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zT2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                        i13 = iMin - this.q;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.p;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zT) {
                        avh avhVar6 = (avh) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) avhVar6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zT2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth4, this.c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.q;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.D;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                avh avhVar7 = (avh) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) avhVar7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) avhVar7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (t(this.h)) {
            bsVar = this.h;
            if (z3) {
                iP = p(bsVar, iP, iMin2, iArr);
            } else {
                iO = o(bsVar, iO, iMin2, iArr);
            }
        }
        if (t(this.a)) {
            actionMenuView = this.a;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (t(this.i)) {
            view = this.i;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (t(this.e)) {
            csVar = this.e;
            if (z3) {
                iMin = p(csVar, iMin, iMin2, iArr);
            } else {
                iMax = o(csVar, iMax, iMin2, iArr);
            }
        }
        zT = t(this.b);
        zT2 = t(this.c);
        if (zT) {
            avh avhVar8 = (avh) this.b.getLayoutParams();
            measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) avhVar8).topMargin + ((ViewGroup.MarginLayoutParams) avhVar8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            avh avhVar9 = (avh) this.c.getLayoutParams();
            measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) avhVar9).topMargin + ((ViewGroup.MarginLayoutParams) avhVar9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zT2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            avhVar = (avh) appCompatTextView.getLayoutParams();
            avhVar2 = (avh) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.w & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) avhVar).bottomMargin;
                    i17 = this.s;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin) - this.s) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zT) {
                    avh avhVar10 = (avh) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) avhVar10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.p;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zT) {
                    avh avhVar11 = (avh) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) avhVar11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i35, measuredWidth7, this.c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zT) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zT2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            avhVar = (avh) appCompatTextView.getLayoutParams();
            avhVar2 = (avh) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.w & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) avhVar).topMargin + this.r;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) avhVar).bottomMargin;
                    i17 = this.s;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) avhVar2).bottomMargin) - this.s) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zT) {
                    avh avhVar12 = (avh) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) avhVar12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.p;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zT) {
                    avh avhVar13 = (avh) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) avhVar13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((avh) this.c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i36, measuredWidth10, this.c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.D;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            avh avhVar14 = (avh) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) avhVar14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) avhVar14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = r9j.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (t(this.d)) {
            r(this.d, i, 0, i2, this.o);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.h)) {
            r(this.h, i, 0, i2, this.o);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b3 = b2;
        int[] iArr = this.F;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (t(this.a)) {
            r(this.a, i, iMax3, i2, this.o);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.i)) {
            iMax5 += q(this.i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (t(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((avh) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.r + this.s;
        int i7 = this.p + this.q;
        if (t(this.b)) {
            q(this.b, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.o1) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a);
        ActionMenuView actionMenuView = this.a;
        yba ybaVar = actionMenuView != null ? actionMenuView.p : null;
        int i = aVar.c;
        if (i != 0 && this.n1 != null && ybaVar != null && (menuItemFindItem = ybaVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (aVar.d) {
            rda rdaVar = this.s1;
            removeCallbacks(rdaVar);
            post(rdaVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        cwe cweVar = this.t;
        boolean z = i == 1;
        if (z == cweVar.g) {
            return;
        }
        cweVar.g = z;
        if (!cweVar.h) {
            cweVar.a = cweVar.e;
            cweVar.b = cweVar.f;
            return;
        }
        if (z) {
            int i2 = cweVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = cweVar.e;
            }
            cweVar.a = i2;
            int i3 = cweVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = cweVar.f;
            }
            cweVar.b = i3;
            return;
        }
        int i4 = cweVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = cweVar.e;
        }
        cweVar.a = i4;
        int i5 = cweVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = cweVar.f;
        }
        cweVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m8 m8Var;
        cca ccaVar;
        a aVar = new a(super.onSaveInstanceState());
        zuh zuhVar = this.n1;
        if (zuhVar != null && (ccaVar = zuhVar.b) != null) {
            aVar.c = ccaVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        aVar.d = (actionMenuView == null || (m8Var = actionMenuView.t) == null || !m8Var.k()) ? false : true;
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        avh avhVar = (avh) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) avhVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) avhVar).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void s(int i, int i2) {
        d();
        this.t.a(i, i2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.r1 != z) {
            this.r1 = z;
            u();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        bs bsVar = this.h;
        if (bsVar != null) {
            bsVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            bs bsVar = this.h;
            if (bsVar != null) {
                bsVar.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.o1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        cs csVar = this.e;
        if (drawable != null) {
            if (csVar == null) {
                this.e = new cs(getContext());
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else if (csVar != null && n(csVar)) {
            removeView(this.e);
            this.E.remove(this.e);
        }
        cs csVar2 = this.e;
        if (csVar2 != null) {
            csVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new cs(getContext());
        }
        cs csVar = this.e;
        if (csVar != null) {
            csVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        bs bsVar = this.d;
        if (bsVar != null) {
            bsVar.setContentDescription(charSequence);
            hvh.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            bs bsVar = this.d;
            if (bsVar != null && n(bsVar)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        bs bsVar2 = this.d;
        if (bsVar2 != null) {
            bsVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(bvh bvhVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.c);
            this.E.remove(this.c);
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.b;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.b);
            this.E.remove(this.b);
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = yuh.a(this);
            zuh zuhVar = this.n1;
            boolean z = (zuhVar == null || zuhVar.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.r1) ? false : true;
            if (z && this.q1 == null) {
                if (this.p1 == null) {
                    this.p1 = yuh.b(new xuh(this, 0));
                }
                yuh.c(onBackInvokedDispatcherA, this.p1);
                this.q1 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.q1) == null) {
                return;
            }
            yuh.d(onBackInvokedDispatcher, this.p1);
            this.q1 = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public static class a extends e0 {
        public static final Parcelable.Creator<a> CREATOR = new androidx.appcompat.widget.a();
        public int c;
        public boolean d;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(wk8.o(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(wk8.o(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(wk8.o(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
