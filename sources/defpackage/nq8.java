package defpackage;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nq8 implements ActionParams {
    public final String a;
    public final String b;

    public nq8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8Var = (nq8) obj;
        return cqk.d(this.a, nq8Var.a) && cqk.d(this.b, nq8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.w("Params(initialJoinLink=", this.a, ", anonToken=", this.b, ")");
    }
}
