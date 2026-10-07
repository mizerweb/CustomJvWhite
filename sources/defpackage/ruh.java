package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ruh implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ruh(izi iziVar, izi iziVar2, oxi oxiVar) {
        this.a = 2;
        this.b = iziVar2;
        this.c = oxiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s28 s28Var;
        int i = 0;
        switch (this.a) {
            case 0:
                e89 e89Var = (e89) this.b;
                boolean zIsCancelled = e89Var.isCancelled();
                ek2 ek2Var = (ek2) this.c;
                if (zIsCancelled) {
                    ek2Var.n(null);
                    return;
                }
                try {
                    ek2Var.resumeWith(y3.n(e89Var));
                    return;
                } catch (ExecutionException e) {
                    ek2Var.resumeWith(new poe(e.getCause()));
                    return;
                }
            case 1:
                cyb cybVar = (cyb) this.b;
                ScrollView scrollView = (ScrollView) this.c;
                ViewGroup.LayoutParams layoutParams = cybVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), cybVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                return;
            case 2:
                izi iziVar = (izi) this.b;
                if (iziVar.g.d) {
                    return;
                }
                izi.k0(iziVar, (oxi) this.c, true);
                return;
            case 3:
                ((i19) this.b).a((uxj) this.c);
                return;
            case 4:
                le4 le4Var = (le4) this.b;
                mkc mkcVar = (mkc) this.c;
                fo foVar = (fo) mkcVar.b;
                skk skkVar = (skk) ((jo7) mkcVar.f).j.get((jp) mkcVar.c);
                if (skkVar == null) {
                    return;
                }
                if (le4Var.b != 0) {
                    skkVar.l(le4Var, null);
                    return;
                }
                mkcVar.a = true;
                if (foVar.d()) {
                    if (!mkcVar.a || (s28Var = (s28) mkcVar.d) == null) {
                        return;
                    }
                    foVar.e(s28Var, (Set) mkcVar.e);
                    return;
                }
                try {
                    foVar.e(null, foVar.f());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    foVar.a("Failed to get service from broker.");
                    skkVar.l(new le4(10, null, null), null);
                    return;
                }
            case 5:
                boolean z = ((kam) ((Task) this.b)).d;
                ixk ixkVar = (ixk) this.c;
                if (z) {
                    ixkVar.d.p();
                    return;
                }
                try {
                    ((ixk) this.c).d.o(ixkVar.c.h((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e3) {
                    boolean z2 = e3.getCause() instanceof Exception;
                    kam kamVar = ((ixk) this.c).d;
                    if (z2) {
                        kamVar.n((Exception) e3.getCause());
                        return;
                    } else {
                        kamVar.n(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((ixk) this.c).d.n(e4);
                    return;
                }
            case 6:
                azl azlVar = (azl) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (azlVar) {
                    if (iBinder == null) {
                        azlVar.a("Null service connection");
                    } else {
                        try {
                            azlVar.c = new ewe(iBinder);
                            azlVar.a = 2;
                            ((ScheduledExecutorService) azlVar.f.d).execute(new oil(azlVar, i));
                        } catch (RemoteException e5) {
                            azlVar.a(e5.getMessage());
                        }
                    }
                }
                return;
            case 7:
                synchronized (((ecl) this.c).c) {
                    ((cub) ((ecl) this.c).d).a(((Task) this.b).h());
                    break;
                }
                return;
            default:
                ecl eclVar = (ecl) this.c;
                kam kamVar2 = (kam) eclVar.d;
                try {
                    Task taskI = ((j8h) eclVar.c).i(((Task) this.b).h());
                    if (taskI == null) {
                        kamVar2.n(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    rg rgVar = vjh.b;
                    taskI.e(rgVar, eclVar);
                    taskI.d(rgVar, eclVar);
                    taskI.a(rgVar, eclVar);
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        eclVar.onFailure((Exception) e6.getCause());
                        return;
                    } else {
                        kamVar2.n(e6);
                        return;
                    }
                } catch (CancellationException unused) {
                    eclVar.c();
                    return;
                } catch (Exception e7) {
                    kamVar2.n(e7);
                    return;
                }
        }
    }

    public /* synthetic */ ruh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ruh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
