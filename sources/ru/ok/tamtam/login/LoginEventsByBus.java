package ru.ok.tamtam.login;

import defpackage.bg9;
import defpackage.cg9;
import defpackage.cqk;
import defpackage.dq4;
import defpackage.e9i;
import defpackage.l7h;
import defpackage.n0c;
import defpackage.pzf;
import defpackage.q8e;
import defpackage.t51;
import defpackage.xhh;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Lcg9;", "Lbg9;", "event", "Lsbi;", "onEvent", "(Lbg9;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class LoginEventsByBus implements cg9 {
    public final pzf a = e9i.b(0, 0, 7);
    public final dq4 b;

    public LoginEventsByBus(t51 t51Var, xhh xhhVar) {
        this.b = cqk.a(((n0c) xhhVar).c().S0());
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(bg9 event) {
        yab.i0(this.b, null, 0, new a(this, event, null), 3);
    }

    @Override // defpackage.cg9
    public final q8e stream() {
        return new q8e(this.a);
    }
}
