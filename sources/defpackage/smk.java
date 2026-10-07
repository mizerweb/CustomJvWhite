package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class smk {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public smk(a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(le4 le4Var);

    public final void c() {
        Boolean bool;
        synchronized (this) {
            try {
                bool = this.a;
                if (this.b) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar = this.f;
            int i = this.d;
            if (i != 0) {
                aVar.w(1, null);
                Bundle bundle = this.e;
                b(new le4(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!a()) {
                aVar.w(1, null);
                b(new le4(8, null, null));
            }
        }
        synchronized (this) {
            this.b = true;
        }
        d();
    }

    public final void d() {
        e();
        a aVar = this.c;
        synchronized (aVar.k) {
            aVar.k.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }
}
