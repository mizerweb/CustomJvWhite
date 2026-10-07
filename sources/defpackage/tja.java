package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tja implements Serializable {
    public final long a;
    public final gda b;
    public final String c;
    public final List d;

    public tja(String str, ArrayList arrayList, long j, gda gdaVar) {
        this.c = str;
        this.d = arrayList;
        this.a = j;
        this.b = gdaVar;
    }

    public final String toString() {
        String strY = ch3.y(this.c);
        int iO = tre.O(this.d);
        String strValueOf = String.valueOf(this.b);
        StringBuilder sbR = c0a.r(iO, "{, feedback='", strY, "', highlights=", ", chatId='");
        qv1.s(this.a, "', message=", strValueOf, sbR);
        sbR.append("}");
        return sbR.toString();
    }
}
