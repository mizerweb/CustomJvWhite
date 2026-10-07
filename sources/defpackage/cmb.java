package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cmb {
    public final CharSequence a;
    public final long b;
    public final htc c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public cmb(CharSequence charSequence, long j, htc htcVar) {
        this.a = charSequence;
        this.b = j;
        this.c = htcVar;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cmb cmbVar = (cmb) arrayList.get(i);
            htc htcVar = cmbVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = cmbVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", cmbVar.b);
            if (htcVar != null) {
                bundle.putCharSequence("sender", htcVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", bmb.a(go.i(htcVar)));
                } else {
                    bundle.putBundle("person", htcVar.b());
                }
            }
            String str = cmbVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = cmbVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = cmbVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        htc htcVar = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            messageA = bmb.b(charSequence, j, htcVar != null ? go.i(htcVar) : null);
        } else {
            messageA = amb.a(charSequence, j, htcVar != null ? htcVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            amb.b(messageA, str, this.f);
        }
        return messageA;
    }
}
