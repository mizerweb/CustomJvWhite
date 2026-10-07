package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dx0 {
    public hb7 a;

    public final void a(r6a r6aVar, cx0 cx0Var) {
        hb7 hb7Var = this.a;
        if (hb7Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (hb7Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        hb7 hb7Var2 = this.a;
        BiometricFragment biometricFragment = (BiometricFragment) hb7Var2.E("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = new BiometricFragment();
            tl0 tl0Var = new tl0(hb7Var2);
            tl0Var.e(0, biometricFragment, "androidx.biometric.BiometricFragment");
            tl0Var.d(true);
            hb7Var2.A(true);
            Iterator it = hb7Var2.e().iterator();
            while (it.hasNext()) {
                ((vd5) it.next()).f();
            }
        }
        b bVarH = biometricFragment.h();
        if (bVarH == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        BiometricViewModel biometricViewModel = biometricFragment.v1;
        biometricViewModel.c = r6aVar;
        if (Build.VERSION.SDK_INT >= 30 || cx0Var != null) {
            biometricViewModel.d = cx0Var;
        } else {
            biometricViewModel.d = xpl.a();
        }
        boolean zS = biometricFragment.S();
        BiometricViewModel biometricViewModel2 = biometricFragment.v1;
        if (zS) {
            biometricViewModel2.h = biometricFragment.m(R.string.confirm_device_credential_password);
        } else {
            biometricViewModel2.h = null;
        }
        if (biometricFragment.S() && new dc9(new ax0(bVarH, 0)).y(255) != 0) {
            biometricFragment.v1.k = true;
            biometricFragment.U();
        } else if (biometricFragment.v1.m) {
            biometricFragment.u1.postDelayed(new xw0(biometricFragment), 600L);
        } else {
            biometricFragment.Z();
        }
    }
}
