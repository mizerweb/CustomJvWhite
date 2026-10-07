package defpackage;

import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class p6k extends ux8 implements qf7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ r7k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6k(String str, r7k r7kVar) {
        super(2);
        this.a = str;
        this.b = r7kVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws RemoteException {
        String str = this.b.m;
        ((PushProvider) obj).registerForPushes(this.a, str, (AsyncCallback) obj2);
        return sbi.a;
    }
}
