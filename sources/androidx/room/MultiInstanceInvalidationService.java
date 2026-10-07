package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.j5b;
import defpackage.k5b;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final k5b c = new k5b(this);
    public final j5b d = new j5b(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
