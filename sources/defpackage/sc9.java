package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sc9 extends a8j {
    public final String c;
    public final Context e;
    public final ny8 f;
    public final ny8 h;
    public final ny8 i;
    public final mjg j;
    public final r8e k;
    public final String l;
    public final ic6 m;
    public final boolean d = true;
    public final List g = gc9.a;

    public sc9(String str, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = str;
        this.e = context;
        this.f = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        mjg mjgVarA = p90.a(r66.a);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        String name = sc9.class.getName();
        this.l = name;
        lq4 lq4Var = null;
        this.m = new ic6(null);
        gm0.n(name, "init, LocaleViewModel");
        yab.i0(this.b, null, 0, new c37(this, lq4Var, 5), 3);
        tre.m0(e9i.o(new af8(this, lq4Var, 8)), this.b);
    }

    public final String B(int i) {
        Object obj;
        List list = this.g;
        if (i < 0 || i >= list.size()) {
            String str = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.k(i, "Can't find lang for id: ", ", set default"), null);
                }
            }
            obj = "ru";
        } else {
            obj = list.get(i);
        }
        return (String) obj;
    }
}
