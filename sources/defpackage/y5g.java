package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.g;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.webrtc.signaling.transport.exception.BadEndpointException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y5g implements p4g {
    public static final int CLOSE_SOCKET_CODE_DISPOSE = 1001;
    public static final int CLOSE_SOCKET_CODE_TIMEOUT = 4000;
    public static final t5g Companion = new t5g();
    public static final long FALLBACK_TO_OTHER_TRANSPORT_TIMEOUT = 21000;
    public static final int MSG_PING_FROM_SERVER_TIMEOUT = 2;
    public static final int MSG_RECONNECT = 1;
    public static final int MSG_REQUEST_FALLBACK = 3;
    public static final String PING = "ping";
    public static final String PONG = "pong";
    public static final long RECONNECT_DELAY_MILLIS = 2000;
    public static final long SERVER_PING_TIMEOUT_MAX = 61000;
    public static final long SERVER_PING_TIMEOUT_MIN = 11000;
    public static final String URL_TYPE_RETRY = "retry";
    public final Object A;
    public xjk B;
    public final ReentrantLock C;
    public volatile z5g D;
    public final o96 E;
    public final ylc F;
    public final List G;
    public final ny8 H;
    public final ReentrantLock I;
    public boolean J;
    public Long K;
    public final j4i a;
    public long b;
    public final m4g c;
    public final r5g d;
    public final ExecutorService e;
    public final y3e f;
    public long g;
    public final boolean h;
    public final n96 i;
    public final boolean j;
    public final q5g k;
    public final esh l;
    public final boolean m;
    public final u5g n;
    public final x5g o;
    public final boolean p;
    public final wxe q;
    public final Handler r;
    public final Object s;
    public boolean t;
    public volatile String u;
    public volatile long v;
    public volatile long w;
    public o4g x;
    public volatile ujk y;
    public final g5g z;

    public y5g(j4i j4iVar, long j, m4g m4gVar, r5g r5gVar, ExecutorService executorService, y3e y3eVar, z3e z3eVar, long j2, boolean z, n96 n96Var, boolean z2, q5g q5gVar, esh eshVar, boolean z3, boolean z4, u5g u5gVar, x5g x5gVar, boolean z5, boolean z6, wxe wxeVar, af7 af7Var) {
        ylc ylcVar;
        String strB;
        String strB2;
        r5gVar.getClass();
        executorService.getClass();
        y3eVar.getClass();
        z3eVar.getClass();
        n96Var.getClass();
        eshVar.getClass();
        this.a = j4iVar;
        this.b = j;
        this.c = m4gVar;
        this.d = r5gVar;
        this.e = executorService;
        this.f = y3eVar;
        this.g = j2;
        this.h = z;
        this.i = n96Var;
        this.j = z2;
        this.k = q5gVar;
        this.l = eshVar;
        this.m = z3;
        this.n = u5gVar;
        this.o = x5gVar;
        this.p = z6;
        this.q = wxeVar;
        this.s = new Object();
        this.v = SystemClock.elapsedRealtime();
        this.y = new ujk(null, null);
        g5g g5gVar = new g5g(y3eVar, z3eVar, eshVar, j4iVar.getKey(), z4);
        this.z = g5gVar;
        this.A = new Object();
        this.C = new ReentrantLock();
        this.E = new o96();
        this.H = new ifh(new ize(21, this));
        this.I = new ReentrantLock();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            ore.k("Looper thread is required to create signaling transport");
            throw null;
        }
        if (z5) {
            t5g t5gVar = Companion;
            String str = n96Var.e;
            t5gVar.getClass();
            try {
                Uri uri = Uri.parse(str);
                ylcVar = new ylc(uri.getHost(), Integer.valueOf(uri.getPort()));
            } catch (Throwable unused) {
                ylcVar = null;
            }
        } else {
            ylcVar = null;
        }
        this.F = ylcVar;
        List listA = z5 ? a(n96Var) : r66.a;
        this.G = listA;
        if (af7Var != null) {
            if (z2) {
                strB2 = cwl.b(n96Var);
            } else {
                Companion.getClass();
                strB2 = t5g.b(n96Var);
            }
            Uri uri2 = Uri.parse(strB2);
            String queryParameter = uri2.getQueryParameter(ApiProtocol.PARAM_PEER_ID);
            Long lC0 = queryParameter != null ? y5h.C0(queryParameter) : null;
            if (lC0 == null) {
                Uri.Builder builderBuildUpon = uri2.buildUpon();
                long jA = a(this, af7Var);
                a(this, jA);
                strB2 = builderBuildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(jA)).build().toString();
                strB2.getClass();
            } else {
                a(this, lC0.longValue());
            }
            this.u = strB2;
        } else {
            if (z2) {
                strB = cwl.b(n96Var);
            } else {
                Companion.getClass();
                strB = t5g.b(n96Var);
            }
            this.u = strB;
        }
        if (listA.size() > 1) {
            this.u = t5g.a(Companion, this.u, listA, g5gVar);
        }
        this.r = new Handler(looperMyLooper, new w84(6, this));
    }

    public static final String access$getOriginalEndpoint(y5g y5gVar) {
        ylc ylcVar = y5gVar.F;
        if (ylcVar != null) {
            return (String) ylcVar.a;
        }
        return null;
    }

    public static final xjk access$getReconnectContext(y5g y5gVar) {
        ReentrantLock reentrantLock = y5gVar.C;
        reentrantLock.lock();
        try {
            xjk xjkVar = y5gVar.B;
            if (xjkVar == null) {
                xjkVar = new xjk(y5gVar);
                y5gVar.B = xjkVar;
                g5g g5gVar = y5gVar.z;
                g5gVar.a.log(g5gVar.d, "Reconnection context created");
            }
            return xjkVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void access$handleSocketFailure(y5g y5gVar, boolean z, Throwable th) {
        g5g g5gVar = y5gVar.z;
        g5gVar.getClass();
        th.getClass();
        g5gVar.a.logException(g5gVar.d, "handleWebSocketFailure", th);
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
            synchronized (y5gVar.A) {
                y5gVar.u = t5g.a(Companion, y5gVar.u, y5gVar.G, y5gVar.z);
            }
        }
        y5gVar.d.onFailedByException(y5gVar.k, th);
        y5gVar.a(z);
    }

    public static final void access$handleSocketOpen(y5g y5gVar) {
        g5g g5gVar = y5gVar.z;
        g5gVar.a.log(g5gVar.d, "handleWebSocketOpen");
        y5gVar.d.onConnected(y5gVar.k);
        o4g o4gVar = y5gVar.x;
        if (o4gVar != null) {
            vog vogVar = (vog) o4gVar;
            synchronized (((q4g) vogVar.a).f) {
                try {
                    q4g q4gVar = (q4g) vogVar.a;
                    if (q4gVar.r) {
                        q4gVar.u = q4gVar.t;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            q4g q4gVar2 = (q4g) vogVar.a;
            q4gVar2.c.post(new nb0(q4gVar2, true, 9));
        }
    }

    public static final void access$resetReconnectContext(y5g y5gVar) {
        ReentrantLock reentrantLock = y5gVar.C;
        reentrantLock.lock();
        try {
            if (y5gVar.B != null) {
                y5gVar.z.d("Reconnection context released");
            }
            y5gVar.B = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void access$resetReconnectDelay(y5g y5gVar) {
        ReentrantLock reentrantLock = y5gVar.I;
        reentrantLock.lock();
        try {
            if (y5gVar.o != null) {
                y5gVar.K = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final long access$time(y5g y5gVar) {
        ((gsh) y5gVar.l).getClass();
        return SystemClock.elapsedRealtime();
    }

    public static final void access$validateEndpoint(y5g y5gVar) {
        o96 o96Var = y5gVar.E;
        String str = y5gVar.u;
        o96Var.getClass();
        str.getClass();
        if (!o96.a.b(str)) {
            throw new BadEndpointException(y5gVar.u);
        }
    }

    public static final String createEndpointUrl(n96 n96Var) {
        Companion.getClass();
        return t5g.b(n96Var);
    }

    public static final String replaceOrAppendQueryParam(String str, String str2, String str3) {
        Companion.getClass();
        return t5g.c(str, str2, str3);
    }

    public final void a(Message message) {
        int i = message.what;
        if (i == 1) {
            c();
            ReentrantLock reentrantLock = this.I;
            reentrantLock.lock();
            try {
                this.J = false;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (i == 2) {
            b();
            return;
        }
        if (i != 3) {
            ore.q(zo5.h(i, "unhandled message "));
            return;
        }
        Object obj = message.obj;
        d7k d7kVar = obj instanceof d7k ? (d7k) obj : null;
        if (d7kVar == null) {
            return;
        }
        z5g z5gVar = d7kVar.a;
        ujk ujkVar = d7kVar.b;
        a6g a6gVar = new a6g(true, ujkVar.b, ujkVar.a, this.w);
        xva xvaVar = (xva) z5gVar;
        xvaVar.getClass();
        yfj yfjVar = (yfj) xvaVar.b;
        ReentrantLock reentrantLock2 = (ReentrantLock) yfjVar.f;
        reentrantLock2.lock();
        try {
            if (this != ((p4g) yfjVar.c)) {
                return;
            }
            setListener(null);
            registerListener(null);
            dispose();
            p4g p4gVarBuild = ((SignalingTransportBuilder) ((j22) yfjVar.a).b).build(a6gVar);
            o4g o4gVar = (o4g) yfjVar.d;
            if (o4gVar != null) {
                p4gVarBuild.registerListener(o4gVar);
            }
            Long l = (Long) yfjVar.e;
            if (l != null) {
                p4gVarBuild.updateActivityTimeout(l.longValue());
            }
            y5g y5gVar = p4gVarBuild instanceof y5g ? (y5g) p4gVarBuild : null;
            if (y5gVar != null) {
                y5gVar.setListener((xva) yfjVar.b);
            }
            yfjVar.c = p4gVarBuild;
        } finally {
            reentrantLock2.unlock();
        }
    }

    public final void b(String str) {
        String strB;
        String strOptString;
        g5g g5gVar = this.z;
        z3e z3eVar = g5gVar.b;
        str.getClass();
        if (g5gVar.c) {
            re9 re9Var = g5gVar.e;
            if (re9Var != null && (str.equals(PING) || str.equals(PONG))) {
                ggk ggkVar = re9Var.c;
                if (ggkVar != null) {
                    synchronized (ggkVar.b) {
                        re9Var.a();
                    }
                } else {
                    re9Var.a();
                }
            } else if (z3eVar.shouldHideSensitiveInformation()) {
                String strC = lql.c(str);
                strC.getClass();
                g5gVar.c(strC, null);
            } else {
                g5gVar.c(str, null);
            }
        } else if (z3eVar.shouldThrottleSignalingLogs()) {
            String strC2 = lql.c(str);
            strC2.getClass();
            g5gVar.a.log(g5gVar.d, " <- ".concat(strC2));
        } else {
            g5gVar.a.log(g5gVar.d, " <- ".concat(str));
        }
        if (!this.m) {
            this.d.onMessageReceived(this.k, null, true);
        } else if (str.equals(PING)) {
            this.d.onMessageReceived(this.k, str, true);
        } else {
            this.d.onMessageReceived(this.k, a(str, "response"), false);
        }
        if (this.g > 0) {
            this.r.removeMessages(2);
            synchronized (this.A) {
                safelyDoIfSocketExists(new s5g(this, 0));
            }
        }
        if (str.equals(PING)) {
            synchronized (this.A) {
                try {
                    if (safelySendSocketMessage(PONG)) {
                        this.z.e(PONG);
                        if (this.m) {
                            this.d.onCommandSent(this.k, PONG, true);
                        }
                        ((gsh) this.l).getClass();
                        this.v = SystemClock.elapsedRealtime();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString2 = jSONObject.optString("type", null);
            String strOptString3 = jSONObject.optString("error", null);
            if ("error".equals(strOptString2) && "conversation-ended".equals(strOptString3)) {
                dispose();
            }
            long jOptLong = jSONObject.optLong("stamp", 0L);
            if (jOptLong > 0) {
                synchronized (this.A) {
                    this.w = Math.max(jOptLong, this.w);
                }
            }
            o4g o4gVar = this.x;
            if (o4gVar != null) {
                ((q4g) ((vog) o4gVar).a).f(jSONObject);
            }
            String strOptString4 = jSONObject.optString("notification", null);
            if ("notification".equals(strOptString2) && "connection".equals(strOptString4)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
                Long lC0 = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("id", null)) == null) ? null : y5h.C0(strOptString);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("conversation");
                String strOptString5 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("id", null) : null;
                if (strOptString5 == null || lC0 == null) {
                    return;
                }
                ujk ujkVar = this.y;
                g5g g5gVar2 = this.z;
                g5gVar2.a.log(g5gVar2.d, "Peer update: " + ujkVar.a + " -> " + lC0 + ", " + ujkVar.b + " -> " + strOptString5);
                synchronized (this.A) {
                    try {
                        this.y = new ujk(strOptString5, lC0);
                        n96 n96VarA = n96.a(this.i, strOptString5, lC0);
                        if (this.j) {
                            strB = cwl.b(n96VarA);
                        } else {
                            Companion.getClass();
                            strB = t5g.b(n96VarA);
                        }
                        this.u = strB;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (JSONException e) {
            g5g g5gVar3 = this.z;
            g5gVar3.getClass();
            g5gVar3.a.reportException(g5gVar3.d, "ws.signaling.json", e);
        } catch (Throwable th3) {
            g5g g5gVar4 = this.z;
            g5gVar4.getClass();
            g5gVar4.a.reportException(g5gVar4.d, "ws.signaling.unexpected_throwable", th3);
        }
    }

    public final void c() {
        g5g g5gVar = this.z;
        g5gVar.a.log(g5gVar.d, "reconnect requested");
        this.e.execute(new f4g(2, this));
    }

    public final void d() {
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            if (this.o == null || !this.J) {
                this.J = true;
                long jA = a();
                this.z.d("submit request to reconnect in " + jA + " ms");
                this.r.removeMessages(1);
                this.r.sendEmptyMessageDelayed(1, jA);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.p4g
    public void dispose() {
        g5g g5gVar = this.z;
        g5gVar.a.log(g5gVar.d, "transport.dispose");
        synchronized (this.s) {
            if (this.t) {
                return;
            }
            this.t = true;
            this.r.removeCallbacksAndMessages(null);
            this.e.execute(new rda(22, this));
        }
    }

    public final v5g getHostnameVerifier() {
        return (v5g) this.H.getValue();
    }

    public final y3e getLog() {
        return this.f;
    }

    public final g5g getSignalingLogger() {
        return this.z;
    }

    public final Object getSocketLock() {
        return this.A;
    }

    public final wxe getSslProvider() {
        return this.q;
    }

    public final void init() {
        a("init", true);
    }

    public boolean isFallbackSupported() {
        return false;
    }

    public final boolean isSNIEnabled() {
        return this.p;
    }

    @Override // defpackage.p4g
    public void registerListener(o4g o4gVar) {
        this.x = o4gVar;
    }

    @Override // defpackage.p4g
    public void restart(String str, Long l) {
        if (str == null) {
            return;
        }
        this.d.onRestart(this.k);
        this.e.execute(new d86(this, str, l, 29));
    }

    public abstract boolean safelyCloseSocketWithCodeAndReason(int i, String str);

    public abstract void safelyCreateNewSocket(String str, String str2, w5g w5gVar);

    public abstract void safelyDoIfSocketExists(cf7 cf7Var);

    public abstract void safelyResetSocketReference();

    public abstract boolean safelySendSocketMessage(String str);

    @Override // defpackage.p4g
    public void send(String str) {
        if (str == null) {
            return;
        }
        this.e.execute(new yde(this, 26, str));
    }

    public void setListener(z5g z5gVar) {
        this.D = z5gVar;
    }

    @Override // defpackage.p4g
    public void tryReconnectNow() {
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            this.z.d("check if in await reconnect state");
            if (this.J) {
                this.z.d("reconnect state confirmed. try reconnect right now");
                this.r.removeMessages(1);
                this.r.sendEmptyMessage(1);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.p4g
    public j4i type() {
        return this.a;
    }

    @Override // defpackage.p4g
    public void updateActivityTimeout(long j) {
        this.b = Math.max(Math.max(j / 2, j - 60000), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        if (this.g > 0) {
            this.g = Math.max(Math.min(j / 4, SERVER_PING_TIMEOUT_MAX), SERVER_PING_TIMEOUT_MIN);
        }
        g5g g5gVar = this.z;
        long j2 = this.b;
        long j3 = this.g;
        StringBuilder sbS = qt4.s(j2, "updateTimeoutMS timeoutMS=", " serverPingTimeoutMs=");
        sbS.append(j3);
        g5gVar.d(sbS.toString());
    }

    public static final long a(y5g y5gVar, af7 af7Var) {
        y5gVar.z.d("Generate new peer id");
        return ((Number) af7Var.invoke()).longValue();
    }

    public static final sbi a(y5g y5gVar, long j) {
        y5gVar.z.d("Remember peer id " + j);
        y5gVar.y = new ujk(y5gVar.i.a, Long.valueOf(j));
        return sbi.a;
    }

    public static final boolean a(y5g y5gVar, Message message) {
        message.getClass();
        y5gVar.a(message);
        return true;
    }

    public static final void a(y5g y5gVar, String str, Long l) {
        String str2 = y5gVar.u;
        Companion.getClass();
        String strC = t5g.c(str2, ApiProtocol.KEY_TOKEN, str);
        if (l != null) {
            strC = t5g.c(strC, "userId", String.valueOf(l.longValue()));
        }
        String strC2 = t5g.c(strC, "tgt", URL_TYPE_RETRY);
        if (y5gVar.h) {
            long j = y5gVar.w;
            if (j > 0) {
                strC2 = t5g.c(strC2, "recoverTs", String.valueOf(j));
            }
        }
        g5g g5gVar = y5gVar.z;
        g5gVar.a.log(g5gVar.d, "transport.restart");
        synchronized (y5gVar.A) {
            y5gVar.u = strC2;
        }
        synchronized (y5gVar.s) {
            y5gVar.t = false;
            y5gVar.a("restart", false);
        }
    }

    public final void a(String str, boolean z) {
        g5g g5gVar = this.z;
        g5gVar.a.log(g5gVar.d, qv1.k("connect, ", str));
        if (this.g > 0) {
            this.r.removeMessages(2);
        }
        synchronized (this.s) {
            if (this.t) {
                g5g g5gVar2 = this.z;
                g5gVar2.a.log(g5gVar2.d, "cant connect because released");
                return;
            }
            ((gsh) this.l).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.v;
            if (j != 0 && jElapsedRealtime - j > this.b) {
                this.d.onTimeout(this.k);
                g5g g5gVar3 = this.z;
                g5gVar3.a.log(g5gVar3.d, "not connecting, lastPongTime = " + j + " time = " + jElapsedRealtime);
                m4g m4gVar = this.c;
                if (m4gVar != null) {
                    ((g) m4gVar).a(new k4g(), this);
                }
                dispose();
            } else {
                this.d.onConnect(this.k);
                this.e.execute(new u3k(this, z));
            }
        }
    }

    public static final e5g a(y5g y5gVar) {
        return new e5g(new occ(0, y5gVar, y5g.class, "getOriginalEndpoint", "getOriginalEndpoint()Ljava/lang/String;", 0, 19), new occ(0, y5gVar, y5g.class, "getAltEndpoints", "getAltEndpoints()Ljava/util/List;", 0, 20));
    }

    public final void a(boolean z) {
        q4g q4gVar;
        g5g g5gVar = this.z;
        g5gVar.a.log(g5gVar.d, "handleDisconnected");
        if (this.g > 0) {
            this.r.removeMessages(2);
        }
        synchronized (this.A) {
            safelyResetSocketReference();
        }
        synchronized (this.s) {
            if (!this.t && !b(z)) {
                d();
            }
        }
        o4g o4gVar = this.x;
        if (o4gVar != null) {
            vog vogVar = (vog) o4gVar;
            synchronized (((q4g) vogVar.a).f) {
                q4gVar = (q4g) vogVar.a;
                q4gVar.s = false;
            }
            q4gVar.c.post(new nb0(q4gVar, false, 9));
        }
    }

    public static String a(String str, String str2) {
        Object poeVar;
        String strOptString;
        try {
            poeVar = new JSONObject(str);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        JSONObject jSONObject = (JSONObject) poeVar;
        if (jSONObject == null || (strOptString = jSONObject.optString(str2)) == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }

    public static final sbi a(y5g y5gVar, String str) {
        str.getClass();
        y5gVar.r.sendEmptyMessageDelayed(2, y5gVar.g);
        return sbi.a;
    }

    public final void a(String str) {
        this.z.d("handleWebSocketClosed, reason=" + str);
        this.d.onDisconnectedSuccessfully(this.k);
        a(false);
    }

    public final List a(n96 n96Var) {
        ArrayList arrayList = new ArrayList();
        ylc ylcVar = this.F;
        int iIntValue = ylcVar != null ? ((Number) ylcVar.b).intValue() : -1;
        List<String> list = n96Var.f;
        if (list != null) {
            for (String str : list) {
                if (iIntValue > 0) {
                    arrayList.add(str + ":" + iIntValue);
                } else {
                    arrayList.add(str);
                }
            }
        }
        ylc ylcVar2 = this.F;
        String str2 = ylcVar2 != null ? (String) ylcVar2.a : null;
        if (str2 != null) {
            if (iIntValue > 0) {
                arrayList.add(str2 + ":" + iIntValue);
            } else {
                arrayList.add(str2);
            }
        }
        return ww3.T1(arrayList);
    }

    public final long a() {
        if (this.o == null) {
            return 2000L;
        }
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            Long l = this.K;
            long jLongValue = l != null ? l.longValue() : this.o.b;
            long jMin = Math.min(gm0.L(jLongValue * this.o.c), this.o.d);
            this.K = Long.valueOf(jMin + gm0.L(((0.5d - Math.random()) * jMin) / 100.0d));
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void b(y5g y5gVar) {
        String strC = y5gVar.u;
        if (y5gVar.h) {
            t5g t5gVar = Companion;
            long j = y5gVar.w;
            if (j <= 0) {
                t5gVar.getClass();
            } else {
                String strValueOf = String.valueOf(j);
                t5gVar.getClass();
                strC = t5g.c(strC, "recoverTs", strValueOf);
            }
        }
        g5g g5gVar = y5gVar.z;
        g5gVar.a.log(g5gVar.d, "transport.reconnect");
        synchronized (y5gVar.A) {
            y5gVar.u = strC;
        }
        synchronized (y5gVar.s) {
            y5gVar.t = false;
            y5gVar.a("reconnect", false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final void b() {
        boolean zSafelyCloseSocketWithCodeAndReason;
        boolean z;
        this.z.d("handleServerPingTimeout, timeout=" + this.g);
        synchronized (this.A) {
            zSafelyCloseSocketWithCodeAndReason = safelyCloseSocketWithCodeAndReason(CLOSE_SOCKET_CODE_TIMEOUT, "dispose");
        }
        if (zSafelyCloseSocketWithCodeAndReason) {
            this.d.onFailedByPings(this.k);
        }
        u5g u5gVar = this.n;
        if (u5gVar != null) {
            z = u5gVar.c;
        }
        a(z);
    }

    public static final void b(y5g y5gVar, String str) {
        synchronized (y5gVar.A) {
            try {
                boolean zSafelySendSocketMessage = y5gVar.safelySendSocketMessage(str);
                g5g g5gVar = y5gVar.z;
                if (zSafelySendSocketMessage) {
                    g5gVar.e(str);
                    if (y5gVar.m) {
                        y5gVar.d.onCommandSent(y5gVar.k, a(str, "command"), false);
                    }
                } else {
                    g5gVar.d("Socket is absent, waiting?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(boolean z) {
        if (!z) {
            g5g g5gVar = this.z;
            g5gVar.a.log(g5gVar.d, "fallback condition not satisfied. ignore fallback request");
            return false;
        }
        if (!isFallbackSupported()) {
            g5g g5gVar2 = this.z;
            g5gVar2.a.log(g5gVar2.d, "fallback is not supported for this kind of transport");
            return false;
        }
        z5g z5gVar = this.D;
        if (z5gVar == null) {
            g5g g5gVar3 = this.z;
            g5gVar3.a.log(g5gVar3.d, "no fallback request listener provided, will not request fallback");
            return false;
        }
        this.r.removeMessages(3);
        Handler handler = this.r;
        ujk ujkVar = this.y;
        handler.sendMessage(handler.obtainMessage(3, new d7k(z5gVar, new ujk(ujkVar.b, ujkVar.a))));
        g5g g5gVar4 = this.z;
        g5gVar4.a.log(g5gVar4.d, "fallback to another instance request submitted");
        return true;
    }
}
