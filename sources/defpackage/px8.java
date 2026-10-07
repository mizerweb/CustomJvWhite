package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* JADX INFO: loaded from: classes3.dex */
public final class px8 implements zab, OmicronEnvironment, wkc, sf7, ujc, t32, zjk, qx5 {
    public px8() {
        new ifh(new yvg(6));
        new ifh(new yvg(7));
    }

    public static int g(oba obaVar, int i) {
        int i2 = eba.$EnumSwitchMapping$0[obaVar.ordinal()];
        if (i2 == 1) {
            return -1;
        }
        if (i2 != 2) {
            return i;
        }
        return -2;
    }

    public static boolean i(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[PHI: r10
  0x0021: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:18:0x0031, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x007a A[RETURN] */
    public static boolean j(int i, int i2, long j, boolean z, boolean z2, hw5 hw5Var) {
        long j2;
        long j3;
        boolean zI = i(i, z2);
        if (zI) {
            Log.d("CXCP", "shouldRetry: Active resume mode is activated");
        }
        if (zI) {
            j2 = 1800000000000L;
            if (hw5Var != null) {
                j3 = hw5Var.a;
                if (hw5.a(1800000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        } else {
            j2 = 10000000000L;
            if (hw5Var != null) {
                j3 = hw5Var.a;
                if (hw5.a(10000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        }
        if (hw5.a(j, j2) <= 0) {
            if (i == 0) {
                if (i2 <= 1) {
                    return true;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (!z || i2 <= 1) {
                            }
                        } else if (i != 4 && i != 5 && i != 6 && i != 7) {
                            if (i == 8) {
                                if (i2 <= 1) {
                                }
                            } else if (i != 10) {
                                if (i != 11) {
                                    Log.e("CXCP", "Unexpected CameraError: " + ipe.i);
                                    return false;
                                }
                                if (i2 <= 1) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 || i2 <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ujc
    public i1m a(xr6 xr6Var) {
        return new i1m(xr6Var);
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        xgc xgcVar = (xgc) obj;
        return new ffd(xgcVar.b() ? (ConversationParams) xgcVar.a() : null, c76.a);
    }

    @Override // defpackage.zab
    public boolean b(String str) {
        return SoLoader.l(0, str);
    }

    @Override // defpackage.wkc
    public double c(double d, double d2, double d3, boolean z) {
        return 1.0d;
    }

    @Override // defpackage.wkc
    public void d(double d) {
    }

    @Override // defpackage.qx5
    public td0 e(Context context, String str, px5 px5Var) {
        td0 td0Var = new td0();
        int iA = px5Var.a(context, str, true);
        td0Var.c = iA;
        if (iA != 0) {
            td0Var.d = 1;
            return td0Var;
        }
        int iF = px5Var.f(context, str);
        td0Var.b = iF;
        if (iF != 0) {
            td0Var.d = -1;
        }
        return td0Var;
    }

    @Override // defpackage.t32
    public void f(String str) {
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "ALPHA";
    }

    @Override // defpackage.wkc
    public void reset() {
    }

    @Override // defpackage.zjk
    public boolean verify(String str, X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null ? false : subjectAlternativeNames.stream().filter(new kck(11)).map(new lbk(17)).anyMatch(new ub8(this, str))) {
                return true;
            }
            return Arrays.stream(x509Certificate.getSubjectDN().getName().split(",")).map(new lbk(18)).filter(new kck(12)).map(new lbk(19)).allMatch(new ub8(str, 4));
        } catch (CertificateParsingException unused) {
            return false;
        }
    }

    public px8(String str) {
        String str2 = rb8.u;
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public /* synthetic */ px8(boolean z) {
    }
}
