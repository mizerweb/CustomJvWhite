package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class b5g implements t4g, u4g {
    public final Long a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final Long e;
    public final String f;
    public final boolean g;
    public final dnf h;
    public final boolean i;

    public b5g(Long l, CharSequence charSequence, CharSequence charSequence2, String str, Long l2, String str2, boolean z, dnf dnfVar, boolean z2) {
        this.a = l;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
        this.e = l2;
        this.f = str2;
        this.g = z;
        this.h = dnfVar;
        this.i = z2;
    }

    @Override // defpackage.t4g
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.t4g
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "record-start").put("movieId", this.a).put(SdkMetricStatEvent.NAME_KEY, this.b).put("description", this.c).put("privacy", this.d).put("groupId", this.e).put("albumId", this.f).put("streamMovie", this.g);
        dnf dnfVar = this.h;
        if (dnfVar instanceof cnf) {
            jSONObjectPut.put("roomId", ((cnf) dnfVar).a);
        }
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    @Override // defpackage.u4g
    public final JSONObject c(long j, o91 o91Var) {
        fw1 activeRecording = ((kw1) o91Var.T0.getValue()).c.getActiveRecording(this.h);
        return (activeRecording == null || !activeRecording.c.equals(o91Var.j0.a.a)) ? new JSONObject().put("sequence", j).put("type", "error").put("error", "command-not-delivered") : new JSONObject().put("type", "response").put("sequence", j).put("response", "record-start").put("recordMovieId", activeRecording.a);
    }
}
