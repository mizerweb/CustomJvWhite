package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ye9 extends n1g {
    public final int g;

    public ye9(int i) {
        this.g = i;
    }

    @Override // defpackage.n1g
    public final void J(String str, String str2) {
        if (this.g <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // defpackage.n1g
    public final void K(String str, String str2, CancellationException cancellationException) {
        if (this.g <= 4) {
            Log.i(str, str2, cancellationException);
        }
    }

    @Override // defpackage.n1g
    public final void h0(String str) {
        if (this.g <= 2) {
            Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
        }
    }

    @Override // defpackage.n1g
    public final void j0(String str, String str2) {
        if (this.g <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // defpackage.n1g
    public final void k0(String str, String str2, RuntimeException runtimeException) {
        if (this.g <= 5) {
            Log.w(str, str2, runtimeException);
        }
    }

    @Override // defpackage.n1g
    public final void p(String str, String str2) {
        if (this.g <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.n1g
    public final void q(String str, String str2, Throwable th) {
        if (this.g <= 3) {
            Log.d(str, str2, th);
        }
    }

    @Override // defpackage.n1g
    public final void s(String str, String str2) {
        if (this.g <= 6) {
            Log.e(str, str2);
        }
    }

    @Override // defpackage.n1g
    public final void t(String str, String str2, Throwable th) {
        if (this.g <= 6) {
            Log.e(str, str2, th);
        }
    }
}
