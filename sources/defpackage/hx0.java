package defpackage;

import android.content.DialogInterface;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.FingerprintDialogFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hx0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public hx0(BiometricViewModel biometricViewModel) {
        this.b = new WeakReference(biometricViewModel);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).g(true);
                }
                break;
            default:
                ((FingerprintDialogFragment) obj).M1.g(true);
                break;
        }
    }

    public hx0(FingerprintDialogFragment fingerprintDialogFragment) {
        this.b = fingerprintDialogFragment;
    }
}
