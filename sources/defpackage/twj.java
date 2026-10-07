package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class twj extends xwj {
    public static Field e;
    public static boolean f;
    public static Constructor g;
    public static boolean h;
    public WindowInsets c;
    public mi8 d;

    public twj() {
        this.c = j();
    }

    private static WindowInsets j() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.xwj
    public ixj b() {
        a();
        ixj ixjVarG = ixj.g(this.c, null);
        mi8[] mi8VarArr = this.b;
        exj exjVar = ixjVarG.a;
        exjVar.p(mi8VarArr);
        exjVar.r(this.d);
        return ixjVarG;
    }

    @Override // defpackage.xwj
    public void e(mi8 mi8Var) {
        this.d = mi8Var;
    }

    @Override // defpackage.xwj
    public void g(mi8 mi8Var) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(mi8Var.a, mi8Var.b, mi8Var.c, mi8Var.d);
        }
    }

    public twj(ixj ixjVar) {
        super(ixjVar);
        this.c = ixjVar.f();
    }
}
