package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class y4e implements q1g {
    public final HashSet a = new HashSet();

    @Override // defpackage.q1g
    public final void onRateCall(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q1g) it.next()).onRateCall(jSONObject);
        }
    }
}
