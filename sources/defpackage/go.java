package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.Person;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class go {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Executor d(Context context) {
        return context.getMainExecutor();
    }

    public static void e(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String f() {
        return Application.getProcessName();
    }

    public static boolean g(Handler handler, qi2 qi2Var, long j) {
        return handler.postDelayed(qi2Var, "retry_token", j);
    }

    public static void h(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static Person i(htc htcVar) {
        Person.Builder name = new Person.Builder().setName(htcVar.a);
        IconCompat iconCompat = htcVar.b;
        return name.setIcon(iconCompat != null ? iconCompat.g(null) : null).setUri(null).setKey(htcVar.c).setBot(false).setImportant(htcVar.d).build();
    }
}
