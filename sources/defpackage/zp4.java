package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zp4 implements pp4 {
    public Bundle a;
    public ynh b;
    public Collection c;
    public int d;
    public Class e;
    public Integer f;
    public Rect g;
    public Float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public float l;
    public float m;
    public Float n;
    public boolean o;
    public float p;
    public float q;
    public View r;
    public boolean s;
    public boolean t;
    public View u;

    @Override // defpackage.pp4
    public pp4 a() {
        Rect rect = tv7.b;
        this.g = tv7.b;
        this.h = null;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 b() {
        this.g = null;
        this.h = null;
        return this;
    }

    @Override // defpackage.pp4
    public qp4 build() {
        Bundle bundle = this.a;
        ynh ynhVar = this.b;
        Collection collection = this.c;
        int i = this.d;
        Class cls = this.e;
        Integer num = this.f;
        Rect rect = this.g;
        Float f = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        float f2 = this.l;
        float f3 = this.m;
        Float f4 = this.n;
        boolean z4 = this.o;
        float f5 = this.p;
        float f6 = this.q;
        rja rjaVar = (rja) this.u;
        View view = this.r;
        boolean z5 = this.s;
        boolean z6 = this.t;
        zp4 zp4Var = new zp4();
        zp4Var.a = bundle;
        zp4Var.b = ynhVar;
        zp4Var.c = collection;
        zp4Var.d = i;
        zp4Var.e = cls;
        zp4Var.f = num;
        zp4Var.g = rect;
        zp4Var.h = f;
        zp4Var.i = z;
        zp4Var.j = z2;
        zp4Var.k = z3;
        zp4Var.l = f2;
        zp4Var.m = f3;
        zp4Var.n = f4;
        zp4Var.o = z4;
        zp4Var.p = f5;
        zp4Var.q = f6;
        zp4Var.r = rjaVar;
        zp4Var.u = view;
        zp4Var.s = z5;
        zp4Var.t = z6;
        return new ri(zp4Var);
    }

    @Override // defpackage.pp4
    public pp4 c() {
        this.j = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 d() {
        this.s = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 e() {
        this.k = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 f(View view) {
        if (view.getId() == -1) {
            ore.k("anchor view has no id");
            return null;
        }
        this.d = view.getId();
        this.e = view.getClass();
        return this;
    }

    @Override // defpackage.pp4
    public pp4 g() {
        this.i = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 h(Rect rect, float f) {
        this.g = rect;
        this.h = Float.valueOf(f);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 i() {
        this.t = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 j(float f) {
        this.q = f;
        return this;
    }

    @Override // defpackage.pp4
    public void k(rja rjaVar) {
        this.u = rjaVar;
    }

    @Override // defpackage.pp4
    public pp4 l(Collection collection) {
        this.c = ww3.T1(collection);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 m() {
        this.o = true;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 n(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            ore.k("Check failed.");
            return null;
        }
        this.l = f;
        this.m = f2;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 o(float f) {
        Rect rect = tv7.b;
        this.g = tv7.b;
        this.h = Float.valueOf(f);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 p(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 q() {
        this.f = Integer.valueOf(R.id.messages_list_recycler_view);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 r(float f) {
        this.p = f;
        return this;
    }

    @Override // defpackage.pp4
    public pp4 s() {
        this.n = Float.valueOf(0.25f);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 t(ynh ynhVar) {
        this.b = ynhVar;
        return this;
    }

    @Override // defpackage.pp4
    public void u(kda kdaVar) {
        this.r = kdaVar;
    }
}
