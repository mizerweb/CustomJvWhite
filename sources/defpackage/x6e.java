package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class x6e {
    public final RecyclerView a;
    public final oqa b;
    public final c8e c;
    public final jsa d;
    public final x5b e;
    public final ExecutorService f;
    public final ny8 g;
    public final ny8 h;
    public h7e i;
    public final Rect j = new Rect();
    public final v22 k = new v22(7, this);

    public x6e(k96 k96Var, oqa oqaVar, c8e c8eVar, jsa jsaVar, x5b x5bVar, ExecutorService executorService, ny8 ny8Var, ny8 ny8Var2) {
        this.a = k96Var;
        this.b = oqaVar;
        this.c = c8eVar;
        this.d = jsaVar;
        this.e = x5bVar;
        this.f = executorService;
        this.g = ny8Var2;
        this.h = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(x6e x6eVar, r5b r5bVar, lq4 lq4Var) {
        w6e w6eVar;
        x6eVar.getClass();
        if (lq4Var instanceof w6e) {
            w6eVar = (w6e) lq4Var;
            int i = w6eVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6eVar.g = i - Integer.MIN_VALUE;
            } else {
                w6eVar = new w6e(x6eVar, lq4Var);
            }
        } else {
            w6eVar = new w6e(x6eVar, lq4Var);
        }
        Object obj = w6eVar.e;
        int i2 = w6eVar.g;
        lq4 lq4Var2 = null;
        if (i2 == 0) {
            ch3.d0(obj);
            if (r5bVar.a.isEmpty()) {
                lk9 lk9VarC = ((n0c) ((xhh) x6eVar.g.getValue())).c();
                c37 c37Var = new c37(x6eVar, lq4Var2, 24);
                w6eVar.d = r5bVar;
                w6eVar.g = 1;
                Object objK0 = yab.K0(lk9VarC, c37Var, w6eVar);
                hu4 hu4Var = hu4.a;
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r5bVar = w6eVar.d;
            ch3.d0(obj);
        }
        int size = r5bVar.a.size();
        sbi sbiVar = sbi.a;
        if (size == 1) {
            long jLongValue = ((Number) ww3.q1(r5bVar.a)).longValue();
            List listC = c8e.C(x6eVar.c, x6eVar.d.R(jLongValue), 6);
            if (!listC.isEmpty()) {
                a8j.x(x6eVar.b.i, new hqa(jLongValue, listC));
            }
        }
        return sbiVar;
    }

    public final void b() {
        h7e h7eVar = this.i;
        if (h7eVar != null) {
            h7eVar.a();
        }
        this.i = null;
        this.a.r0(this.k);
    }
}
