package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import one.me.android.MainActivity;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class s91 {
    public final ha9 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;

    public s91(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        this.a = ha9Var;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var2;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var;
    }

    public final void a(Context context, Intent intent, String str) {
        gjg gjgVarZ;
        gm0.n("CallActionsProcessor", "handleCallNotificationActionIntent action=" + intent.getAction() + " from=" + str);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        zb1 zb1Var = (zb1) this.g.getValue();
        po1 po1VarL = cy5.l(action);
        boolean zEquals = po1VarL.equals(ko1.a);
        ha9 ha9Var = this.a;
        if (zEquals) {
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            intent2.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
            context.startActivity(intent2);
            b();
            return;
        }
        if (po1VarL.equals(fo1.a)) {
            x02 x02VarD = d(intent);
            if (((wsc) this.b.getValue()).c(wsc.i)) {
                boolean booleanExtra = intent.getBooleanExtra("incoming_param_is_video", false);
                if (x02VarD != null) {
                    x02VarD.B(booleanExtra);
                }
                Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
                intent3.setAction("action-open-call");
                intent3.setFlags(268435456);
                intent3.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
                context.startActivity(intent3);
            } else {
                context.startActivity(c(context, intent.getExtras()));
            }
            b();
            return;
        }
        if (po1VarL.equals(io1.a)) {
            x02 x02VarD2 = d(intent);
            if (x02VarD2 != null) {
                x02VarD2.o(false);
            }
            b();
            return;
        }
        if (po1VarL.equals(go1.a)) {
            x02 x02VarD3 = d(intent);
            dz4 dz4Var = (x02VarD3 == null || (gjgVarZ = x02VarD3.z()) == null) ? null : (dz4) gjgVarZ.getValue();
            sa2 sa2Var = (sa2) this.c.getValue();
            String strA = dz4Var != null ? ns4.a(dz4Var.c) : null;
            ac1 ac1Var = (ac1) zb1Var;
            long j = ac1Var.c() ? 0L : 1L;
            boolean z = dz4Var != null && dz4Var.i;
            sa2Var.getClass();
            sa2.c(sa2Var, "AUDIO_ENABLED", strA, null, Long.valueOf(j), null, null, z, Boolean.FALSE, 116);
            ac1Var.d(true ^ ac1Var.c());
            return;
        }
        if (po1VarL.equals(ho1.a)) {
            x02 x02VarD4 = d(intent);
            if (x02VarD4 != null) {
                x02VarD4.p(it7.c);
            }
            b();
            return;
        }
        if (po1VarL.equals(lo1.a)) {
            context.startActivity(c(context, intent.getExtras()));
            b();
            return;
        }
        if (po1VarL.equals(jo1.a)) {
            Bundle extras = intent.getExtras();
            Intent intent4 = new Intent(context, (Class<?>) MainActivity.class);
            intent4.setAction("action-join-link");
            if (extras != null) {
                intent4.putExtras(extras);
            }
            intent4.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
            intent4.setFlags(268435456);
            context.startActivity(intent4);
            return;
        }
        if (po1VarL.equals(mo1.a)) {
            Bundle extras2 = intent.getExtras();
            Intent intent5 = new Intent(context, (Class<?>) MainActivity.class);
            intent5.setAction("action-rate-call");
            if (extras2 != null) {
                intent5.putExtras(extras2);
            }
            intent5.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
            intent5.setFlags(268435456);
            context.startActivity(intent5);
            return;
        }
        if (!po1VarL.equals(no1.a)) {
            if (po1VarL.equals(oo1.a)) {
                return;
            }
            ore.o();
            return;
        }
        Bundle extras3 = intent.getExtras();
        Intent intent6 = new Intent(context, (Class<?>) MainActivity.class);
        intent6.setAction("action-unknown-call");
        if (extras3 != null) {
            intent6.putExtras(extras3);
        }
        intent6.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        intent6.setFlags(268435456);
        context.startActivity(intent6);
    }

    public final void b() {
        if (((b95) this.d.getValue()).g()) {
            return;
        }
        ((c95) this.e.getValue()).b();
    }

    public final Intent c(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("action-open-incoming");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, this.a.a);
        intent.setFlags(268435456);
        return intent;
    }

    public final x02 d(Intent intent) {
        String stringExtra = intent.getStringExtra("arg_call_session_id");
        if (stringExtra != null) {
            return ((b95) this.d.getValue()).i(stringExtra);
        }
        return null;
    }
}
