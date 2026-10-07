package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w4g implements t4g {
    public final i5g a;
    public final boolean b;
    public final boolean c;

    public w4g(i5g i5gVar, boolean z, boolean z2) {
        i5gVar.getClass();
        this.a = i5gVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.t4g
    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "change-media-settings");
        jSONObject.put("mediaSettings", kql.n(this.a, this.b, this.c));
        return jSONObject;
    }
}
