package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider;
import com.vk.push.core.remote.config.omicron.segment.SegmentsProvider;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import one.me.android.join.JoinChatWidget;
import one.me.folders.edit.FolderEditScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.GetSystemInfo;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo6 implements DeviceIdProvider, jw0, y58, qbf, zje, hu8, cub, u8j, p48, gdd, i8c, u00, bg7, s72, aj9, rv9, r4a, p4a, n78, tg4, tm9, SegmentsProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo6(int i, pmf pmfVar) {
        this.a = 20;
        this.b = pmfVar;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        r6a r6aVar = (r6a) this.b;
        zjl.d().execute(new su6(r6aVar, 11, r72Var));
        return r6aVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        ((nv4) this.b).invoke(obj);
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        c60 c60Var = (c60) obj;
        y60 y60Var = ((e70) this.b).a;
        int i = y60Var == null ? -1 : m4b.$EnumSwitchMapping$0[y60Var.ordinal()];
        if (i == 1) {
            o60 o60Var = c60Var.b;
            if (o60Var == null) {
                o60Var = o60.l;
            }
            n60 n60VarC = o60Var.c();
            n60VarC.h = null;
            c60Var.b = new o60(n60VarC);
            return;
        }
        if (i == 2) {
            z60 z60VarA = c60Var.c().a();
            z60VarA.a = 0L;
            z60VarA.n = null;
            c60Var.d = new d70(z60VarA);
            return;
        }
        if (i == 3) {
            i60 i60VarA = c60Var.b().a();
            i60VarA.a = 0L;
            i60VarA.e = null;
            c60Var.r = new j60(i60VarA);
            return;
        }
        if (i != 4) {
            return;
        }
        w60 w60Var = c60Var.f;
        if (w60Var == null) {
            w60Var = w60.p;
        }
        v60 v60Var = new v60();
        long j = w60Var.a;
        v60Var.b = w60Var.b;
        v60Var.c = w60Var.c;
        v60Var.d = w60Var.d;
        v60Var.e = w60Var.e;
        v60Var.f = w60Var.f;
        v60Var.g = w60Var.g;
        v60Var.h = w60Var.h;
        v60Var.i = w60Var.i;
        v60Var.j = w60Var.j;
        v60Var.k = w60Var.k;
        v60Var.l = w60Var.l;
        v60Var.m = w60Var.m;
        v60Var.n = w60Var.n;
        v60Var.o = w60Var.o;
        v60Var.a = 0L;
        c60Var.f = v60Var.b();
    }

    @Override // defpackage.u00
    public e89 apply(Object obj) {
        return (e89) ((nv4) this.b).invoke(obj);
    }

    @Override // defpackage.aj9
    public void c() {
        fj9 fj9Var = (fj9) this.b;
        ((l1c) fj9Var.a.b).setVisibility(8);
        if (fj9Var.c) {
            fj9Var.d = true;
        }
    }

    @Override // defpackage.p4a
    public void d(j4d j4dVar, i2a i2aVar) {
        ((qg4) this.b).accept(j4dVar);
    }

    @Override // defpackage.qbf
    public int e(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 3:
                int f = ((k79) ((FolderEditScreen) obj).f.F(i)).getF();
                int i3 = 536870911 & f;
                if (i3 == 32 || i3 == 64) {
                    return 0;
                }
                if ((536870912 & f) != 0) {
                    return 1;
                }
                if ((1073741824 & f) != 0) {
                    return 2;
                }
                return (f & Integer.MIN_VALUE) != 0 ? 3 : 4;
            default:
                return ((lva) ((k79) ((MessagesSettingsScreen) obj).h.F(i))).a();
        }
    }

    @Override // defpackage.jw0
    public long g(long j) {
        bx6 bx6Var = (bx6) this.b;
        return vqi.k((j * ((long) bx6Var.e)) / 1000000, 0L, bx6Var.j - 1);
    }

    @Override // com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider
    public String getDeviceId() {
        return ((FeatureManagerImpl) this.b).e.getDeviceIdBlocking();
    }

    @Override // com.vk.push.core.remote.config.omicron.segment.SegmentsProvider
    public Map getSegments() {
        Data data = ((Omicron) this.b).a.b;
        if (data != null) {
            return data.getSegments();
        }
        ore.k("init() must be called before any access to logic");
        return null;
    }

    @Override // defpackage.tm9
    public Object h(Object obj, Object obj2) {
        return j8f.f(new kzi(((f7b) this.b).f, obj, false), (List) ((Collection) obj2));
    }

    @Override // defpackage.u8j
    public void i(float f, View view) {
        xy7 xy7Var = (xy7) this.b;
        if (xy7Var.a.d()) {
            int i = xy7Var.u;
            float fK = 0.0f;
            if (i == 1 && f < 0.0f) {
                fK = -gm0.K(142.0f * yl5.d().getDisplayMetrics().density);
            } else if (i == 0 && f > 0.0f) {
                fK = gm0.K(142.0f * yl5.d().getDisplayMetrics().density);
            }
            view.setTranslationX(fK);
        }
    }

    @Override // defpackage.p48
    public void j(nof nofVar) {
        ((p48) this.b).j(nofVar);
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 21:
                return d3aVar.l(i2aVar, (c98) obj);
            default:
                p4a p4aVar = (p4a) obj;
                h88 h88Var = h88.b;
                if (!d3aVar.j()) {
                    p4aVar.d(d3aVar.t, i2aVar);
                    t4a.q0(d3aVar, i2aVar, i, new wmf(0));
                }
                return h88Var;
        }
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        boolean z;
        boolean z2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                umf umfVar = (umf) obj;
                if (jv9Var.isConnected() && jv9Var.k.isEmpty()) {
                    umf umfVar2 = jv9Var.q.c;
                    if (umfVar2.c < umfVar.c && gm0.d(umfVar, umfVar2)) {
                        jv9Var.q = jv9Var.q.i(umfVar);
                        break;
                    }
                }
                break;
            case 19:
                h3d h3dVar = (h3d) obj;
                iu9 iu9Var = jv9Var.a;
                if (jv9Var.isConnected() && !Objects.equals(jv9Var.y, h3dVar)) {
                    jv9Var.y = h3dVar;
                    h3d h3dVar2 = jv9Var.z;
                    h3d h3dVarY = jv9.Y(jv9Var.x, h3dVar);
                    jv9Var.z = h3dVarY;
                    if (h3dVarY.equals(h3dVar2)) {
                        z = false;
                        z2 = false;
                    } else {
                        ghe gheVar = jv9Var.u;
                        ghe gheVar2 = jv9Var.v;
                        ghe gheVarN0 = jv9.n0(jv9Var.t, jv9Var.s, jv9Var.w, jv9Var.z, jv9Var.I);
                        jv9Var.u = gheVarN0;
                        jv9Var.v = jv9.m0(gheVarN0, jv9Var.s, jv9Var.I, jv9Var.w, jv9Var.z);
                        ghe gheVar3 = jv9Var.u;
                        gheVar3.getClass();
                        z = !j8f.a(gheVar3, gheVar);
                        ghe gheVar4 = jv9Var.v;
                        gheVar4.getClass();
                        z2 = !j8f.a(gheVar4, gheVar2);
                        jv9Var.i.f(13, new tu9(jv9Var, 13));
                    }
                    if (z2) {
                        iu9Var.getClass();
                        lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                        iu9Var.e.getClass();
                    }
                    if (z) {
                        iu9Var.getClass();
                        lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                        iu9Var.e.o();
                    }
                }
                break;
            default:
                iu9 iu9Var2 = jv9Var.a;
                pmf pmfVar = (pmf) obj;
                if (jv9Var.isConnected()) {
                    iu9Var2.getClass();
                    lvb.b0(Looper.myLooper() == iu9Var2.f.getLooper());
                    iu9Var2.e.r(pmfVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n78
    public void n(o78 o78Var) {
        qwa qwaVar = (qwa) this.b;
        synchronized (qwaVar.a) {
            qwaVar.c++;
        }
        qwaVar.g(o78Var);
    }

    @Override // defpackage.zje
    public void o(long j, nmc nmcVar) {
        lkl.a(j, nmcVar, ((sb7) this.b).K);
    }

    @Override // defpackage.y58
    public void p() {
        ((i64) this.b).Q(sbi.a);
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                return ((GetOkIdByExternalId.Response.Companion) obj).parse(vu8Var);
            default:
                return ((GetSystemInfo.Companion) obj).parse(vu8Var);
        }
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        JoinChatWidget joinChatWidget = (JoinChatWidget) this.b;
        if (j8cVar == j8c.e) {
            try {
                joinChatWidget.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(np4.q(joinChatWidget.getContext(), R.string.oneme_faq_restricted_join_link))));
            } catch (ActivityNotFoundException e) {
                String name = JoinChatWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, qv1.k("error handleUrl faq for restricted user. Reason - ", e.getMessage()), e);
                }
            }
        }
    }

    public /* synthetic */ oo6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bg7, defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return (Void) ((os1) this.b).invoke(obj);
    }

    @Override // defpackage.gdd
    /* JADX INFO: renamed from: apply */
    public boolean mo28apply(Object obj) {
        return ((v71) obj).b((Uri) this.b);
    }
}
