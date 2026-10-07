package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashSet;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qgl {
    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public static gi6 b(ApiInvocationException apiInvocationException) {
        String[] strArr = {apiInvocationException.getErrorMessage(), apiInvocationException.getMessage()};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        if (linkedHashSet.contains("privacy.violation") || linkedHashSet.contains("call.blocked")) {
            return gi6.c;
        }
        if (linkedHashSet.contains("not.chat.participant")) {
            return gi6.i;
        }
        if (linkedHashSet.contains("wait.for.admin")) {
            return gi6.j;
        }
        if (linkedHashSet.contains("user.restricted.call")) {
            return gi6.k;
        }
        return linkedHashSet.contains("error.participants.limit.exceeded") ? gi6.l : gi6.d;
    }
}
