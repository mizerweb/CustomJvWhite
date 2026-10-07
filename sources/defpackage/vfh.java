package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class vfh {
    public static final String d = n1g.Z("SystemJobInfoConverter");
    public final ComponentName a;
    public final lhb b;
    public final boolean c;

    public vfh(Context context, lhb lhbVar, boolean z) {
        this.b = lhbVar;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
