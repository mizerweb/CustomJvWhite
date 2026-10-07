package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class uyb {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public uyb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final Object a(ta2 ta2Var) {
        sih sihVar = (sih) this.a.getValue();
        String strC = ((svb) this.c.getValue()).c();
        if (strC != null) {
            return sihVar.a.g(new vsb(strC, ((s7f) ((et3) this.b.getValue())).t()), ta2Var);
        }
        ore.p("Required value was null.");
        return null;
    }

    public final Object b(String str, String str2, String str3, s2c s2cVar) {
        sih sihVar = (sih) this.a.getValue();
        lrg lrgVar = new lrg(kfc.t2, 9);
        lrgVar.h(ApiProtocol.PARAM_CONVERSATION_ID, str);
        lrgVar.h("reason", str2);
        lrgVar.h("internalParams", str3);
        return sihVar.a.g(lrgVar, s2cVar);
    }

    public final Object c(String str, boolean z, String str2, n3c n3cVar) {
        sih sihVar = (sih) this.a.getValue();
        lrg lrgVar = new lrg(kfc.s2, 11);
        lrgVar.h(ApiProtocol.PARAM_JOIN_LINK, str);
        lrgVar.a(ApiProtocol.PARAM_IS_VIDEO, z);
        lrgVar.h("internalParams", str2);
        return sihVar.a.g(lrgVar, n3cVar);
    }

    public final Object d(String str, long[] jArr, Long l, boolean z, String str2, s9c s9cVar) {
        sih sihVar = (sih) this.a.getValue();
        lrg lrgVar = new lrg(kfc.r2, 12);
        lrgVar.h(ApiProtocol.PARAM_CONVERSATION_ID, str);
        if (jArr.length != 0) {
            lrgVar.e("calleeIds", jArr);
        }
        if (l != null) {
            lrgVar.a.put(ApiProtocol.PARAM_CHAT_ID, l);
        }
        lrgVar.a(ApiProtocol.PARAM_IS_VIDEO, z);
        lrgVar.h("internalParams", str2);
        return sihVar.a.g(lrgVar, s9cVar);
    }
}
