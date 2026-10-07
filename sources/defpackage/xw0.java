package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class xw0 implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public xw0(BiometricViewModel biometricViewModel, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(biometricViewModel);
                break;
            default:
                this.b = new WeakReference(biometricViewModel);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((BiometricFragment) weakReference.get()).Z();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).m = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).n = false;
                }
                break;
        }
    }

    public xw0(BiometricFragment biometricFragment) {
        this.a = 0;
        this.b = new WeakReference(biometricFragment);
    }
}
