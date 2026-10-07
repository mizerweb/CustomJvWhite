package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class i12 {
    public final CidLogger a;
    public final ru1 b;
    public final fik c;
    public final zq1 d;
    public final xq1 e;
    public final fik f;
    public final ih g;
    public final esh h;

    public i12(CidLogger cidLogger, ru1 ru1Var, fik fikVar, zq1 zq1Var, xq1 xq1Var, fik fikVar2, ih ihVar, esh eshVar) {
        ru1Var.getClass();
        fikVar.getClass();
        zq1Var.getClass();
        xq1Var.getClass();
        eshVar.getClass();
        this.a = cidLogger;
        this.b = ru1Var;
        this.c = fikVar;
        this.d = zq1Var;
        this.e = xq1Var;
        this.f = fikVar2;
        this.g = ihVar;
        this.h = eshVar;
    }

    public final void a(dnf dnfVar) {
        String str;
        int i = 14;
        final c7k c7kVar = new c7k(i, dnfVar);
        final tc tcVar = new tc(this, i, dnfVar);
        final ysj ysjVar = new ysj(1, this, i12.class, "onAllParticipantsLoadError", "onAllParticipantsLoadError(Ljava/lang/Throwable;)V", 0, 8);
        final fik fikVar = this.f;
        q4g q4gVar = ((p81) fikVar.c).b.k;
        if (q4gVar == null) {
            ysjVar.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-participant-list-chunk");
        jSONObject.put("count", 0);
        int i2 = em7.$EnumSwitchMapping$0[qt4.D(1)];
        if (i2 == 1) {
            str = "GRID";
        } else if (i2 == 2) {
            str = "SIDE";
        } else {
            if (i2 != 3) {
                ore.o();
                return;
            }
            str = "ADMIN";
        }
        jSONObject.put("listType", str);
        if (dnfVar instanceof cnf) {
            jSONObject.put("roomId", ((cnf) dnfVar).a);
        }
        q4gVar.l(jSONObject, new n4g() { // from class: dm7
            @Override // defpackage.n4g
            public final void onResponse(JSONObject jSONObject2) {
                jSONObject2.getClass();
                dnf dnfVar2 = (dnf) c7kVar.b;
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                l5g l5gVarY = jSONObjectOptJSONObject != null ? ((kzi) fikVar.b).y(jSONObjectOptJSONObject, dnfVar2) : null;
                if (l5gVarY != null) {
                    tcVar.invoke(l5gVarY);
                    return;
                }
                ysjVar.invoke(new RuntimeException("Can't parse chunk " + jSONObject2));
            }
        }, new mb(fikVar, ysjVar, 3));
    }

    public final void b(n5g n5gVar) {
        cnf cnfVar = new cnf(n5gVar.a);
        imc xr8Var = new xr8();
        xr8 xr8Var2 = new xr8();
        imc xr8Var3 = new xr8();
        imc xr8Var4 = new xr8();
        xr8 xr8Var5 = new xr8();
        imc dueVar = xr8Var2;
        due dueVar2 = new due(n5gVar.b);
        Boolean bool = n5gVar.c;
        if (bool != null) {
            xr8Var = new due(bool);
        }
        List list = n5gVar.d;
        if (list != null) {
            dueVar = new due(list);
        }
        List list2 = n5gVar.e;
        if (list2 != null) {
            xr8Var3 = new due(list2);
        }
        List list3 = n5gVar.f;
        if (list3 != null) {
            xr8Var4 = new due(list3);
        }
        imc imcVar = xr8Var4;
        imc imcVar2 = dueVar;
        due dueVar3 = new due(Integer.valueOf(n5gVar.h.intValue()));
        Long l = n5gVar.g;
        Long lValueOf = null;
        if (l != null) {
            long jLongValue = l.longValue();
            Long lA = ((gsh) this.h).a();
            if (lA != null) {
                lValueOf = Long.valueOf(System.currentTimeMillis() + (jLongValue - lA.longValue()));
            }
        }
        imc dueVar4 = lValueOf != null ? new due(Long.valueOf(lValueOf.longValue())) : xr8Var5;
        a12 a12VarD = this.c.d(new x70(cnfVar, dueVar2, xr8Var, imcVar2, xr8Var3, imcVar, dueVar3, new due(n5gVar.m), dueVar4, false));
        if (a12VarD == null) {
            return;
        }
        cnf cnfVar2 = a12VarD.a;
        List list4 = a12VarD.d;
        ru1 ru1Var = this.b;
        if (ww3.j1(list4, ru1Var.a.a)) {
            ru1Var.s(cnfVar2);
        } else if (cqk.d(cnfVar2, ru1Var.j)) {
            ru1Var.s(bnf.a);
        }
        l5g l5gVar = n5gVar.l;
        xq1 xq1Var = this.e;
        if (l5gVar != null) {
            uvc uvcVar = l5gVar.a;
            if (ru1Var.a.b() || cqk.d(ru1Var.k, cnfVar2)) {
                ru1Var.h(cnfVar2, (List) uvcVar.b);
                for (au1 au1Var : (List) uvcVar.c) {
                    vmc vmcVar = xq1Var.n;
                    yt1 yt1Var = au1Var.b;
                    yt1Var.getClass();
                    vmcVar.onStateChanged(yt1Var, au1Var);
                }
            }
        }
        xq1Var.f.onRoomUpdated(new g12(cnfVar2, zgl.c(a12VarD)));
    }

    public final void c(boolean z, yt1 yt1Var, cnf cnfVar) {
        cnfVar.getClass();
        xr8 xr8Var = new xr8();
        xr8 xr8Var2 = new xr8();
        xr8 xr8Var3 = new xr8();
        xr8 xr8Var4 = new xr8();
        xr8 xr8Var5 = new xr8();
        xr8 xr8Var6 = new xr8();
        xr8 xr8Var7 = new xr8();
        if (z) {
            yt1Var = null;
        }
        this.c.d(new x70(cnfVar, xr8Var, xr8Var2, xr8Var3, xr8Var4, xr8Var5, xr8Var6, new due(yt1Var), xr8Var7, true));
    }

    public final void d(boolean z) throws JSONException {
        if (z) {
            ysj ysjVar = new ysj(this, 9);
            ysj ysjVar2 = new ysj(this, 10);
            ih ihVar = this.g;
            q4g q4gVar = ((p81) ihVar.b).b.k;
            if (q4gVar == null) {
                ysjVar2.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "get-rooms");
            q4gVar.l(jSONObject, new x81(ihVar, ysjVar2, ysjVar, 2), new mb(ihVar, ysjVar2, 4));
        }
    }

    public final void e(gnf gnfVar) {
        gnfVar.getClass();
        int i = gnfVar.b;
        n5g n5gVar = gnfVar.c;
        Set set = gnfVar.a;
        if (set.contains(hnf.a) && n5gVar != null) {
            b(n5gVar);
        }
        boolean zContains = set.contains(hnf.c);
        fik fikVar = this.c;
        if (zContains) {
            cnf cnfVar = new cnf(i);
            xr8 xr8Var = new xr8();
            xr8 xr8Var2 = new xr8();
            xr8 xr8Var3 = new xr8();
            xr8 xr8Var4 = new xr8();
            xr8 xr8Var5 = new xr8();
            xr8 xr8Var6 = new xr8();
            due dueVar = new due(Boolean.valueOf(!gnfVar.d));
            Long lValueOf = null;
            Long l = n5gVar != null ? n5gVar.g : null;
            if (l != null) {
                long jLongValue = l.longValue();
                Long lA = ((gsh) this.h).a();
                if (lA != null) {
                    lValueOf = Long.valueOf(System.currentTimeMillis() + (jLongValue - lA.longValue()));
                }
            }
            fikVar.d(new x70(cnfVar, xr8Var, dueVar, xr8Var2, xr8Var3, xr8Var4, xr8Var5, xr8Var6, new due(lValueOf), false));
        }
        set.contains(hnf.d);
        if (set.contains(hnf.b)) {
            cnf cnfVar2 = new cnf(i);
            ru1 ru1Var = this.b;
            if (cqk.d(ru1Var.j, cnfVar2)) {
                ru1Var.s(bnf.a);
            }
            fikVar.getClass();
            ((HashMap) fikVar.c).remove(cnfVar2);
            ((xq1) fikVar.b).f.onRoomRemoved(new f12(cnfVar2));
        }
    }

    public final void f(o5g o5gVar) {
        xq1 xq1Var;
        o5gVar.getClass();
        dnf dnfVar = o5gVar.a;
        List<n5g> list = o5gVar.b;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cnf(((n5g) it.next()).a));
        }
        Set setX1 = ww3.X1(arrayList);
        fik fikVar = this.c;
        Set setKeySet = ((HashMap) fikVar.c).keySet();
        setKeySet.getClass();
        for (cnf cnfVar : ww3.X1(setKeySet)) {
            if (!setX1.contains(cnfVar)) {
                cnfVar.getClass();
                ((HashMap) fikVar.c).remove(cnfVar);
                ((xq1) fikVar.b).f.onRoomRemoved(new f12(cnfVar));
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            b((n5g) it2.next());
        }
        Iterator it3 = list.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            xq1Var = this.e;
            if (!zHasNext) {
                break;
            }
            n5g n5gVar = (n5g) it3.next();
            xq1Var.g.a(new kzi(n5gVar.i, new cnf(n5gVar.a), false));
        }
        for (n5g n5gVar2 : list) {
            xq1Var.q.onUrlSharingInfoUpdated(new o42(new cnf(n5gVar2.a), n5gVar2.n));
        }
        for (n5g n5gVar3 : list) {
            xq1Var.h.a(new uvc(n5gVar3.j, 7, new cnf(n5gVar3.a)));
        }
        for (n5g n5gVar4 : list) {
            this.d.m(n5gVar4.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", 2, new cnf(n5gVar4.a), true);
        }
        if (dnfVar instanceof bnf) {
            return;
        }
        ru1 ru1Var = this.b;
        if (!cqk.d(ru1Var.k, dnfVar)) {
            ru1Var.p(dnfVar);
            xq1Var.f.onCurrentParticipantActiveRoomChanged(new d12(dnfVar, dnfVar instanceof cnf ? fikVar.r((cnf) dnfVar) : null));
        }
        a(dnfVar);
    }
}
