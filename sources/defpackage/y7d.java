package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y7d extends a8j {
    public final long c;
    public final mjg d;
    public final q0d e;
    public final ic6 f;
    public final ic6 g;
    public Long h;
    public boolean i;
    public final String j;

    public y7d(long j) {
        this.c = j;
        mjg mjgVarA = p90.a(new x8d("", Collections.singletonList(new l7d("", new tnh(R.string.oneme_poll_create__answer_hint), 6, 0L)), true));
        this.d = mjgVarA;
        this.e = new q0d(mjgVarA, this, 2);
        this.f = new ic6(null);
        this.g = new ic6(null);
        this.h = Long.valueOf(n7d.d);
        this.j = y7d.class.getName();
    }

    public final void B() {
        mjg mjgVar = this.d;
        boolean zX0 = r5h.X0(((x8d) mjgVar.getValue()).c);
        List list = ((x8d) mjgVar.getValue()).a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!r5h.X0(((l7d) it.next()).d)) {
                    z = true;
                    break;
                }
            }
        }
        ic6 ic6Var = this.f;
        if (!zX0 || z) {
            a8j.x(ic6Var, c2g.b);
        } else {
            a8j.x(ic6Var, rt3.b);
        }
    }
}
