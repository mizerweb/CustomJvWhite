package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class agk implements JsonSerializer {
    public static final iw8 b = new iw8(18);
    public final boolean a;

    public agk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agk) && this.a == ((agk) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("test_mode_enabled", this.a);
    }

    public final String toString() {
        return c0a.p(new StringBuilder("SdkModeData(testModeEnabled="), this.a, ')');
    }
}
