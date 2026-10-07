package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class oic extends pic {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oic(vee veeVar, int i) {
        super(veeVar);
        this.d = i;
    }

    @Override // defpackage.pic
    public final int d(View view) {
        int iE;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                wee weeVar = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iE = vee.E(view);
                i = ((ViewGroup.MarginLayoutParams) weeVar).rightMargin;
                break;
            default:
                wee weeVar2 = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iE = vee.z(view);
                i = ((ViewGroup.MarginLayoutParams) weeVar2).bottomMargin;
                break;
        }
        return iE + i;
    }

    @Override // defpackage.pic
    public final int e(View view) {
        int iD;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                wee weeVar = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iD = vee.D(view) + ((ViewGroup.MarginLayoutParams) weeVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) weeVar).rightMargin;
                break;
            default:
                wee weeVar2 = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iD = vee.C(view) + ((ViewGroup.MarginLayoutParams) weeVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) weeVar2).bottomMargin;
                break;
        }
        return iD + i;
    }

    @Override // defpackage.pic
    public final int f(View view) {
        int iC;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                wee weeVar = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iC = vee.C(view) + ((ViewGroup.MarginLayoutParams) weeVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin;
                break;
            default:
                wee weeVar2 = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iC = vee.D(view) + ((ViewGroup.MarginLayoutParams) weeVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) weeVar2).rightMargin;
                break;
        }
        return iC + i;
    }

    @Override // defpackage.pic
    public final int g(View view) {
        int iB;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                wee weeVar = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iB = vee.B(view);
                i = ((ViewGroup.MarginLayoutParams) weeVar).leftMargin;
                break;
            default:
                wee weeVar2 = (wee) view.getLayoutParams();
                ((vee) obj).getClass();
                iB = vee.F(view);
                i = ((ViewGroup.MarginLayoutParams) weeVar2).topMargin;
                break;
        }
        return iB - i;
    }

    @Override // defpackage.pic
    public final int h() {
        switch (this.d) {
            case 0:
                return ((vee) this.b).n;
            default:
                return ((vee) this.b).o;
        }
    }

    @Override // defpackage.pic
    public final int i() {
        int i;
        int iK;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                vee veeVar = (vee) obj;
                i = veeVar.n;
                iK = veeVar.K();
                break;
            default:
                vee veeVar2 = (vee) obj;
                i = veeVar2.o;
                iK = veeVar2.I();
                break;
        }
        return i - iK;
    }

    @Override // defpackage.pic
    public final int j() {
        switch (this.d) {
            case 0:
                return ((vee) this.b).K();
            default:
                return ((vee) this.b).I();
        }
    }

    @Override // defpackage.pic
    public final int k() {
        switch (this.d) {
            case 0:
                return ((vee) this.b).l;
            default:
                return ((vee) this.b).m;
        }
    }

    @Override // defpackage.pic
    public final int l() {
        switch (this.d) {
            case 0:
                return ((vee) this.b).m;
            default:
                return ((vee) this.b).l;
        }
    }

    @Override // defpackage.pic
    public final int m() {
        switch (this.d) {
            case 0:
                return ((vee) this.b).J();
            default:
                return ((vee) this.b).L();
        }
    }

    @Override // defpackage.pic
    public final int n() {
        int iJ;
        int iK;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                vee veeVar = (vee) obj;
                iJ = veeVar.n - veeVar.J();
                iK = veeVar.K();
                break;
            default:
                vee veeVar2 = (vee) obj;
                iJ = veeVar2.o - veeVar2.L();
                iK = veeVar2.I();
                break;
        }
        return iJ - iK;
    }

    @Override // defpackage.pic
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((vee) obj2).P(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((vee) obj2).P(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.pic
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((vee) obj2).P(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((vee) obj2).P(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.pic
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((vee) this.b).U(i);
                break;
            default:
                ((vee) this.b).V(i);
                break;
        }
    }
}
