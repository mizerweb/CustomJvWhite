package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes2.dex */
public class CampaignReceiver extends BroadcastReceiver {
    public static void a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("referrer");
        if (TextUtils.isEmpty(string)) {
            Tracer.d("CampaignReceiver: referrer is null or empty");
            return;
        }
        Tracer.d("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, (Class<?>) CampaignService.class).putExtra("referrer", string));
        } catch (Throwable th) {
            Tracer.e("CampaignReceiver error: " + th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
