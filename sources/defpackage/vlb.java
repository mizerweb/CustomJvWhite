package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vlb extends emb {
    public final int e;
    public final htc f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public vlb(int i, htc htcVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (TextUtils.isEmpty(htcVar.a)) {
            ore.p("person must have a non-empty a name");
            throw null;
        }
        this.e = i;
        this.f = htcVar;
        this.g = pendingIntent3;
        this.h = pendingIntent2;
        this.i = pendingIntent;
    }

    @Override // defpackage.emb
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        htc htcVar = this.f;
        if (htcVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", tlb.b(go.i(htcVar)));
            } else {
                bundle.putParcelable("android.callPersonCompat", htcVar.b());
            }
        }
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    @Override // defpackage.emb
    public final void b(vyh vyhVar) {
        Notification.CallStyle callStyleA;
        Notification.Builder builder = (Notification.Builder) vyhVar.d;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.e;
        htc htcVar = this.f;
        if (i < 31) {
            builder.setContentTitle(htcVar != null ? htcVar.a : null);
            Bundle bundle = this.a.x;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.x.getCharSequence("android.text");
            if (charSequence == null) {
                if (i2 == 1) {
                    charSequence = this.a.a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i2 != 2) {
                    charSequence = i2 != 3 ? null : this.a.a.getResources().getString(R.string.call_notification_screening_text);
                } else {
                    charSequence = this.a.a.getResources().getString(R.string.call_notification_ongoing_text);
                }
            }
            builder.setContentText(charSequence);
            if (htcVar != null) {
                IconCompat iconCompat = htcVar.b;
                if (iconCompat != null) {
                    slb.a(builder, iconCompat.g(this.a.a));
                }
                if (i >= 28) {
                    tlb.a(builder, go.i(htcVar));
                } else {
                    rlb.a(builder, null);
                }
            }
            rlb.b(builder, "call");
            return;
        }
        PendingIntent pendingIntent = this.g;
        if (i2 != 1) {
            PendingIntent pendingIntent2 = this.i;
            if (i2 == 2) {
                htcVar.getClass();
                callStyleA = ulb.b(go.i(htcVar), pendingIntent2);
            } else if (i2 != 3) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(i2));
                }
                callStyleA = null;
            } else {
                htcVar.getClass();
                callStyleA = ulb.c(go.i(htcVar), pendingIntent2, pendingIntent);
            }
        } else {
            htcVar.getClass();
            callStyleA = ulb.a(go.i(htcVar), this.h, pendingIntent);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            ulb.e(callStyleA, null);
            ulb.d(callStyleA, false);
        }
    }

    @Override // defpackage.emb
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final ArrayList d() {
        PendingIntent pendingIntent = this.h;
        klb klbVarE = pendingIntent == null ? e(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, R.color.call_notification_decline_color, this.i) : e(R.drawable.ic_call_decline, R.string.call_notification_decline_action, R.color.call_notification_decline_color, pendingIntent);
        PendingIntent pendingIntent2 = this.g;
        klb klbVarE2 = pendingIntent2 == null ? null : e(R.drawable.ic_call_answer, R.string.call_notification_answer_action, R.color.call_notification_answer_color, pendingIntent2);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(klbVarE);
        ArrayList<klb> arrayList2 = this.a.b;
        int i = 2;
        if (arrayList2 != null) {
            for (klb klbVar : arrayList2) {
                klbVar.getClass();
                if (!klbVar.a.getBoolean("key_action_priority") && i > 1) {
                    arrayList.add(klbVar);
                    i--;
                }
                if (klbVarE2 != null && i == 1) {
                    arrayList.add(klbVarE2);
                    i--;
                }
            }
        }
        if (klbVarE2 != null && i >= 1) {
            arrayList.add(klbVarE2);
        }
        return arrayList;
    }

    public final klb e(int i, int i2, int i3, PendingIntent pendingIntent) {
        Integer numValueOf = Integer.valueOf(this.a.a.getColor(i3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.a.a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        klb klbVarA = new jlb(IconCompat.c(context.getResources(), context.getPackageName(), i), spannableStringBuilder, pendingIntent, new Bundle()).a();
        klbVarA.a.putBoolean("key_action_priority", true);
        return klbVarA;
    }
}
