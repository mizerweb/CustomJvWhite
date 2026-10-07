package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hv9 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ jv9 b;

    public hv9(jv9 jv9Var, Bundle bundle) {
        this.b = jv9Var;
        this.a = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        iu9 iu9Var = this.b.a;
        Objects.requireNonNull(iu9Var);
        iu9Var.S(new e6(21, iu9Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e6 e6Var;
        g38 f38Var;
        jv9 jv9Var = this.b;
        xnf xnfVar = jv9Var.e;
        iu9 iu9Var = jv9Var.a;
        int i = 21;
        try {
            try {
                if (xnfVar.a.getPackageName().equals(componentName.getPackageName())) {
                    int i2 = x3a.f;
                    if (iBinder == null) {
                        f38Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
                        f38Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g38)) ? new f38(iBinder) : (g38) iInterfaceQueryLocalInterface;
                    }
                    if (f38Var != null) {
                        String packageName = jv9Var.d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.a;
                        iu9Var.getClass();
                        f38Var.c0(jv9Var.c, new ke4(packageName, iMyPid, bundle).b());
                        return;
                    }
                    lvb.k0("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(iu9Var);
                    e6Var = new e6(i, iu9Var);
                } else {
                    lvb.k0("MCImplBase", "Expected connection to " + xnfVar.a.getPackageName() + " but is connected to " + componentName);
                    Objects.requireNonNull(iu9Var);
                    e6Var = new e6(i, iu9Var);
                }
            } catch (RemoteException unused) {
                lvb.G0("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(iu9Var);
                e6Var = new e6(i, iu9Var);
            }
            iu9Var.S(e6Var);
        } catch (Throwable th) {
            Objects.requireNonNull(iu9Var);
            iu9Var.S(new e6(i, iu9Var));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        iu9 iu9Var = this.b.a;
        Objects.requireNonNull(iu9Var);
        iu9Var.S(new e6(21, iu9Var));
    }
}
