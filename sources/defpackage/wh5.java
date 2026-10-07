package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* JADX INFO: loaded from: classes3.dex */
public final class wh5 implements no {
    public final /* synthetic */ int a;
    public final i18 b;
    public final yo c;
    public final List d;
    public volatile boolean e;
    public final fi6 f;
    public final Object g;
    public final Object h;

    public wh5(i18 i18Var, zu4 zu4Var, wuh wuhVar, ot4 ot4Var, List list) {
        this.a = 0;
        this.h = new Object();
        this.e = false;
        this.b = i18Var;
        this.f = zu4Var;
        this.g = wuhVar;
        this.c = ot4Var;
        this.d = list;
    }

    @Override // defpackage.no
    public final Object a(zo zoVar) throws ApiInvocationException {
        switch (this.a) {
            case 0:
                t6f t6fVarH = ((zu4) this.f).h();
                String str = t6fVarH.a.c;
                try {
                    if (this.e || str == null) {
                        synchronized (this.h) {
                            if (this.e || str == null) {
                                d(t6fVarH, str);
                            }
                            break;
                        }
                    }
                    return wdl.d(this.b, zoVar, ((zu4) this.f).h().a, this.d);
                } catch (ApiInvocationException e) {
                    if (zoVar.getScopeAfter() != vp.a || !btk.a(e)) {
                        throw e;
                    }
                    zu4 zu4Var = (zu4) this.f;
                    t6f t6fVarH2 = zu4Var.h();
                    d(t6fVarH2, t6fVarH2.a.c);
                    return wdl.d(this.b, zoVar, zu4Var.h().a, this.d);
                } catch (ApiScopeException unused) {
                    zu4 zu4Var2 = (zu4) this.f;
                    t6f t6fVarH3 = zu4Var2.h();
                    d(t6fVarH3, t6fVarH3.a.c);
                    return wdl.d(this.b, zoVar, zu4Var2.h().a, this.d);
                }
            default:
                t6f t6fVarH4 = ((ug5) this.f).h();
                String str2 = t6fVarH4.a.c;
                try {
                    ReentrantLock reentrantLock = (ReentrantLock) this.h;
                    reentrantLock.lock();
                    try {
                        if (this.e || str2 == null) {
                            c(t6fVarH4, str2);
                            break;
                        }
                        return wdl.d(this.b, zoVar, ((ug5) this.f).h().a, this.d);
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (ApiInvocationException e2) {
                    if (zoVar.getScopeAfter() != vp.a || !btk.a(e2)) {
                        throw e2;
                    }
                    ug5 ug5Var = (ug5) this.f;
                    t6f t6fVarH5 = ug5Var.h();
                    c(t6fVarH5, t6fVarH5.a.c);
                    return wdl.d(this.b, zoVar, ug5Var.h().a, this.d);
                } catch (ApiScopeException unused2) {
                    ug5 ug5Var2 = (ug5) this.f;
                    t6f t6fVarH6 = ug5Var2.h();
                    c(t6fVarH6, t6fVarH6.a.c);
                    return wdl.d(this.b, zoVar, ug5Var2.h().a, this.d);
                }
        }
    }

    public void c(t6f t6fVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.h;
        reentrantLock.lock();
        try {
            if (cqk.d(str, ((ug5) this.f).h().a.c) || this.e) {
                cq cqVarK = ((dq) this.g).k();
                t6f t6fVarD = t6fVar.d(Uri.parse(cqVarK.b));
                ((ug5) this.f).c(t6fVarD);
                e(t6fVarD, cqVarK.a);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(t6f t6fVar, String str) {
        synchronized (this.h) {
            try {
                if (Objects.equals(str, ((zu4) this.f).h().a.c)) {
                    String token = ((wuh) this.g).getToken();
                    yo yoVar = this.c;
                    ((zu4) this.f).b(t6fVar.c(((sg9) wdl.d(this.b, new ap(new ne0(token, yoVar != null ? ((ek5) ((ny8) ((uii) ((ot4) yoVar).b).g).getValue()).a() : null), sg9.f), t6fVar.a, this.d)).b));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(t6f t6fVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.h;
        reentrantLock.lock();
        try {
            yo yoVar = this.c;
            ((ug5) this.f).c(t6fVar.c(((sg9) wdl.d(this.b, new ap(new ne0(str, yoVar != null ? ((ek5) ((ny8) ((uii) ((ot4) yoVar).b).g).getValue()).a() : null), sg9.f), t6fVar.a, this.d)).b));
            this.e = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public wh5(i18 i18Var, ug5 ug5Var, dq dqVar, ot4 ot4Var, List list) {
        this.a = 1;
        this.b = i18Var;
        this.f = ug5Var;
        this.g = dqVar;
        this.c = ot4Var;
        this.d = list;
        this.h = new ReentrantLock();
    }
}
