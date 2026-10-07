package defpackage;

import java.util.Collections;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s0f implements spa {
    public final jcd a;
    public final String b = s0f.class.getName();

    public s0f(jcd jcdVar) {
        this.a = jcdVar;
    }

    @Override // defpackage.spa
    public final Object a(rt2 rt2Var, opa opaVar, lq4 lq4Var) {
        r66 r66Var = r66.a;
        boolean zD = jcd.d(this.a, null, rt2Var, 1);
        if (rt2Var != null && !opaVar.c && rt2Var.y0() && !zD) {
            return Collections.singletonList(new yx2(new tnh(R.string.chat_screen_saved_messages_empty_state_title), new tnh(R.string.chat_screen_saved_messages_empty_state_subtitle), rt2Var.s(us0.c, rs0.a), null, rt2Var.q(), 32));
        }
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "NO_SAVED_MESSAGES messages=" + opaVar, null);
            }
        }
        return r66Var;
    }
}
