package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class kcd implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ i1m b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ yp4 f;

    public kcd(View view, i1m i1mVar, float f, float f2, boolean z, yp4 yp4Var) {
        this.a = view;
        this.b = i1mVar;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = yp4Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.a;
        View rootView = view2.getRootView();
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        int[] iArr = (int[]) this.b.a;
        rootView.getLocationOnScreen(iArr);
        int iK = gm0.K(this.c) - iArr[0];
        int iK2 = gm0.K(this.d) - iArr[1];
        int iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, rootView.getHeight() - iK2);
        int iD2 = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, iK2);
        boolean z = this.e;
        if (iD > measuredHeight) {
            iK2 = (z ? 12 : 0) + zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iK2);
        } else if (iD2 > measuredHeight) {
            iK2 = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, iK2 - measuredHeight) - (z ? 12 : 0);
        }
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iD3 = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, rootView.getHeight() - measuredHeight);
        if (iD3 < iK3) {
            iD3 = iK3;
        }
        int iV = oc9.v(iK2, iK3, iD3);
        if (iK + measuredWidth >= rootView.getWidth()) {
            iK = ((rootView.getWidth() - measuredWidth) - 8) - (z ? 12 : 0);
        } else if (iK <= 0) {
            iK = z ? 12 : 0;
        }
        view2.setX(iK);
        view2.setY(iV);
        this.f.invoke();
    }
}
