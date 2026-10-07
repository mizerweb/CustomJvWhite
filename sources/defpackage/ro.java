package defpackage;

import android.os.Trace;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.api.session.ApiSessionChangedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ro implements no {
    public final to a;
    public final xo b;
    public final wp c;

    public ro(to toVar, xo xoVar, wp wpVar) {
        this.a = toVar;
        this.b = xoVar;
        this.c = wpVar;
    }

    @Override // defpackage.no
    public final Object a(zo zoVar) {
        Object objD;
        try {
            Trace.beginSection("ApiClientAdapter.execute: ".concat(etk.a(zoVar)));
            vp scopeAfter = zoVar.getScopeAfter();
            vp vpVar = vp.a;
            xo xoVar = this.b;
            if (scopeAfter != vpVar) {
                wfe wfeVar = new wfe();
                wfeVar.a = null;
                wfe wfeVar2 = new wfe();
                xoVar.v(new po(wfeVar, this, zoVar, wfeVar2));
                ApiInvocationException apiInvocationException = (ApiInvocationException) wfeVar2.a;
                if (apiInvocationException != null) {
                    throw apiInvocationException;
                }
                objD = wfeVar.a;
            } else {
                objD = d(zoVar, xoVar);
            }
            Trace.endSection();
            return objD;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final uo c(up upVar, xo xoVar, String str, ApiInvocationException apiInvocationException) throws Throwable {
        String str2;
        uo uoVarH = xoVar.h();
        if (upVar == up.d) {
            uoVarH.getClass();
            throw new ApiScopeException("No user for session", apiInvocationException);
        }
        if (upVar != up.c || ((str2 = uoVarH.c) != null && !str2.equals(str))) {
            return uoVarH;
        }
        wfe wfeVar = new wfe();
        wfe wfeVar2 = new wfe();
        xoVar.v(new qo(str, upVar, this, apiInvocationException, wfeVar2, wfeVar));
        Throwable th = (Throwable) wfeVar2.a;
        if (th == null) {
            return (uo) wfeVar.a;
        }
        throw th;
    }

    public final Object d(zo zoVar, xo xoVar) throws Throwable {
        uo uoVarC = c(zoVar.getScope(), xoVar, null, null);
        try {
            return e(zoVar, xoVar, uoVarC);
        } catch (ApiInvocationException e) {
            if (e instanceof ApiSessionChangedException) {
                ApiSessionChangedException apiSessionChangedException = (ApiSessionChangedException) e;
                return e(zoVar, xoVar, xoVar.v(new oo(uoVarC.c, apiSessionChangedException.a, apiSessionChangedException.b, 0)));
            }
            if (e.getErrorCode() == 103 || e.getErrorCode() == 102) {
                return e(zoVar, xoVar, c(zoVar.getScope(), xoVar, uoVarC.c, e));
            }
            if (e.getErrorCode() == 401) {
                uoVarC.getClass();
            }
            throw e;
        }
    }

    public final Object e(zo zoVar, xo xoVar, uo uoVar) {
        Object objA = ((i18) this.a).a(zoVar, uoVar);
        if (zoVar.getScopeAfter() != vp.a) {
            xoVar.s(zoVar.getConfigExtractor().l(uoVar, objA));
        }
        return objA;
    }
}
