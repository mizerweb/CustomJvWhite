package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class so1 {
    public final ha9 a;
    public final ny8 b;

    public so1(ny8 ny8Var, ha9 ha9Var) {
        this.a = ha9Var;
        this.b = ny8Var;
    }

    public static void b(Intent intent, be1 be1Var, boolean z, String str) {
        intent.setAction("action-open-incoming");
        intent.putExtra("arg_call_session_id", str);
        CharSequence charSequence = be1Var.c;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        intent.putExtra("incoming_param_name", string);
        String str2 = be1Var.e;
        intent.putExtra("incoming_param_avatar", str2 != null ? p2m.b(str2) : null);
        Long l = be1Var.a;
        intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0L);
        intent.putExtra("incoming_param_is_video", z);
        intent.setFlags(268435456);
    }

    public final PendingIntent a(Context context, int i, cf7 cf7Var) {
        int i2 = tsi.a;
        ha9 ha9Var = this.a;
        if (i2 >= 31) {
            Intent intent = new Intent(context, (Class<?>) CallNotifierFixActivity.class);
            cf7Var.invoke(intent);
            intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
            return PendingIntent.getActivity(context, i, intent, 201326592);
        }
        Intent intent2 = new Intent(context, (Class<?>) CallNotifierBroadcastReceiver.class);
        cf7Var.invoke(intent2);
        intent2.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        return PendingIntent.getBroadcast(context, i, intent2, 201326592);
    }

    public final Application c() {
        return (Application) this.b.getValue();
    }

    public final PendingIntent d(String str) {
        Intent intent = new Intent();
        intent.setAction("action-microphone-state");
        intent.setPackage(c().getPackageName());
        intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, this.a.a);
        intent.putExtra("arg_call_session_id", str);
        return PendingIntent.getBroadcast(c().getApplicationContext(), str.hashCode(), intent, 201326592);
    }
}
