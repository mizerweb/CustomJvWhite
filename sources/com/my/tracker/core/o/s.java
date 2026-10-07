package com.my.tracker.core.o;

import android.app.Application;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.core.EnginePrefs;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    private final d a;
    private final m b;
    private final w c;
    private final z d;
    private final f e;
    private final j f;
    private final u g;

    private s(Application application, EnginePrefs enginePrefs) {
        this.a = new d(application, enginePrefs);
        this.b = new m(application);
        this.e = new f(enginePrefs);
        this.c = new w(application);
        this.d = new z(application);
        this.g = new u(application, enginePrefs);
        this.f = new j(application);
    }

    public r a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z) {
        y yVarA;
        v vVarA;
        t tVarA;
        c cVarB = this.a.b();
        l lVarA = this.b.a();
        e eVarA = this.e.a(installedPackagesProvider);
        if (z) {
            vVarA = null;
            yVarA = null;
            tVarA = null;
        } else {
            yVarA = this.d.a();
            vVarA = this.c.a();
            tVarA = this.g.a();
        }
        return new r(cVarB, lVarA, vVarA, yVarA, eVarA, this.f.a(), tVarA);
    }

    public static s a(Application application, EnginePrefs enginePrefs) {
        return new s(application, enginePrefs);
    }
}
