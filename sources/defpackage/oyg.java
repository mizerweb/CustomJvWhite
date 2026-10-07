package defpackage;

import android.graphics.Color;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oyg {
    public final xk2 a;
    public Long b;
    public int c = -1;
    public int d = -1;
    public final r8e e;
    public final r8e f;
    public final mjg g;
    public final r8e h;
    public final mjg i;
    public final r8e j;

    public oyg(xk2 xk2Var) {
        this.a = xk2Var;
        this.e = xk2Var.e;
        this.f = xk2Var.g;
        mjg mjgVarA = p90.a(mmh.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(lyg.a);
        this.i = mjgVarA2;
        this.j = new r8e(mjgVarA2);
    }

    public final void a() {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, mmh.a));
        this.b = null;
    }

    public final void b() {
        this.a.f(null);
    }

    public final void c(int i) {
        Object kygVar = nyg.$EnumSwitchMapping$0[qt4.D(i)] == 1 ? new kyg(false, false, false) : lyg.a;
        mjg mjgVar = this.i;
        mjgVar.getClass();
        mjgVar.j(null, kygVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    public final void d(Long l) {
        hoh hohVar;
        mjg mjgVar;
        Object value;
        Object next;
        int i;
        this.b = l;
        xk2 xk2Var = this.a;
        xk2Var.f(null);
        if (l != null) {
            long jLongValue = l.longValue();
            Iterator it = xk2Var.c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((umh) next).a != jLongValue);
            umh umhVar = (umh) next;
            if (umhVar != null) {
                int i2 = umhVar.d;
                int iAlpha = Color.alpha(i2);
                int i3 = i2 == 0 ? umhVar.c : (-16777216) | i2;
                if (i2 == 0) {
                    i = R.drawable.icon_text_no_bg_28;
                } else {
                    i = iAlpha < 255 ? R.drawable.icon_text_transparent_bg_28 : R.drawable.icon_text_bg;
                }
                hohVar = new hoh(umhVar.b, umhVar.c, umhVar.d, i3, umhVar.e, umhVar.f, i, 64);
            } else {
                hohVar = null;
            }
        } else {
            hohVar = null;
        }
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new nmh(l, hohVar != null ? hohVar.e : null, hohVar)));
    }
}
