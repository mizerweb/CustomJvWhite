package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vki extends Drawable implements j8j {
    public static boolean u;
    public static boolean v;
    public final q78 a;
    public final String b;
    public final pj c;
    public final eu5 d;
    public final dpe e;
    public final Handler f;
    public kzi g;
    public int h;
    public final WeakHashMap i;
    public final ex4 j;
    public v78 k;
    public v78 l;
    public final int m;
    public final ski n;
    public final ski o;
    public final ski p;
    public final ski q;
    public final ski r;
    public ewg s;
    public String t;

    public vki(Context context, q78 q78Var) {
        this.a = q78Var;
        this.b = vki.class.getName();
        pj pjVar = new pj(7, this);
        this.c = pjVar;
        xj7 xj7Var = new xj7(context.getResources());
        int i = 0;
        xj7Var.b = 0;
        eu5 eu5Var = new eu5(xj7Var.a());
        ote oteVarD = eu5Var.d();
        if (oteVarD != null) {
            oteVarD.setCallback(pjVar);
        }
        this.d = eu5Var;
        this.e = new dpe();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.h = 255;
        this.i = new WeakHashMap();
        this.j = new ex4(3, this);
        this.m = gm0.K(15.0f * yl5.d().getDisplayMetrics().density);
        this.n = new ski(this, i);
        ski skiVar = new ski(this, 1);
        this.o = skiVar;
        this.p = new ski(this, 2);
        this.q = new ski(this, 3);
        this.r = new ski(this, 4);
        handler.removeCallbacks(skiVar);
        l0m.b(handler, skiVar);
    }

    public static void d(vki vkiVar) {
        super.invalidateSelf();
    }

    public static final String e(vki vkiVar) {
        String str = vkiVar.t;
        if (str != null) {
            return r5h.u1(20, str);
        }
        return null;
    }

    public static v78 g(v78 v78Var, int i, int i2) {
        w78 w78VarB = w78.b(v78Var);
        w78VarB.d = (i <= 0 || i2 <= 0) ? null : new bne(i, i2, 0.0f, 12);
        return w78VarB.a();
    }

    @Override // defpackage.j8j
    public final void a(boolean z) {
    }

    @Override // defpackage.j8j
    public final void b(View view) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "[" + Thread.currentThread().getName() + "] " + ((Object) ("onAttach with view: " + e(this) + ", bounds: " + getBounds())), null);
            }
        }
        this.i.put(view, sbi.a);
        this.f.removeCallbacks(this.p);
        l0m.b(this.f, this.p);
    }

    @Override // defpackage.j8j
    public final void c(View view) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "[" + Thread.currentThread().getName() + "] " + ((Object) qv1.k("onDetach ", e(this))), null);
            }
        }
        this.i.remove(view);
        this.f.removeCallbacks(this.q);
        l0m.b(this.f, this.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        je9 je9Var = je9.f;
        ote oteVarD = this.d.d();
        if (getCallback() == null || !this.d.b || oteVarD == null || (bounds = oteVarD.getBounds()) == null || bounds.isEmpty()) {
            return;
        }
        if (!Looper.getMainLooper().isCurrentThread()) {
            if (u) {
                return;
            }
            String str = this.b;
            uki ukiVar = new uki();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("Try to draw UrlDrawable(", e(this), ") on not MainThread"), ukiVar);
            }
            u = true;
            return;
        }
        try {
            oteVarD.draw(canvas);
        } catch (NullPointerException e) {
            if (v) {
                return;
            }
            String str2 = this.b;
            tki tkiVar = new tki(e);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, c0a.o("Couldn't draw UrlDrawable(", e(this), ") because of Transform callback, probably race condition happened"), tkiVar);
            }
            v = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    public final void f(v78 v78Var, v78 v78Var2) {
        char c;
        Object z68Var;
        u78 u78Var = u78.FULL_FETCH;
        je9 je9Var = je9.f;
        if (v78Var == null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                String name = Thread.currentThread().getName();
                a4cVar.c(je9Var, str, "[" + name + "] " + ((Object) qt4.n("loadImage: ", e(this), " with null imageRequest; lowImageRequest is null = ", v78Var2 == null)), null);
            }
            this.d.i(null);
            return;
        }
        Rect bounds = getBounds();
        ote oteVarD = this.d.d();
        Rect bounds2 = oteVarD != null ? oteVarD.getBounds() : null;
        if (bounds2 != null && !bounds2.isEmpty()) {
            c = 1;
        } else if (bounds.isEmpty()) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                c = 1;
                a4cVar2.c(je9Var, str2, "[" + Thread.currentThread().getName() + "] " + ((Object) c0a.o("loadImage: ", e(this), " called prematurely, need to set bounds first")), null);
            } else {
                c = 1;
            }
        } else {
            c = 1;
            ote oteVarD2 = this.d.d();
            if (oteVarD2 != null) {
                oteVarD2.setBounds(getBounds());
            }
        }
        int iWidth = bounds.width();
        int i = this.m;
        if (iWidth < i) {
            iWidth = i;
        }
        int iHeight = bounds.height();
        int i2 = this.m;
        if (iHeight < i2) {
            iHeight = i2;
        }
        if (v78Var2 != null) {
            b78 b78VarA = vd7.A();
            v78 v78VarG = g(v78Var, iWidth, iHeight);
            q78 q78Var = this.a;
            b78VarA.getClass();
            z68 z68Var2 = new z68(b78VarA, v78VarG, q78Var, u78Var);
            b78 b78VarA2 = vd7.A();
            v78 v78VarG2 = g(v78Var2, iWidth, iHeight);
            q78 q78Var2 = this.a;
            b78VarA2.getClass();
            z68 z68Var3 = new z68(b78VarA2, v78VarG2, q78Var2, u78Var);
            oah[] oahVarArr = new oah[2];
            oahVarArr[0] = z68Var2;
            oahVarArr[c] = z68Var3;
            z68Var = new wc8(xw3.P0(oahVarArr), false);
        } else {
            b78 b78VarA3 = vd7.A();
            v78 v78VarG3 = g(v78Var, iWidth, iHeight);
            q78 q78Var3 = this.a;
            b78VarA3.getClass();
            z68Var = new z68(b78VarA3, v78VarG3, q78Var3, u78Var);
        }
        ewg ewgVar = this.s;
        if (ewgVar != null) {
            this.f.removeCallbacks(ewgVar);
        }
        ewg ewgVar2 = new ewg(this, 12, z68Var);
        l0m.b(this.f, ewgVar2);
        this.s = ewgVar2;
        if (this.d.e == null) {
            Handler handler = this.f;
            ski skiVar = this.o;
            handler.removeCallbacks(skiVar);
            l0m.b(handler, skiVar);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            return oteVarD.getOpacity();
        }
        return -3;
    }

    public final void h(eve eveVar) {
        du5 du5Var = this.d.d;
        du5Var.getClass();
        ((wj7) du5Var).m(eveVar);
    }

    public final void i(Uri uri, String str) {
        Uri uriC;
        if (cqk.d(this.t, str)) {
            return;
        }
        String str2 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "[" + Thread.currentThread().getName() + "] " + ((Object) qv1.k("setUrl = ", e(this))), null);
            }
        }
        this.t = str;
        this.k = (str == null || (uriC = f55.c(str)) == null) ? null : w78.d(uriC).a();
        v78 v78VarA = uri != null ? w78.d(uri).a() : null;
        this.l = v78VarA;
        f(this.k, v78VarA);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Handler handler = this.f;
        ski skiVar = this.n;
        handler.removeCallbacks(skiVar);
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            skiVar.run();
        } else {
            handler.postAtFrontOfQueue(skiVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            oteVarD.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        }
        f(this.k, this.l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            ore.c(c0a.k(i, "Alpha is ", ", must be in range 0..255"));
            return;
        }
        this.h = i;
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            oteVarD.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            oteVarD.setColorFilter(colorFilter);
        }
    }

    public vki(Context context, String str) {
        this(context, (q78) null);
        i(null, str);
    }

    public /* synthetic */ vki(Context context, Uri uri, String str) {
        this(context, str, uri, null);
    }

    public vki(Context context, String str, Uri uri, q78 q78Var) {
        this(context, q78Var);
        i(uri, str);
    }
}
