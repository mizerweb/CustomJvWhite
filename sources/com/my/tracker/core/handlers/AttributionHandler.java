package com.my.tracker.core.handlers;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.o.g;
import defpackage.qe;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionHandler {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final EngineCore b;

    public AttributionHandler(EngineCore engineCore) {
        this.b = engineCore;
    }

    public static AttributionHandler newHandler(EngineCore engineCore) {
        return new AttributionHandler(engineCore);
    }

    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(strOptString)) {
            Tracer.d("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.a.compareAndSet(false, true)) {
            Tracer.d("AttributionHandler: attribution has already been received");
            return;
        }
        if (!TextUtils.isEmpty(this.b.getPrefs().getString("attribution"))) {
            Tracer.d("AttributionHandler: attribution has already been received");
            return;
        }
        this.b.getPrefs().setString("attribution", jSONObject.toString());
        MyTracker.AttributionListener attributionListener = this.b.getTrackerConfig().getAttributionListener();
        if (attributionListener == null) {
            return;
        }
        Handler attributionHandler = this.b.getTrackerConfig().getAttributionHandler();
        if (attributionHandler == null) {
            attributionHandler = g.a;
        }
        try {
            attributionHandler.post(new qe(attributionListener, 6, MyTrackerAttribution.newAttribution(strOptString)));
        } catch (Throwable th) {
            Tracer.e("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    public void handleReferrerAttribution(String str) {
        if (TextUtils.isEmpty(str)) {
            Tracer.d("AttributionHandler: referrer is empty");
            return;
        }
        if (a()) {
            Tracer.d("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            String queryParameter = Uri.parse("https://tracker-api.vk-analytics.ru/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
            if (TextUtils.isEmpty(queryParameter)) {
                Tracer.d("AttributionHandler: deeplink is empty");
            } else {
                a(new JSONObject().put("deeplink", queryParameter));
            }
        } catch (Throwable th) {
            Tracer.e("AttributionHandler error: handling referrer failed with error: ", th);
        }
    }

    public void handleServerAttribution(String str) {
        if (a()) {
            Tracer.d("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                Tracer.d("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            Tracer.d("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th) {
            Tracer.e("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public boolean a() {
        return this.a.get() || !TextUtils.isEmpty(this.b.getPrefs().getString("attribution"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            Tracer.e("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }
}
