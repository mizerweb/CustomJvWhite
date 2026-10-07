package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rw0 implements srb {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ rw0(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b A[LOOP:0: B:96:0x0160->B:100:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:101:0x016e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:117:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x0129  */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x0135  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x017c, please report this as an issue */
    @Override // defpackage.srb
    public final void a(Object obj) {
        BiometricViewModel biometricViewModel;
        Context contextJ;
        String str;
        String[] stringArray;
        int length;
        int i;
        int i2;
        int i3 = this.a;
        int i4 = 0;
        CharSequence charSequenceM = null;
        BiometricFragment biometricFragment = this.b;
        switch (i3) {
            case 0:
                bx0 bx0Var = (bx0) obj;
                if (bx0Var != null) {
                    biometricFragment.X(bx0Var);
                    BiometricViewModel biometricViewModel2 = biometricFragment.v1;
                    if (biometricViewModel2.o == null) {
                        biometricViewModel2.o = new g8b();
                    }
                    BiometricViewModel.h(biometricViewModel2.o, null);
                }
                break;
            case 1:
                pw0 pw0Var = (pw0) obj;
                if (pw0Var != null) {
                    int i5 = pw0Var.a;
                    CharSequence charSequenceF = pw0Var.b;
                    switch (i5) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i5 = 8;
                            break;
                    }
                    Context contextJ2 = biometricFragment.j();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 < 29 && ((i5 == 7 || i5 == 9) && contextJ2 != null)) {
                        KeyguardManager keyguardManagerA = fx8.a(contextJ2);
                        if ((keyguardManagerA == null ? false : fx8.b(keyguardManagerA)) && zcl.b(biometricFragment.v1.c())) {
                            biometricFragment.U();
                        } else if (biometricFragment.T()) {
                            if (charSequenceF == null) {
                                charSequenceF = gwl.f(biometricFragment.j(), i5);
                            }
                            biometricViewModel = biometricFragment.v1;
                            if (i5 == 5) {
                                i2 = biometricViewModel.i;
                                if (i2 != 0) {
                                    biometricFragment.W(i5, charSequenceF);
                                } else {
                                    biometricFragment.W(i5, charSequenceF);
                                }
                                biometricFragment.Q();
                            } else {
                                if (biometricViewModel.t) {
                                    biometricFragment.V(i5, charSequenceF);
                                } else {
                                    biometricFragment.Y(charSequenceF);
                                    Handler handler = biometricFragment.u1;
                                    xs xsVar = new xs(biometricFragment, i5, charSequenceF, 1);
                                    contextJ = biometricFragment.j();
                                    if (contextJ != null) {
                                        str = Build.MODEL;
                                        if (i6 == 28) {
                                            i4 = 2000;
                                        } else {
                                            stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                            length = stringArray.length;
                                            i = 0;
                                            while (true) {
                                                if (i < length) {
                                                    i4 = 2000;
                                                } else if (str.startsWith(stringArray[i])) {
                                                    i++;
                                                }
                                            }
                                        }
                                    } else {
                                        i4 = 2000;
                                    }
                                    handler.postDelayed(xsVar, i4);
                                }
                                biometricFragment.v1.t = true;
                            }
                        } else {
                            if (charSequenceF == null) {
                                charSequenceF = biometricFragment.m(R.string.default_error_msg) + " " + i5;
                            }
                            biometricFragment.V(i5, charSequenceF);
                        }
                    } else if (biometricFragment.T()) {
                        if (charSequenceF == null) {
                            charSequenceF = gwl.f(biometricFragment.j(), i5);
                        }
                        biometricViewModel = biometricFragment.v1;
                        if (i5 == 5) {
                            i2 = biometricViewModel.i;
                            if (i2 != 0 || i2 == 3) {
                                biometricFragment.W(i5, charSequenceF);
                            }
                            biometricFragment.Q();
                        } else {
                            if (biometricViewModel.t) {
                                biometricFragment.V(i5, charSequenceF);
                            } else {
                                biometricFragment.Y(charSequenceF);
                                Handler handler2 = biometricFragment.u1;
                                xs xsVar2 = new xs(biometricFragment, i5, charSequenceF, 1);
                                contextJ = biometricFragment.j();
                                if (contextJ != null) {
                                    str = Build.MODEL;
                                    if (i6 == 28 || str == null) {
                                        i4 = 2000;
                                    } else {
                                        stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        length = stringArray.length;
                                        i = 0;
                                        while (true) {
                                            if (i < length) {
                                                i4 = 2000;
                                            } else if (str.startsWith(stringArray[i])) {
                                                i++;
                                            }
                                        }
                                    }
                                } else {
                                    i4 = 2000;
                                }
                                handler2.postDelayed(xsVar2, i4);
                            }
                            biometricFragment.v1.t = true;
                        }
                    } else {
                        if (charSequenceF == null) {
                            charSequenceF = biometricFragment.m(R.string.default_error_msg) + " " + i5;
                        }
                        biometricFragment.V(i5, charSequenceF);
                    }
                    biometricFragment.v1.d(null);
                }
                break;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (biometricFragment.T()) {
                        biometricFragment.Y(charSequence);
                    }
                    biometricFragment.v1.d(null);
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    if (biometricFragment.T()) {
                        biometricFragment.Y(biometricFragment.m(R.string.fingerprint_not_recognized));
                    }
                    if (biometricFragment.v1.k) {
                        new Handler(Looper.getMainLooper()).post(new qw0(biometricFragment, 1));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    BiometricViewModel biometricViewModel3 = biometricFragment.v1;
                    if (biometricViewModel3.r == null) {
                        biometricViewModel3.r = new g8b();
                    }
                    BiometricViewModel.h(biometricViewModel3.r, Boolean.FALSE);
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    if (biometricFragment.S()) {
                        biometricFragment.U();
                    } else {
                        BiometricViewModel biometricViewModel4 = biometricFragment.v1;
                        String str2 = biometricViewModel4.h;
                        if (str2 != null) {
                            charSequenceM = str2;
                        } else {
                            r6a r6aVar = biometricViewModel4.c;
                            if (r6aVar != null && (charSequenceM = (CharSequence) r6aVar.c) == null) {
                                charSequenceM = "";
                            }
                        }
                        if (charSequenceM == null) {
                            charSequenceM = biometricFragment.m(R.string.default_error_msg);
                        }
                        biometricFragment.V(13, charSequenceM);
                        biometricFragment.P(2);
                    }
                    biometricFragment.v1.g(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    biometricFragment.P(1);
                    biometricFragment.Q();
                    BiometricViewModel biometricViewModel5 = biometricFragment.v1;
                    if (biometricViewModel5.u == null) {
                        biometricViewModel5.u = new g8b();
                    }
                    BiometricViewModel.h(biometricViewModel5.u, Boolean.FALSE);
                }
                break;
        }
    }
}
