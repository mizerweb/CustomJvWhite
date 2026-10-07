package defpackage;

import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class dk9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk9(MainActivity mainActivity, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mainActivity;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                dk9 dk9Var = new dk9(mainActivity, lq4Var, 0);
                dk9Var.f = obj;
                return dk9Var;
            default:
                dk9 dk9Var2 = new dk9(mainActivity, lq4Var, 1);
                dk9Var2.f = obj;
                return dk9Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((dk9) create((Boolean) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((dk9) create((Uri) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) this.f;
                ch3.d0(obj);
                MainActivity mainActivity = this.g;
                gm0.n(mainActivity.y, "got event for applySecureFlag");
                wk8.d(mainActivity.getWindow(), !bool.booleanValue());
                return sbi.a;
            default:
                Uri uri = (Uri) this.f;
                ch3.d0(obj);
                MainActivity mainActivity2 = this.g;
                int i = MainActivity.o1;
                mainActivity2.J = null;
                sgg sggVar = mainActivity2.K;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                mainActivity2.K = null;
                String name = MainActivity.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.l(uri, "handle mytracker link "), null);
                    }
                }
                return ((d59) this.g.z.getAccessor().c(1117)).B(uri);
        }
    }
}
