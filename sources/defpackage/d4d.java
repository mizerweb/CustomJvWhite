package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d4d {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public d4d(gjf gjfVar) {
        JSONObject jSONObject;
        je9 je9Var = je9.d;
        String name = d4d.class.getName();
        String str = (String) ((g5d) gjfVar).a.Z1.a(e5d.S6[154]).i();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, qv1.k("Server player control params=", str), null);
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                gm0.V(name, "Failed to parse player control params", e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.a = jSONObject.optBoolean("mp_autoplay_enabled", false);
            this.c = jSONObject.optBoolean("time_over_size", false);
            this.d = jSONObject.optInt("buffer_after_rebuffer_ms", 3000);
            this.e = jSONObject.optInt("min_buffer_ms", 5000);
            this.f = jSONObject.optInt("max_buffer_ms", 13000);
            this.g = jSONObject.optInt("buffer_ms", 500);
            this.b = jSONObject.optBoolean("use_min_size_lc", true);
            this.h = jSONObject.optInt("min_size_lc_fmt_mis_sf", 4);
        } else {
            this.a = false;
            this.c = false;
            this.d = 3000;
            this.e = 5000;
            this.f = 13000;
            this.g = 500;
            this.b = true;
            this.h = 4;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name, toString(), null);
        }
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("PlayerControl(\n        isAutoPlayEnabledDuringMediaProcessing=", this.a, "\n        isMinSizeLoadControlRequested=", this.b, "\n        isPlaybackPrioritizeTimeOverSize=");
        sbB.append(this.c);
        sbB.append("\n        playbackMinBufferMs=");
        sbB.append(this.e);
        sbB.append("\n        playbackMaxBufferMs=");
        qt4.x(this.f, this.g, "\n        playbackBufferMs=", "\n        playbackBufferAfterRebufferMs=", sbB);
        sbB.append(this.d);
        sbB.append("\n        formatMaxInputSizeScaleUpFactor=");
        sbB.append(this.h);
        sbB.append("\n        )\n        ");
        return sbB.toString();
    }
}
