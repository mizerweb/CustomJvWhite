package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class ate {
    public final String a = ate.class.getName();
    public final ny8 b;

    public ate(ny8 ny8Var) {
        this.b = ny8Var;
    }

    public static btc e(ctc ctcVar, byte[] bArr) throws mwd {
        try {
            switch (ctcVar.ordinal()) {
                case 0:
                case 15:
                case 18:
                case 34:
                case vg8.l /* 35 */:
                    return null;
                case 1:
                    return f3b.a(bArr);
                case 2:
                    return l4b.a(bArr);
                case 3:
                    return xjd.a(bArr);
                case 4:
                    return om4.a(bArr);
                case 5:
                    return u94.a(bArr);
                case 6:
                    return tx2.a(bArr);
                case 7:
                    return ai3.a(bArr);
                case 8:
                    return n3b.a(bArr);
                case 9:
                    return pv2.a(bArr);
                case 10:
                    return y2j.a(bArr);
                case 11:
                    return j13.a(bArr);
                case 12:
                    try {
                        Tasks.SyncChatHistory syncChatHistory = (Tasks.SyncChatHistory) sia.mergeFrom(new Tasks.SyncChatHistory(), bArr);
                        ulf ulfVar = new ulf(syncChatHistory.taskId, syncChatHistory.chatId, syncChatHistory.count, ku6.q(mg5.d, Integer.valueOf(syncChatHistory.itemTypeId)));
                        gm0.n(ulfVar.f, "parseFrom");
                        return ulfVar;
                    } catch (InvalidProtocolBufferNanoException e) {
                        throw new ProtoException(e);
                    }
                case 13:
                    return bg3.a(bArr);
                case 14:
                    return j03.a(bArr);
                case 16:
                    return v4b.a(bArr);
                case 17:
                    return c73.a(bArr);
                case 19:
                    return m93.a(bArr);
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    return pq6.a(bArr);
                case 21:
                    return tie.a(bArr);
                case 22:
                    return k3b.a(bArr);
                case 23:
                    return rv2.a(bArr);
                case 24:
                    return o4b.a(bArr);
                case 25:
                    return pch.a(bArr);
                case 26:
                    rkf.g.getClass();
                    return pkf.a(bArr);
                case 27:
                    return xq2.a(bArr);
                case 28:
                    return fd9.a(bArr);
                case 29:
                    int i = hy.i;
                    return gy.a(bArr);
                case 30:
                    int i2 = oy.j;
                    return ny.a(bArr);
                case 31:
                    int i3 = uy.i;
                    return ty.a(bArr);
                case 32:
                    int i4 = ry.k;
                    return qy.a(bArr);
                case 33:
                    return zy2.a(bArr);
                case 36:
                    return cfi.a(bArr);
                case LangUtils.HASH_OFFSET /* 37 */:
                    return jp2.a(bArr);
                case 38:
                    try {
                        Tasks.CritLog critLog = (Tasks.CritLog) sia.mergeFrom(new Tasks.CritLog(), bArr);
                        return new bw4(critLog.requestId, new kp(critLog.time, critLog.userId, critLog.sessionId, critLog.type, critLog.event, (Map) ch3.k(critLog.params)));
                    } catch (InvalidProtocolBufferNanoException e2) {
                        throw new ProtoException(e2);
                    }
                case 39:
                    return d54.a(bArr);
                case 40:
                    return f93.a(bArr);
                case 41:
                    AtomicInteger atomicInteger = amf.f;
                    try {
                        Tasks.WarmChatHistory warmChatHistory = (Tasks.WarmChatHistory) sia.mergeFrom(new Tasks.WarmChatHistory(), bArr);
                        return new amf(warmChatHistory.taskId, warmChatHistory.lastFailTime, a.m1(warmChatHistory.chatIds));
                    } catch (InvalidProtocolBufferNanoException e3) {
                        throw new ProtoException(e3);
                    }
                case 42:
                    ConcurrentHashMap concurrentHashMap = wjf.j;
                    return sjf.b(bArr);
                case 43:
                    int i5 = dkf.h;
                    return bkf.a(bArr);
                case 44:
                    int i6 = qjf.h;
                    return ojf.b(bArr);
                case 45:
                    return iz3.b(bArr);
                case 46:
                    return ly3.a(bArr);
                case 47:
                    return sy3.a(bArr);
                case 48:
                    String str = ry3.i;
                    return py3.a(bArr);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (ProtoException e4) {
            throw new mwd(e4);
        }
        throw new mwd(e4);
    }

    public final Object a(long j, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, b().a, false, true, new uy6(j, 5));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final xkh b() {
        return (xkh) this.b.getValue();
    }

    public final Object c(btc btcVar, long j, int i, nq4 nq4Var) {
        xkh xkhVarB = b();
        return ch3.I(nq4Var, xkhVarB.a, false, true, new ol(xkhVarB, 23, new ujh(btcVar.getId(), btcVar.getType(), rkh.WAITING, 0, j, i, btcVar.g(), System.currentTimeMillis())));
    }

    public final List d(List list) {
        return yhf.w0(yhf.o0(new m2i(new sw(1, list), new oo3(1, this, ate.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0, 7))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ctc ctcVar, nq4 nq4Var) {
        yse yseVar;
        if (nq4Var instanceof yse) {
            yseVar = (yse) nq4Var;
            int i = yseVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yseVar.g = i - Integer.MIN_VALUE;
            } else {
                yseVar = new yse(this, nq4Var);
            }
        } else {
            yseVar = new yse(this, nq4Var);
        }
        Object objI = yseVar.e;
        int i2 = yseVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            xkh xkhVarB = b();
            yseVar.d = this;
            yseVar.g = 1;
            objI = ch3.I(yseVar, xkhVarB.a, true, false, new ptf(xkhVarB, ctcVar));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = yseVar.d;
            ch3.d0(objI);
        }
        return this.d((List) objI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, nq4 nq4Var) {
        zse zseVar;
        if (nq4Var instanceof zse) {
            zseVar = (zse) nq4Var;
            int i = zseVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zseVar.f = i - Integer.MIN_VALUE;
            } else {
                zseVar = new zse(this, nq4Var);
            }
        } else {
            zseVar = new zse(this, nq4Var);
        }
        Object objI = zseVar.d;
        int i2 = zseVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            xkh xkhVarB = b();
            zseVar.f = 1;
            objI = ch3.I(zseVar, xkhVarB.a, true, false, new uy6(j, xkhVarB, 8));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        ujh ujhVar = (ujh) objI;
        if (ujhVar != null) {
            return i(ujhVar);
        }
        return null;
    }

    public final Object h(int i, nq4 nq4Var) {
        if (i == Integer.MAX_VALUE) {
            xkh xkhVarB = b();
            return ch3.I(nq4Var, xkhVarB.a, true, false, new nre(13, xkhVarB));
        }
        xkh xkhVarB2 = b();
        return ch3.I(nq4Var, xkhVarB2.a, true, false, new hb8(xkhVarB2, i));
    }

    public final tjh i(ujh ujhVar) {
        Object poeVar;
        try {
            poeVar = e(ujhVar.b, ujhVar.g);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z = poeVar instanceof poe;
        btc btcVar = (btc) (z ? null : poeVar);
        if (btcVar != null && !z) {
            return new tjh(ujhVar.a, ujhVar.c, ujhVar.d, ujhVar.e, ujhVar.f, btcVar, ujhVar.h);
        }
        Throwable thA = roe.a(poeVar);
        if (thA == null) {
            thA = new mwd(null, 1, null);
        }
        if (!(thA instanceof mwd)) {
            thA = new mwd(thA);
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "task parse error! " + ujhVar.b, thA);
            }
        }
        ((Number) ch3.G(b().a, false, true, new uy6(ujhVar.a, 6))).intValue();
        return null;
    }
}
