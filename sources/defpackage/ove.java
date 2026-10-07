package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ove {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final jrc c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public sxk g;
    public final h6g a = new h6g(0);
    public final Messenger e = new Messenger(new ink(this, Looper.getMainLooper()));

    public ove(Context context) {
        this.b = context;
        this.c = new jrc(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    public final kam a(Bundle bundle) {
        String string;
        int iF;
        Context context;
        synchronized (ove.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        qjh qjhVar = new qjh();
        synchronized (this.a) {
            this.a.put(string, qjhVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.F() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (ove.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context2, 0, intent2, tmk.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iF = this.c.F();
            context = this.b;
            if (iF == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iF = this.c.F();
                context = this.b;
                if (iF == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        qjhVar.a.c(jm5.d, new dc9(this, string, this.d.schedule(new rda(27, qjhVar), 30L, TimeUnit.SECONDS)));
        return qjhVar.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                qjh qjhVar = (qjh) this.a.remove(str);
                if (qjhVar != null) {
                    qjhVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
