package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class lg8 extends l40 {
    public final lw8 d;
    public final String e;

    public lg8(lw8 lw8Var, String str, boolean z, boolean z2) {
        super(w50.INLINE_KEYBOARD, z, z2);
        this.d = lw8Var;
        this.e = str;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        ArrayList arrayList = new ArrayList();
        for (List<d61> list : (ArrayList) this.d.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (d61 d61Var : list) {
                d61Var.getClass();
                HashMap map = new HashMap();
                String str = d61Var.d;
                if (str != null) {
                    map.put(MLFeatureConfigProviderBase.URL_KEY, str);
                }
                map.put("type", d61Var.a.a);
                map.put("text", d61Var.b);
                map.put("intent", d61Var.c.a);
                map.put(ApiProtocol.PARAM_PAYLOAD, d61Var.e);
                map.put("isQuick", Boolean.valueOf(d61Var.f));
                map.put("contactId", Long.valueOf(d61Var.g));
                arrayList2.add(map);
            }
        }
        mapA.put("buttons", arrayList);
        return mapA;
    }
}
