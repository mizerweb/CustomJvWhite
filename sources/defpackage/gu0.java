package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gu0 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                njd njdVar = (njd) this.b;
                int intExtra = intent.getIntExtra("status", -1);
                njdVar.c(Boolean.valueOf(intExtra == 2 || intExtra == 5));
                break;
            case 1:
                iu0 iu0Var = (iu0) this.b;
                switch (iu0Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            n1g.x().p(ju0.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        iu0Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        iu0Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        iu0Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        iu0Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            n1g.x().p(yu0.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        iu0Var.b(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    iu0Var.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            n1g.x().p(mqg.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        iu0Var.b(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    iu0Var.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 2:
                String str = ((de4) this.b).p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onBackgroundDataEnabledChange", null);
                    }
                }
                de4 de4Var = (de4) this.b;
                ce4 ce4Var = ce4.a;
                Iterator it = de4Var.m.iterator();
                while (it.hasNext()) {
                    ce4Var.accept((vd4) it.next());
                }
                break;
            default:
                ((ndb) this.b).a.execute(new o90(this, context, 18));
                break;
        }
    }
}
