package defpackage;

import android.text.SpannableStringBuilder;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class x9h extends a8j {
    public static final /* synthetic */ zv8[] J = {new z8b(x9h.class, "loadingJob", "getLoadingJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, x9h.class, "processTextJob", "getProcessTextJob()Lkotlinx/coroutines/Job;")};
    public final mjg A;
    public final mjg B;
    public final p3c C;
    public final p3c D;
    public jah E;
    public uii F;
    public lx2 G;
    public r6a H;
    public uv2 I;
    public final gjg c;
    public final t73 d;
    public final ny8 e;
    public final af7 f;
    public final fik g;
    public final ny8 h;
    public final ny8 i;
    public final t51 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public lah r = lah.g;
    public final mjg s;
    public final r8e t;
    public final pzf u;
    public final pzf v;
    public final mjg w;
    public final mjg x;
    public final mjg y;
    public final r8e z;

    public x9h(gjg gjgVar, t73 t73Var, ny8 ny8Var, af7 af7Var, fik fikVar, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, t51 t51Var) {
        this.c = gjgVar;
        this.d = t73Var;
        this.e = ny8Var;
        this.f = af7Var;
        this.g = fikVar;
        this.h = ny8Var5;
        this.i = ny8Var10;
        this.j = t51Var;
        this.k = ny8Var6;
        this.l = ny8Var2;
        this.m = ny8Var3;
        this.n = ny8Var4;
        this.o = ny8Var7;
        this.p = ny8Var8;
        this.q = ny8Var9;
        mjg mjgVarA = p90.a(null);
        this.s = mjgVarA;
        this.t = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.u = pzfVarB;
        this.v = pzfVarB;
        mjg mjgVarA2 = p90.a(null);
        this.w = mjgVarA2;
        this.x = p90.a(0);
        mjg mjgVarA3 = p90.a(null);
        this.y = mjgVarA3;
        this.z = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(null);
        this.A = mjgVarA4;
        this.B = mjgVarA4;
        this.C = qyj.S();
        this.D = qyj.S();
        e9i.j0(new fz6(mjgVarA2, new j8g(this, (lq4) null, 12), 3), this.b);
    }

    public final CharSequence B(u9h u9hVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u9hVar.i().toString());
        int i = s9h.d;
        w9h w9hVar = new w9h(this, 0);
        spannableStringBuilder.toString();
        spannableStringBuilder.setSpan(new s9h(this.f, u9hVar, w9hVar), 0, spannableStringBuilder.length(), 17);
        return ((p4c) this.q.getValue()).c(spannableStringBuilder, new cga(u9hVar.a, null, bga.a, 0, spannableStringBuilder.length(), null), false, true);
    }

    public final ei8 C() {
        return new ei8(((Number) this.x.getValue()).intValue(), (CharSequence) this.w.getValue());
    }

    public final xhh D() {
        return (xhh) this.k.getValue();
    }

    public final void E(int i, String str) {
        mjg mjgVar;
        Object value;
        lx2 lx2Var = this.G;
        if (lx2Var == null) {
            gm0.Y(x9h.class.getName(), "Early return in loadMoreItems cuz of chatType is null");
            return;
        }
        uii uiiVar = this.F;
        if (uiiVar == null) {
            gm0.Y(x9h.class.getName(), "Early return in loadMoreItems cuz of suggestRepository is null");
            return;
        }
        r6a r6aVar = this.H;
        if (r6aVar == null) {
            gm0.Y(x9h.class.getName(), "Early return in loadMoreItems cuz of suggestionsMapper is null");
            return;
        }
        if (str == null || r5h.X0(str)) {
            this.r = lah.g;
            do {
                mjgVar = this.s;
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, null));
            return;
        }
        sgg sggVarI0 = yab.i0(this.b, ((n0c) D()).b(), 0, new tt6(this, str, i, lx2Var, uiiVar, r6aVar, null), 2);
        this.C.B(this, J[0], sggVarI0);
    }

    public final void F(CharSequence charSequence) {
        if (charSequence == null || r5h.X0(charSequence)) {
            return;
        }
        sgg sggVarI0 = yab.i0(this.b, null, 0, new ryf(this, charSequence, null, 13), 3);
        this.D.B(this, J[1], sggVarI0);
    }

    public final void G(r9h r9hVar) {
        this.A.setValue(r9hVar);
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        jah jahVar = this.E;
        if (jahVar != null) {
            String str = jahVar.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, jahVar + " clear", null);
                }
            }
            sgg sggVar = jahVar.p;
            if (sggVar != null) {
                sggVar.b(null);
            }
            jahVar.p = null;
            sgg sggVar2 = jahVar.q;
            if (sggVar2 != null) {
                sggVar2.b(null);
            }
            jahVar.q = null;
            b11 b11Var = jahVar.h;
            b11Var.b.f(b11Var);
            jahVar.n = r66.a;
        }
    }
}
