package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.eu6;
import defpackage.mx8;
import defpackage.o75;
import defpackage.ou7;
import defpackage.ov6;
import defpackage.ph5;
import defpackage.pu7;
import defpackage.qu7;
import defpackage.u64;
import defpackage.v64;
import defpackage.wa5;
import defpackage.wh0;
import defpackage.x0e;
import defpackage.xe5;
import defpackage.xhc;
import defpackage.yl0;
import defpackage.za5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        u64 u64VarB = v64.b(xe5.class);
        u64VarB.a(new ph5(2, 0, wh0.class));
        u64VarB.f = new o75(10);
        arrayList.add(u64VarB.b());
        x0e x0eVar = new x0e(yl0.class, Executor.class);
        u64 u64Var = new u64(za5.class, new Class[]{pu7.class, qu7.class});
        u64Var.a(ph5.a(Context.class));
        u64Var.a(ph5.a(ov6.class));
        u64Var.a(new ph5(2, 0, ou7.class));
        u64Var.a(new ph5(1, 1, xe5.class));
        u64Var.a(new ph5(x0eVar, 1, 0));
        u64Var.f = new wa5(x0eVar, 0);
        arrayList.add(u64Var.b());
        arrayList.add(xhc.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(xhc.b("fire-core", "21.0.0"));
        arrayList.add(xhc.b("device-name", a(Build.PRODUCT)));
        arrayList.add(xhc.b("device-model", a(Build.DEVICE)));
        arrayList.add(xhc.b("device-brand", a(Build.BRAND)));
        arrayList.add(xhc.d("android-target-sdk", new eu6(1)));
        arrayList.add(xhc.d("android-min-sdk", new eu6(2)));
        arrayList.add(xhc.d("android-platform", new eu6(3)));
        arrayList.add(xhc.d("android-installer", new eu6(4)));
        try {
            mx8.b.getClass();
            str = "2.3.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(xhc.b("kotlin", str));
        }
        return arrayList;
    }
}
