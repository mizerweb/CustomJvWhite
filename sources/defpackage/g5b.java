package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class g5b extends hl8 {
    public final /* synthetic */ i5b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5b(i5b i5bVar, String[] strArr) {
        super(strArr);
        this.b = i5bVar;
    }

    @Override // defpackage.hl8
    public final void b(Set set) {
        i5b i5bVar = this.b;
        if (((AtomicBoolean) i5bVar.g).get()) {
            return;
        }
        try {
            k38 k38Var = (k38) i5bVar.h;
            if (k38Var != null) {
                k38Var.y(i5bVar.b, (String[]) set.toArray(new String[0]));
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot broadcast invalidation", e);
        }
    }
}
