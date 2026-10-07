package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nud extends qud {
    public final List a;

    public nud(c79 c79Var) {
        this.a = c79Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nud) && cqk.d(this.a, ((nud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("ShowPhoneActionsMenu(actions=", ")", this.a);
    }
}
