package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a9k implements JsonSerializer {
    public static final nv8 c = new nv8(17);
    public final String a;
    public final String b;

    public a9k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9k)) {
            return false;
        }
        a9k a9kVar = (a9k) obj;
        return cqk.d(this.a, a9kVar.a) && cqk.d(this.b, a9kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() {
        return new JSONObject().put("master_host_package_name_key", this.a).put("master_host_public_key", this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArbiterData(masterHostPackageName=");
        sb.append(this.a);
        sb.append(", masterHostPublicKey=");
        return x05.i(sb, this.b, ')');
    }
}
