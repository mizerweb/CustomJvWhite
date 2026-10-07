package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLHandshakeException;
import one.me.sdk.net.client.api.AddressUnreachableException;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.tamtam.api.SessionSendLimitException;
import ru.ok.tamtam.api.SessionTamErrorException;
import ru.ok.tamtam.exception.SessionStateAnonException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q89 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q89(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        mg9 mg9Var;
        long jZ0;
        String message2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u89 u89Var = (u89) obj;
                s89 s89Var = u89Var.c;
                s89Var.getClass();
                for (t89 t89Var : u89Var.d) {
                    if (!t89Var.d && t89Var.c) {
                        cx6 cx6VarD = t89Var.b.d();
                        t89Var.b = new s74(1);
                        t89Var.c = false;
                        s89Var.c(t89Var.a, cx6VarD);
                    }
                    sfh sfhVar = u89Var.b;
                    sfhVar.getClass();
                    if (sfhVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                qg7 qg7Var = (qg7) obj;
                if (message.what != 1) {
                    return true;
                }
                try {
                    jv9 jv9Var = (jv9) qg7Var.c;
                    jv9Var.D.v(jv9Var.c);
                    break;
                } catch (RemoteException unused) {
                    lvb.G0("MCImplBase", "Error in sending flushCommandQueue");
                }
                return true;
            case 2:
                rnf rnfVar = (rnf) obj;
                je9 je9Var = je9.f;
                int i2 = message.what;
                int i3 = 11;
                int i4 = 10;
                if (i2 == 10) {
                    wfe wfeVar = new wfe();
                    rnfVar.f(new x5(rnfVar, 29, wfeVar));
                    if (wfeVar.a != null) {
                        int i5 = 0;
                        while (i5 < ((ArrayList) wfeVar.a).size()) {
                            int i6 = i5 + 1;
                            nnf nnfVar = (nnf) ((ArrayList) wfeVar.a).get(i5);
                            sfe sfeVar = new sfe();
                            rnfVar.f(new z5(rnfVar, nnfVar, sfeVar, i3));
                            if (!sfeVar.a) {
                                nnfVar.b(rnfVar.q);
                            }
                            i5 = i6;
                        }
                    }
                } else if (i2 != 11) {
                    switch (i2) {
                        case -1:
                            String str = (String) message.obj;
                            CopyOnWriteArraySet copyOnWriteArraySet = rnfVar.m;
                            if (copyOnWriteArraySet.isEmpty()) {
                                rg9 rg9Var = rnfVar.c;
                                rg9Var.getClass();
                                rg9Var.C(null, q1f.b);
                            }
                            copyOnWriteArraySet.add(str);
                            break;
                        case 0:
                            Object obj2 = message.obj;
                            if (obj2 instanceof qnf) {
                                qnf qnfVar = (qnf) obj2;
                                String str2 = qnfVar.a;
                                om5 om5Var = qnfVar.b;
                                je9 je9Var2 = je9.d;
                                String str3 = rnfVar.f;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var2)) {
                                    a4cVar.c(je9Var2, str3, "handleDisconnected: sessionId->" + str2 + ", reason->" + om5Var, null);
                                }
                                switch (om5Var.ordinal()) {
                                    case 0:
                                    case 4:
                                    case 10:
                                    case 11:
                                    case 12:
                                        mg9Var = mg9.SOCKET_CLOSED;
                                        break;
                                    case 1:
                                        mg9Var = mg9.SOCKET_DNS_ERROR;
                                        break;
                                    case 2:
                                    case 3:
                                        mg9Var = mg9.SOCKET_CONNECT_ERROR;
                                        break;
                                    case 5:
                                        mg9Var = mg9.SOCKET_TIMEOUT;
                                        break;
                                    case 6:
                                    case 7:
                                        mg9Var = mg9.SOCKET_IO_ERROR;
                                        break;
                                    case 8:
                                        mg9Var = mg9.SESSION_STATE_ERROR;
                                        break;
                                    case 9:
                                        mg9Var = mg9.USER_LOGOUT;
                                        break;
                                    default:
                                        ore.o();
                                        return false;
                                }
                                if (rnfVar.t == 1 || rnfVar.t == 2) {
                                    rg9 rg9Var2 = rnfVar.c;
                                    rg9 rg9Var3 = rg9.i;
                                    rg9Var2.D(mg9Var, null);
                                    rnfVar.m.clear();
                                } else if (rnfVar.m.size() == 1) {
                                    rg9 rg9Var4 = rnfVar.c;
                                    rg9 rg9Var5 = rg9.i;
                                    rg9Var4.D(mg9Var, null);
                                } else {
                                    String str4 = rnfVar.f;
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, str4, "No need to fail login metric", null);
                                    }
                                }
                                rnfVar.m.remove(str2);
                                rnfVar.t = 0;
                                rnfVar.e();
                            } else {
                                String str5 = rnfVar.f;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                    a4cVar3.c(je9Var, str5, c0a.n(obj2, "Unexpected object type for CONN_STATUS_DISCONNECTED: "), null);
                                }
                            }
                            break;
                        case 1:
                            wc4 wc4Var = (wc4) message.obj;
                            rg9 rg9Var6 = rnfVar.c;
                            long j = wc4Var.b;
                            long j2 = wc4Var.c;
                            long j3 = wc4Var.d;
                            String str6 = wc4Var.e;
                            int i7 = wc4Var.f;
                            String str7 = rg9Var6.g;
                            owh owhVar = str7 != null ? new owh(str7) : null;
                            String str8 = owhVar != null ? owhVar.a : null;
                            if (str8 == null) {
                                String str9 = rg9Var6.b;
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                    a4cVar4.c(je9Var, str9, "Invoked 'onSocketConnected', but traceId is null or empty!", null);
                                }
                            } else {
                                if (rg9.m.get() != 0) {
                                    rg9.j = false;
                                }
                                if (j == 0) {
                                    rg9 rg9Var7 = rg9.i;
                                    ylc ylcVar = new ylc("tcp_handshake", Long.valueOf(j2));
                                    ylc ylcVar2 = new ylc("tls_handshake", Long.valueOf(j3));
                                    Object[] objArr = cqb.a;
                                    u8b u8bVar = new u8b(2);
                                    u8bVar.b(ylcVar);
                                    u8bVar.b(ylcVar2);
                                    qrc.j(rg9Var7, str8, u8bVar, p90.N("cached_dns", 1, MLFeatureConfigProviderBase.URL_KEY, qt4.j(i7, str6, ":")));
                                } else {
                                    rg9 rg9Var8 = rg9.i;
                                    ylc ylcVar3 = new ylc("dns_resolve", Long.valueOf(j));
                                    ylc ylcVar4 = new ylc("tcp_handshake", Long.valueOf(j2));
                                    ylc ylcVar5 = new ylc("tls_handshake", Long.valueOf(j3));
                                    Object[] objArr2 = cqb.a;
                                    u8b u8bVar2 = new u8b(3);
                                    u8bVar2.b(ylcVar3);
                                    u8bVar2.b(ylcVar4);
                                    u8bVar2.b(ylcVar5);
                                    qrc.j(rg9Var8, str8, u8bVar2, p90.O(str6 + ":" + i7, MLFeatureConfigProviderBase.URL_KEY));
                                }
                                qrc.k(rg9.i, "session_established", 4, str8, false, null, null, 120);
                            }
                            rnfVar.t = 1;
                            rnfVar.e();
                            break;
                        case 2:
                            rnfVar.m.clear();
                            rnfVar.t = 2;
                            rnfVar.e();
                            return true;
                        case 3:
                            int i8 = message.arg1;
                            int i9 = message.arg2;
                            e8b e8bVar = rnfVar.u;
                            long j4 = ((bj8) e8bVar.d(i8, new bj8(bj8.a(0, 0)))).a;
                            e8bVar.f(i8, new bj8(bj8.a(((int) (j4 >> 32)) + 1, ((int) (j4 & 4294967295L)) + i9)));
                            return true;
                        case 4:
                            Exception exc = (Exception) message.obj;
                            boolean z = message.arg1 != 0;
                            if ((exc instanceof SessionSendLimitException) || (exc instanceof AddressUnreachableException)) {
                                ((t1c) rnfVar.b).a(exc);
                            } else if (exc instanceof SSLHandshakeException) {
                                if (rnfVar.a.e() && (message2 = exc.getMessage()) != null && ((r5h.L0(message2, "current time", false) && r5h.L0(message2, "validation time", false)) || r5h.L0(message2, "not valid until", false))) {
                                    gm0.Y(rnfVar.f, "Server time is not same as local time!");
                                }
                            } else if ((exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof SessionTamErrorException)) {
                                if (!z && rnfVar.a.e() && !((Boolean) rnfVar.d.invoke()).booleanValue()) {
                                    e2 e2Var = rnfVar.w;
                                    if (e2Var != null) {
                                        jZ0 = yab.z0(e2Var, rnfVar.e);
                                    } else {
                                        ghb ghbVar = ew5.b;
                                        jZ0 = 0;
                                    }
                                    if (ew5.f(jZ0, 0L)) {
                                        rnfVar.w = (e2) rnfVar.v.a();
                                        long jB = ((wd4) rnfVar.g.getValue()).b();
                                        int iN = ldf.n(jB);
                                        int iM = ldf.m(jB);
                                        String strA = ((ek5) rnfVar.i.getValue()).a();
                                        boolean zH = ((wd4) rnfVar.g.getValue()).h();
                                        we4 we4VarA = ((wd4) rnfVar.g.getValue()).a();
                                        boolean zC = ((wd4) rnfVar.g.getValue()).c();
                                        boolean zE = rnfVar.a.e();
                                        StringBuilder sbA = zo5.A("Anonymus session error:\n                            |id=", strA, "\n                            |net=", "\n                            |ct=", zH);
                                        sbA.append(we4VarA);
                                        sbA.append("\n                            |vpn=");
                                        sbA.append(zC);
                                        sbA.append("\n                            |link=(");
                                        qt4.x(iM, iN, ", ", ")\n                            |isForeground=", sbA);
                                        sbA.append(zE);
                                        sbA.append("\n                            ");
                                        SessionStateAnonException sessionStateAnonException = new SessionStateAnonException(s5h.y0(sbA.toString()), exc);
                                        String str10 = rnfVar.f;
                                        a4c a4cVar5 = gm0.f;
                                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                                            a4cVar5.c(je9Var, str10, "Anonymus session failed", sessionStateAnonException);
                                        }
                                    }
                                }
                            } else if (!(exc instanceof IOException) && !(exc instanceof SecurityException) && !z) {
                                ((t1c) rnfVar.b).a(exc);
                            }
                            return true;
                        case 5:
                            rnfVar.e();
                            return true;
                    }
                } else {
                    String str11 = rnfVar.f;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null) {
                        je9 je9Var3 = je9.c;
                        if (a4cVar6.b(je9Var3)) {
                            a4cVar6.c(je9Var3, str11, zo5.h(rnfVar.l.size(), "handleRemoveListener, arListeners="), null);
                        }
                    }
                    rnfVar.f(new ize(i4, rnfVar));
                }
                return true;
            default:
                gbc gbcVar = (gbc) obj;
                int i10 = message.what;
                if (i10 == 1) {
                    ((o6h) gbcVar.g).a();
                } else if (i10 == 2) {
                    ((p6h) gbcVar.h).a();
                } else if (i10 == 3) {
                    ((q6h) gbcVar.i).a();
                } else {
                    if (i10 != 4) {
                        return false;
                    }
                    ((r6h) gbcVar.j).a();
                }
                return true;
        }
    }
}
