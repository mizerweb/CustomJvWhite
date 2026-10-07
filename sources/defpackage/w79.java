package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class w79 implements x3g {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public kv5 c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public t79 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final es z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final s79 r = new s79(this, 1);
    public final v79 s = new v79(this);
    public final u79 t = new u79(this);
    public final s79 u = new s79(this, 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public w79(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l3e.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        es esVar = new es(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l3e.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            esVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        esVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : wk8.o(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.z = esVar;
        esVar.setInputMethodMode(1);
    }

    @Override // defpackage.x3g
    public final boolean a() {
        return this.z.isShowing();
    }

    public final Drawable b() {
        return this.z.getBackground();
    }

    public final int c() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.x3g
    public final void dismiss() {
        es esVar = this.z;
        esVar.dismiss();
        esVar.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final void g(int i) {
        this.g = i;
        this.i = true;
    }

    public final int j() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        t79 t79Var = this.n;
        if (t79Var == null) {
            this.n = new t79(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(t79Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        kv5 kv5Var = this.c;
        if (kv5Var != null) {
            kv5Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.x3g
    public final void m() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        kv5 kv5Var;
        kv5 kv5Var2 = this.c;
        Context context = this.a;
        es esVar = this.z;
        if (kv5Var2 == null) {
            kv5 kv5VarP = p(context, !this.y);
            this.c = kv5VarP;
            kv5VarP.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new p79(this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            esVar.setContentView(this.c);
        }
        Drawable background = esVar.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = q79.a(esVar, this.o, this.g, esVar.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = esVar.getInputMethodMode() == 2;
        esVar.setWindowLayoutType(this.h);
        if (esVar.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        esVar.setWidth(i5 == -1 ? -1 : 0);
                        esVar.setHeight(0);
                    } else {
                        esVar.setWidth(i5 == -1 ? -1 : 0);
                        esVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                esVar.setOutsideTouchable(true);
                int i6 = width;
                View view = this.o;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                esVar.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        esVar.setWidth(width2);
        esVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(esVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            r79.b(esVar, true);
        }
        esVar.setOutsideTouchable(true);
        esVar.setTouchInterceptor(this.s);
        if (this.k) {
            esVar.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(esVar, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            r79.a(esVar, this.x);
        }
        esVar.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (kv5Var = this.c) != null) {
            kv5Var.setListSelectionHidden(true);
            kv5Var.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    @Override // defpackage.x3g
    public final kv5 n() {
        return this.c;
    }

    public final void o(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public kv5 p(Context context, boolean z) {
        return new kv5(context, z);
    }

    public final void q(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
