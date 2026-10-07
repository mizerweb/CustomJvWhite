package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class st2 implements Serializable {
    public final boolean A;
    public final boolean B;
    public final long C;
    public final long D;
    public final LinkedHashMap E;
    public final vui F;
    public final e11 G;
    public final long H;
    public final LinkedHashMap I;
    public final long J;
    public final boolean K;
    public final long X;
    public final String Y;
    public final long Z;
    public final long a;
    public final String b;
    public final long c;
    public final LinkedHashMap d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final gda i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final int n;
    public final long n1;
    public final String o;
    public final int o1;
    public final b50 p;
    public final int p1;
    public final int q;
    public final long q1;
    public final b93 r;
    public final k8b r1;
    public final ka3 s;
    public final int s1;
    public final String t;
    public final long t1;
    public final xva u;
    public final int u1;
    public final int v;
    public final int v1;
    public final ir7 w;
    public final gda x;
    public final long y;
    public final boolean z;

    public st2(qt2 qt2Var) {
        this.a = qt2Var.a;
        this.u1 = qt2Var.W;
        this.b = qt2Var.b;
        this.c = qt2Var.c;
        this.d = qt2Var.d;
        this.e = qt2Var.e;
        this.f = qt2Var.f;
        this.g = qt2Var.g;
        this.h = qt2Var.h;
        this.i = qt2Var.i;
        this.j = qt2Var.j;
        this.k = qt2Var.k;
        this.l = qt2Var.l;
        this.m = qt2Var.m;
        this.n = qt2Var.r;
        this.o = qt2Var.s;
        this.p = qt2Var.t;
        this.q = qt2Var.u;
        this.r = qt2Var.v;
        this.s = qt2Var.w;
        this.v1 = qt2Var.X;
        this.t = qt2Var.n;
        this.u = qt2Var.o;
        this.v = qt2Var.p;
        this.w = qt2Var.q;
        this.x = qt2Var.x;
        this.z = qt2Var.y;
        this.A = qt2Var.z;
        this.B = qt2Var.A;
        this.C = qt2Var.B;
        this.D = qt2Var.C;
        this.E = qt2Var.D;
        this.F = qt2Var.E;
        this.G = new e11(qt2Var.F, qt2Var.G);
        this.H = qt2Var.H;
        this.I = qt2Var.I;
        this.J = qt2Var.J;
        this.K = qt2Var.K;
        this.X = qt2Var.L;
        this.Y = qt2Var.M;
        this.Z = qt2Var.N;
        this.n1 = qt2Var.O;
        this.o1 = qt2Var.P;
        this.p1 = qt2Var.Q;
        this.q1 = qt2Var.R;
        this.r1 = qt2Var.S;
        this.t1 = qt2Var.U;
        this.y = qt2Var.T;
        this.s1 = qt2Var.V;
    }

    public static st2 b(fka fkaVar) {
        long j;
        long j2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        qt2 qt2Var = new qt2();
        qt2Var.S = null;
        long j3 = 0;
        qt2Var.T = 0L;
        int iP0 = fkaVar.P0();
        int i = 0;
        while (i < iP0) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            int i2 = 3;
            int i3 = 1;
            switch (strS0) {
                case "baseRawIconUrl":
                    j = j3;
                    qt2Var.h = ch3.W(fkaVar);
                    continue;
                    i++;
                    j3 = j;
                    break;
                case "participants":
                    if (fkaVar.y().a() == 8) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        int iP1 = fkaVar.P0();
                        int i4 = 0;
                        while (i4 < iP1) {
                            long jT = ch3.T(fkaVar, j3);
                            long jT2 = ch3.T(fkaVar, j3);
                            if (jT == j3) {
                                j2 = j3;
                            } else if (jT2 < j3) {
                                j2 = j3;
                                if (qt2Var.S == null) {
                                    qt2Var.S = new k8b(1);
                                }
                                qt2Var.S.g(jT, jT2);
                                linkedHashMap3.put(Long.valueOf(jT), Long.valueOf(j2));
                            } else {
                                j2 = j3;
                                linkedHashMap3.put(Long.valueOf(jT), Long.valueOf(jT2));
                            }
                            i4++;
                            j3 = j2;
                        }
                        j = j3;
                        qt2Var.d = linkedHashMap3;
                        continue;
                    } else {
                        j = j3;
                        fkaVar.x();
                        qt2Var.d = null;
                    }
                    i++;
                    j3 = j;
                    break;
                case "videoConversation":
                    qt2Var.E = vui.a(fkaVar);
                    break;
                case "invitedBy":
                    qt2Var.R = ch3.T(fkaVar, j3);
                    break;
                case "subject":
                    qt2Var.o = xva.D(fkaVar);
                    break;
                case "lastEventTime":
                    qt2Var.k = fkaVar.I0();
                    break;
                case "description":
                    qt2Var.s = ch3.W(fkaVar);
                    break;
                case "commentsBlacklistCount":
                    qt2Var.V = ch3.R(fkaVar, 0);
                    break;
                case "adminParticipants":
                    if (fkaVar.y().a() == 8) {
                        linkedHashMap = new LinkedHashMap();
                        int iP2 = fkaVar.P0();
                        for (int i5 = 0; i5 < iP2; i5++) {
                            linkedHashMap.put(Long.valueOf(ch3.T(fkaVar, j3)), pc.a(fkaVar));
                        }
                    } else {
                        fkaVar.x();
                        linkedHashMap = null;
                    }
                    qt2Var.D = linkedHashMap;
                    break;
                case "unreadPin":
                    qt2Var.A = ch3.L(fkaVar);
                    break;
                case "lastMessage":
                    qt2Var.i = yab.q0(fkaVar);
                    break;
                case "access":
                    String strS1 = fkaVar.S0();
                    strS1.getClass();
                    if (strS1.equals("PUBLIC")) {
                        i2 = 2;
                    } else if (!strS1.equals("PRIVATE")) {
                        i2 = 1;
                    }
                    qt2Var.X = i2;
                    break;
                case "admins":
                    qt2Var.t = b50.d(fkaVar);
                    break;
                case "joinTime":
                    qt2Var.B = ch3.T(fkaVar, j3);
                    break;
                case "options":
                    qt2Var.v = ch3.A(fkaVar);
                    break;
                case "restrictions":
                    qt2Var.p = ch3.R(fkaVar, 0);
                    break;
                case "reactions":
                    qt2Var.w = np4.v(fkaVar);
                    break;
                case "lastMentionMessageId":
                    qt2Var.J = ch3.T(fkaVar, j3);
                    break;
                case "liveStreamUpdateTime":
                    qt2Var.U = ch3.T(fkaVar, j3);
                    break;
                case "unreadReply":
                    qt2Var.z = ch3.L(fkaVar);
                    break;
                case "lastDelayedUpdateTime":
                    qt2Var.N = ch3.T(fkaVar, j3);
                    break;
                case "status":
                    qt2Var.b = fkaVar.S0();
                    break;
                case "lastReactedMessageId":
                    qt2Var.L = ch3.T(fkaVar, j3);
                    break;
                case "groupChatInfo":
                    qt2Var.q = ir7.a(fkaVar);
                    break;
                case "hidePinnedMessage":
                    qt2Var.y = ch3.L(fkaVar);
                    break;
                case "modified":
                    qt2Var.H = ch3.T(fkaVar, j3);
                    break;
                case "isSuspended":
                    qt2Var.G = ch3.L(fkaVar);
                    break;
                case "participantSettings":
                    qt2Var.P = ch3.R(fkaVar, 0);
                    break;
                case "baseIconUrl":
                    qt2Var.g = ch3.W(fkaVar);
                    break;
                case "joinRequestTime":
                    qt2Var.C = ch3.T(fkaVar, j3);
                    break;
                case "lastFireDelayedErrorTime":
                    qt2Var.O = ch3.T(fkaVar, j3);
                    break;
                case "liveLocationMessageIds":
                    if (fkaVar.y().a() == 8) {
                        linkedHashMap2 = new LinkedHashMap();
                        int iP3 = fkaVar.P0();
                        for (int i6 = 0; i6 < iP3; i6++) {
                            linkedHashMap2.put(Long.valueOf(ch3.T(fkaVar, j3)), Long.valueOf(ch3.T(fkaVar, j3)));
                        }
                    } else {
                        fkaVar.x();
                        linkedHashMap2 = null;
                    }
                    qt2Var.I = linkedHashMap2;
                    break;
                case "id":
                    qt2Var.a = fkaVar.I0();
                    break;
                case "cid":
                    qt2Var.j = fkaVar.I0();
                    break;
                case "link":
                    qt2Var.n = fkaVar.S0();
                    break;
                case "type":
                    String strS2 = fkaVar.S0();
                    if (!ch3.r(strS2)) {
                        strS2.getClass();
                        switch (strS2) {
                            case "CHAT":
                                i3 = 3;
                                break;
                            case "CHANNEL":
                                i3 = 4;
                                break;
                            case "GROUP_CHAT":
                                i3 = 5;
                                break;
                            case "DIALOG":
                                i3 = 2;
                                break;
                        }
                    }
                    qt2Var.W = i3;
                    break;
                case "owner":
                    qt2Var.c = fkaVar.I0();
                    break;
                case "title":
                    qt2Var.f = ch3.W(fkaVar);
                    break;
                case "pinnedMessageId":
                    qt2Var.T = ch3.T(fkaVar, j3);
                    break;
                case "blockedParticipantsCount":
                    qt2Var.u = ch3.R(fkaVar, 0);
                    break;
                case "pinnedMessage":
                    qt2Var.x = yab.q0(fkaVar);
                    break;
                case "hasBots":
                    qt2Var.F = ch3.L(fkaVar);
                    break;
                case "newMessages":
                    qt2Var.l = fkaVar.D0();
                    break;
                case "markedAsUnread":
                    qt2Var.K = ch3.L(fkaVar);
                    break;
                case "created":
                    qt2Var.e = fkaVar.I0();
                    break;
                case "prevMessageId":
                    qt2Var.m = ch3.T(fkaVar, j3);
                    break;
                case "lastReaction":
                    qt2Var.M = ch3.W(fkaVar);
                    break;
                case "participantsCount":
                    qt2Var.r = ch3.R(fkaVar, 0);
                    break;
                case "pendingJoinRequestsCount":
                    qt2Var.Q = ch3.R(fkaVar, 0);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
            j = j3;
            i++;
            j3 = j;
        }
        return new st2(qt2Var);
    }

    public final boolean a() {
        return this.u1 == 2;
    }

    public final String toString() {
        String str;
        String string;
        String str2 = "UNKNOWN";
        int i = this.u1;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "DIALOG";
        } else if (i == 3) {
            str = "CHAT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "GROUP_CHAT";
        } else {
            str = "CHANNEL";
        }
        int i2 = this.v1;
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = i2 != 3 ? "null" : "PRIVATE";
            } else {
                str2 = "PUBLIC";
            }
        }
        String strValueOf = String.valueOf(this.i);
        int iO = tre.O(this.p);
        String strValueOf2 = String.valueOf(this.r);
        String strValueOf3 = String.valueOf(this.s);
        String strValueOf4 = String.valueOf(this.G);
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap == null) {
            string = "{}";
        } else {
            Iterator it = linkedHashMap.entrySet().iterator();
            StringBuilder sb = new StringBuilder("{");
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Long l = (Long) entry.getKey();
                Long l2 = (Long) entry.getValue();
                sb.append('{');
                sb.append(l);
                sb.append(':');
                if (l2.longValue() < 0) {
                    sb.append("INVALID_READMARK=");
                } else {
                    k8b k8bVar = this.r1;
                    if (k8bVar != null && k8bVar.b(l.longValue()) >= 0) {
                        try {
                            long jC = k8bVar.c(l.longValue());
                            sb.append("INVALID_READMARK");
                            sb.append('=');
                            sb.append(jC);
                            sb.append('|');
                        } catch (NoSuchElementException unused) {
                        }
                    }
                }
                sb.append(l2);
                sb.append('}');
                if (it.hasNext()) {
                    sb.append(',');
                }
            }
            sb.append('}');
            string = sb.toString();
        }
        StringBuilder sbT = qt4.t(this.a, "{id=", ", type=", str);
        nbh.G(sbT, ", status='", this.b, "', accessType=", str2);
        qt4.z(this.c, ", owner=", ", created=", sbT);
        qv1.s(this.e, ", lastMessage=", strValueOf, sbT);
        qt4.z(this.y, ", pinnedMessageId =", ", cid=", sbT);
        sbT.append(this.j);
        qt4.z(this.k, ", lastEventTime=", ", newMessages=", sbT);
        qt4.x(this.l, this.n, ", participantsCount=", ", admins=", sbT);
        sbT.append(iO);
        sbT.append(", chatOptions=");
        sbT.append(strValueOf2);
        sbT.append(", chatReactionsSettings=");
        nbh.G(sbT, strValueOf3, ", botsInfo=", strValueOf4, ", getLastMentionMessageId=");
        sbT.append(this.J);
        qt4.z(this.X, ", lastReactedMessageId=", ", lastReaction=", sbT);
        sbT.append(this.Y);
        sbT.append(", markedAsUnread=");
        sbT.append(this.K);
        sbT.append(", lastFireDelayedErrorTime=");
        sbT.append(this.n1);
        qt4.z(this.Z, ", lastDelayedUpdateTime=", ", participantSettings=", sbT);
        qt4.x(this.o1, this.p1, ", pendingJoinRequestsCount=", ", invitedBy=", sbT);
        sbT.append(this.q1);
        qt4.z(this.t1, ", liveStreamUpdateTime=", ", participants=", sbT);
        sbT.append(string);
        sbT.append(", commentsBlacklistCount=");
        sbT.append(this.s1);
        sbT.append("}");
        return sbT.toString();
    }
}
