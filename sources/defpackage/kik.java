package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class kik implements JsonSerializer {
    public static final ku8 b = new ku8();
    public final int a;

    public kik(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kik) && this.a == ((kik) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("notification_id_key", this.a);
    }

    public final String toString() {
        return qt4.p(new StringBuilder("NotificationIdData(notificationIdKey="), this.a, ')');
    }
}
