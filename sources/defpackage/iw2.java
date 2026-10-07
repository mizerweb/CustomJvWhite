package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iw2 implements tg4, r89, rv9, qg4, en7, v7, g5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw2(int i, ghe gheVar) {
        this.a = 3;
        this.b = i;
        this.c = gheVar;
    }

    @Override // defpackage.en7
    public void a(fn7 fn7Var, dn7 dn7Var, long j) {
        n7b n7bVar = (n7b) this.c;
        int i = this.b;
        g55.a();
        df5 df5Var = n7bVar.p;
        df5Var.getClass();
        ex3 ex3Var = n7bVar.b;
        synchronized (df5Var) {
            try {
                lvb.b0(vqi.l(df5Var.f, i));
                cf5 cf5Var = (cf5) df5Var.f.get(i);
                lvb.b0(!cf5Var.b);
                lvb.Z("HDR input is not supported.", !ex3.h(ex3Var));
                if (df5Var.l == null) {
                    df5Var.l = ex3Var;
                }
                lvb.Z("Mixing different ColorInfos is not supported.", df5Var.l.equals(ex3Var));
                osh oshVar = new osh(dn7Var, j);
                df5Var.k.getClass();
                cf5Var.a.add(new bf5(fn7Var, oshVar, new lui()));
                if (i == df5Var.o) {
                    df5Var.c();
                } else {
                    df5Var.d(cf5Var);
                }
                df5Var.e.q(new ye5(df5Var, 2), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        e09 e09VarB;
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tw2 tw2Var = (tw2) obj;
                ((qw2) obj2).getClass();
                tw2Var.m = i2;
                if (i2 == 0) {
                    tw2Var.O = false;
                    tw2Var.P = false;
                }
                break;
            default:
                i2a i2aVar = (i2a) obj2;
                try {
                    e09VarB = (e09) ((e89) obj).get();
                    lvb.W(e09VarB, "LibraryResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    lvb.H0("MediaSessionStub", "Library operation failed", e);
                    e09VarB = e09.b(-1);
                } catch (CancellationException e2) {
                    lvb.H0("MediaSessionStub", "Library operation cancelled", e2);
                    e09VarB = e09.b(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    lvb.H0("MediaSessionStub", "Library operation failed", e);
                    e09VarB = e09.b(-1);
                }
                try {
                    h2a h2aVar = i2aVar.d;
                    h2aVar.getClass();
                    h2aVar.e(i2, e09VarB);
                } catch (RemoteException e4) {
                    lvb.H0("MediaSessionStub", "Failed to send result to browser " + i2aVar, e4);
                }
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((j3d) obj).y0(((r2d) this.c).a, this.b);
                break;
            default:
                ((j3d) obj).S((ry9) this.c, this.b);
                break;
        }
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        int i = this.a;
        im5 im5Var = im5.a;
        Object obj = this.c;
        int i2 = this.b;
        switch (i) {
            case 3:
                c98 c98Var = (c98) obj;
                if (jv9Var.isConnected()) {
                    ghe gheVar = jv9Var.u;
                    ghe gheVar2 = jv9Var.v;
                    jv9Var.t = c98.n(c98Var);
                    ghe gheVarN0 = jv9.n0(c98Var, jv9Var.s, jv9Var.w, jv9Var.z, jv9Var.I);
                    jv9Var.u = gheVarN0;
                    jv9Var.v = jv9.m0(gheVarN0, jv9Var.s, jv9Var.I, jv9Var.w, jv9Var.z);
                    ghe gheVar3 = jv9Var.u;
                    gheVar3.getClass();
                    boolean zA = j8f.a(gheVar3, gheVar);
                    ghe gheVar4 = jv9Var.v;
                    gheVar4.getClass();
                    j8f.a(gheVar4, gheVar2);
                    iu9 iu9Var = jv9Var.a;
                    iu9Var.getClass();
                    lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                    gu9 gu9Var = iu9Var.e;
                    gu9Var.getClass();
                    h88 h88VarP = gu9.p();
                    if (!zA) {
                        gu9Var.o();
                    }
                    h88VarP.b(new uc2(jv9Var, h88VarP, i2, 8), im5Var);
                    break;
                }
                break;
            default:
                emf emfVar = (emf) obj;
                iu9 iu9Var2 = jv9Var.a;
                if (jv9Var.isConnected()) {
                    iu9Var2.getClass();
                    lvb.b0(Looper.myLooper() == iu9Var2.f.getLooper());
                    h88 h88VarU = iu9Var2.e.u(emfVar);
                    h88VarU.b(new uc2(jv9Var, h88VarU, i2, 8), im5Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.v7
    public void run() {
        ((SharedPreferences) ((xdd) this.c).c.getValue()).edit().putInt("estimatedPerformanceIndex", this.b).apply();
    }

    @Override // defpackage.g5
    public boolean z(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
        int i = this.b;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(zo5.w(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.s(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.p.get();
        ai aiVar = new ai(sideSheetBehavior, i, 21);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = i7j.a;
            if (view2.isAttachedToWindow()) {
                view2.post(aiVar);
                return true;
            }
        }
        aiVar.run();
        return true;
    }

    public /* synthetic */ iw2(int i, emf emfVar, Bundle bundle) {
        this.a = 4;
        this.b = i;
        this.c = emfVar;
    }

    public /* synthetic */ iw2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
