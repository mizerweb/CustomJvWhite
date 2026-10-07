package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class ecb {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public ecb(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2) {
        ViewParent viewParentD;
        if (!this.d || (viewParentD = d(0)) == null) {
            return false;
        }
        return i4m.b(viewParentD, this.c, f, f2);
    }

    public final boolean b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentD;
        int i4;
        int i5;
        if (this.d && (viewParentD = d(i3)) != null) {
            if (i != 0 || i2 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    iArr = this.e;
                }
                int[] iArr3 = iArr;
                iArr3[0] = 0;
                iArr3[1] = 0;
                i4m.c(viewParentD, viewGroup, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean c(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentD;
        int i6;
        int i7;
        int[] iArr3;
        if (this.d && (viewParentD = d(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                i4m.d(viewParentD, viewGroup, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent d(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean e(int i) {
        return d(i) != null;
    }

    public final boolean f(int i, int i2) {
        if (e(i2)) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        ViewGroup viewGroup = this.c;
        View view = viewGroup;
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if (i4m.f(parent, view, viewGroup, i, i2)) {
                if (i2 == 0) {
                    this.a = parent;
                } else if (i2 == 1) {
                    this.b = parent;
                }
                i4m.e(parent, view, viewGroup, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final void g(int i) {
        ViewParent viewParentD = d(i);
        if (viewParentD != null) {
            i4m.g(viewParentD, this.c, i);
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
