package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class mqk extends bmk {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqk(a aVar, Looper looper) {
        super(looper, 2);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        smk smkVar;
        a aVar = this.a;
        int i = aVar.v.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (smkVar = (smk) message.obj) != null) {
                smkVar.d();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !aVar.b()) {
            smk smkVar2 = (smk) message.obj;
            if (smkVar2 != null) {
                smkVar2.d();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            aVar.s = new le4(message.arg2, null, null);
            if (!aVar.t && !TextUtils.isEmpty(aVar.q()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.q());
                    if (!aVar.t) {
                        aVar.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            le4 le4Var = aVar.s;
            if (le4Var == null) {
                le4Var = new le4(8, null, null);
            }
            aVar.i.b(le4Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            le4 le4Var2 = aVar.s;
            if (le4Var2 == null) {
                le4Var2 = new le4(8, null, null);
            }
            aVar.i.b(le4Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            aVar.i.b(new le4(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            aVar.w(5, null);
            p3c p3cVar = aVar.n;
            if (p3cVar != null) {
                ((ho7) p3cVar.b).V(message.arg2);
            }
            aVar.t();
            aVar.v(5, 1, null);
            return;
        }
        if (i4 == 2 && !aVar.isConnected()) {
            smk smkVar3 = (smk) message.obj;
            if (smkVar3 != null) {
                smkVar3.d();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 == 2 || i5 == 1 || i5 == 7) {
            ((smk) message.obj).c();
        } else {
            Log.wtf("GmsClient", zo5.v(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
        }
    }
}
