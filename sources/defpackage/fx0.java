package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fx0 extends se0 {
    public final WeakReference a;

    public fx0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    @Override // defpackage.se0
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((BiometricViewModel) weakReference.get()).l || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        ((BiometricViewModel) weakReference.get()).d(new pw0(i, charSequence));
    }

    @Override // defpackage.se0
    public final void b(bx0 bx0Var) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        int i = -1;
        if (bx0Var.b == -1) {
            cx0 cx0Var = bx0Var.a;
            int iC = ((BiometricViewModel) weakReference.get()).c();
            if ((iC & 32767) != 0 && !zcl.b(iC)) {
                i = 2;
            }
            bx0Var = new bx0(cx0Var, i);
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.o == null) {
            biometricViewModel.o = new g8b();
        }
        BiometricViewModel.h(biometricViewModel.o, bx0Var);
    }
}
