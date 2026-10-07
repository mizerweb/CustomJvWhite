package defpackage;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v8j extends ecg {
    public oic d;
    public oic e;
    public final /* synthetic */ y8j f;

    public v8j(y8j y8jVar) {
        this.f = y8jVar;
    }

    public static int h(View view, pic picVar) {
        return ((picVar.e(view) / 2) + picVar.g(view)) - ((picVar.n() / 2) + picVar.m());
    }

    public static View i(vee veeVar, pic picVar) {
        int iW = veeVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iN = (picVar.n() / 2) + picVar.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = veeVar.v(i2);
            int iAbs = Math.abs(((picVar.e(viewV) / 2) + picVar.g(viewV)) - iN);
            if (iAbs < i) {
                view = viewV;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // defpackage.ecg
    public final int[] c(vee veeVar, View view) {
        int[] iArr = new int[2];
        if (veeVar.getE()) {
            iArr[0] = h(view, j(veeVar));
        } else {
            iArr[0] = 0;
        }
        if (veeVar.f()) {
            iArr[1] = h(view, k(veeVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.ecg
    public final a29 d(vee veeVar) {
        if (veeVar instanceof gfe) {
            return new wlc(this, this.a.getContext(), 0);
        }
        return null;
    }

    @Override // defpackage.ecg
    public final View e(vee veeVar) {
        if (this.f.d()) {
            return null;
        }
        if (veeVar.f()) {
            return i(veeVar, k(veeVar));
        }
        if (veeVar.getE()) {
            return i(veeVar, j(veeVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecg
    public final int f(vee veeVar, int i, int i2) {
        PointF pointFA;
        int iG = veeVar.G();
        if (iG != 0) {
            View view = null;
            pic picVarK = veeVar.f() ? k(veeVar) : veeVar.getE() ? j(veeVar) : null;
            if (picVarK != null) {
                int iW = veeVar.w();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iW; i5++) {
                    View viewV = veeVar.v(i5);
                    if (viewV != null) {
                        int iH = h(viewV, picVarK);
                        if (iH <= 0 && iH > i4) {
                            view2 = viewV;
                            i4 = iH;
                        }
                        if (iH >= 0 && iH < i3) {
                            view = viewV;
                            i3 = iH;
                        }
                    }
                }
                boolean z2 = !veeVar.getE() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return vee.M(view);
                }
                if (!z2 && view2 != null) {
                    return vee.M(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iM = vee.M(view);
                    int iG2 = veeVar.G();
                    if ((veeVar instanceof gfe) && (pointFA = ((gfe) veeVar).a(iG2 - 1)) != null && (pointFA.x < 0.0f || pointFA.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iM + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iG) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final pic j(vee veeVar) {
        oic oicVar = this.e;
        if (oicVar == null || ((vee) oicVar.b) != veeVar) {
            this.e = new oic(veeVar, 0);
        }
        return this.e;
    }

    public final pic k(vee veeVar) {
        oic oicVar = this.d;
        if (oicVar == null || ((vee) oicVar.b) != veeVar) {
            this.d = new oic(veeVar, 1);
        }
        return this.d;
    }
}
