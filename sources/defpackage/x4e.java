package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class x4e extends ViewGroup implements eph {
    public w4e a;

    public static void a(r4e r4eVar, kbc kbcVar) {
        r4eVar.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{kbcVar.getText().g, kbcVar.getText().b}));
        r4eVar.setBackgroundColors(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{kbcVar.h().a, kbcVar.h().b}));
    }

    public final void b(r4e r4eVar, boolean z, int i) {
        w4e w4eVar = this.a;
        if (z) {
            if (w4eVar != null) {
                mjg mjgVar = ((CallRateBottomSheet) w4eVar).G1().h;
                f8b f8bVar = ((bw1) mjgVar.getValue()).b;
                f8b f8bVar2 = new f8b();
                f8bVar2.b(f8bVar);
                f8bVar2.a(i);
                mjgVar.j(null, bw1.a((bw1) mjgVar.getValue(), null, f8bVar2, 5));
                return;
            }
            return;
        }
        if (w4eVar != null) {
            mjg mjgVar2 = ((CallRateBottomSheet) w4eVar).G1().h;
            f8b f8bVar3 = ((bw1) mjgVar2.getValue()).b;
            f8b f8bVar4 = new f8b();
            f8bVar4.b(f8bVar3);
            f8bVar4.i(i);
            mjgVar2.j(null, bw1.a((bw1) mjgVar2.getValue(), null, f8bVar4, 5));
        }
        r4eVar.setOnTouchListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int iE = 0;
        int i5 = 0;
        int iE2 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getMeasuredWidth() + iE > measuredWidth) {
                int iK = (measuredWidth - (iE - gm0.K(yl5.d().getDisplayMetrics().density * 10.0f))) / 2;
                while (i5 < i6) {
                    getChildAt(i5).offsetLeftAndRight(iK);
                    i5++;
                }
                iE2 = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, iMax, iE2);
                iE = 0;
                iMax = 0;
                i5 = i6;
            }
            childAt.layout(iE, iE2, childAt.getMeasuredWidth() + iE, childAt.getMeasuredHeight() + iE2);
            iE = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), iE);
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        int iK2 = (measuredWidth - (iE - gm0.K(10.0f * yl5.d().getDisplayMetrics().density))) / 2;
        int childCount2 = getChildCount();
        while (i5 < childCount2) {
            getChildAt(i5).offsetLeftAndRight(iK2);
            i5++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        int iMax = 0;
        int measuredWidth = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            int iK = measuredWidth != 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) : 0;
            if (childAt.getMeasuredWidth() + measuredWidth + iK > size) {
                paddingBottom = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, iMax, paddingBottom);
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + iK + childAt.getMeasuredWidth();
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, paddingBottom + iMax);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r4e) {
                a((r4e) childAt, kbcVar);
            }
        }
    }

    public final void setListener(w4e w4eVar) {
        this.a = w4eVar;
    }
}
