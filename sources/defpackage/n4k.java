package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.core.push.RegisterForPushesResult;

/* JADX INFO: loaded from: classes3.dex */
public final class n4k {
    public final RegisterForPushesResult a;
    public final AppInfo b;

    public n4k(RegisterForPushesResult registerForPushesResult, AppInfo appInfo) {
        this.a = registerForPushesResult;
        this.b = appInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4k)) {
            return false;
        }
        n4k n4kVar = (n4k) obj;
        return this.a == n4kVar.a && cqk.d(this.b, n4kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterResult(innerResult=" + this.a + ", host=" + this.b + ')';
    }
}
