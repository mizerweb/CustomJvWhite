package defpackage;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class smb {
    public final ComponentName a;
    public INotificationSideChannel c;
    public boolean b = false;
    public final ArrayDeque d = new ArrayDeque();
    public int e = 0;

    public smb(ComponentName componentName) {
        this.a = componentName;
    }
}
