package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d4e extends a8j {
    public final fu1 c;
    public final w82 d;
    public final r8e e;

    public d4e(fu1 fu1Var, w82 w82Var) {
        Object value;
        tnh tnhVar;
        vnh vnhVar;
        this.c = fu1Var;
        this.d = w82Var;
        mjg mjgVarA = p90.a(g4e.c);
        this.e = new r8e(mjgVarA);
        do {
            value = mjgVarA.getValue();
            g4e g4eVar = (g4e) value;
            tmc tmcVarB = this.d.b();
            tmc tmcVar = (tmc) ((l9) this.d.r.a.getValue()).c.c.get(this.c);
            hu1 hu1Var = tmcVarB.a;
            tnhVar = cqk.d(hu1Var.getId(), this.c) ? new tnh(R.string.call_screen_raisehand_manage_title_me) : new tnh(R.string.call_screen_raisehand_manage_title_admin);
            vnhVar = null;
            vnhVar = null;
            if (!cqk.d(hu1Var.getId(), this.c) && hu1Var.j()) {
                String name = tmcVar != null ? tmcVar.b.getName() : null;
                vnhVar = new vnh(R.string.call_screen_raisehand_manage_subtitle_admin, a.n1(new Object[]{name == null ? "" : name}));
            }
            g4eVar.getClass();
        } while (!mjgVarA.h(value, new g4e(tnhVar, vnhVar)));
    }
}
