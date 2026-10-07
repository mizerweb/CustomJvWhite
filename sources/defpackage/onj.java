package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onj implements ynj {
    public final List a;
    public final Bundle b;
    public final tnh c;

    public onj(c79 c79Var, Bundle bundle, tnh tnhVar) {
        this.a = c79Var;
        this.b = bundle;
        this.c = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onj)) {
            return false;
        }
        onj onjVar = (onj) obj;
        return cqk.d(this.a, onjVar.a) && this.b.equals(onjVar.b) && this.c.equals(onjVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.a + ", payload=" + this.b + ", title=" + this.c + ")";
    }
}
