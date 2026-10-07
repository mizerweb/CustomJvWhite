package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class av6 implements srb {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ av6(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    @Override // defpackage.srb
    public final void a(Object obj) {
        int i = this.a;
        DialogFragment dialogFragment = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) dialogFragment;
                Handler handler = fingerprintDialogFragment.K1;
                pi piVar = fingerprintDialogFragment.L1;
                handler.removeCallbacks(piVar);
                int iIntValue = num.intValue();
                if (fingerprintDialogFragment.P1 != null) {
                    int i2 = fingerprintDialogFragment.M1.v;
                    Context contextJ = fingerprintDialogFragment.j();
                    Drawable drawable = null;
                    if (contextJ == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i3 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i2 == 0 && iIntValue == 1) {
                            drawable = contextJ.getDrawable(i3);
                        } else {
                            if (i2 == 1 && iIntValue == 2) {
                                i3 = R.drawable.fingerprint_dialog_error;
                            } else if ((i2 == 2 && iIntValue == 1) || (i2 == 1 && iIntValue == 3)) {
                            }
                            drawable = contextJ.getDrawable(i3);
                        }
                    }
                    if (drawable != null) {
                        fingerprintDialogFragment.P1.setImageDrawable(drawable);
                        if ((i2 != 0 || iIntValue != 1) && ((i2 == 1 && iIntValue == 2) || (i2 == 2 && iIntValue == 1))) {
                            bv6.a(drawable);
                        }
                        fingerprintDialogFragment.M1.v = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = fingerprintDialogFragment.Q1;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.N1 : fingerprintDialogFragment.O1);
                }
                handler.postDelayed(piVar, 2000L);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) dialogFragment;
                Handler handler2 = fingerprintDialogFragment2.K1;
                pi piVar2 = fingerprintDialogFragment2.L1;
                handler2.removeCallbacks(piVar2);
                TextView textView2 = fingerprintDialogFragment2.Q1;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(piVar2, 2000L);
                return;
            default:
                if (((g19) obj) != null && dialogFragment.B1) {
                    throw new IllegalStateException(zo5.n("Fragment ", dialogFragment, " did not return a View from onCreateView() or this was called before onCreateView()."));
                }
                return;
        }
    }
}
