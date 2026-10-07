package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class y05 implements vwd {
    public final z05 a;
    public final int b;

    public y05(z05 z05Var, int i) {
        this.a = z05Var;
        this.b = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map mapSingletonMap;
        String string;
        lb2 lb2Var = null;
        byte b = 0;
        byte b2 = 0;
        z05 z05Var = this.a;
        int i = this.b;
        switch (i) {
            case 0:
                return new qg2((vo8) z05Var.d.get());
            case 1:
                return vd7.a();
            case 2:
                return new me2((qc2) z05Var.w.get());
            case 3:
                hg2 hg2Var = (hg2) z05Var.a.b;
                y05 y05Var = z05Var.v;
                Context contextA = z05Var.a();
                zqh zqhVar = (zqh) z05Var.f.get();
                qg2 qg2Var = (qg2) z05Var.e.get();
                vn7 vn7Var = hg2Var.d;
                vn7Var.getClass();
                Map map = (Map) vn7Var.b;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    ya2 ya2Var = (ya2) y05Var.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    if (map.containsKey(new pc2(str))) {
                        c.p(pc2.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                        return null;
                    }
                    pc2 pc2Var = new pc2(str);
                    rg2 rg2Var = new rg2(ya2Var);
                    if (map.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(pc2Var, rg2Var);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(pc2Var, rg2Var);
                        mapSingletonMap = linkedHashMap;
                    }
                    if (mapSingletonMap.containsKey(new pc2(str))) {
                        return new qc2("CXCP-Camera2", mapSingletonMap, contextA, zqhVar, qg2Var);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) pc2.a("CXCP-Camera2"));
                    qr7.n(sb, " in the list of available CameraPipe backends! Available values are ", mapSingletonMap.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                zqh zqhVar2 = (zqh) z05Var.f.get();
                dc2 dc2Var = (dc2) z05Var.k.get();
                kc2 kc2Var = (kc2) z05Var.n.get();
                txd txdVar = (txd) z05Var.u.get();
                i1m i1mVar = new i1m(z05Var);
                z05Var.a();
                return new ya2(zqhVar2, dc2Var, kc2Var, txdVar, i1mVar);
            case 5:
                c70 c70Var = z05Var.b;
                qg2 qg2Var2 = (qg2) z05Var.e.get();
                vo8 vo8Var = (vo8) z05Var.d.get();
                int i2 = c70Var.d;
                ArrayList arrayList = new ArrayList();
                ((jg2) c70Var.e).getClass();
                ThreadFactory threadFactory = bi.b;
                ScheduledExecutorService scheduledExecutorServiceA = bi.a(new yh(i2, new zh(threadFactory, "CXCP-IO-", gvk.b(0))), 8);
                arrayList.add(scheduledExecutorServiceA);
                xt4 xt4VarM = ch3.m(scheduledExecutorServiceA);
                ScheduledExecutorService scheduledExecutorServiceA2 = bi.a(new yh(i2, new zh(threadFactory, "CXCP-BG-", gvk.b(0))), c70Var.b);
                arrayList.add(scheduledExecutorServiceA2);
                xt4 xt4VarM2 = ch3.m(scheduledExecutorServiceA2);
                ScheduledExecutorService scheduledExecutorServiceA3 = bi.a(new yh(c70Var.c, new zh(threadFactory, "CXCP-", gvk.b(0))), c70Var.a);
                arrayList.add(scheduledExecutorServiceA3);
                xt4 xt4VarM3 = ch3.m(scheduledExecutorServiceA3);
                qg2Var2.a(new ci(5, arrayList), 3);
                iqh iqhVar = new iqh(c70Var, qg2Var2, b == true ? 1 : 0);
                iqh iqhVar2 = new iqh(c70Var, qg2Var2, 1);
                wfe wfeVar = new wfe();
                wfe wfeVar2 = new wfe();
                wfeVar.a = cqk.a(lvb.x0(new nah(vo8Var), xt4VarM3).u0(new du4("CXCP")));
                wfeVar2.a = cqk.a(lvb.x0(new nah(vo8Var), new du4("CXCP-Dispatch")));
                qg2Var2.a(new ewg(wfeVar, 9, wfeVar2), 2);
                return new zqh((gu4) wfeVar.a, (gu4) wfeVar2.a, scheduledExecutorServiceA, xt4VarM, scheduledExecutorServiceA2, xt4VarM2, scheduledExecutorServiceA3, xt4VarM3, iqhVar, iqhVar2);
            case 6:
                vwd vwdVar = z05Var.g;
                zqh zqhVar3 = (zqh) z05Var.f.get();
                z05Var.a();
                return new dc2(vwdVar, zqhVar3, (PackageManager) z05Var.h.get(), (ic2) z05Var.i.get(), z05Var.j, (qg2) z05Var.e.get(), (vo8) z05Var.d.get());
            case 7:
                CameraManager cameraManager = (CameraManager) z05Var.a().getSystemService("camera");
                n1g.l(cameraManager);
                return cameraManager;
            case 8:
                return z05Var.a().getPackageManager();
            case 9:
                return new ic2();
            case 10:
                Context contextA2 = z05Var.a();
                ke2 ke2Var = new ke2();
                if (Build.VERSION.SDK_INT >= 35) {
                    ke2Var.b = new lb2(contextA2);
                }
                try {
                    ServiceInfo[] serviceInfoArr = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ore.k("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                lb2Var = (lb2) Class.forName(str2).getConstructor(Context.class).newInstance(contextA2);
                            } catch (Exception e) {
                                ore.l("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                ke2Var.a = lb2Var;
                return ke2Var;
            case 11:
                Context contextA3 = z05Var.a();
                zqh zqhVar4 = (zqh) z05Var.f.get();
                xsc xscVar = (xsc) z05Var.l.get();
                kzi kziVar = ((hg2) z05Var.a.b).c;
                n1g.l(kziVar);
                return new kc2(contextA3, zqhVar4, xscVar, kziVar, (jgh) z05Var.m.get());
            case 12:
                return new xsc(z05Var.a());
            case 13:
                return new jgh();
            case 14:
                return new txd((ipe) z05Var.s.get(), (gc2) z05Var.t.get(), (ic2) z05Var.i.get(), (zqh) z05Var.f.get());
            case 15:
                vwd vwdVar2 = z05Var.g;
                zo7 zo7Var = z05Var.a;
                kzi kziVar2 = new kzi(vwdVar2, (zqh) z05Var.f.get(), b2 == true ? 1 : 0);
                kc2 kc2Var2 = (kc2) z05Var.n.get();
                ic2 ic2Var = (ic2) z05Var.i.get();
                lc2 lc2Var = (lc2) z05Var.p.get();
                jgh jghVar = (jgh) z05Var.m.get();
                gg2 gg2Var = ((hg2) zo7Var.b).e;
                n1g.l(gg2Var);
                d0c d0cVar = new d0c(kziVar2, kc2Var2, ic2Var, lc2Var, jghVar, gg2Var, (zqh) z05Var.f.get());
                ic2 ic2Var2 = (ic2) z05Var.i.get();
                ljf ljfVar = new ljf(z05Var.g, (zqh) z05Var.f.get(), (vo8) z05Var.d.get());
                jgh jghVar2 = (jgh) z05Var.m.get();
                qg qgVar = (qg) z05Var.q.get();
                pb0 pb0Var = (pb0) z05Var.r.get();
                gg2 gg2Var2 = ((hg2) zo7Var.b).e;
                n1g.l(gg2Var2);
                return new ipe(d0cVar, ic2Var2, ljfVar, jghVar2, qgVar, pb0Var, gg2Var2, (zqh) z05Var.f.get());
            case 16:
                return new lc2((kc2) z05Var.n.get(), (d5h) z05Var.o.get());
            case 17:
                n1g.l(((hg2) z05Var.a.b).f);
                return new d5h();
            case 18:
                return new qg((DevicePolicyManager) z05Var.a().getSystemService("device_policy"));
            case 19:
                return new pb0((zqh) z05Var.f.get(), (qg2) z05Var.e.get(), (vo8) z05Var.d.get());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new gc2((zqh) z05Var.f.get(), (lc2) z05Var.p.get(), (ipe) z05Var.s.get());
            case 21:
                z05Var.a();
                return new sg2();
            case 22:
                return new fi2();
            case 23:
                return new q94();
            default:
                throw new AssertionError(i);
        }
    }
}
