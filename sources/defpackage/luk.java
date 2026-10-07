package defpackage;

import android.app.Application;
import android.content.pm.PackageInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class luk {
    public static final PackageInfo e(Application application) {
        return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
    }

    public abstract long a();

    public abstract List b();

    public abstract q24 c();

    public abstract boolean d();

    public abstract long f();
}
