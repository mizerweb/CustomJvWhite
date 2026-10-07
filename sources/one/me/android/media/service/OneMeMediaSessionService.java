package one.me.android.media.service;

import android.content.Intent;
import androidx.media3.session.MediaSessionService;
import defpackage.a4c;
import defpackage.au9;
import defpackage.bg6;
import defpackage.cqk;
import defpackage.dq4;
import defpackage.e2a;
import defpackage.gm0;
import defpackage.hf6;
import defpackage.i2a;
import defpackage.if6;
import defpackage.ifh;
import defpackage.je9;
import defpackage.k2a;
import defpackage.lvb;
import defpackage.mc6;
import defpackage.n0c;
import defpackage.v56;
import defpackage.w4a;
import defpackage.wk8;
import defpackage.wyj;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yxb;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class OneMeMediaSessionService extends MediaSessionService {
    public static final /* synthetic */ int k = 0;
    public k2a h;
    public dq4 i;
    public final ifh j = new ifh(new yxb(3));

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "media"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th) {
            super(2, "46733", null, th);
        }
    }

    @Override // androidx.media3.session.MediaSessionService
    public final k2a e(i2a i2aVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeMediaSessionService", "onGetSession, controllerInfo=" + i2aVar + ", mediaSession=" + this.h, null);
            }
        }
        return this.h;
    }

    public final au9 i() {
        return (au9) this.j.getValue();
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onCreate() {
        k2a k2aVarA;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "OneMeMediaSessionService", "onCreate", null);
        }
        super.onCreate();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "OneMeMediaSessionService", "createMediaSession", null);
        }
        if6 if6Var = new if6(this);
        w4a w4aVar = (w4a) i().getAccessor().c(148);
        lvb.b0(!if6Var.B);
        w4aVar.getClass();
        if6Var.d = new hf6(0, w4aVar);
        bg6 bg6VarA = if6Var.a();
        bg6VarA.d(new mc6());
        try {
            e2a e2aVar = new e2a(this, bg6VarA);
            e2aVar.d = new v56(12, this);
            k2aVarA = e2aVar.a();
        } catch (RuntimeException e) {
            gm0.V("OneMeMediaSessionService", "Failed to create media session", new a(e));
            bg6VarA.o0();
            k2aVarA = null;
        }
        this.h = k2aVarA;
        if (k2aVarA != null) {
            dq4 dq4VarA = cqk.a(lvb.x0(wk8.a(), ((n0c) ((xhh) i().getAccessor().c(23))).c().S0()));
            this.i = dq4VarA;
            yab.i0(dq4VarA, ((n0c) ((xhh) i().getAccessor().c(23))).b(), 0, new wyj(this, null, 10), 2);
        }
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onDestroy() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeMediaSessionService", "onDestroy", null);
            }
        }
        dq4 dq4Var = this.i;
        if (dq4Var != null) {
            cqk.g(dq4Var);
        }
        this.i = null;
        k2a k2aVar = this.h;
        if (k2aVar != null) {
            ((bg6) k2aVar.a()).o0();
            try {
                synchronized (k2a.b) {
                    k2a.c.remove(k2aVar.a.i);
                }
                k2aVar.a.s();
            } catch (Exception unused) {
            }
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, null);
            }
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onTaskRemoved(Intent intent) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeMediaSessionService", "onTaskRemoved", null);
            }
        }
        super.onTaskRemoved(intent);
    }
}
