package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class j36 {
    public static final j36 c;
    public final c98 a;
    public final c98 b;

    static {
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        c = new j36(gheVar, gheVar);
    }

    public j36(List list, List list2) {
        this.a = c98.n(list);
        this.b = c98.n(list2);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c98 c98Var = this.a;
        boolean zIsEmpty = c98Var.isEmpty();
        c98 c98Var2 = this.b;
        if (zIsEmpty && c98Var2.isEmpty()) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < c98Var.size(); i++) {
            jSONArray.put(((fb0) c98Var.get(i)).getClass().getSimpleName());
        }
        try {
            jSONObject.put(MediaStreamTrack.AUDIO_TRACK_KIND, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < c98Var2.size(); i2++) {
                jSONArray2.put(((i36) c98Var2.get(i2)).getClass().getSimpleName());
            }
            jSONObject.put(MediaStreamTrack.VIDEO_TRACK_KIND, jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            lvb.H0("Effects", "JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return a().toString();
    }
}
