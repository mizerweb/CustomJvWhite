package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class ik5 extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik5(ljh ljhVar, Object obj) {
        super(1);
        this.a = 4;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(DeviceIdRemoteDataSource.access$hasProvider((DeviceIdRemoteDataSource) this.b, (PackageInfo) obj));
            case 1:
                Throwable jSONException = (Throwable) obj;
                String str = "Error parsing model in " + ((JsonSerializableFileDataStoreImpl) this.b).a;
                if (jSONException == null) {
                    jSONException = new JSONException("Unknown data corrupted");
                }
                return new IllegalStateException(str, jSONException);
            case 2:
                ((e89) this.b).cancel(false);
                return sbi.a;
            case 3:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    mjg mjgVar = ((m9g) this.b).f;
                    ru6 ru6Var = new ru6(th);
                    mjgVar.getClass();
                    mjgVar.j(null, ru6Var);
                }
                Object obj2 = m9g.j;
                m9g m9gVar = (m9g) this.b;
                synchronized (obj2) {
                    m9g.i.remove(m9gVar.c().getAbsolutePath());
                }
                return sbi.a;
            case 4:
                bub bubVar = ((o89) obj).a;
                if (bubVar != null) {
                    ljh.f(null, new hjh(bubVar, this.b, 1));
                }
                return sbi.a;
            case 5:
                ((fjh) obj).a((IllegalStateException) this.b);
                return sbi.a;
            case 6:
                ek2 ek2Var = (ek2) this.b;
                sbi sbiVar = sbi.a;
                if (ek2Var.t() instanceof hib) {
                    ek2Var.resumeWith(sbiVar);
                }
                return sbiVar;
            default:
                String str2 = (String) obj;
                f4k f4kVar = (f4k) this.b;
                Intent intent = new Intent("com.vk.push.MASTER_SERVICE");
                intent.setPackage(str2);
                ResolveInfo resolveInfoResolveService = f4kVar.getContext().getPackageManager().resolveService(intent, np0.m);
                if (resolveInfoResolveService != null) {
                    return new ComponentName(str2, resolveInfoResolveService.serviceInfo.name);
                }
                Logger.DefaultImpls.error$default(f4kVar.getLogger(), c0a.o("Unable to resolve service in ", str2, " by action com.vk.push.MASTER_SERVICE"), null, 2, null);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik5(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }
}
