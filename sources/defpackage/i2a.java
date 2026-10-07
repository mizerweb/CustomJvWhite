package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i2a {
    public final p3a a;
    public final int b;
    public final int c;
    public final h2a d;
    public final Bundle e;

    public i2a(p3a p3aVar, int i, int i2, boolean z, h2a h2aVar, Bundle bundle) {
        this.a = p3aVar;
        this.b = i;
        this.c = i2;
        this.d = h2aVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        i2a i2aVar = (i2a) obj;
        h2a h2aVar = i2aVar.d;
        h2a h2aVar2 = this.d;
        return (h2aVar2 == null && h2aVar == null) ? this.a.equals(i2aVar.a) : Objects.equals(h2aVar2, h2aVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        p3a p3aVar = this.a;
        sb.append(p3aVar.a.a);
        sb.append(", uid=");
        return zo5.t(sb, p3aVar.a.c, "}");
    }
}
