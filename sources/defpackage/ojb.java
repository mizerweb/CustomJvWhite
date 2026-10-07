package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ojb {
    public final boolean a;
    public final int b;
    public final int c;

    public ojb(JSONObject jSONObject) {
        this.a = jSONObject != null ? jSONObject.optBoolean("enabled") : false;
        this.b = jSONObject != null ? jSONObject.optInt("ver") : -1;
        this.c = jSONObject != null ? jSONObject.optInt("mask") : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvalidateConfig{enabled:");
        sb.append(this.a);
        sb.append(",ver:");
        sb.append(this.b);
        sb.append(",mask:");
        return zo5.t(sb, this.c, "}");
    }
}
