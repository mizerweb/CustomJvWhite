package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nm0 {
    public static final /* synthetic */ zv8[] i;
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ConcurrentHashMap e;
    public final pzf f;
    public final q8e g;
    public final p3c h;

    static {
        z8b z8bVar = new z8b(nm0.class, "warmUpJob", "getWarmUpJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public nm0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = new ConcurrentHashMap(((mbc) pq3.j.e(context).d).b.values().size() * 2);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.f = pzfVarB;
        this.g = new q8e(pzfVarB);
        this.h = qyj.S();
    }

    public final Drawable a(hm0 hm0Var) {
        return (Drawable) this.e.get(hm0Var);
    }

    public final void b() {
        sgg sggVarH0 = yab.h0((wmi) this.d.getValue(), ((n0c) ((xhh) this.c.getValue())).a(), 2, new qi4(this, null));
        this.h.B(this, i[0], sggVarH0);
    }
}
