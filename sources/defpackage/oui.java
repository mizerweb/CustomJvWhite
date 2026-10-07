package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oui implements Serializable {
    public final pj4 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final List i;

    public oui(nui nuiVar) {
        this.a = nuiVar.a;
        this.b = nuiVar.b;
        this.d = nuiVar.c;
        this.c = nuiVar.d;
        this.e = nuiVar.e;
        this.f = nuiVar.f;
        this.h = nuiVar.h;
        this.g = nuiVar.i;
        this.i = nuiVar.g;
    }

    public static oui a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        nui nuiVar = new nui();
        nuiVar.h = (byte) 0;
        nuiVar.i = 0L;
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "startAt":
                    nuiVar.f = ch3.T(fkaVar, 0L);
                    break;
                case "joinLink":
                    nuiVar.b = ch3.W(fkaVar);
                    break;
                case "chatId":
                    nuiVar.i = ch3.T(fkaVar, 0L);
                    break;
                case "conferenceId":
                    nuiVar.d = ch3.W(fkaVar);
                    break;
                case "callName":
                    nuiVar.c = ch3.W(fkaVar);
                    break;
                case "type":
                    nuiVar.h = ch3.N(fkaVar);
                    break;
                case "owner":
                    nuiVar.a = pj4.e(fkaVar);
                    break;
                case "previewParticipantIds":
                    nuiVar.g = b50.d(fkaVar);
                    break;
                case "participantsCount":
                    nuiVar.e = ch3.R(fkaVar, 0);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        if (nuiVar.g == null) {
            nuiVar.g = Collections.EMPTY_LIST;
        }
        return new oui(nuiVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iO = tre.O(this.i);
        StringBuilder sbQ = qv1.q("VideoConference{owner=", strValueOf, ", joinLink='", this.b, "', conversationId='");
        nbh.G(sbQ, this.c, "', callName='", this.d, "', participantsCount=");
        c0a.v(sbQ, this.e, ", startedAt=", this.f);
        sbQ.append(", type=");
        sbQ.append(this.h);
        sbQ.append(", chatId=");
        c0a.w(sbQ, this.g, ", previewParticipantIds=", iO);
        sbQ.append("}");
        return sbQ.toString();
    }
}
