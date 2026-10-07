package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class qw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public qw0(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.a = 0;
        this.b = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BiometricFragment biometricFragment = this.b;
        switch (i) {
            case 0:
                BiometricViewModel biometricViewModel = biometricFragment.v1;
                if (biometricViewModel.b == null) {
                    biometricViewModel.b = new ex0();
                }
                biometricViewModel.b.a();
                break;
            case 1:
                BiometricViewModel biometricViewModel2 = biometricFragment.v1;
                if (biometricViewModel2.b == null) {
                    biometricViewModel2.b = new ex0();
                }
                biometricViewModel2.b.b();
                break;
            default:
                biometricFragment.v1.t = false;
                break;
        }
    }

    public /* synthetic */ qw0(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }
}
