package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.ore;

/* JADX INFO: loaded from: classes2.dex */
public final class RuStoreActivityLauncher extends Activity {
    public ResultReceiver a;

    public final void a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver == null) {
            resultReceiver = null;
        }
        resultReceiver.send(i, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            a(i2, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        Object parcelableExtra2;
        RuStoreActivityLauncher ruStoreActivityLauncher;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER", ResultReceiver.class);
            if (parcelableExtra == null) {
                ore.p("Required value was null.");
                return;
            }
        } else {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER");
            if (parcelableExtra == null) {
                ore.p("Required value was null.");
                return;
            }
        }
        this.a = (ResultReceiver) parcelableExtra;
        if (bundle != null) {
            return;
        }
        Intent intent2 = getIntent();
        if (i >= 33) {
            parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
            if (parcelableExtra2 == null) {
                ore.p("Required value was null.");
                return;
            }
        } else {
            parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
            if (parcelableExtra2 == null) {
                ore.p("Required value was null.");
                return;
            }
        }
        try {
            ruStoreActivityLauncher = this;
            try {
                ruStoreActivityLauncher.startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException unused) {
                ruStoreActivityLauncher.a(2, null);
            } catch (IntentSender.SendIntentException unused2) {
                ruStoreActivityLauncher.a(9901, null);
            } catch (Exception unused3) {
                ruStoreActivityLauncher.a(9902, null);
            }
        } catch (ActivityNotFoundException unused4) {
            ruStoreActivityLauncher = this;
        } catch (IntentSender.SendIntentException unused5) {
            ruStoreActivityLauncher = this;
        } catch (Exception unused6) {
            ruStoreActivityLauncher = this;
        }
    }
}
