package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vj7 implements t4g {
    public final JSONObject a;

    public vj7(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.t4g
    public final boolean a() {
        return false;
    }

    @Override // defpackage.t4g
    public final JSONObject b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj7) && cqk.d(this.a, ((vj7) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GenericCommand(params=" + this.a + ", isSmart=false)";
    }

    public vj7(JSONObject jSONObject, int i) {
        this.a = jSONObject;
    }
}
