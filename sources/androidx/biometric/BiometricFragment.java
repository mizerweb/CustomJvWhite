package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import defpackage.b8j;
import defpackage.bx0;
import defpackage.cx0;
import defpackage.d1f;
import defpackage.ev6;
import defpackage.f8j;
import defpackage.fv6;
import defpackage.fx0;
import defpackage.fx8;
import defpackage.g8b;
import defpackage.glc;
import defpackage.gwl;
import defpackage.gx0;
import defpackage.h8j;
import defpackage.hx0;
import defpackage.ih;
import defpackage.ik2;
import defpackage.khb;
import defpackage.n11;
import defpackage.ng7;
import defpackage.ore;
import defpackage.qe0;
import defpackage.qw0;
import defpackage.r6a;
import defpackage.rw0;
import defpackage.sr3;
import defpackage.sw0;
import defpackage.tl0;
import defpackage.tw0;
import defpackage.uw0;
import defpackage.vn7;
import defpackage.vw0;
import defpackage.ww0;
import defpackage.x7b;
import defpackage.xpl;
import defpackage.xtj;
import defpackage.xw0;
import defpackage.zcl;
import defpackage.zfe;
import java.security.Signature;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class BiometricFragment extends a {
    public final Handler u1 = new Handler(Looper.getMainLooper());
    public BiometricViewModel v1;

    @Override // androidx.fragment.app.a
    public final void I() {
        this.G = true;
        if (Build.VERSION.SDK_INT == 29 && zcl.b(this.v1.c())) {
            BiometricViewModel biometricViewModel = this.v1;
            biometricViewModel.n = true;
            this.u1.postDelayed(new xw0(biometricViewModel, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.a
    public final void J() {
        this.G = true;
        if (Build.VERSION.SDK_INT >= 29 || this.v1.l) {
            return;
        }
        b bVarH = h();
        if (bVarH == null || !bVarH.isChangingConfigurations()) {
            P(0);
        }
    }

    public final void P(int i) {
        if (i == 3 || !this.v1.n) {
            if (T()) {
                this.v1.i = i;
                if (i == 1) {
                    W(10, gwl.f(j(), 10));
                }
            }
            BiometricViewModel biometricViewModel = this.v1;
            if (biometricViewModel.f == null) {
                biometricViewModel.f = new ih(10);
            }
            ih ihVar = biometricViewModel.f;
            CancellationSignal cancellationSignal = (CancellationSignal) ihVar.a;
            if (cancellationSignal != null) {
                try {
                    ik2.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                ihVar.a = null;
            }
            n11 n11Var = (n11) ihVar.b;
            if (n11Var != null) {
                try {
                    n11Var.a();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                ihVar.b = null;
            }
        }
    }

    public final void Q() {
        this.v1.j = false;
        R();
        if (!this.v1.l && p()) {
            tl0 tl0Var = new tl0(l());
            tl0Var.g(this);
            tl0Var.d(true);
        }
        Context contextJ = j();
        if (contextJ != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextJ.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        BiometricViewModel biometricViewModel = this.v1;
                        biometricViewModel.m = true;
                        this.u1.postDelayed(new xw0(biometricViewModel, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void R() {
        this.v1.j = false;
        if (p()) {
            c cVarL = l();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) cVarL.E("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.p()) {
                    fingerprintDialogFragment.P(false);
                    return;
                }
                tl0 tl0Var = new tl0(cVarL);
                tl0Var.g(fingerprintDialogFragment);
                tl0Var.d(true);
            }
        }
    }

    public final boolean S() {
        return Build.VERSION.SDK_INT <= 28 && zcl.b(this.v1.c());
    }

    public final boolean T() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            b bVarH = h();
            if (bVarH != null && this.v1.d != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    if (str != null) {
                        for (String str3 : bVarH.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (!str.equalsIgnoreCase(str3)) {
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : bVarH.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context contextJ = j();
            return contextJ == null || contextJ.getPackageManager() == null || !glc.a(contextJ.getPackageManager());
        }
        return true;
    }

    public final void U() {
        b bVarH = h();
        if (bVarH == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = fx8.a(bVarH);
        if (keyguardManagerA == null) {
            V(12, m(R.string.generic_error_no_keyguard));
            return;
        }
        BiometricViewModel biometricViewModel = this.v1;
        r6a r6aVar = biometricViewModel.c;
        CharSequence charSequence = r6aVar != null ? (CharSequence) r6aVar.a : null;
        biometricViewModel.getClass();
        r6a r6aVar2 = this.v1.c;
        Intent intentA = sw0.a(keyguardManagerA, charSequence, r6aVar2 != null ? (CharSequence) r6aVar2.b : null);
        if (intentA == null) {
            V(14, m(R.string.generic_error_no_device_credential));
            return;
        }
        this.v1.l = true;
        if (T()) {
            R();
        }
        intentA.setFlags(134742016);
        O(intentA, 1, null);
    }

    public final void V(int i, CharSequence charSequence) {
        W(i, charSequence);
        Q();
    }

    public final void W(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.v1;
        if (biometricViewModel.l) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!biometricViewModel.k) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            biometricViewModel.k = false;
            new Handler(Looper.getMainLooper()).post(new qw0(this, i, charSequence));
        }
    }

    public final void X(bx0 bx0Var) {
        BiometricViewModel biometricViewModel = this.v1;
        if (biometricViewModel.k) {
            biometricViewModel.k = false;
            new Handler(Looper.getMainLooper()).post(new ng7((Object) this, (Object) bx0Var, false, 3));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        Q();
    }

    public final void Y(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = m(R.string.default_error_msg);
        }
        this.v1.f(2);
        this.v1.e(charSequence);
    }

    public final void Z() {
        int i;
        xtj xtjVar;
        if (this.v1.j) {
            return;
        }
        if (j() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        BiometricViewModel biometricViewModel = this.v1;
        biometricViewModel.j = true;
        biometricViewModel.k = true;
        CharSequence charSequence = null;
        CancellationSignal cancellationSignal = null;
        if (!T()) {
            BiometricPrompt.Builder builderD = tw0.d(L().getApplicationContext());
            BiometricViewModel biometricViewModel2 = this.v1;
            r6a r6aVar = biometricViewModel2.c;
            CharSequence charSequence2 = r6aVar != null ? (CharSequence) r6aVar.a : null;
            biometricViewModel2.getClass();
            r6a r6aVar2 = this.v1.c;
            CharSequence charSequence3 = r6aVar2 != null ? (CharSequence) r6aVar2.b : null;
            if (charSequence2 != null) {
                tw0.g(builderD, charSequence2);
            }
            if (charSequence3 != null) {
                tw0.e(builderD, charSequence3);
            }
            BiometricViewModel biometricViewModel3 = this.v1;
            String str = biometricViewModel3.h;
            if (str != null) {
                charSequence = str;
            } else {
                r6a r6aVar3 = biometricViewModel3.c;
                if (r6aVar3 != null && (charSequence = (CharSequence) r6aVar3.c) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.v1.getClass();
                gx0 gx0Var = new gx0(0);
                BiometricViewModel biometricViewModel4 = this.v1;
                if (biometricViewModel4.g == null) {
                    biometricViewModel4.g = new hx0(biometricViewModel4);
                }
                tw0.f(builderD, charSequence, gx0Var, biometricViewModel4.g);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                r6a r6aVar4 = this.v1.c;
                uw0.a(builderD, true);
            }
            int iC = this.v1.c();
            if (i2 >= 30) {
                vw0.a(builderD, iC);
            } else if (i2 >= 29) {
                uw0.b(builderD, zcl.b(iC));
            }
            BiometricPrompt biometricPromptC = tw0.c(builderD);
            Context contextJ = j();
            BiometricPrompt.CryptoObject cryptoObjectF = xpl.f(this.v1.d);
            BiometricViewModel biometricViewModel5 = this.v1;
            if (biometricViewModel5.f == null) {
                biometricViewModel5.f = new ih(10);
            }
            ih ihVar = biometricViewModel5.f;
            if (((CancellationSignal) ihVar.a) == null) {
                ihVar.a = ik2.b();
            }
            CancellationSignal cancellationSignal2 = (CancellationSignal) ihVar.a;
            ww0 ww0Var = new ww0(0);
            BiometricViewModel biometricViewModel6 = this.v1;
            if (biometricViewModel6.e == null) {
                biometricViewModel6.e = new r6a(new fx0(biometricViewModel6));
            }
            r6a r6aVar5 = biometricViewModel6.e;
            if (((BiometricPrompt$AuthenticationCallback) r6aVar5.a) == null) {
                r6aVar5.a = qe0.a((fx0) r6aVar5.c);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) r6aVar5.a;
            try {
                if (cryptoObjectF == null) {
                    tw0.b(biometricPromptC, cancellationSignal2, ww0Var, biometricPrompt$AuthenticationCallback);
                } else {
                    tw0.a(biometricPromptC, cryptoObjectF, cancellationSignal2, ww0Var, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                V(1, contextJ != null ? contextJ.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = L().getApplicationContext();
        FingerprintManager fingerprintManagerC = fv6.c(applicationContext);
        if (fingerprintManagerC == null || !fv6.e(fingerprintManagerC)) {
            i = 12;
        } else {
            FingerprintManager fingerprintManagerC2 = fv6.c(applicationContext);
            i = (fingerprintManagerC2 == null || !fv6.d(fingerprintManagerC2)) ? 11 : 0;
        }
        if (i != 0) {
            V(i, gwl.f(applicationContext, i));
            return;
        }
        if (p()) {
            this.v1.t = true;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT != 28 || str2 == null) {
                this.u1.postDelayed(new qw0(this, 2), 500L);
                FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
                c cVarL = l();
                fingerprintDialogFragment.H1 = false;
                fingerprintDialogFragment.I1 = true;
                tl0 tl0Var = new tl0(cVarL);
                tl0Var.o = true;
                tl0Var.e(0, fingerprintDialogFragment, "androidx.biometric.FingerprintDialogFragment");
                tl0Var.d(false);
                break;
            }
            String[] stringArray = applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
            int length = stringArray.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    this.u1.postDelayed(new qw0(this, 2), 500L);
                    FingerprintDialogFragment fingerprintDialogFragment2 = new FingerprintDialogFragment();
                    c cVarL2 = l();
                    fingerprintDialogFragment2.H1 = false;
                    fingerprintDialogFragment2.I1 = true;
                    tl0 tl0Var2 = new tl0(cVarL2);
                    tl0Var2.o = true;
                    tl0Var2.e(0, fingerprintDialogFragment2, "androidx.biometric.FingerprintDialogFragment");
                    tl0Var2.d(false);
                    break;
                }
                if (str2.startsWith(stringArray[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            BiometricViewModel biometricViewModel7 = this.v1;
            biometricViewModel7.i = 0;
            cx0 cx0Var = biometricViewModel7.d;
            if (cx0Var != null) {
                Cipher cipher = cx0Var.b;
                if (cipher != null) {
                    xtjVar = new xtj(cipher);
                } else {
                    Signature signature = cx0Var.a;
                    if (signature != null) {
                        xtjVar = new xtj(signature);
                    } else {
                        Mac mac = cx0Var.c;
                        if (mac != null) {
                            xtjVar = new xtj(mac);
                        } else {
                            if (Build.VERSION.SDK_INT >= 30 && cx0Var.d != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            }
                            xtjVar = null;
                        }
                    }
                }
            } else {
                xtjVar = null;
            }
            BiometricViewModel biometricViewModel8 = this.v1;
            if (biometricViewModel8.f == null) {
                biometricViewModel8.f = new ih(10);
            }
            ih ihVar2 = biometricViewModel8.f;
            int i4 = 3;
            if (((n11) ihVar2.b) == null) {
                ihVar2.b = new n11(i4);
            }
            n11 n11Var = (n11) ihVar2.b;
            BiometricViewModel biometricViewModel9 = this.v1;
            if (biometricViewModel9.e == null) {
                biometricViewModel9.e = new r6a(new fx0(biometricViewModel9));
            }
            r6a r6aVar6 = biometricViewModel9.e;
            if (((vn7) r6aVar6.b) == null) {
                r6aVar6.b = new vn7(i4, r6aVar6);
            }
            vn7 vn7Var = (vn7) r6aVar6.b;
            if (n11Var != null) {
                try {
                    synchronized (n11Var) {
                        try {
                            if (((CancellationSignal) n11Var.c) == null) {
                                CancellationSignal cancellationSignal3 = new CancellationSignal();
                                n11Var.c = cancellationSignal3;
                                if (n11Var.b) {
                                    cancellationSignal3.cancel();
                                }
                            }
                            cancellationSignal = (CancellationSignal) n11Var.c;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    V(1, gwl.f(applicationContext, 1));
                    return;
                }
            }
            FingerprintManager fingerprintManagerC3 = fv6.c(applicationContext);
            if (fingerprintManagerC3 != null) {
                fv6.a(fingerprintManagerC3, fv6.g(xtjVar), cancellationSignal, new ev6(vn7Var));
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        if (i == 1) {
            this.v1.l = false;
            if (i2 == -1) {
                X(new bx0(null, 1));
            } else {
                V(10, m(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void v(Bundle bundle) {
        b8j b8jVarA;
        super.v(bundle);
        if (h() == null) {
            return;
        }
        b bVarH = h();
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
        this.v1 = biometricViewModel;
        if (biometricViewModel.o == null) {
            biometricViewModel.o = new g8b();
        }
        biometricViewModel.o.e(this, new rw0(this, 0));
        BiometricViewModel biometricViewModel2 = this.v1;
        if (biometricViewModel2.p == null) {
            biometricViewModel2.p = new g8b();
        }
        biometricViewModel2.p.e(this, new rw0(this, 1));
        BiometricViewModel biometricViewModel3 = this.v1;
        if (biometricViewModel3.q == null) {
            biometricViewModel3.q = new g8b();
        }
        biometricViewModel3.q.e(this, new rw0(this, 2));
        BiometricViewModel biometricViewModel4 = this.v1;
        if (biometricViewModel4.r == null) {
            biometricViewModel4.r = new g8b();
        }
        biometricViewModel4.r.e(this, new rw0(this, 3));
        BiometricViewModel biometricViewModel5 = this.v1;
        if (biometricViewModel5.s == null) {
            biometricViewModel5.s = new g8b();
        }
        biometricViewModel5.s.e(this, new rw0(this, 4));
        BiometricViewModel biometricViewModel6 = this.v1;
        if (biometricViewModel6.u == null) {
            biometricViewModel6.u = new g8b();
        }
        biometricViewModel6.u.e(this, new rw0(this, 5));
    }
}
