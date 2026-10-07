package com.vk.push.core.remote.config.omicron;

import android.text.TextUtils;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.DefaultHttpRequestExecutor;
import com.vk.push.core.remote.config.omicron.retriever.RequestExecutor;
import com.vk.push.core.remote.config.omicron.timetable.SimpleTimeProvider;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import defpackage.ore;
import defpackage.ysb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OmicronConfig {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final AnalyticsHandler f;
    public final int g;
    public final OmicronEnvironment h;
    public final float i;
    public final UpdateBehaviour j;
    public final String k;
    public final boolean l;
    public final RequestExecutor m;
    public final TimeProvider n;
    public final DeviceIdProvider o;

    public static final class Builder {
        public String a;
        public OmicronEnvironment h;
        public String k;
        public boolean l;
        public HttpClient n;
        public String b = "https";
        public String c = "e.mail.ru";
        public String d = "api/v1/omicron/get";
        public List e = new ArrayList(4);
        public AnalyticsHandler f = new ysb();
        public int g = 1440;
        public float i = 0.0f;
        public UpdateBehaviour j = UpdateBehaviour.DEFAULT;
        public RequestExecutor m = null;
        public TimeProvider o = new SimpleTimeProvider();
        public DeviceIdProvider p = null;

        public Builder analyticsHandler(AnalyticsHandler analyticsHandler) {
            this.f = analyticsHandler;
            return this;
        }

        public Builder apiHost(String str) {
            this.c = str;
            return this;
        }

        public Builder apiPath(String str) {
            this.d = str;
            return this;
        }

        public Builder apiScheme(String str) {
            this.b = str;
            return this;
        }

        public Builder appId(String str) {
            this.a = str;
            return this;
        }

        public OmicronConfig build() {
            if (TextUtils.isEmpty(this.a)) {
                ore.p("appId is required");
                return null;
            }
            if (this.h == null) {
                ore.p("environment is required");
                return null;
            }
            RequestExecutor requestExecutor = this.m;
            if (requestExecutor != null && this.n != null) {
                ore.p("you must pass HttpClient or custom RequestExecutor before build");
                return null;
            }
            if (requestExecutor == null) {
                this.m = new DefaultHttpRequestExecutor(this.n);
            }
            if (this.p != null) {
                return new OmicronConfig(this);
            }
            ore.p("deviceIdProvider is required");
            return null;
        }

        public Builder clearDataOnInit(boolean z) {
            this.l = z;
            return this;
        }

        public Builder deviceIdProvider(DeviceIdProvider deviceIdProvider) {
            this.p = deviceIdProvider;
            return this;
        }

        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.h = omicronEnvironment;
            return this;
        }

        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.e = list;
            return this;
        }

        public Builder firstLoadTimeout(float f) {
            this.i = f;
            return this;
        }

        public Builder requestExecutor(RequestExecutor requestExecutor) {
            this.m = requestExecutor;
            return this;
        }

        public Builder timeProvider(TimeProvider timeProvider) {
            this.o = timeProvider;
            return this;
        }

        public Builder updateBehaviour(UpdateBehaviour updateBehaviour) {
            this.j = updateBehaviour;
            return this;
        }

        public Builder updateInterval(int i) {
            this.g = i;
            return this;
        }

        public Builder useDefaultRequestExecutor(HttpClient httpClient) {
            this.n = httpClient;
            return this;
        }

        public Builder userId(String str) {
            this.k = str;
            return this;
        }
    }

    public OmicronConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.o;
        this.o = builder.p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
