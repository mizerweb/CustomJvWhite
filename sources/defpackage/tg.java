package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tg implements vm2 {
    public final zqh a;
    public final se2 b;
    public final i4h c;
    public final kc2 d;
    public final d5h e;

    public tg(zqh zqhVar, se2 se2Var, i4h i4hVar, kc2 kc2Var, d5h d5hVar) {
        this.a = zqhVar;
        this.b = se2Var;
        this.c = i4hVar;
        this.d = kc2Var;
        this.e = d5hVar;
    }

    @Override // defpackage.vm2
    public final um2 a(le2 le2Var, Map map, zm2 zm2Var) throws Exception {
        nb2 nb2VarA;
        se2 se2Var = this.b;
        if (se2Var.h != 2) {
            c.f(bjl.b(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
            return null;
        }
        Object obj = se2Var.g.get(mg2.a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            ore.k("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.b.d != null) {
            ore.k("Reprocessing is not supported for Extensions");
            return null;
        }
        qb2 qb2Var = (qb2) this.d.d(le2Var.Y());
        Set set = (Set) qb2Var.g.getValue();
        d5h d5hVar = this.e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            d5hVar.getClass();
            Log.w("CXCP", le2Var + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
        }
        if (this.b.e != null) {
            synchronized (qb2Var.f) {
                nb2VarA = (nb2) qb2Var.f.get(Integer.valueOf(iIntValue));
            }
            if (nb2VarA == null) {
                kc2 kc2Var = qb2Var.c;
                String str = qb2Var.a;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(zo5.h(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) ef2.b(str)) + "#awaitExtensionMetadata");
                    synchronized (kc2Var.g) {
                        nb2 nb2VarA2 = (nb2) kc2Var.g.get(str);
                        if (nb2VarA2 != null) {
                            nb2VarA = nb2VarA2;
                        } else if (kc2.c(kc2Var)) {
                            nb2VarA = kc2.a(kc2Var, str, true, iIntValue);
                        } else {
                            nb2VarA2 = kc2.a(kc2Var, str, false, iIntValue);
                            kc2Var.g.put(str, nb2VarA2);
                            nb2VarA = nb2VarA2;
                        }
                    }
                    Trace.endSection();
                    synchronized (qb2Var.f) {
                        qb2Var.f.put(Integer.valueOf(iIntValue), nb2VarA);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            d5h d5hVar2 = this.e;
            if (!((Boolean) nb2VarA.d.getValue()).booleanValue()) {
                d5hVar2.getClass();
                Log.w("CXCP", le2Var + " does not support Postview streams");
            }
            if (this.b.e.a.size() != 1) {
                ore.k("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        kjc kjcVarB = ikl.b(this.b, this.c, map);
        if (kjcVarB.a.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.b);
            zm2Var.b();
            return so2.e;
        }
        if (!kjcVarB.b.isEmpty()) {
            ore.k("Deferred output is not supported for Extensions");
            return null;
        }
        ci6 ci6Var = new ci6(zm2Var);
        ArrayList arrayList = kjcVarB.a;
        ww0 ww0Var = new ww0(this.a.a(), 1);
        se2 se2Var2 = this.b;
        if (le2Var.P(new bi6(arrayList, ww0Var, zm2Var, se2Var2.f, se2Var2.g, Integer.valueOf(iIntValue), ci6Var, kjcVarB.c))) {
            return new tm2(kjcVarB.b, kjcVarB.d);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + le2Var + " for " + zm2Var + '!');
        zm2Var.b();
        return so2.e;
    }
}
