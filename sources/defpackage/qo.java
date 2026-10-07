package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import java.io.Serializable;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo implements wo, EngineCore.EventPacker {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ qo(d dVar, String str, String str2, String str3, String str4, String str5) {
        this.b = dVar;
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.wo
    public uo d(uo uoVar) {
        uo uoVarD;
        up upVar = (up) this.b;
        ro roVar = (ro) this.c;
        ApiInvocationException apiInvocationException = (ApiInvocationException) this.d;
        wfe wfeVar = (wfe) this.e;
        wfe wfeVar2 = (wfe) this.f;
        String str = uoVar.c;
        if (cqk.d(str, this.a) && str != null) {
            uoVar = new uo(uoVar.a, uoVar.b, null, null);
        }
        try {
            String str2 = uoVar.c;
            up upVar2 = up.d;
            if (upVar == upVar2) {
                throw new ApiScopeException("No user for session", apiInvocationException);
            }
            up upVar3 = up.c;
            if (upVar == upVar3 && str2 == null) {
                String str3 = uoVar.b;
                wp wpVar = roVar.c;
                if (str3 != null) {
                    wpVar.getClass();
                    uoVarD = uoVar;
                } else {
                    uoVarD = wpVar.d(uoVar);
                }
            } else {
                uoVarD = uoVar;
            }
            String str4 = uoVarD.c;
            if (upVar == upVar2 && str4 == null) {
                wfeVar.a = new ApiScopeException("Couldn't provide session", apiInvocationException);
                return uoVarD;
            }
            if (upVar == upVar3 && str4 == null) {
                wfeVar.a = new ApiScopeException("Couldn't provide anonymous session", apiInvocationException);
                return uoVarD;
            }
            wfeVar2.a = uoVarD;
            return uoVarD;
        } catch (Throwable th) {
            wfeVar.a = th;
            return uoVar;
        }
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return ((d) this.b).a(this.a, (String) this.c, (String) this.d, (String) this.e, (String) this.f, insertEventTools);
    }

    public /* synthetic */ qo(String str, up upVar, ro roVar, ApiInvocationException apiInvocationException, wfe wfeVar, wfe wfeVar2) {
        this.a = str;
        this.b = upVar;
        this.c = roVar;
        this.d = apiInvocationException;
        this.e = wfeVar;
        this.f = wfeVar2;
    }
}
