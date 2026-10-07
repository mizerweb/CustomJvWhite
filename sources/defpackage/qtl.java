package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qtl {
    public static void a(ebd ebdVar, long j) throws IOException {
        oc9.i(Boolean.valueOf(j >= 0));
        while (j > 0) {
            long jSkip = ebdVar.skip(j);
            if (jSkip <= 0) {
                if (ebdVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }

    public static JSONArray b(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", rv5Var.a);
            jSONObject.put("reason", rv5Var.b);
            jSONObject.put("count", rv5Var.c);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
