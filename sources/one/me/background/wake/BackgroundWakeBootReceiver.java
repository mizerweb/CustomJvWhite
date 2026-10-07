package one.me.background.wake;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a4c;
import defpackage.cn0;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.in0;
import defpackage.je9;
import defpackage.lq4;
import defpackage.n0c;
import defpackage.qv1;
import defpackage.r7;
import defpackage.rm0;
import defpackage.yab;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundWakeBootReceiver extends BroadcastReceiver {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/background/wake/BackgroundWakeBootReceiver$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "background-wake"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th) {
            super("44964", th.getMessage(), th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", qv1.k("BackgroundWakeBootReceiver action=", intent != null ? intent.getAction() : null), null);
            }
        }
        try {
            r7 r7Var = r7.a;
            in0 in0Var = (in0) new rm0(r7.d(ha9.b)).getAccessor().c(340);
            if (in0Var.e()) {
                gm0.n("KeepBackground", "App updated, rescheduling background wake alarm");
                yab.i0(in0Var.b, ((n0c) in0Var.c).c().S0(), 0, new cn0(in0Var, lq4Var, 3), 2);
            }
        } catch (Throwable th) {
            gm0.V("KeepBackground", "BackgroundWakeBootReceiver: couldn't get controller", new a(th));
        }
    }
}
