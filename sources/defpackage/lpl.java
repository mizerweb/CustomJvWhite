package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lpl {
    public static final String a = "lpl";

    public static Uri a(String str) {
        Object poeVar;
        String str2 = a;
        if (str == null || r5h.X0(str)) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "SessionInit.recoveryUrl is empty, try use default", null);
                }
            }
            return Uri.parse("https://go.max.ru/selfrecovery");
        }
        try {
            poeVar = Uri.parse(str);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            ch3.d0(poeVar);
            return (Uri) poeVar;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "Parsing sessionInit.recoveryUrl:" + str + " returns error:" + roe.a(poeVar) + ".", null);
            }
        }
        return Uri.parse("https://go.max.ru/selfrecovery");
    }

    public static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }
}
