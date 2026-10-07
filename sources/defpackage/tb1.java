package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tb1 implements b12 {
    public final tx a;
    public final xq1 b;

    public tb1(tx txVar, xq1 xq1Var) {
        txVar.getClass();
        xq1Var.getClass();
        this.a = txVar;
        this.b = xq1Var;
        zmf zmfVar = xq1Var.h;
        zmfVar.getClass();
        zmfVar.a.add(this);
    }

    @Override // defpackage.b12
    public final void a(uvc uvcVar) {
        cnf cnfVar = (cnf) uvcVar.c;
        ob1 ob1Var = (ob1) uvcVar.b;
        xq1 xq1Var = this.b;
        if (ob1Var == null) {
            xq1Var.m.onAsrRecordStopped(new qb1(cnfVar));
        } else {
            xq1Var.m.onAsrRecordStarted(new pb1(cnfVar, ob1Var));
        }
    }

    public final void b(JSONObject jSONObject) {
        tx txVar = this.a;
        txVar.getClass();
        rx rxVar = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("asrInfo");
            jSONObject2.getClass();
            ob1 ob1VarC = tx.c(jSONObject2);
            if (ob1VarC != null) {
                rxVar = new rx(iw8.k(jSONObject), ob1VarC);
            }
        } catch (JSONException e) {
            txVar.a.logException("AsrParser", "Can't parse record start info", e);
        }
        if (rxVar == null) {
            return;
        }
        this.b.m.onAsrRecordStarted(new pb1(rxVar.a, rxVar.b));
    }

    public final void c(JSONObject jSONObject) {
        sx sxVar;
        tx txVar = this.a;
        txVar.getClass();
        try {
            sxVar = new sx(iw8.k(jSONObject));
        } catch (JSONException e) {
            txVar.a.logException("AsrParser", "Can't parse record stop info", e);
            sxVar = null;
        }
        if (sxVar == null) {
            return;
        }
        this.b.m.onAsrRecordStopped(new qb1(sxVar.a));
    }
}
