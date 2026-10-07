package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oyb extends ViewGroup {
    public static final /* synthetic */ zv8[] n = {new z8b(oyb.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), zo5.e(zfe.a, oyb.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;"), new z8b(oyb.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;")};
    public myb a;
    public final nyb b;
    public final nyb c;
    public final nyb d;
    public cf7 e;
    public final u8b f;
    public final u8b g;
    public final u8b h;
    public final Rect i;
    public int j;
    public int k;
    public int l;
    public boolean m;

    public oyb(Context context) {
        super(context);
        this.b = new nyb(this, 0);
        this.c = new nyb(this, 1);
        this.d = new nyb(this, 2);
        this.e = new s9a(29);
        this.f = new u8b(4);
        this.g = new u8b(4);
        this.h = new u8b();
        this.i = new Rect();
        this.j = -1;
        this.k = -1;
        this.l = -1;
    }

    public static kyb a(oyb oybVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = oybVar.getChildCount();
        }
        boolean z = (i2 & 2) == 0;
        kyb kybVar = (kyb) oybVar.getChildAt(i);
        if (kybVar == null) {
            kybVar = new kyb(oybVar.getContext());
            if (z) {
                oybVar.addViewInLayout(kybVar, oybVar.getChildCount(), new ViewGroup.LayoutParams(-2, -2));
            } else {
                oybVar.addView(kybVar);
            }
        }
        kybVar.setId(R.id.oneme_buttonstack_more_btn);
        kybVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kybVar.setIconTintResolver(oybVar.e);
        kybVar.setMode(oybVar.getMode());
        kybVar.setAppearance(oybVar.getAppearance());
        kybVar.setCustomTheme(oybVar.getCustomTheme());
        kybVar.setText(R.string.oneme_button_stack_more);
        kybVar.setIcon(R.drawable.icon_dots_horizontal);
        qe7.H(kybVar, 300L, new o37(25, oybVar));
        return kybVar;
    }

    public static final n6g c(lyb lybVar) {
        int i = lybVar.a;
        Integer num = lybVar.b;
        return new n6g(i, num != null ? new tnh(num.intValue()) : ynh.b, lybVar.c, lybVar.d, lybVar.e);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d9 -> B:34:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00db -> B:34:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void b(java.util.List r9, java.util.List r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.b(java.util.List, java.util.List, boolean):void");
    }

    public final gyb getAppearance() {
        zv8 zv8Var = n[1];
        return (gyb) this.c.b;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = n[2];
        return (kbc) this.d.b;
    }

    public final cf7 getIconTintResolver() {
        return this.e;
    }

    public final myb getListener() {
        return this.a;
    }

    public final hyb getMode() {
        zv8 zv8Var = n[0];
        return (hyb) this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int iE = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.k;
            if (i5 > this.l || i6 > i5) {
                qyj.M(childAt, iE, 0, 0, 12);
                iE = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), iE);
            } else {
                qyj.L(childAt, 0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            int childCount = getChildCount();
            int measuredWidth = 0;
            int iMax = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                childAt.measure(i, i2);
                measuredWidth += childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                i3++;
            }
            setMeasuredDimension(bc1.g(8.0f, yl5.d().getDisplayMetrics().density, getChildCount() - 1, measuredWidth), iMax);
            return;
        }
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (-1 >= childCount2) {
                childCount2 = -1;
                break;
            }
            View childAt2 = getChildAt(childCount2);
            if (childAt2 != null && childAt2.getVisibility() == 0) {
                break;
            } else {
                childCount2--;
            }
        }
        if (childCount2 == -1) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.k = -1;
        this.l = -1;
        u8b u8bVar = this.g;
        u8bVar.f();
        int i4 = childCount2 + 1;
        int iK = (size - (gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) * childCount2)) / i4;
        if (!this.m) {
            while (iK < gm0.K(67.0f * yl5.d().getDisplayMetrics().density)) {
                int i5 = this.j;
                boolean z = i5 == -1;
                if (i5 == -1) {
                    this.j = getChildCount();
                    a(this, 0, 1);
                }
                int i6 = this.l;
                if (i6 == -1) {
                    int i7 = this.j;
                    this.k = i7 - (z ? 2 : 1);
                    this.l = i7 - (z ? 2 : 1);
                } else {
                    this.k = i6 - (z ? 2 : 1);
                }
                u8bVar.a(0, this.f.g(this.k));
                int i8 = i4 - 1;
                int iK2 = (size - (gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) * (i4 - 2))) / i8;
                i4 = i8;
                iK = iK2;
            }
        }
        int childCount3 = getChildCount();
        int iMax2 = 0;
        while (i3 < childCount3) {
            int i9 = this.k;
            if (i3 > this.l || i9 > i3) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
                View childAt3 = getChildAt(i3);
                childAt3.measure(iMakeMeasureSpec, i2);
                iMax2 = Math.max(iMax2, childAt3.getMeasuredHeight());
            }
            i3++;
        }
        setMeasuredDimension(size, Math.max(mode, iMax2));
    }

    public final void setAppearance(gyb gybVar) {
        this.c.B(this, n[1], gybVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.d.B(this, n[2], kbcVar);
    }

    public final void setIconTintResolver(cf7 cf7Var) {
        this.e = cf7Var;
    }

    public final void setListener(myb mybVar) {
        this.a = mybVar;
    }

    public final void setMode(hyb hybVar) {
        this.b.B(this, n[0], hybVar);
    }
}
