package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class cg extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public cg(Context context) {
        this.a = 10;
        this.b = new CopyOnWriteArraySet();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, 4);
        } else {
            context.registerReceiver(this, intentFilter);
        }
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((bw3) this.b).c).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        boolean z = true;
        switch (this.a) {
            case 0:
                dg dgVar = (dg) this.b;
                dgVar.c.execute(new bg(dgVar, 2));
                break;
            case 1:
                ((sr) this.b).V();
                break;
            case 2:
                if (!isInitialStickyBroadcast()) {
                    x70 x70Var = (x70) this.b;
                    x70Var.h(u70.c(context, intent, (p70) x70Var.j, (AudioDeviceInfo) x70Var.i));
                }
                break;
            case 3:
                s80 s80Var = (s80) this.b;
                r80 r80Var = (r80) s80Var.b;
                String str = (String) s80Var.c;
                gm0.n(str, "Audio becoming noisy " + intent);
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction()) && r80Var.d() && r80Var.a() > 0.0f) {
                    gm0.n(str, "Player. Audio Focus. Receiver: ACTION_AUDIO_BECOMING_NOISY. Pause player");
                    r80Var.pause();
                    break;
                }
                break;
            case 4:
                context.getClass();
                intent.getClass();
                g85 g85Var = (g85) this.b;
                ft0 ft0Var = (ft0) g85Var.d;
                if (ft0Var != null) {
                    int intExtra = intent.getIntExtra("level", 0);
                    ((gsh) ((esh) g85Var.c)).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int intExtra2 = intent.getIntExtra("status", -1);
                    if (intExtra2 != 2 && intExtra2 != 5) {
                        z = false;
                    }
                    dc1 dc1Var = new dc1(z, jElapsedRealtime, intExtra);
                    ec1 ec1Var = (ec1) ft0Var.a;
                    if (z) {
                        ec1Var.b = false;
                    }
                    dc1 dc1Var2 = (dc1) ec1Var.f;
                    if (dc1Var2 == null) {
                        ec1Var.f = dc1Var;
                        break;
                    } else if (((dc1) ec1Var.g) != null) {
                        ec1Var.h = dc1Var;
                        break;
                    } else if (dc1Var2.a != intExtra) {
                        ec1Var.g = dc1Var;
                        break;
                    }
                }
                break;
            case 5:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((mu9) ((qg7) ((o3a) this.b).m.c).b).a.dispatchMediaButtonEvent(keyEvent);
                }
                break;
            case 6:
                if (!isInitialStickyBroadcast()) {
                    ((ake) this.b).b();
                }
                break;
            case 7:
                if (cqk.d(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = (ScheduledSendPickerBottomSheet) this.b;
                    zv8[] zv8VarArr = ScheduledSendPickerBottomSheet.D;
                    t2f t2fVarG1 = scheduledSendPickerBottomSheet.G1();
                    x35 x35Var = (x35) t2fVarG1.h.getValue();
                    if (x35Var == null) {
                        gm0.Y(t2f.class.getName(), "Early return in onTimeZoneChanged cuz of _dateTime.value is null");
                    } else {
                        yab.i0(t2fVarG1.b, ((n0c) t2fVarG1.d).a(), 0, new xra(t2fVarG1, x35Var, (lq4) null, 14), 2);
                    }
                }
                break;
            case 8:
                bw3 bw3Var = (bw3) this.b;
                if (bw3Var != null && bw3Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    bw3 bw3Var2 = (bw3) this.b;
                    ((FirebaseMessaging) bw3Var2.c).getClass();
                    FirebaseMessaging.c(bw3Var2, 0L);
                    ((FirebaseMessaging) ((bw3) this.b).c).b.unregisterReceiver(this);
                    this.b = null;
                }
                break;
            case 9:
                njd njdVar = (njd) this.b;
                int intExtra3 = intent != null ? intent.getIntExtra("status", -1) : -1;
                if (intExtra3 != 2 && intExtra3 != 5) {
                    z = false;
                }
                njdVar.c(Boolean.valueOf(z));
                break;
            default:
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -2128145023) {
                        if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                            for (ljk ljkVar : (CopyOnWriteArraySet) this.b) {
                                if (!ljkVar.i) {
                                    ljkVar.i = true;
                                    if (ljkVar.h) {
                                        ljkVar.b();
                                    }
                                }
                            }
                        }
                        break;
                    } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        for (ljk ljkVar2 : (CopyOnWriteArraySet) this.b) {
                            if (ljkVar2.i) {
                                ljkVar2.i = false;
                                if (ljkVar2.h) {
                                    ljkVar2.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ cg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ cg() {
        this.a = 8;
    }
}
