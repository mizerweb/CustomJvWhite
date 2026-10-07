package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class kw1 implements c12 {
    public final cnc a;
    public final xq1 b;
    public final ode c;

    public kw1(cnc cncVar, xq1 xq1Var, ode odeVar) {
        cncVar.getClass();
        xq1Var.getClass();
        odeVar.getClass();
        this.a = cncVar;
        this.b = xq1Var;
        this.c = odeVar;
        fnf fnfVar = xq1Var.g;
        fnfVar.getClass();
        fnfVar.a.add(this);
    }

    @Override // defpackage.c12
    public final void a(kzi kziVar) {
        cnf cnfVar = (cnf) kziVar.b;
        m5g m5gVar = (m5g) kziVar.a;
        xq1 xq1Var = this.b;
        if (m5gVar == null) {
            xq1Var.i.onRecordStopped(new iw1(null, cnfVar));
        } else {
            xq1Var.i.onRecordStarted(new hw1(cnfVar, tgl.b(m5gVar)));
        }
    }

    public final void b(JSONObject jSONObject) {
        h6f h6fVar;
        cnc cncVar = this.a;
        cncVar.getClass();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("recordInfo");
            jSONObject2.getClass();
            h6fVar = new h6f(cnc.a(jSONObject2), 1, iw8.k(jSONObject));
        } catch (JSONException e) {
            cncVar.a.logException("RecordInfoParser", "Can't parse record start info", e);
            h6fVar = null;
        }
        if (h6fVar == null) {
            return;
        }
        this.b.i.onRecordStarted(new hw1((dnf) h6fVar.c, tgl.b((m5g) h6fVar.b)));
    }

    public final void c(JSONObject jSONObject) {
        cnc cncVar = this.a;
        cncVar.getClass();
        phf phfVar = null;
        try {
            String strD = f6m.d(jSONObject, "participant");
            yt1 yt1VarA = strD != null ? yt1.a(strD) : null;
            f6m.c(jSONObject, "recordMovieId");
            phfVar = new phf(iw8.k(jSONObject), yt1VarA, false, 1);
        } catch (JSONException e) {
            cncVar.a.logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (phfVar == null) {
            return;
        }
        this.b.i.onRecordStopped(new iw1((yt1) phfVar.c, (dnf) phfVar.b));
    }
}
