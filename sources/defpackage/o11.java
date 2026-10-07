package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class o11 extends c4m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c4m
    public int a(View view, int i) {
        int iB;
        int i2;
        switch (this.a) {
            case 0:
                return view.getLeft();
            case 1:
            default:
                return super.a(view, i);
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                gz8 gz8Var = sideSheetBehavior.a;
                switch (gz8Var.a) {
                    case 0:
                        iB = -gz8Var.b.l;
                        break;
                    default:
                        iB = gz8Var.b();
                        break;
                }
                gz8 gz8Var2 = sideSheetBehavior.a;
                switch (gz8Var2.a) {
                    case 0:
                        i2 = gz8Var2.b.o;
                        break;
                    default:
                        i2 = gz8Var2.b.m;
                        break;
                }
                return np4.f(i, iB, i2);
            case 3:
                return oc9.v(i, -2147483647, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.c4m
    public int b(View view, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                return np4.f(i, ((BottomSheetBehavior) obj).y(), f(view));
            case 1:
                fl2 fl2Var = (fl2) obj;
                return oc9.v(i, fl2Var.g, fl2Var.f);
            case 2:
                return view.getTop();
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.c4m
    public int e(View view) {
        switch (this.a) {
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 3:
                return view.getWidth();
            default:
                return super.e(view);
        }
    }

    @Override // defpackage.c4m
    public int f(View view) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.s1 : bottomSheetBehavior.G;
            default:
                return super.f(view);
        }
    }

    @Override // defpackage.c4m
    public void h(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.D(1);
                    }
                }
                break;
            case 1:
                if (i == 1) {
                    ((fl2) obj).a.U1().H();
                }
                break;
            case 2:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.s(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.c4m
    public final void i(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) obj).v(i2);
                return;
            case 1:
                fl2 fl2Var = (fl2) obj;
                fl2Var.h = Integer.valueOf(i2);
                fl2Var.i(i2);
                fl2Var.h();
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    gz8 gz8Var = sideSheetBehavior.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (gz8Var.a) {
                        case 0:
                            if (left <= gz8Var.b.m) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i4 = gz8Var.b.m;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                gz8 gz8Var2 = sideSheetBehavior.a;
                switch (gz8Var2.a) {
                    case 0:
                        gz8Var2.c();
                        gz8Var2.b();
                        break;
                    default:
                        int i5 = gz8Var2.b.m;
                        gz8Var2.b();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw qt4.h(it);
                }
                return;
            default:
                reh rehVar = (reh) obj;
                if (i <= (-rehVar.getWidth()) || i >= rehVar.getWidth()) {
                    rehVar.b = true;
                    qeh callback = rehVar.getCallback();
                    if (callback != null) {
                        callback.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ab A[PHI: r2
  0x01ab: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:137:0x0235, B:129:0x0216, B:121:0x01e6, B:124:0x01fc, B:106:0x01a9, B:104:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x009a. Please report as an issue. */
    @Override // defpackage.c4m
    public final void j(View view, float f, float f2) {
        int iIntValue;
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        int i2 = 3;
        int i3 = 5;
        Object obj = this.b;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top > bottomSheetBehavior.E) {
                            i2 = 6;
                        }
                    }
                } else if (!bottomSheetBehavior.I || !bottomSheetBehavior.E(f2, view)) {
                    i3 = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (!bottomSheetBehavior.b) {
                            int i4 = bottomSheetBehavior.E;
                            if (top2 < i4) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                }
                            } else if (Math.abs(top2 - i4) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                i2 = i3;
                            }
                            i2 = 6;
                        } else if (Math.abs(top2 - bottomSheetBehavior.D) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i2 = i3;
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                                i2 = 6;
                            }
                        }
                        i2 = i3;
                    }
                } else if (Math.abs(f) < Math.abs(f2) && f2 > bottomSheetBehavior.d) {
                    i2 = i3;
                } else if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.s1) / 2) {
                    i2 = i3;
                } else if (!bottomSheetBehavior.b && Math.abs(view.getTop() - bottomSheetBehavior.y()) >= Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                    i2 = 6;
                }
                bottomSheetBehavior.F(view, i2, true);
                break;
            case 1:
                fl2 fl2Var = (fl2) obj;
                if (fl2Var.p) {
                    ChatMediaViewerScreen chatMediaViewerScreen = fl2Var.a;
                    if (chatMediaViewerScreen.J1()) {
                        chatMediaViewerScreen.U1().Q();
                    }
                    if (f2 > 1000.0f) {
                        iIntValue = fl2Var.f;
                    } else if (f2 < -1000.0f) {
                        iIntValue = fl2Var.g;
                    } else {
                        Integer num = fl2Var.h;
                        iIntValue = num != null ? num.intValue() : fl2Var.f;
                    }
                    fl2Var.settleToPosition(iIntValue);
                    break;
                }
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                boolean z4 = false;
                switch (sideSheetBehavior.a.a) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (!z) {
                    gz8 gz8Var = sideSheetBehavior.a;
                    switch (gz8Var.a) {
                        case 0:
                            if (Math.abs((gz8Var.b.k * f) + view.getLeft()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            if (Math.abs((gz8Var.b.k * f) + view.getRight()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.a.a) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                        }
                        if (z3) {
                            i2 = 5;
                        } else {
                            gz8 gz8Var2 = sideSheetBehavior.a;
                            switch (gz8Var2.a) {
                                case 0:
                                    if (view.getRight() < (gz8Var2.b() - gz8Var2.c()) / 2) {
                                        z4 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() > (gz8Var2.b() + gz8Var2.b.m) / 2) {
                                        z4 = true;
                                    }
                                    break;
                            }
                            if (z4) {
                                i2 = 5;
                            }
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.a.b()) >= Math.abs(left - sideSheetBehavior.a.c())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior.u(view, i2, true);
                break;
            default:
                reh rehVar = (reh) obj;
                int width = view.getWidth() / 2;
                int i5 = width / 2;
                if (rehVar.a.q(view, view.getLeft() > width - i5 ? rehVar.getWidth() : view.getRight() < width + i5 ? -rehVar.getWidth() : rehVar.getPaddingStart(), view.getTop())) {
                    rehVar.postInvalidateOnAnimation();
                }
                break;
        }
    }

    @Override // defpackage.c4m
    public final boolean k(View view, int i) {
        WeakReference weakReference;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i3 = bottomSheetBehavior.X;
                if (i3 == 1 || bottomSheetBehavior.z1) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.x1 == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.u1;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.t1;
                return weakReference3 != null && weakReference3.get() == view;
            case 1:
                fl2 fl2Var = (fl2) obj;
                return fl2Var.p && view == fl2Var.v;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
            default:
                reh rehVar = (reh) obj;
                qeh callback = rehVar.getCallback();
                return view == (callback != null ? callback.z() : null) && !rehVar.b;
        }
    }
}
