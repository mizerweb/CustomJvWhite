package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xb1 extends l40 {
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final Long h;
    public final List i;

    public xb1(String str, String str2, int i, int i2, Long l, List list, boolean z, boolean z2) {
        super(w50.CALL, z, z2);
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = l;
        this.i = list;
    }

    @Override // defpackage.l40
    public final String toString() {
        String str;
        String strU = bc1.u(this.f);
        int i = this.g;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "HANGUP";
        } else if (i == 3) {
            str = "CANCELED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "MISSED";
        } else {
            str = "REJECTED";
        }
        List list = this.i;
        int size = list != null ? list.size() : 0;
        StringBuilder sbQ = qv1.q("CallAttach{conversationId='", this.d, "', callType=", strU, ", hangupType=");
        sbQ.append(str);
        sbQ.append(", duration=");
        sbQ.append(this.h);
        sbQ.append(", contactIds=");
        return zo5.t(sbQ, size, "}");
    }
}
