package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q6k implements JsonSerializer {
    public static final iw8 c = new iw8(16);
    public final String a;
    public final boolean b;

    public q6k(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6k)) {
            return false;
        }
        q6k q6kVar = (q6k) obj;
        return cqk.d(this.a, q6kVar.a) && this.b == q6kVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("last_delivered_push_token", this.a).put("push_token_delivered", this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushTokenDeliveryData(lastDeliveredPushToken=");
        sb.append(this.a);
        sb.append(", pushTokenDelivered=");
        return c0a.p(sb, this.b, ')');
    }
}
