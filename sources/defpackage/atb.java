package defpackage;

import android.net.Uri;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class atb {
    public final AtomicReference a = new AtomicReference();
    public Data b;
    public final OmicronConfig c;
    public final DataId d;
    public final /* synthetic */ g85 e;

    public atb(g85 g85Var, OmicronConfig omicronConfig) {
        this.e = g85Var;
        this.c = omicronConfig;
        this.d = new DataId(new Uri.Builder().scheme(omicronConfig.b).authority(omicronConfig.c).path(omicronConfig.d).toString(), omicronConfig.a);
    }

    public abstract Data a();

    public final void b() {
        OmicronConfig omicronConfig = this.c;
        AnalyticsHandler analyticsHandler = omicronConfig.f;
        SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = (SharedPreferencesUpdateTimetable) this.e.c;
        long j = omicronConfig.g;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        DataId dataId = this.d;
        analyticsHandler.onCacheHit(dataId, sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j, timeUnit));
    }
}
