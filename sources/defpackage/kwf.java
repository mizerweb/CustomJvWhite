package defpackage;

import android.content.Context;
import java.util.Iterator;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kwf extends a8j {
    public static final /* synthetic */ zv8[] m = {new z8b(kwf.class, "clearCacheJob", "getClearCacheJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, kwf.class, "refreshCacheJob", "getRefreshCacheJob()Lkotlinx/coroutines/Job;")};
    public final Context c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final p3c j;
    public final p3c k;
    public final ic6 l;

    public kwf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, Context context) {
        this.c = context;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        mjg mjgVarA = p90.a(null);
        this.h = mjgVarA;
        this.i = e9i.G0(e9i.T(new q0d(new jz(mjgVarA, 13), this, 18), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b, j0g.a, r66.a);
        this.j = qyj.S();
        p3c p3cVarS = qyj.S();
        this.k = p3cVarS;
        this.l = new ic6(null);
        p3cVarS.B(this, m[1], a8j.t(this, null, new hwf(this, null, 0), 1));
    }

    public static final void B(kwf kwfVar, long j) {
        a8j.x(kwfVar.l, new gwf(new vnh(R.string.oneme_settings_storage_clear_cache_success_snackbar, a.n1(new Object[]{woh.v(j, false, kwfVar.c)}))));
    }

    public static final Object C(kwf kwfVar, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) ((xhh) kwfVar.d.getValue())).b(), new hpf(kwfVar, null, 4), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final Object D(s71 s71Var, mdh mdhVar) {
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        int i = s71Var == null ? -1 : iwf.$EnumSwitchMapping$0[s71Var.ordinal()];
        if (i == -1) {
            Object objB = ((ct9) this.g.getValue()).b(mdhVar);
            if (objB == hu4Var) {
                return objB;
            }
        } else if (i != 1) {
            String name = kwf.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Don't support clear index for this type: " + s71Var, null);
                    return sbiVar;
                }
            }
        } else {
            ct9 ct9Var = (ct9) this.g.getValue();
            gm0.n(ct9Var.a, "Delete all audio in index");
            Object objI = ch3.I(mdhVar, ((ys9) ct9Var.c.getValue()).a, false, true, new x27(23));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI == hu4Var) {
                return objI;
            }
        }
        return sbiVar;
    }

    public final void E(int i) {
        Object next;
        Object next2;
        a81 a81Var;
        boolean zContains = s71.f.contains(Integer.valueOf(i));
        ic6 ic6Var = this.l;
        int i2 = 0;
        Context context = this.c;
        mjg mjgVar = this.h;
        Object obj = null;
        byte b = 0;
        if (zContains) {
            Iterator it = s71.k.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (i != ((s71) next2).a);
            s71 s71Var = (s71) next2;
            if (s71Var == null || (a81Var = (a81) mjgVar.getValue()) == null) {
                return;
            }
            for (Object obj2 : a81Var.b) {
                if (((r71) obj2).a == s71Var) {
                    obj = obj2;
                    break;
                }
            }
            r71 r71Var = (r71) obj;
            if (r71Var != null) {
                a8j.x(ic6Var, new fwf(new tnh(R.string.oneme_settings_storage_clear_cache_dialog_desc), new vnh(s71Var.e, a.n1(new Object[]{woh.v(r71Var.b, false, context)})), xw3.P0(new ewf(s71Var.b, new tnh(R.string.oneme_settings_storage_clear_cache_dialog_action_clear), true), new ewf(s71Var.c, new tnh(R.string.oneme_settings_storage_clear_cache_dialog_action_cancel), false))));
                return;
            }
            return;
        }
        boolean zContains2 = s71.g.contains(Integer.valueOf(i));
        zv8[] zv8VarArr = m;
        p3c p3cVar = this.j;
        ny8 ny8Var = this.d;
        dq4 dq4Var = this.b;
        if (!zContains2) {
            if (i != R.id.oneme_settings_storage_item_clear_cache) {
                if (i == R.id.oneme_settings_storage_item_action_all_clear) {
                    p3cVar.B(this, zv8VarArr[0], yab.h0(dq4Var, ((n0c) ((xhh) ny8Var.getValue())).b(), 2, new hwf(this, null, 1)));
                    return;
                }
                return;
            } else {
                a81 a81Var2 = (a81) mjgVar.getValue();
                if (a81Var2 != null) {
                    a8j.x(ic6Var, new fwf(new tnh(R.string.oneme_settings_storage_clear_cache_dialog_desc), new vnh(R.string.oneme_settings_storage_clear_cache_dialog_all_title, a.n1(new Object[]{woh.v(a81Var2.a, false, context)})), xw3.P0(new ewf(R.id.oneme_settings_storage_item_action_all_clear, new tnh(R.string.oneme_settings_storage_clear_cache_dialog_action_clear), true), new ewf(R.id.oneme_settings_storage_item_action_all_cancel, new tnh(R.string.oneme_settings_storage_clear_cache_dialog_action_cancel), false))));
                    return;
                }
                return;
            }
        }
        y1 y1Var = new y1(i2, s71.k);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (i != ((s71) next).b);
        s71 s71Var2 = (s71) next;
        if (s71Var2 == null) {
            return;
        }
        p3cVar.B(this, zv8VarArr[0], yab.h0(dq4Var, ((n0c) ((xhh) ny8Var.getValue())).b(), 2, new gce(s71Var2, this, b == true ? 1 : 0, 29)));
    }
}
