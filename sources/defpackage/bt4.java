package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bt4 extends ViewGroup.MarginLayoutParams {
    public ys4 a;
    public boolean b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;

    public bt4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3e.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = et4.s;
            ys4 ys4Var = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = et4.s;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = et4.u;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(et4.t);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    ys4Var = (ys4) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    ore.h("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.a = ys4Var;
        }
        typedArrayObtainStyledAttributes.recycle();
        ys4 ys4Var2 = this.a;
        if (ys4Var2 != null) {
            ys4Var2.c(this);
        }
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.m;
        }
        if (i != 1) {
            return false;
        }
        return this.n;
    }

    public final void b(ys4 ys4Var) {
        ys4 ys4Var2 = this.a;
        if (ys4Var2 != ys4Var) {
            if (ys4Var2 != null) {
                ys4Var2.f();
            }
            this.a = ys4Var;
            this.b = true;
            if (ys4Var != null) {
                ys4Var.c(this);
            }
        }
    }

    public bt4(int i, int i2) {
        super(i, i2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public bt4(bt4 bt4Var) {
        super((ViewGroup.MarginLayoutParams) bt4Var);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public bt4(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public bt4(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}
