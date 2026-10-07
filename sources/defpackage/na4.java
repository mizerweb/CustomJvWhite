package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class na4 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pa4 pa4Var = (pa4) obj2;
                int iDiff = configuration.diff(pa4Var.c);
                pa4Var.c = new Configuration(configuration);
                Context context = (Context) obj;
                pa4Var.a.forEach(new ma4(0, new la4(iDiff, 0, context)));
                pa4Var.b.forEach(new ma4(1, new la4(iDiff, 1, context)));
                break;
            default:
                int i2 = configuration.orientation;
                ufe ufeVar = (ufe) obj2;
                if (i2 != ufeVar.a && i2 != 0) {
                    ufeVar.a = i2;
                    WeakHashMap weakHashMap = i7j.a;
                    w6j.c((View) obj);
                    break;
                }
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        int i = this.a;
    }
}
