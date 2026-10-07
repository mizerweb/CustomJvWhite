package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e9k implements JsonSerializer {
    public static final iw8 b = new iw8(17);
    public final String a;

    public e9k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9k) && cqk.d(this.a, ((e9k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("master_host_default_key", this.a);
    }

    public final String toString() {
        return x05.i(new StringBuilder("DefaultMasterHostData(defaultMasterHostPackageName="), this.a, ')');
    }
}
