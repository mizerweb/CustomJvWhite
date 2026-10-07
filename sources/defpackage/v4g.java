package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v4g implements t4g {
    public final h0a a;

    public v4g(h0a h0aVar) {
        h0aVar.getClass();
        this.a = h0aVar;
    }

    @Override // defpackage.t4g
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "update-media-modifiers");
        h0a h0aVar = this.a;
        h0aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", h0aVar.a);
            jSONObject.put("denoiseAnn", h0aVar.b);
        } catch (Exception unused) {
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("mediaModifiers", jSONObject);
        jSONObjectPut2.getClass();
        return jSONObjectPut2;
    }
}
