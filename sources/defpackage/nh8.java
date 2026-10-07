package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class nh8 {
    public static final /* synthetic */ zv8[] m;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final mjg e;
    public final pzf g;
    public final q8e h;
    public final lge i;
    public final mjg j;
    public final r8e k;
    public final b9b l;
    public final p3c d = qyj.S();
    public final mjg f = p90.a("");

    static {
        z8b z8bVar = new z8b(nh8.class, "availableCountriesJob", "getAvailableCountriesJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public nh8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.e = p90.a(new x0c("RU", 7, context.getString(R.string.oneme_russia_name), null));
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.g = pzfVarB;
        this.h = new q8e(pzfVarB);
        this.i = new lge("[^0-9+]");
        mjg mjgVarA = p90.a(r66.a);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        xnh xnhVar = new xnh("123 4567 8901");
        xnh xnhVar2 = new xnh("473 123 4567");
        xnh xnhVar3 = new xnh("12 3456 7890");
        xnh xnhVar4 = new xnh("9 123 456 789");
        xnh xnhVar5 = new xnh("1 234 567");
        xnh xnhVar6 = new xnh("869 123 4567");
        b9b b9bVar = new b9b(6);
        b9bVar.k("ID", xnhVar);
        b9bVar.k("GD", xnhVar2);
        b9bVar.k("EG", xnhVar3);
        b9bVar.k("MM", xnhVar4);
        b9bVar.k("LB", xnhVar5);
        b9bVar.k("KN", xnhVar6);
        this.l = b9bVar;
    }

    public final xx6 a(qf7 qf7Var) {
        return e9i.T(new r07(new j3(this.f, 23, this), new r07(this.e, qf7Var, this, 2), new jh8(3, null), 0), ((n0c) ((xhh) this.c.getValue())).a());
    }

    public final r8e b(dq4 dq4Var) {
        mjg mjgVar = this.e;
        return e9i.G0(new r07(mjgVar, dq4Var, this, 3), dq4Var, j0g.a, new uu4((x0c) mjgVar.getValue(), Integer.MAX_VALUE, new tnh(R.string.oneme_default_phone_hint)));
    }

    public final void c(String str, String str2) {
        Object next;
        mjg mjgVar = this.f;
        mjgVar.getClass();
        mjgVar.j(null, str2);
        String strP = vd7.p(str.concat(str2));
        if (strP != null) {
            Iterator it = ((Iterable) this.k.a.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(((x0c) next).a, strP));
            x0c x0cVar = (x0c) next;
            if (x0cVar == null) {
                return;
            }
            mjg mjgVar2 = this.e;
            mjgVar2.getClass();
            mjgVar2.j(null, x0cVar);
        }
    }

    public final void d(x0c x0cVar, boolean z) {
        int i = x0cVar.b;
        if (z && i == 7) {
            String strP = vd7.p("+" + i + this.f.getValue());
            if (strP != null && !strP.equals(x0cVar.a)) {
                this.g.a(gh8.a);
            }
        }
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, x0cVar);
    }

    public final void e(gu4 gu4Var, List list) {
        sgg sggVarJ0 = e9i.j0(e9i.T(new fz6(new j3(((wge) this.a.getValue()).f, 24, list), new y73(this, (lq4) null, 9), 3), ((n0c) ((xhh) this.c.getValue())).a()), gu4Var);
        this.d.B(this, m[0], sggVarJ0);
    }
}
