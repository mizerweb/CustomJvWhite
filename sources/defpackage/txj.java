package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class txj implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ txj(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s28 v6mVar;
        switch (this.a) {
            case 0:
                ((i19) this.b).f((uxj) this.c);
                return;
            case 1:
                q4g q4gVar = (q4g) this.c;
                y3e y3eVar = q4gVar.b;
                StringBuilder sb = new StringBuilder("<!> send retry -> ");
                cak cakVar = (cak) this.b;
                sb.append(cakVar);
                y3eVar.log("OKSignaling", sb.toString());
                q4gVar.g.send(cakVar.a);
                return;
            case 2:
                dlk dlkVar = (dlk) this.c;
                ulk ulkVar = (ulk) this.b;
                le4 le4Var = ulkVar.b;
                if (le4Var.b == 0) {
                    cmk cmkVar = ulkVar.c;
                    yab.s(cmkVar);
                    le4 le4Var2 = cmkVar.c;
                    if (le4Var2.b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(le4Var2)), new Exception());
                        dlkVar.j.f(le4Var2);
                        dlkVar.i.m();
                        return;
                    }
                    mkc mkcVar = dlkVar.j;
                    IBinder iBinder = cmkVar.b;
                    if (iBinder == null) {
                        v6mVar = null;
                    } else {
                        int i = i5.d;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        v6mVar = iInterfaceQueryLocalInterface instanceof s28 ? (s28) iInterfaceQueryLocalInterface : new v6m(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = dlkVar.g;
                    mkcVar.getClass();
                    if (v6mVar == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        mkcVar.f(new le4(4, null, null));
                    } else {
                        mkcVar.d = v6mVar;
                        mkcVar.e = set;
                        if (mkcVar.a) {
                            ((fo) mkcVar.b).e(v6mVar, set);
                        }
                    }
                } else {
                    dlkVar.j.f(le4Var);
                }
                dlkVar.i.m();
                return;
            case 3:
                ixk ixkVar = (ixk) this.c;
                kam kamVar = ixkVar.d;
                try {
                    Task task = (Task) ixkVar.c.h((Task) this.b);
                    if (task == null) {
                        ixkVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    rg rgVar = vjh.b;
                    task.e(rgVar, ixkVar);
                    task.d(rgVar, ixkVar);
                    task.a(rgVar, ixkVar);
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        kamVar.n((Exception) e.getCause());
                        return;
                    } else {
                        kamVar.n(e);
                        return;
                    }
                } catch (Exception e2) {
                    kamVar.n(e2);
                    return;
                }
            case 4:
                synchronized (((ecl) this.c).c) {
                    ((otb) ((ecl) this.c).d).j((Task) this.b);
                    break;
                }
                return;
            case 5:
                azl azlVar = (azl) this.b;
                int i2 = ((g3m) this.c).a;
                synchronized (azlVar) {
                    g3m g3mVar = (g3m) azlVar.e.get(i2);
                    if (g3mVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i2);
                        azlVar.e.remove(i2);
                        g3mVar.b(new zzt("Timed out waiting for response", null));
                        azlVar.c();
                    }
                    break;
                }
                return;
            default:
                kam kamVar2 = (kam) this.b;
                try {
                    kamVar2.o(((Callable) this.c).call());
                    return;
                } catch (Exception e3) {
                    kamVar2.n(e3);
                    return;
                } catch (Throwable th) {
                    kamVar2.n(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ txj(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
