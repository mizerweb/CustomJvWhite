package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.b;
import defpackage.av6;
import defpackage.b8j;
import defpackage.cv6;
import defpackage.d1f;
import defpackage.f8j;
import defpackage.g8b;
import defpackage.h8j;
import defpackage.hf;
import defpackage.hx0;
import defpackage.khb;
import defpackage.mf;
import defpackage.nf;
import defpackage.ore;
import defpackage.pi;
import defpackage.r6a;
import defpackage.sr3;
import defpackage.x7b;
import defpackage.zcl;
import defpackage.zfe;
import java.util.LinkedHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public final Handler K1 = new Handler(Looper.getMainLooper());
    public final pi L1 = new pi(17, this);
    public BiometricViewModel M1;
    public int N1;
    public int O1;
    public ImageView P1;
    public TextView Q1;

    @Override // androidx.fragment.app.a
    public final void D() {
        this.G = true;
        this.K1.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.a
    public final void G() {
        this.G = true;
        BiometricViewModel biometricViewModel = this.M1;
        biometricViewModel.v = 0;
        biometricViewModel.f(1);
        this.M1.e(m(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog Q() {
        mf mfVar = new mf(L());
        r6a r6aVar = this.M1.c;
        CharSequence charSequenceM = null;
        CharSequence charSequence = r6aVar != null ? (CharSequence) r6aVar.a : null;
        hf hfVar = (hf) mfVar.c;
        hfVar.d = charSequence;
        View viewInflate = LayoutInflater.from(hfVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.M1.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            r6a r6aVar2 = this.M1.c;
            CharSequence charSequence2 = r6aVar2 != null ? (CharSequence) r6aVar2.b : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence2);
            }
        }
        this.P1 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.Q1 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (zcl.b(this.M1.c())) {
            charSequenceM = m(R.string.confirm_device_credential_password);
        } else {
            BiometricViewModel biometricViewModel = this.M1;
            String str = biometricViewModel.h;
            if (str != null) {
                charSequenceM = str;
            } else {
                r6a r6aVar3 = biometricViewModel.c;
                if (r6aVar3 != null && (charSequenceM = (CharSequence) r6aVar3.c) == null) {
                    charSequenceM = "";
                }
            }
        }
        hx0 hx0Var = new hx0(this);
        hfVar.f = charSequenceM;
        hfVar.g = hx0Var;
        hfVar.k = viewInflate;
        nf nfVarD = mfVar.d();
        nfVarD.setCanceledOnTouchOutside(false);
        return nfVarD;
    }

    public final int R(int i) {
        Context contextJ = j();
        b bVarH = h();
        if (contextJ == null || bVarH == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextJ.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = bVarH.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        BiometricViewModel biometricViewModel = this.M1;
        if (biometricViewModel.u == null) {
            biometricViewModel.u = new g8b();
        }
        BiometricViewModel.h(biometricViewModel.u, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void v(Bundle bundle) {
        b8j b8jVarA;
        super.v(bundle);
        b bVarH = h();
        if (bVarH != null) {
            h8j h8jVarB = bVarH.b();
            f8j f8jVarK = bVarH.k();
            x7b x7bVarE = bVarH.e();
            LinkedHashMap linkedHashMap = h8jVarB.a;
            sr3 sr3VarA = zfe.a(BiometricViewModel.class);
            String strG = sr3VarA.g();
            if (strG == null) {
                ore.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG);
            b8j b8jVar = (b8j) linkedHashMap.get(strConcat);
            if (!sr3VarA.i(b8jVar)) {
                x7b x7bVar = new x7b(x7bVarE);
                x7bVar.o(khb.n, strConcat);
                try {
                    try {
                        b8jVarA = f8jVarK.c(sr3VarA, x7bVar);
                    } catch (AbstractMethodError unused) {
                        b8jVarA = f8jVarK.b(sr3VarA.d(), x7bVar);
                    }
                } catch (AbstractMethodError unused2) {
                    b8jVarA = f8jVarK.a(sr3VarA.d());
                }
                b8jVar = b8jVarA;
                b8j b8jVar2 = (b8j) linkedHashMap.put(strConcat, b8jVar);
                if (b8jVar2 != null) {
                    b8jVar2.a();
                }
            } else if (f8jVarK instanceof d1f) {
                ((d1f) f8jVarK).e(b8jVar);
            }
            BiometricViewModel biometricViewModel = (BiometricViewModel) b8jVar;
            this.M1 = biometricViewModel;
            if (biometricViewModel.w == null) {
                biometricViewModel.w = new g8b();
            }
            biometricViewModel.w.e(this, new av6(this, 0));
            BiometricViewModel biometricViewModel2 = this.M1;
            if (biometricViewModel2.x == null) {
                biometricViewModel2.x = new g8b();
            }
            biometricViewModel2.x.e(this, new av6(this, 1));
        }
        this.N1 = R(cv6.a());
        this.O1 = R(android.R.attr.textColorSecondary);
    }
}
