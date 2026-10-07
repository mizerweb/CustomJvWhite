package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class nl {
    public final o91 a;
    public final CidLogger b;
    public final wl c;
    public final p8b d;
    public final d0c e;
    public final js8 f;
    public final CopyOnWriteArraySet g;
    public final km h;
    public final boolean i;
    public volatile boolean j;
    public volatile Integer k;

    public nl(o91 o91Var, zzf zzfVar, CidLogger cidLogger, vn7 vn7Var, wl wlVar, p8b p8bVar, EglBase eglBase) {
        zzfVar.getClass();
        vn7Var.getClass();
        wlVar.getClass();
        eglBase.getClass();
        this.a = o91Var;
        this.b = cidLogger;
        this.c = wlVar;
        this.d = p8bVar;
        d0c d0cVar = new d0c(1);
        this.e = d0cVar;
        zzfVar.getClass();
        wlVar.getClass();
        js8 js8Var = new js8();
        js8Var.a = this;
        js8Var.b = zzfVar;
        js8Var.c = wlVar;
        js8Var.d = d0cVar;
        js8Var.e = "";
        js8Var.f = js8.g;
        this.f = js8Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.g = copyOnWriteArraySet;
        this.h = new km(this, new fik(o91Var, vn7Var), wlVar, eglBase, d0cVar, new ysj(1, this, nl.class, "shouldRenderLocally", "shouldRenderLocally(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Z", 0, 2));
        this.i = false;
        ot4 ot4Var = new ot4(2, this);
        if (!((NativeDoubleArrayConsumer.Consumer) js8Var.f).equals(ot4Var)) {
            js8Var.f = ot4Var;
            d0c d0cVar2 = (d0c) js8Var.d;
            ((String) js8Var.e).getClass();
            ((AtomicInteger) d0cVar2.g).set(0);
        }
        copyOnWriteArraySet.add(new ml(this));
    }

    public final void a(JSONObject jSONObject) {
        yt1 yt1VarA;
        if (this.i) {
            try {
                yt1VarA = yt1.a(jSONObject.optString("participantId"));
            } catch (Exception unused) {
                yt1VarA = null;
            }
            if (yt1VarA == null) {
                return;
            }
            this.c.z(yt1VarA);
            km kmVar = this.h;
            kmVar.getClass();
            kmVar.g.post(new qe(kmVar, 2, yt1VarA));
        }
    }

    public final void b(x52 x52Var, List list) {
        Object objPutIfAbsent;
        x52Var.getClass();
        list.getClass();
        if (this.i && x52Var.a == v4j.c) {
            yt1 yt1Var = x52Var.b;
            yt1Var.getClass();
            km kmVar = this.h;
            kmVar.getClass();
            ConcurrentHashMap concurrentHashMap = kmVar.j;
            Object copyOnWriteArraySet = concurrentHashMap.get(yt1Var);
            if (copyOnWriteArraySet == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(yt1Var, (copyOnWriteArraySet = new CopyOnWriteArraySet()))) != null) {
                copyOnWriteArraySet = objPutIfAbsent;
            }
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) copyOnWriteArraySet;
            copyOnWriteArraySet2.clear();
            copyOnWriteArraySet2.addAll(list);
        }
    }
}
