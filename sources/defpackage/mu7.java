package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mu7 {
    public final String a;
    public final String b;

    public mu7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buildUuid", this.a);
        jSONObject.put("tag", this.b);
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu7)) {
            return false;
        }
        mu7 mu7Var = (mu7) obj;
        return cqk.d(this.a, mu7Var.a) && cqk.d(this.b, mu7Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.w("DumpMeta(buildUuid=", this.a, ", tag=", this.b, ")");
    }
}
