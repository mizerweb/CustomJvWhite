package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class k5b extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public k5b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.a.b.remove((Integer) obj);
    }
}
