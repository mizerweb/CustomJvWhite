package defpackage;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class t26 {
    public static final u98 e = u98.l(new Object[]{1, 2}, 2);
    public final ghe a;
    public final u98 b;
    public final boolean c;
    public final boolean d;

    public t26(kzi kziVar) {
        ghe gheVarH = ((z88) kziVar.a).h();
        this.a = gheVarH;
        boolean z = true;
        lvb.O("The sequence must contain at least one EditedMediaItem.", !gheVarH.isEmpty());
        u98 u98Var = (u98) kziVar.b;
        if (u98Var.contains(-2)) {
            if (s26.d(((s26) gheVarH.get(0)).a) && !u98Var.contains(1) && !u98Var.contains(2)) {
                z = false;
            }
            lvb.O("If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set", z);
        }
        this.b = u98Var;
        this.c = u98Var.contains(1);
        this.d = u98Var.contains(2);
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            ghe gheVar = this.a;
            if (i >= gheVar.d) {
                return false;
            }
            if (s26.d(((s26) gheVar.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                ghe gheVar = this.a;
                if (i >= gheVar.d) {
                    jSONObject.put("mediaItems", jSONArray);
                    jSONObject.put("trackTypes", new JSONArray((Collection) this.b));
                    jSONObject.put("isLooping", false);
                    return jSONObject;
                }
                jSONArray.put(((s26) gheVar.get(i)).f());
                i++;
            }
        } catch (JSONException e2) {
            lvb.H0("EditedSequence", "JSON conversion failed.", e2);
            return new JSONObject();
        }
    }

    public final String toString() {
        return b().toString();
    }
}
