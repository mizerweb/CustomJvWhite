package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class l1c extends t6g {
    public final String j;
    public final dpe k;
    public final fik l;
    public final ex4 m;
    public boolean n;

    public l1c(Context context, wj7 wj7Var) {
        super(context);
        setHierarchy(wj7Var);
        e(context);
        this.j = getClass().getName();
        dpe dpeVar = new dpe();
        this.k = dpeVar;
        this.l = new fik(24, dpeVar);
        this.m = new ex4(2, this);
        setupNewController(false);
    }

    public static /* synthetic */ void j(l1c l1cVar, v78 v78Var, v78 v78Var2, int i) {
        if ((i & 2) != 0) {
            v78Var2 = null;
        }
        l1cVar.i(v78Var, v78Var2, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.draw(canvas);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ng7(this, 15, canvas));
        } else {
            post(new og7(this, 15, canvas));
        }
    }

    public final t25 getCurrentDataSource() {
        fik fikVar = this.l;
        cpe cpeVar = (cpe) fikVar.c;
        if (cpeVar == null || cpeVar.d()) {
            dpe dpeVar = (dpe) fikVar.b;
            cpe cpeVar2 = new cpe();
            cpeVar2.h = null;
            cpeVar2.o(dpeVar.b);
            dpeVar.a.add(cpeVar2);
            fikVar.c = cpeVar2;
        }
        return (cpe) fikVar.c;
    }

    public final void i(v78 v78Var, v78 v78Var2, q78 q78Var) {
        oah z68Var;
        dpe dpeVar = this.k;
        if (v78Var == null) {
            if (v78Var2 == null) {
                setController(null);
                return;
            }
            b78 b78VarA = vd7.A();
            u78 u78Var = v78Var2.k;
            b78VarA.getClass();
            dpeVar.a(new z68(b78VarA, v78Var2, q78Var, u78Var));
            if (getController() == null) {
                setupNewController(this.n);
                return;
            }
            return;
        }
        u78 u78Var2 = v78Var.k;
        if (v78Var2 != null) {
            b78 b78VarA2 = vd7.A();
            b78VarA2.getClass();
            z68 z68Var2 = new z68(b78VarA2, v78Var, q78Var, u78Var2);
            b78 b78VarA3 = vd7.A();
            u78 u78Var3 = v78Var2.k;
            b78VarA3.getClass();
            z68Var = new wc8(xw3.P0(z68Var2, new z68(b78VarA3, v78Var2, q78Var, u78Var3)), false);
        } else {
            b78 b78VarA4 = vd7.A();
            b78VarA4.getClass();
            z68Var = new z68(b78VarA4, v78Var, q78Var, u78Var2);
        }
        dpeVar.a(z68Var);
        if (getController() == null) {
            setupNewController(this.n);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ng7(this, 16, drawable));
        } else {
            post(new og7(this, 16, drawable));
        }
    }

    public void k(l68 l68Var, Animatable animatable) {
    }

    public final void setupNewController(boolean z) {
        this.n = z;
        t1d t1dVar = vd7.a.get();
        t1dVar.e = this.k;
        t1dVar.f = this.m;
        t1dVar.j = getController();
        t1dVar.h = z;
        setController(t1dVar.a());
    }

    public l1c(Context context) {
        super(context);
        this.j = getClass().getName();
        dpe dpeVar = new dpe();
        this.k = dpeVar;
        this.l = new fik(24, dpeVar);
        this.m = new ex4(2, this);
        setupNewController(false);
    }
}
