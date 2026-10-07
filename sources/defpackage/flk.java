package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class flk implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ GoogleApiActivity b;

    public flk(Intent intent, GoogleApiActivity googleApiActivity) {
        this.a = intent;
        this.b = googleApiActivity;
    }

    public static flk a(Intent intent, GoogleApiActivity googleApiActivity) {
        return new flk(intent, googleApiActivity);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                Intent intent = this.a;
                if (intent != null) {
                    this.b.startActivityForResult(intent, 2);
                }
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
