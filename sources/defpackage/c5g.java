package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c5g implements t4g, u4g {
    public final dnf a;
    public final boolean b;
    public final boolean c;

    public c5g(dnf dnfVar, boolean z, boolean z2) {
        this.a = dnfVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.t4g
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.t4g
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "record-stop");
        dnf dnfVar = this.a;
        if (dnfVar instanceof cnf) {
            jSONObjectPut.put("roomId", ((cnf) dnfVar).a);
        }
        boolean z = this.b;
        if (z) {
            jSONObjectPut.put("remove", z);
        }
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    @Override // defpackage.u4g
    public final JSONObject c(long j, o91 o91Var) {
        fw1 activeRecording = ((kw1) o91Var.T0.getValue()).c.getActiveRecording(this.a);
        return (activeRecording == null || !activeRecording.c.equals(o91Var.j0.a.a)) ? new JSONObject().put("type", "response").put("sequence", j).put("response", "record-stop") : new JSONObject().put("sequence", j).put("type", "error").put("error", "command-not-delivered");
    }
}
