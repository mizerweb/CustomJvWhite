package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vnl {
    public static int a(qwf qwfVar) {
        if (cqk.d(qwfVar, qwf.c)) {
            return 3;
        }
        if (cqk.d(qwfVar, qwf.d)) {
            return 4;
        }
        if (cqk.d(qwfVar, qwf.e)) {
            return 5;
        }
        if (cqk.d(qwfVar, qwf.f)) {
            return 6;
        }
        if (cqk.d(qwfVar, qwf.g)) {
            return 7;
        }
        return cqk.d(qwfVar, qwf.h) ? 8 : 2;
    }

    public static final ArrayList b(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        Iterator it = oc9.f0(0, jSONArray.length()).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                return arrayList;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(gj8Var.nextInt());
            h54 h54Var = jSONObjectOptJSONObject == null ? null : new h54((byte) jSONObjectOptJSONObject.getInt("id"), jSONObjectOptJSONObject.getString("title"));
            if (h54Var != null) {
                arrayList.add(h54Var);
            }
        }
    }
}
