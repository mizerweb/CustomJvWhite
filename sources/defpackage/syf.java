package defpackage;

import java.util.Collections;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class syf implements dk5 {
    public final ny8 a;
    public final ny8 b;
    public final r8e c = new r8e(p90.a(Collections.singletonList(new e55(ej5.b.incrementAndGet(), new tnh(R.string.oneme_settings_send_logs), R.drawable.icon_folder_add_to, null, null, 24))));

    public syf(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.c;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) throws Throwable {
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar == null) {
            a4cVar = null;
        }
        if (a4cVar == null) {
            return;
        }
        yab.A0(k66.a, new ryf(a4cVar, this, lq4Var, 0));
    }
}
