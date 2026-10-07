package com.vk.push.core.remote.config.omicron;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.fingerprint.AppFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.DeviceFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.SessionFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.retriever.ResponseParserImpl;
import com.vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.util.PackageInfoUtil;
import defpackage.atb;
import defpackage.g85;
import defpackage.oo6;
import defpackage.zsb;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class Omicron {
    public static final Omicron b = new Omicron();
    public volatile atb a;

    public static Omicron getInstance() {
        return b;
    }

    public final synchronized Data a() {
        Data data;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access data before method 'init' called");
            }
            data = this.a.b;
            if (data == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return data;
    }

    public final synchronized Data b() {
        atb atbVar;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access latest data before method 'init' called");
            }
            atbVar = this.a;
            if (atbVar.b == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Data) atbVar.a.get();
    }

    public void clearLogic() {
        SegmentsHolder.clearProvider();
        this.a = null;
    }

    public boolean getBoolean(String str) {
        return a().getBoolean(str);
    }

    public double getDouble(String str) {
        return a().getDouble(str);
    }

    public float getFloat(String str) {
        return a().getFloat(str);
    }

    public int getInt(String str) {
        return a().getInt(str);
    }

    @Deprecated
    public boolean getLatestBoolean(String str) {
        return b().getBoolean(str);
    }

    public Boolean getLatestBooleanOrNull(String str) {
        return b().getBooleanOrNull(str);
    }

    @Deprecated
    public double getLatestDouble(String str) {
        return b().getDouble(str);
    }

    public Double getLatestDoubleOrNull(String str) {
        return b().getDoubleOrNull(str);
    }

    @Deprecated
    public float getLatestFloat(String str) {
        return b().getFloat(str);
    }

    public Float getLatestFloatOrNull(String str) {
        return b().getFloatOrNull(str);
    }

    @Deprecated
    public int getLatestInt(String str) {
        return b().getInt(str);
    }

    public Integer getLatestIntOrNull(String str) {
        return b().getIntOrNull(str);
    }

    @Deprecated
    public long getLatestLong(String str) {
        return b().getLong(str);
    }

    public Long getLatestLongOrNull(String str) {
        return b().getLongOrNull(str);
    }

    @Deprecated
    public String getLatestString(String str) {
        return b().getString(str);
    }

    public String getLatestStringOrNull(String str) {
        return b().getString(str);
    }

    public long getLong(String str) {
        return a().getLong(str);
    }

    public String getString(String str) {
        return a().getString(str);
    }

    public synchronized void init(Context context, OmicronConfig omicronConfig) {
        atb cVar;
        try {
            if (this.a != null) {
                return;
            }
            SerializationDataStorage serializationDataStorage = new SerializationDataStorage(new File(context.getFilesDir(), "push_sdk_omicron"), omicronConfig.f);
            NetworkDataRetriever networkDataRetriever = new NetworkDataRetriever(omicronConfig.m, new ResponseParserImpl(omicronConfig.f), omicronConfig.f);
            SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = new SharedPreferencesUpdateTimetable(context.getSharedPreferences("push_sdk_omicron_".concat("timetable"), 0), omicronConfig.n);
            DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_sdk_omicron_".concat("session_counter"), 0);
            int versionCode = PackageInfoUtil.getVersionCode(context);
            SessionCounter sessionCounter = new SessionCounter(sharedPreferences, versionCode);
            int i = sharedPreferences.getInt("current_count", 0);
            int i2 = sharedPreferences.getInt("total_count", 0);
            sharedPreferences.edit().putInt("current_count", (versionCode != sharedPreferences.getInt("last_version_code", -1) ? 0 : i) + 1).putInt("total_count", i2 + 1).putInt("last_version_code", versionCode).apply();
            omicronConfig.e.add(new DeviceFingerprint(context, omicronConfig.o));
            omicronConfig.e.add(new AppFingerprint(context));
            omicronConfig.e.add(new SessionFingerprint(sessionCounter));
            g85 g85Var = new g85(serializationDataStorage, networkDataRetriever, sharedPreferencesUpdateTimetable, omicronConfig.n, defaultExecutorFactory);
            int i3 = zsb.a[omicronConfig.j.ordinal()];
            if (i3 != 1) {
                cVar = i3 != 2 ? new b(g85Var, omicronConfig) : new a(g85Var, omicronConfig);
            } else {
                cVar = new c(g85Var, omicronConfig);
            }
            this.a = cVar;
            if (omicronConfig.l) {
                ((SerializationDataStorage) this.a.e.a).clearData();
                atb atbVar = this.a;
                ((SharedPreferencesUpdateTimetable) atbVar.e.c).setNeedUpdate(atbVar.d);
            }
            atb atbVar2 = this.a;
            Data dataA = atbVar2.a();
            atbVar2.b = dataA;
            atbVar2.a.set(dataA);
            SegmentsHolder.registerProvider(new oo6(29, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void needUpdateCache() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        atb atbVar = this.a;
        ((SharedPreferencesUpdateTimetable) atbVar.e.c).setNeedUpdate(atbVar.d);
        atb atbVar2 = this.a;
        Data dataA = atbVar2.a();
        atbVar2.b = dataA;
        atbVar2.a.set(dataA);
    }

    public synchronized void reInit() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        atb atbVar = this.a;
        Data dataA = atbVar.a();
        atbVar.b = dataA;
        atbVar.a.set(dataA);
    }

    public boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public double getDouble(String str, double d) {
        return a().getDouble(str, d);
    }

    public float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public boolean getLatestBoolean(String str, boolean z) {
        return b().getBoolean(str, z);
    }

    public double getLatestDouble(String str, double d) {
        return b().getDouble(str, d);
    }

    public float getLatestFloat(String str, float f) {
        return b().getFloat(str, f);
    }

    public int getLatestInt(String str, int i) {
        return b().getInt(str, i);
    }

    public long getLatestLong(String str, long j) {
        return b().getLong(str, j);
    }

    public String getLatestString(String str, String str2) {
        return b().getString(str, str2);
    }

    public long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return a().getString(str, str2);
    }
}
