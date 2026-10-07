package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class cnc {
    public final CidLogger a;

    public cnc(CidLogger cidLogger) {
        this.a = cidLogger;
    }

    public static m5g a(JSONObject jSONObject) {
        qde qdeVar;
        yt1 yt1VarA = yt1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        string.getClass();
        if (string.equals("STREAM")) {
            qdeVar = qde.c;
        } else {
            qdeVar = string.equals("RECORD") ? qde.b : qde.a;
        }
        return new m5g(j, qdeVar, yt1VarA, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), f6m.d(jSONObject, "recordExternalMovieId"), f6m.d(jSONObject, "recordExternalOwnerId"));
    }

    public ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(yt1.a(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", "Can't parse id " + string, th);
            }
        }
        return arrayList;
    }

    public cnc(CidLogger cidLogger, iw8 iw8Var) {
        this.a = cidLogger;
    }
}
