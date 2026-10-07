package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public interface z4f {
    static View p(ViewGroup viewGroup, String str, WindowInsets windowInsets, int i) {
        int i2;
        int i3;
        View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        int[] iArr = y4f.$EnumSwitchMapping$1;
        int i4 = iArr[qt4.D(i)];
        if (i4 == 1) {
            i2 = windowInsets.getInsets(WindowInsets.Type.statusBars()).top;
        } else {
            if (i4 != 2) {
                ore.o();
                return null;
            }
            i2 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        }
        int i5 = iArr[qt4.D(i)];
        if (i5 == 1) {
            i3 = 48;
        } else {
            if (i5 != 2) {
                ore.o();
                return null;
            }
            i3 = 80;
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, i2, i3));
        view.setTag(str);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return null;
        }
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        return view;
    }

    default Integer L() {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        pq3.j.e(getContext()).m();
        return 0;
    }

    default Integer R() {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        pq3.j.e(getContext()).m();
        return 0;
    }

    default void d(Window window) {
        if ((getA() == 3 || getA() == 1) && Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        s(window, R(), L(), l0());
    }

    Context getContext();

    default void j(Window window) {
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(true);
        }
        Context context = getContext();
        a8g a8gVar = pq3.j;
        a8gVar.e(context).m();
        a8gVar.e(getContext()).m();
        s(window, 0, 0, false);
    }

    default boolean l0() {
        return true;
    }

    default void s(Window window, Integer num, Integer num2, boolean z) {
        ch3 kxjVar;
        x0(window, num, num2);
        View decorView = window.getDecorView();
        v56 v56Var = new v56(decorView);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            kxjVar = new lxj(window, v56Var);
        } else {
            kxjVar = i >= 30 ? new kxj(window, v56Var) : new jxj(window, v56Var);
        }
        boolean z2 = pq3.j.h(decorView).A() == ix3.a && !z;
        int iD = qt4.D(getA());
        if (iD == 0) {
            kxjVar.a0(z2);
            kxjVar.Z(z2);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(z2);
                return;
            }
            return;
        }
        if (iD == 1) {
            kxjVar.a0(z2);
            return;
        }
        if (iD != 2) {
            ore.o();
            return;
        }
        kxjVar.Z(z2);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(z2);
        }
    }

    /* JADX INFO: renamed from: v */
    default int getA() {
        return 1;
    }

    default void x0(Window window, final Integer num, final Integer num2) {
        if (Build.VERSION.SDK_INT >= 35) {
            final ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(num, viewGroup, num2, this) { // from class: x4f
                public final /* synthetic */ Integer a;
                public final /* synthetic */ ViewGroup b;
                public final /* synthetic */ Integer c;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Integer num3 = this.a;
                    ViewGroup viewGroup2 = this.b;
                    if (num3 != null) {
                        z4f.p(viewGroup2, "statusBarOverlay", windowInsets, 1).setBackgroundColor(num3.intValue());
                    } else {
                        View viewFindViewWithTag = viewGroup2.findViewWithTag("statusBarOverlay");
                        if (viewFindViewWithTag != null) {
                            viewGroup2.removeView(viewFindViewWithTag);
                        }
                    }
                    Integer num4 = this.c;
                    if (num4 != null) {
                        z4f.p(viewGroup2, "navBarOverlay", windowInsets, 2).setBackgroundColor(num4.intValue());
                        return windowInsets;
                    }
                    View viewFindViewWithTag2 = viewGroup2.findViewWithTag("navBarOverlay");
                    if (viewFindViewWithTag2 != null) {
                        viewGroup2.removeView(viewFindViewWithTag2);
                    }
                    return windowInsets;
                }
            });
            return;
        }
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
    }
}
