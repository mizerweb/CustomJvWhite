package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ce7 implements uba, ComponentCallbacks2 {
    public final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();

    public ce7(Context context) {
        context.registerComponentCallbacks(this);
    }

    @Override // defpackage.uba
    public final void a(sba sbaVar) {
        this.a.add(sbaVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qba qbaVar;
        String name = ce7.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                int size = this.a.size();
                String strZ1 = ww3.z1(this.a, null, null, null, null, 63);
                StringBuilder sbP = qv1.p("onTrimMemory level=", i, ", trimmables=", size, "|");
                sbP.append(strZ1);
                a4cVar.c(je9Var, name, sbP.toString(), null);
            }
        }
        if (i == 5 || i == 10 || i == 15) {
            qbaVar = qba.OnCloseToDalvikHeapLimit;
        } else if (i == 20 || i == 40) {
            qbaVar = qba.OnAppBackgrounded;
        } else {
            qbaVar = (i == 60 || i == 80) ? qba.OnSystemLowMemoryWhileAppInBackgroundLowSeverity : null;
        }
        if (qbaVar == null) {
            gm0.x(ce7.class.getName(), "ignore onTrimMemory", null);
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sba) it.next()).e(qbaVar);
        }
    }
}
