package defpackage;

import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import one.me.android.MainActivity;
import one.me.android.root.RootController;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qy8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                as6 as6Var = new as6((File) obj5, (bs6) obj4, (cs6) obj3, (ds6) obj2);
                ((cf7) obj).invoke(as6Var);
                return as6Var;
            case 1:
                wje wjeVar = (wje) obj5;
                wfe wfeVar = (wfe) obj4;
                Handler handler = (Handler) obj3;
                fbc fbcVar = (fbc) obj2;
                ldc ldcVar = (ldc) obj;
                t3a t3aVar = wjeVar.d;
                if (t3aVar == null) {
                    t3aVar = null;
                }
                gvb gvbVar = wjeVar.e;
                if (gvbVar == null) {
                    gvbVar = null;
                }
                uje ujeVar = new uje(t3aVar, gvbVar, wjeVar.getLooper(), new g3(29, wfeVar), new x5(handler, 27, fbcVar), new ol(handler, 15, fbcVar));
                wjeVar.f.put(ldcVar, ujeVar);
                wjeVar.g.add(ujeVar.h);
                f2d f2dVar = ujeVar.h;
                f2dVar.getClass();
                f2dVar.f = new u6g();
                handler.post(new o90(fbcVar, 21, wfeVar));
                return sbiVar;
            default:
                MainActivity mainActivity = (MainActivity) obj5;
                RootController rootController = (RootController) obj4;
                qzb qzbVar = (qzb) obj3;
                x5 x5Var = (x5) obj2;
                Bundle bundle = (Bundle) obj;
                if (mainActivity.B) {
                    sb8.e(rootController, qzbVar, mainActivity.getIntent());
                    x5Var.invoke();
                }
                sb8.N(mainActivity, qzbVar, mainActivity.getIntent(), bundle == null);
                return sbiVar;
        }
    }
}
