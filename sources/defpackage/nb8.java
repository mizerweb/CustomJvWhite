package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class nb8 implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ ek2 a;

    public nb8(ek2 ek2Var) {
        this.a = ek2Var;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) throws IllegalAccessException, DispatchException, InvocationTargetException {
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.j(sbi.a, mb8.b);
        }
    }
}
