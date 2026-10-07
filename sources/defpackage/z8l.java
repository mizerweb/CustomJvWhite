package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: loaded from: classes.dex */
public final class z8l {
    public final i3m a;
    public final Context b;

    public z8l(i3m i3mVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = i3mVar;
        this.b = context;
    }

    public final kam a() {
        String packageName = this.b.getPackageName();
        ste steVar = i3m.e;
        i3m i3mVar = this.a;
        sbm sbmVar = i3mVar.a;
        if (sbmVar != null) {
            steVar.c("requestUpdateInfo(%s)", packageName);
            qjh qjhVar = new qjh();
            sbmVar.c(new asl(i3mVar, qjhVar, packageName, qjhVar), qjhVar);
            return qjhVar.a;
        }
        Object[] objArr = {-9};
        steVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", ste.d(steVar.b, "onError(%d)", objArr));
        }
        return gwl.d(new InstallException(-9));
    }
}
