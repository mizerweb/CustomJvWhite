package defpackage;

import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.auth.AuthorizedResult;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.masterhost.MasterHost;
import com.vk.push.core.push.RegisterForPushesResult;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ei6 extends ux8 implements qf7 {
    public static final ei6 b = new ei6(2, 0);
    public static final ei6 c = new ei6(2, 1);
    public static final ei6 d = new ei6(2, 2);
    public static final ei6 e = new ei6(2, 3);
    public static final ei6 f = new ei6(2, 4);
    public static final ei6 g = new ei6(2, 5);
    public static final ei6 h = new ei6(2, 6);
    public static final ei6 i = new ei6(2, 7);
    public static final ei6 j = new ei6(2, 8);
    public static final ei6 k = new ei6(2, 9);
    public static final ei6 l = new ei6(2, 10);
    public static final ei6 m = new ei6(2, 11);
    public static final ei6 n = new ei6(2, 12);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei6(int i2, int i3) {
        super(i2);
        this.a = i3;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws RemoteException {
        String str;
        String str2;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        switch (i2) {
            case 0:
                return sbiVar;
            case 1:
                return sbiVar;
            case 2:
                ExtensionsKt.setPushToken((Map) obj, ((m4k) obj2).a);
                return sbiVar;
            case 3:
                ((MasterElections) obj).getMaster((AsyncCallback) obj2);
                return sbiVar;
            case 4:
                return new roe(((MasterHost) ((AidlResult) obj).getData()).getMaster());
            case 5:
                Map map = (Map) obj;
                a4k a4kVar = (a4k) obj2;
                map.put("master_package_name", a4kVar.a);
                ExtensionsKt.set((Map<String, String>) map, "is_from_arbiter", a4kVar.b);
                return sbiVar;
            case 6:
                Map map2 = (Map) obj;
                Throwable th = (Throwable) obj2;
                if (th instanceof k6k) {
                    k6k k6kVar = (k6k) th;
                    if (k6kVar instanceof d6k) {
                        str = "master_not_saved";
                    } else if (k6kVar instanceof e6k) {
                        map2.put("installed_hosts", ww3.z1(((e6k) th).a, ",", null, null, null, 62));
                        str = "no_hosts_from_api_received";
                    } else if (k6kVar instanceof f6k) {
                        f6k f6kVar = (f6k) th;
                        map2.put("master", f6kVar.a);
                        map2.put("installed_hosts", ww3.z1(f6kVar.b, ",", null, null, null, 62));
                        str = "no_master_in_hosts_list";
                    } else if (k6kVar instanceof g6k) {
                        str = "no_master_installed";
                    } else {
                        if (!(k6kVar instanceof h6k)) {
                            ore.o();
                            return null;
                        }
                        h6k h6kVar = (h6k) th;
                        map2.put("arbiter", h6kVar.a);
                        Throwable th2 = h6kVar.b;
                        if (th2 != null) {
                            ExtensionsKt.setErrorMessage(map2, "arbiter_response", th2);
                        }
                        str = "no_response_from_arbiter";
                    }
                    map2.put("reason", str);
                }
                return sbiVar;
            case 7:
                ((Auth) obj).getIntermediateToken((AsyncCallback) obj2);
                return sbiVar;
            case 8:
                return new roe(((AuthTokenResult) ((AidlResult) obj).getData()).getToken());
            case 9:
                return new roe(new n4k((RegisterForPushesResult) ((AidlResult) obj).getData(), (AppInfo) obj2));
            case 10:
                ((Auth) obj).isUserAuthorized((AsyncCallback) obj2);
                return sbiVar;
            case 11:
                return new roe(Boolean.valueOf(((AuthorizedResult) ((AidlResult) obj).getData()).isAuthorized()));
            default:
                Map map3 = (Map) obj;
                n4k n4kVar = (n4k) obj2;
                map3.put("master_package_name", n4kVar.b.getPackageName());
                int i3 = vck.a[n4kVar.a.ordinal()];
                if (i3 == 1) {
                    str2 = "registered";
                } else {
                    if (i3 != 2) {
                        ore.o();
                        return null;
                    }
                    str2 = "already_registered";
                }
                map3.put("reason", str2);
                return sbiVar;
        }
    }
}
