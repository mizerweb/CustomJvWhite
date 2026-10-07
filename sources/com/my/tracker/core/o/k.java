package com.my.tracker.core.o;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.proto.ByteArrayProtoWriter;
import defpackage.d7i;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    private final EngineCore a;

    public k(EngineCore engineCore) {
        this.a = engineCore;
    }

    public String a(Intent intent) {
        Tracer.d("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            Tracer.d("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                Tracer.d("DeeplinkHandler: intent data is null");
                return null;
            }
            Tracer.d("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                Tracer.d("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                Tracer.d("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            Tracer.d("DeeplinkHandler: deeplink " + queryParameter);
            Tracer.d("DeeplinkHandler: clickId " + queryParameter2);
            a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            Tracer.e("DeeplinkHandler error: ", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] a(String str, String str2, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeField(1, str);
        if (!TextUtils.isEmpty(str2)) {
            byteArrayProtoWriter.writeField(2, str2);
        }
        return byteArrayProtoWriter.toByteArray();
    }

    public static k a(EngineCore engineCore) {
        return new k(engineCore);
    }

    public void a(String str, String str2) {
        this.a.insertEventInWorker(15L, 16, true, true, this.a.getTimeCore().currentTimeSec(), new d7i((Object) this, str, str2, 4));
    }
}
