package defpackage;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class q4g {
    public final j4i a;
    public final y3e b;
    public final p4g g;
    public final ps4 p;
    public boolean r;
    public boolean s;
    public volatile long t;
    public volatile long u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final s63 y;
    public final lcb z;
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();
    public boolean q = true;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final int o = 5;
    public final int n = 30000;

    public q4g(p4g p4gVar, qs4 qs4Var, CidLogger cidLogger, boolean z, boolean z2, boolean z3, s63 s63Var, lcb lcbVar) {
        this.g = p4gVar;
        this.p = qs4Var;
        this.b = cidLogger;
        this.v = z;
        this.w = z2;
        this.y = s63Var;
        this.a = p4gVar.type();
        this.x = z3;
        this.z = lcbVar;
        if (lcbVar != null) {
            lcbVar.c = new vuf(4, p4gVar);
        }
        p4gVar.registerListener(new vog(this));
    }

    public final cak a(t4g t4gVar, long j) {
        try {
            return new cak(t4gVar.b().put("sequence", j).toString(), j);
        } catch (JSONException e) {
            this.b.reportException("OKSignaling", "signaling.create.command", e);
            return null;
        }
    }

    public final cfk b(long j) {
        cfk cfkVar;
        synchronized (this.f) {
            try {
                int iIndexOfKey = this.i.indexOfKey(j);
                if (iIndexOfKey >= 0) {
                    cfkVar = (cfk) this.i.valueAt(iIndexOfKey);
                    this.i.removeAt(iIndexOfKey);
                } else {
                    cfkVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cfkVar;
    }

    public final void c(t4g t4gVar, n4g n4gVar, n4g n4gVar2) {
        synchronized (this.f) {
            try {
                this.b.log("OKSignaling", "<!> postpone send " + t4gVar);
                if (this.w && e(t4gVar, n4gVar, n4gVar2)) {
                    return;
                }
                cak cakVarA = a(t4gVar, this.e.getAndIncrement());
                if (cakVarA == null) {
                    return;
                }
                this.h.add(new cfk(this, t4gVar, cakVarA, n4gVar, n4gVar2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(t4g t4gVar, boolean z, n4g n4gVar, n4g n4gVar2) {
        synchronized (this.f) {
            try {
                boolean z2 = this.v;
                boolean z3 = false;
                boolean z4 = !z2 && this.r;
                if (z2 && this.s) {
                    z3 = true;
                }
                if (z4 || z3 || z) {
                    cak cakVarA = a(t4gVar, this.e.getAndIncrement());
                    if (cakVarA == null) {
                        return;
                    }
                    this.i.put(cakVarA.b, new cfk(this, t4gVar, cakVarA, n4gVar, n4gVar2));
                    this.g.send(cakVarA.a);
                } else {
                    if (t4gVar.a()) {
                        try {
                            n4gVar2.onResponse(new JSONObject().put("error", "command-can-not-be-postponed"));
                        } catch (JSONException e) {
                            this.b.logException("OKSignaling", "Can't handle unsupported enqueue error", e);
                        }
                        return;
                    }
                    c(t4gVar, n4gVar, n4gVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public final boolean e(t4g t4gVar, n4g n4gVar, n4g n4gVar2) {
        Object z4gVar;
        String strOptString;
        tca tcaVar = t4gVar instanceof w4g ? new tca((w4g) t4gVar, 1) : t4gVar instanceof v4g ? new tca((v4g) t4gVar, 0) : null;
        if (tcaVar != null) {
            ArrayList arrayList = this.h;
            arrayList.getClass();
            y3e y3eVar = this.b;
            y3eVar.getClass();
            int size = arrayList.size();
            while (size > 0) {
                if (size > 0) {
                    int i = size - 1;
                    t4g t4gVar2 = ((cfk) arrayList.get(i)).a;
                    int i2 = tcaVar.a;
                    x4g x4gVar = x4g.a;
                    switch (i2) {
                        case 0:
                            if (!(t4gVar2 instanceof v4g)) {
                                z4gVar = x4gVar;
                            } else {
                                z4gVar = new z4g((v4g) tcaVar.b);
                            }
                            break;
                        default:
                            if (!(t4gVar2 instanceof w4g)) {
                                z4gVar = x4gVar;
                            } else {
                                z4gVar = new z4g((w4g) tcaVar.b);
                            }
                            break;
                    }
                    if (z4gVar.equals(x4gVar)) {
                        size = i;
                    } else {
                        if (!(z4gVar instanceof z4g)) {
                            if (z4gVar.equals(y4g.a)) {
                                return true;
                            }
                            ore.o();
                            return false;
                        }
                        t4g t4gVar3 = ((z4g) z4gVar).a;
                        cfk cfkVar = (cfk) arrayList.get(i);
                        cak cakVarA = a(t4gVar3, cfkVar.b);
                        cfk cfkVar2 = cakVarA != null ? new cfk(this, t4gVar3, cakVarA, n4gVar, n4gVar2) : null;
                        if (cfkVar2 != null) {
                            try {
                                if (cfkVar.e != null) {
                                    cfkVar.f.c.post(new myj(4, cfkVar));
                                }
                            } catch (Throwable th) {
                                t4g t4gVar4 = cfkVar.a;
                                t4gVar4.getClass();
                                try {
                                    strOptString = t4gVar4.b().optString("command");
                                    strOptString.getClass();
                                } catch (JSONException unused) {
                                    strOptString = "";
                                }
                                y3eVar.logException("SignalingCommandQueueIterator", "Error on discard command ".concat(strOptString), th);
                            }
                            arrayList.set(i, cfkVar2);
                            return true;
                        }
                    }
                } else {
                    c.r("No more elements in the list");
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public final void f(final JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPut;
        s63 s63Var = this.y;
        final int i = 1;
        final int i2 = 0;
        if (s63Var != null) {
            int i3 = gh6.$EnumSwitchMapping$0[((eh6) s63Var.b).ordinal()];
            if (i3 == 1) {
                jSONObjectPut = null;
            } else if (i3 == 2) {
                jSONObjectPut = new JSONObject().put("error", "service-unavailable");
            } else if (i3 != 3) {
                jSONObjectPut = null;
            } else {
                jSONObjectPut = new JSONObject().put("error", "participants-limit-reached").put("limit", "134");
            }
            if (jSONObjectPut != null) {
                jSONObjectPut.put("type", "error");
                jSONObjectPut.put("stamp", 0);
                jSONObjectPut.put("sequence", 0);
            } else {
                jSONObjectPut = null;
            }
            if (jSONObjectPut != null) {
                jSONObject = jSONObjectPut;
            }
        }
        String string = jSONObject.getString("type");
        long jOptLong = jSONObject.optLong("stamp", 0L);
        if (jOptLong != 0) {
            this.t = Math.max(jOptLong, this.t);
        }
        if (string.equals("response")) {
            String strOptString = jSONObject.optString("response", null);
            long j = jSONObject.getLong("sequence");
            if (!"recover".equals(strOptString) || this.v) {
                cfk cfkVarB = b(j);
                final n4g n4gVar = cfkVarB != null ? cfkVarB.d : null;
                if (n4gVar != null) {
                    this.c.post(new Runnable(this) { // from class: i4g
                        public final /* synthetic */ q4g b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            JSONObject jSONObject2 = jSONObject;
                            n4g n4gVar2 = n4gVar;
                            q4g q4gVar = this.b;
                            switch (i4) {
                                case 0:
                                    y3e y3eVar = q4gVar.b;
                                    try {
                                        if (n4gVar2 instanceof u7k) {
                                            ((u7k) n4gVar2).onResponse(jSONObject2);
                                        } else if (q4gVar.q) {
                                            n4gVar2.onResponse(jSONObject2);
                                        } else {
                                            y3eVar.log("OKSignaling", "<!> ignoring " + jSONObject2);
                                        }
                                    } catch (Exception e) {
                                        y3eVar.reportException("OKSignaling", "signaling.response", e);
                                        return;
                                    }
                                    break;
                                default:
                                    y3e y3eVar2 = q4gVar.b;
                                    try {
                                        if (n4gVar2 instanceof u7k) {
                                            ((u7k) n4gVar2).onResponse(jSONObject2);
                                        } else if (q4gVar.q) {
                                            n4gVar2.onResponse(jSONObject2);
                                        } else {
                                            y3eVar2.log("OKSignaling", "<!> ignoring " + jSONObject2);
                                        }
                                    } catch (Exception e2) {
                                        y3eVar2.reportException("OKSignaling", "signaling.response", e2);
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
            if (jSONArrayOptJSONArray != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    f(jSONArrayOptJSONArray.getJSONObject(i4));
                }
            }
            synchronized (this.f) {
                while (i2 < this.i.size()) {
                    try {
                        cfk cfkVar = (cfk) this.i.valueAt(i2);
                        cak cakVar = cfkVar.c;
                        if (cakVar.b <= j) {
                            t4g t4gVar = cfkVar.a;
                            if (t4gVar == null || !t4gVar.a()) {
                                this.g.send(cakVar.a);
                            } else {
                                this.i.removeAt(i2);
                                if (cfkVar.e != null) {
                                    cfkVar.f.c.post(new myj(4, cfkVar));
                                }
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        if (string.equals("notification")) {
            if ("connection".equals(jSONObject.getString("notification"))) {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recoverMessages");
                if (jSONArrayOptJSONArray2 != null && this.v) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                        f(jSONArrayOptJSONArray2.getJSONObject(i5));
                    }
                }
                String string2 = jSONObject.getJSONObject("conversation").getString("id");
                this.b.log("OKSignaling", qt4.q(new StringBuilder("cur cid="), ((qs4) this.p).b, ", new cid=", string2));
                lml.c(this.p, string2);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("conversationParams");
                if (jSONObjectOptJSONObject != null) {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("activityTimeout", -1L);
                    if (jOptLong2 > 0) {
                        this.g.updateActivityTimeout(jOptLong2);
                    }
                }
                synchronized (this.f) {
                    this.s = true;
                    if (!this.r || this.v) {
                        this.r = true;
                        while (!this.h.isEmpty()) {
                            cfk cfkVar2 = (cfk) this.h.remove(0);
                            cak cakVar2 = cfkVar2.c;
                            this.b.log("OKSignaling", "send postponed " + cakVar2);
                            cak cakVar3 = cfkVar2.c;
                            this.i.put(cakVar3.b, cfkVar2);
                            this.g.send(cakVar3.a);
                        }
                    } else {
                        long j2 = this.u;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("stamp", j2);
                            cak cakVarA = a(kql.b(jSONObject2, "recover"), this.e.getAndIncrement());
                            if (cakVarA != null) {
                                this.g.send(cakVarA.a);
                            }
                        } catch (JSONException e) {
                            this.b.reportException("OKSignaling", "signaling.recover", e);
                        }
                    }
                }
            }
            this.c.post(new yde(this, 25, jSONObject));
            return;
        }
        if (string.equals("error")) {
            if (!jSONObject.has("sequence")) {
                this.c.post(new d86(this, jSONObject, "listener.response.error", 28));
                return;
            }
            long j3 = jSONObject.getLong("sequence");
            cfk cfkVarB2 = b(j3);
            final n4g n4gVar2 = cfkVarB2 == null ? null : cfkVarB2.e;
            if (n4gVar2 != null) {
                this.c.post(new Runnable(this) { // from class: i4g
                    public final /* synthetic */ q4g b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i;
                        JSONObject jSONObject3 = jSONObject;
                        n4g n4gVar3 = n4gVar2;
                        q4g q4gVar = this.b;
                        switch (i6) {
                            case 0:
                                y3e y3eVar = q4gVar.b;
                                try {
                                    if (n4gVar3 instanceof u7k) {
                                        ((u7k) n4gVar3).onResponse(jSONObject3);
                                    } else if (q4gVar.q) {
                                        n4gVar3.onResponse(jSONObject3);
                                    } else {
                                        y3eVar.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                    }
                                } catch (Exception e2) {
                                    y3eVar.reportException("OKSignaling", "signaling.response", e2);
                                    return;
                                }
                                break;
                            default:
                                y3e y3eVar2 = q4gVar.b;
                                try {
                                    if (n4gVar3 instanceof u7k) {
                                        ((u7k) n4gVar3).onResponse(jSONObject3);
                                    } else if (q4gVar.q) {
                                        n4gVar3.onResponse(jSONObject3);
                                    } else {
                                        y3eVar2.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                    }
                                } catch (Exception e3) {
                                    y3eVar2.reportException("OKSignaling", "signaling.response", e3);
                                    return;
                                }
                                break;
                        }
                    }
                });
            }
            if (!"service-unavailable".equals(jSONObject.getString("error"))) {
                this.c.post(new d86(this, jSONObject, "signaling.listener.response.error.seq", 28));
                return;
            }
            if (!jSONObject.optBoolean("recoverable", false)) {
                this.c.post(new d86(this, jSONObject, "signaling.listener.response.error.seq", 28));
                return;
            }
            synchronized (this.f) {
                try {
                    int iIndexOfKey = this.i.indexOfKey(j3);
                    cfk cfkVar3 = iIndexOfKey >= 0 ? (cfk) this.i.valueAt(iIndexOfKey) : null;
                    if (cfkVar3 != null) {
                        cak cakVar4 = cfkVar3.c;
                        long j4 = cakVar4.d + 1;
                        cakVar4.d = j4;
                        if (j4 >= this.o) {
                            this.b.log("OKSignaling", "<!> quit retrying " + ((qs4) this.p).b + " " + cakVar4);
                            this.b.reportException("OKSignaling", "signaling.retry", new RuntimeException("retry.fail"));
                            this.i.removeAt(iIndexOfKey);
                            return;
                        }
                        txj txjVar = new txj(this, cakVar4, false, 1);
                        this.j.add(txjVar);
                        this.b.log("OKSignaling", "<!> retrying " + cakVar4);
                        this.d.postDelayed(txjVar, cakVar4.c);
                        long j5 = cakVar4.c * 2;
                        cakVar4.c = j5;
                        cakVar4.c = Math.min(j5, this.n);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        this.g.dispose();
        lcb lcbVar = this.z;
        if (lcbVar != null) {
            gd8 gd8Var = lcbVar.d;
            if (gd8Var != null) {
                Object systemService = lcbVar.a.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(gd8Var);
                }
            }
            lcbVar.c = null;
        }
        synchronized (this.f) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.d.removeCallbacks((Runnable) obj);
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(o91 o91Var) {
        int i;
        if (this.x) {
            LongSparseArray longSparseArray = new LongSparseArray();
            synchronized (this.f) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    try {
                        cfk cfkVar = (cfk) this.i.valueAt(i2);
                        cak cakVar = cfkVar.c;
                        t4g t4gVar = cfkVar.a;
                        if (t4gVar.a() && (t4gVar instanceof u4g)) {
                            longSparseArray.put(cakVar.b, (u4g) t4gVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (i = 0; i < longSparseArray.size(); i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                u4g u4gVar = (u4g) longSparseArray.valueAt(i);
                try {
                    JSONObject jSONObjectC = u4gVar.c(jKeyAt, o91Var);
                    if (jSONObjectC != null) {
                        f(jSONObjectC);
                    }
                } catch (JSONException e) {
                    this.b.logException("OKSignaling", "Can't recover command response" + u4gVar + " by call state", e);
                }
            }
        }
    }

    public final void i(n4g n4gVar) {
        this.k.remove(n4gVar);
    }

    public final void j(vj7 vj7Var, n4g n4gVar) {
        d(vj7Var, false, n4gVar, null);
    }

    public final void k(t4g t4gVar) {
        d(t4gVar, false, null, null);
    }

    public final void l(JSONObject jSONObject, n4g n4gVar, n4g n4gVar2) {
        d(new vj7(jSONObject), false, n4gVar, n4gVar2);
    }
}
