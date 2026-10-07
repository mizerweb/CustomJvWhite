package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n4 {
    public static /* synthetic */ SessionConfiguration j(int i, ArrayList arrayList, Executor executor, ng ngVar) {
        return new SessionConfiguration(i, arrayList, executor, ngVar);
    }

    public static /* bridge */ /* synthetic */ SessionConfiguration k(Object obj) {
        return (SessionConfiguration) obj;
    }
}
