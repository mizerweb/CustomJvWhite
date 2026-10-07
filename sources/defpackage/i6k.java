package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i6k implements JsonSerializer {
    public static final nv8 b = new nv8(16);
    public final String a;

    public i6k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6k) && cqk.d(this.a, ((i6k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("push_token", this.a);
    }

    public final String toString() {
        return x05.i(new StringBuilder("PushTokenData(pushToken="), this.a, ')');
    }
}
