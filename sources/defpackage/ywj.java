package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ywj extends exj {
    public static boolean i;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public mi8[] d;
    public mi8 e;
    public ixj f;
    public mi8 g;
    public int h;

    public ywj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean A(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private mi8 t(int i2, boolean z) {
        mi8 mi8VarA = mi8.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                mi8VarA = mi8.a(mi8VarA, u(i3, z));
            }
        }
        return mi8VarA;
    }

    private mi8 v() {
        ixj ixjVar = this.f;
        return ixjVar != null ? ixjVar.a.h() : mi8.e;
    }

    private mi8 w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.i("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            y();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return mi8.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void y() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    @Override // defpackage.exj
    public void d(View view) {
        mi8 mi8VarW = w(view);
        if (mi8VarW == null) {
            mi8VarW = mi8.e;
        }
        z(mi8VarW);
    }

    @Override // defpackage.exj
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ywj ywjVar = (ywj) obj;
        return Objects.equals(this.g, ywjVar.g) && A(this.h, ywjVar.h);
    }

    @Override // defpackage.exj
    public mi8 f(int i2) {
        return t(i2, false);
    }

    @Override // defpackage.exj
    public final mi8 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = mi8.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.exj
    public ixj l(int i2, int i3, int i4, int i5) {
        xwj uwjVar;
        ixj ixjVarG = ixj.g(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            uwjVar = new wwj(ixjVarG);
        } else if (i6 >= 30) {
            uwjVar = new vwj(ixjVarG);
        } else {
            uwjVar = i6 >= 29 ? new uwj(ixjVarG) : new twj(ixjVarG);
        }
        uwjVar.g(ixj.e(j(), i2, i3, i4, i5));
        uwjVar.e(ixj.e(h(), i2, i3, i4, i5));
        return uwjVar.b();
    }

    @Override // defpackage.exj
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.exj
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !x(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.exj
    public void p(mi8[] mi8VarArr) {
        this.d = mi8VarArr;
    }

    @Override // defpackage.exj
    public void q(ixj ixjVar) {
        this.f = ixjVar;
    }

    @Override // defpackage.exj
    public void s(int i2) {
        this.h = i2;
    }

    public mi8 u(int i2, boolean z) {
        mi8 mi8VarH;
        int i3;
        mi8 mi8Var = mi8.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    mi8[] mi8VarArr = this.d;
                    mi8VarH = mi8VarArr != null ? mi8VarArr[gm0.A(8)] : null;
                    if (mi8VarH != null) {
                        return mi8VarH;
                    }
                    mi8 mi8VarJ = j();
                    mi8 mi8VarV = v();
                    int i4 = mi8VarJ.d;
                    if (i4 > mi8VarV.d) {
                        return mi8.b(0, 0, 0, i4);
                    }
                    mi8 mi8Var2 = this.g;
                    if (mi8Var2 != null && !mi8Var2.equals(mi8Var) && (i3 = this.g.d) > mi8VarV.d) {
                        return mi8.b(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return i();
                    }
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 == 128) {
                        ixj ixjVar = this.f;
                        do5 do5VarE = ixjVar != null ? ixjVar.a.e() : e();
                        if (do5VarE != null) {
                            return mi8.b(do5VarE.b(), do5VarE.d(), do5VarE.c(), do5VarE.a());
                        }
                    }
                }
            } else {
                if (z) {
                    mi8 mi8VarV2 = v();
                    mi8 mi8VarH2 = h();
                    return mi8.b(Math.max(mi8VarV2.a, mi8VarH2.a), 0, Math.max(mi8VarV2.c, mi8VarH2.c), Math.max(mi8VarV2.d, mi8VarH2.d));
                }
                if ((this.h & 2) == 0) {
                    mi8 mi8VarJ2 = j();
                    ixj ixjVar2 = this.f;
                    mi8VarH = ixjVar2 != null ? ixjVar2.a.h() : null;
                    int iMin = mi8VarJ2.d;
                    if (mi8VarH != null) {
                        iMin = Math.min(iMin, mi8VarH.d);
                    }
                    return mi8.b(mi8VarJ2.a, 0, mi8VarJ2.c, iMin);
                }
            }
        } else {
            if (z) {
                return mi8.b(0, Math.max(v().b, j().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return mi8.b(0, j().b, 0, 0);
            }
        }
        return mi8Var;
    }

    public boolean x(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !u(i2, false).equals(mi8.e);
    }

    public void z(mi8 mi8Var) {
        this.g = mi8Var;
    }
}
