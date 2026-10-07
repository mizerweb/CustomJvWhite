package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class r35 extends ecg {
    public oic d;
    public oic e;
    public final int f;

    public r35(int i) {
        this.f = (int) (i * 0.25f);
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

    @Override // defpackage.ecg, defpackage.yee
    public final boolean a(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        int iAbs = Math.abs(numValueOf.intValue());
        int i3 = this.f;
        if (iAbs > i3) {
            numValueOf = null;
        }
        return super.a(i, numValueOf != null ? numValueOf.intValue() : Integer.signum(i2) * i3);
    }

    @Override // defpackage.ecg
    public final int[] c(vee veeVar, View view) {
        int[] iArr = new int[2];
        if (veeVar.e()) {
            pic picVarJ = j(veeVar);
            iArr[0] = ((picVarJ.e(view) / 2) + picVarJ.g(view)) - ((picVarJ.n() / 2) + picVarJ.m());
        } else {
            iArr[0] = 0;
        }
        if (!veeVar.f()) {
            iArr[1] = 0;
            return iArr;
        }
        pic picVarK = k(veeVar);
        iArr[1] = ((picVarK.e(view) / 2) + picVarK.g(view)) - ((picVarK.n() / 2) + picVarK.m());
        return iArr;
    }

    @Override // defpackage.ecg
    public final View e(vee veeVar) {
        if (veeVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) veeVar;
            if (linearLayoutManager.U0() == 0 || linearLayoutManager.Y0() == linearLayoutManager.G() - 1) {
                return null;
            }
        }
        if (veeVar.f()) {
            return i(veeVar, k(veeVar));
        }
        if (veeVar.e()) {
            return i(veeVar, j(veeVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecg
    public final int f(vee veeVar, int i, int i2) {
        int iG;
        View viewE;
        int iM;
        int i3;
        PointF pointFA;
        int iH;
        int iH2;
        if ((veeVar instanceof gfe) && (iG = veeVar.G()) != 0 && (viewE = e(veeVar)) != null && (iM = vee.M(viewE)) != -1 && (pointFA = ((gfe) veeVar).a((i3 = iG - 1))) != null) {
            if (veeVar.e()) {
                iH = h(veeVar, j(veeVar), i, 0);
                if (pointFA.x < 0.0f) {
                    iH = -iH;
                }
            } else {
                iH = 0;
            }
            if (veeVar.f()) {
                iH2 = h(veeVar, k(veeVar), 0, i2);
                if (pointFA.y < 0.0f) {
                    iH2 = -iH2;
                }
            } else {
                iH2 = 0;
            }
            if (veeVar.f()) {
                iH = iH2;
            }
            if (iH != 0) {
                int i4 = iM + iH;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= iG ? i3 : i5;
            }
        }
        return -1;
    }

    public final int h(vee veeVar, pic picVar, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iW = veeVar.w();
        float f = 1.0f;
        if (iW != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iW; i5++) {
                View viewV = veeVar.v(i5);
                int iM = vee.M(viewV);
                if (iM != -1) {
                    if (iM < i4) {
                        view = viewV;
                        i4 = iM;
                    }
                    if (iM > i3) {
                        view2 = viewV;
                        i3 = iM;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(picVar.d(view), picVar.d(view2)) - Math.min(picVar.g(view), picVar.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
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
