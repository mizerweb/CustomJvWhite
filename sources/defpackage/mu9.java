package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class mu9 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final u2a e;

    public mu9(Context context, u2a u2aVar) {
        this.e = u2aVar;
        MediaController mediaController = new MediaController(context, u2aVar.b);
        this.a = mediaController;
        if (u2aVar.a() == null) {
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new lu9(this));
        }
    }

    public final void a() {
        d38 d38VarA = this.e.a();
        if (d38VarA == null) {
            return;
        }
        ArrayList<nv9> arrayList = this.c;
        for (nv9 nv9Var : arrayList) {
            ju9 ju9Var = new ju9(nv9Var);
            this.d.put(nv9Var, ju9Var);
            nv9Var.c = ju9Var;
            try {
                d38VarA.d0(ju9Var);
                nv9Var.c(13, null);
            } catch (RemoteException | SecurityException e) {
                lvb.l0("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(nv9 nv9Var) {
        MediaController mediaController = this.a;
        ku9 ku9Var = nv9Var.a;
        ku9Var.getClass();
        mediaController.unregisterCallback(ku9Var);
        synchronized (this.b) {
            d38 d38VarA = this.e.a();
            if (d38VarA != null) {
                try {
                    ju9 ju9Var = (ju9) this.d.remove(nv9Var);
                    if (ju9Var != null) {
                        nv9Var.c = null;
                        d38VarA.Y(ju9Var);
                    }
                } catch (RemoteException | SecurityException e) {
                    lvb.l0("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(nv9Var);
            }
        }
    }
}
