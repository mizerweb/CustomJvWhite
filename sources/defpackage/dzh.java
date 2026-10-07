package defpackage;

import android.os.Bundle;
import com.google.firebase.datatransport.TransportRegistrar;
import java.net.DatagramSocket;
import java.security.cert.X509Certificate;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dzh implements mf7, k74, tg4, zjk, w5k {
    public static final dzh b = new dzh(2);
    public static final dzh c = new dzh(3);
    public static final dzh d = new dzh(4);
    public static final dzh e = new dzh(5);
    public static final dzh f = new dzh(6);
    public final /* synthetic */ int a;

    public /* synthetic */ dzh(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() throws bz {
        throw new bz();
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        g85 g85Var = (g85) h74Var;
        switch (this.a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(g85Var);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(g85Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(g85Var);
        }
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        u60 u60Var = u60.d;
        c60 c60Var = (c60) obj;
        switch (i) {
            case 11:
                c60Var.i = u60Var;
                break;
            default:
                if (c60Var.c().h) {
                    u60Var = u60.a;
                }
                c60Var.i = u60Var;
                break;
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 0:
                ezh ezhVar = (ezh) obj;
                ezhVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBundle(ezh.f, ezhVar.b.d());
                bundle.putIntArray(ezh.g, ezhVar.d);
                bundle.putBooleanArray(ezh.h, ezhVar.e);
                bundle.putBoolean(ezh.i, ezhVar.c);
                return bundle;
            default:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(ezh.f);
                bundle3.getClass();
                hyh hyhVarA = hyh.a(bundle3);
                int[] intArray = bundle2.getIntArray(ezh.g);
                int i = hyhVarA.a;
                int[] iArr = new int[i];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle2.getBooleanArray(ezh.h);
                boolean[] zArr = new boolean[i];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new ezh(hyhVarA, bundle2.getBoolean(ezh.i, false), intArray, booleanArray);
        }
    }

    public void b(q2i q2iVar, r2i r2iVar, boolean z) {
        switch (this.a) {
            case 2:
                q2iVar.f(r2iVar);
                break;
            case 3:
                q2iVar.c(r2iVar);
                break;
            case 4:
                q2iVar.e(r2iVar);
                break;
            case 5:
                q2iVar.b();
                break;
            default:
                q2iVar.d();
                break;
        }
    }

    @Override // defpackage.w5k
    public DatagramSocket createSocket() {
        return new DatagramSocket();
    }

    @Override // defpackage.zjk
    public boolean verify(String str, X509Certificate x509Certificate) {
        return true;
    }
}
