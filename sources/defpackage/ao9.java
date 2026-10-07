package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ao9 {
    public final zn9 a;
    public ywf b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public jo9 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public ao9(zn9 zn9Var, ywf ywfVar) {
        this.a = zn9Var;
        this.b = ywfVar;
    }

    public final kxf a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.s;
        return numberOfLayers > 2 ? (kxf) rippleDrawable2.getDrawable(2) : (kxf) rippleDrawable2.getDrawable(1);
    }

    public final jo9 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (jo9) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(ywf ywfVar) {
        this.b = ywfVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(ywfVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(ywfVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(ywfVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = i7j.a;
        zn9 zn9Var = this.a;
        int paddingStart = zn9Var.getPaddingStart();
        int paddingTop = zn9Var.getPaddingTop();
        int paddingEnd = zn9Var.getPaddingEnd();
        int paddingBottom = zn9Var.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        zn9Var.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        jo9 jo9Var = new jo9(this.b);
        zn9 zn9Var = this.a;
        jo9Var.h(zn9Var.getContext());
        jo9Var.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            jo9Var.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        jo9Var.a.j = f;
        jo9Var.invalidateSelf();
        io9 io9Var = jo9Var.a;
        if (io9Var.d != colorStateList) {
            io9Var.d = colorStateList;
            jo9Var.onStateChange(jo9Var.getState());
        }
        jo9 jo9Var2 = new jo9(this.b);
        jo9Var2.setTint(0);
        float f2 = this.h;
        int iD = this.n ? qyj.D(zn9Var, R.attr.colorSurface) : 0;
        jo9Var2.a.j = f2;
        jo9Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        io9 io9Var2 = jo9Var2.a;
        if (io9Var2.d != colorStateListValueOf) {
            io9Var2.d = colorStateListValueOf;
            jo9Var2.onStateChange(jo9Var2.getState());
        }
        jo9 jo9Var3 = new jo9(this.b);
        this.m = jo9Var3;
        jo9Var3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(pqe.c(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jo9Var2, jo9Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        zn9Var.setInternalBackground(rippleDrawable);
        jo9 jo9VarB = b(false);
        if (jo9VarB != null) {
            jo9VarB.i(this.t);
            jo9VarB.setState(zn9Var.getDrawableState());
        }
    }

    public final void f() {
        jo9 jo9VarB = b(false);
        jo9 jo9VarB2 = b(true);
        if (jo9VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            jo9VarB.a.j = f;
            jo9VarB.invalidateSelf();
            io9 io9Var = jo9VarB.a;
            if (io9Var.d != colorStateList) {
                io9Var.d = colorStateList;
                jo9VarB.onStateChange(jo9VarB.getState());
            }
            if (jo9VarB2 != null) {
                float f2 = this.h;
                int iD = this.n ? qyj.D(this.a, R.attr.colorSurface) : 0;
                jo9VarB2.a.j = f2;
                jo9VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
                io9 io9Var2 = jo9VarB2.a;
                if (io9Var2.d != colorStateListValueOf) {
                    io9Var2.d = colorStateListValueOf;
                    jo9VarB2.onStateChange(jo9VarB2.getState());
                }
            }
        }
    }
}
