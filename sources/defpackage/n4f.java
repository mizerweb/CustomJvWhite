package defpackage;

import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* JADX INFO: loaded from: classes.dex */
public interface n4f extends RecordEventListener {
    void c(u4f u4fVar);

    boolean d();

    mjg j();

    mjg n();

    void prepare();

    void r();

    void s(RecordManager.StopParams stopParams);

    void u(RecordManager.StartParams startParams);
}
